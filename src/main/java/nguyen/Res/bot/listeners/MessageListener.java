package nguyen.Res.bot.listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.entities.channel.middleman.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class MessageListener extends ListenerAdapter {
    public void onMessageReceived(@Nonnull MessageReceivedEvent event) {
        if(event.getAuthor().isBot()){
            return;
        }
        Message msg = event.getMessage();
        MessageChannel channel = event.getChannel();
        User user = event.getAuthor();
        event.getChannel().sendMessage("Hello, " + user.getAsMention() + "I am Nguyen's discord bot").queue();
        channel.sendMessage("Hello" +user.getName()).queue();
    }

}
