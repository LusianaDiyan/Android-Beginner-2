package com.example.chat;

import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ChatViewHolder extends RecyclerView.ViewHolder {
    public TextView tvUser;
    public TextView tvText;
    public TextView tvTime;

    public ChatViewHolder(@NonNull View itemView) {
        super(itemView);

        tvUser = itemView.findViewById(R.id.message_text);
        tvText = itemView.findViewById(R.id.message_user);
        tvTime = itemView.findViewById(R.id.message_time);
    }

    public void bindToMessage(MessageModel messageModel){
        tvUser.setText(messageModel.messageUser);
        tvText.setText(messageModel.messageText);
        tvTime.setText(DateFormat.format("dd-MM-yyyy (HH:mm:ss)",
                messageModel.getMessageTime()));
    }
}
