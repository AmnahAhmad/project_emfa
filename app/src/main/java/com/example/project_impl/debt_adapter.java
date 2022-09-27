package com.example.project_impl;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.google.firebase.database.FirebaseDatabase;
import com.orhanobut.dialogplus.DialogPlus;
import com.orhanobut.dialogplus.ViewHolder;

import java.util.HashMap;
import java.util.Map;

public class debt_adapter extends FirebaseRecyclerAdapter<model,debt_adapter.myViewholder> {
    /**
     * Initialize a {@link RecyclerView.Adapter} that listens to a Firebase query. See
     * {@link FirebaseRecyclerOptions} for configuration options.
     *
     * @param options
     */
    public debt_adapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myViewholder holder, int position, @NonNull model model) {
        holder.debt_Amount.setText(model.getDebt_Amount());
        holder.debt_Description.setText(model.getDebt_Description());
        holder.date.setText(model.getDate());
        holder.debt_Reciept.setText(model.getDebt_Receipt());


    }


    @NonNull
    @Override
    public myViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.debt_main_item,parent,false);
        return new myViewholder(view);

    }

    class myViewholder extends RecyclerView.ViewHolder{


        TextView debt_Amount,debt_Description,date,debt_Reciept;


        public myViewholder(@NonNull View itemView) {
            super(itemView);

            debt_Amount=(TextView)itemView.findViewById(R.id.deb_in_amount);
            debt_Description=(TextView)itemView.findViewById(R.id.deb_in_des);
            date=(TextView)itemView.findViewById(R.id.debt_in_date1);
            debt_Reciept=(TextView)itemView.findViewById(R.id.deb_in_rec1);


        }
    }


}
