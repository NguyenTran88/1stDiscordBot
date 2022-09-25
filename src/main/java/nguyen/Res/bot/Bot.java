package nguyen.Res.bot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import nguyen.Res.bot.listeners.MessageListener;

import javax.security.auth.login.LoginException;

public class Bot {
    public static final String TOKEN = "MTAyMjM4OTY0NDI0NTA5MDM4Ng.G4mpdr._1FsP6yKfeRLYE3k9jeCWGj9lvkac12ET6vpTc";

    public static void main(String[] args) {
        Bot bot = new Bot();
        bot.prepareJDA();
    }

    public JDA prepareJDA() {
        try {
            JDA api = JDABuilder.createDefault(Bot.TOKEN)
                    .addEventListeners(
                            new MessageListener()
                    )
                    .build()
                    .awaitReady();
            return api;
        }
        catch(InterruptedException e){ //LoginException|
            System.out.println("Log in Auth or Await Ready failed ");
            System.exit(1);
        }
    return null;
    }

    }
