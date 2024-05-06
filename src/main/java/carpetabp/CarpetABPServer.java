package carpetabp;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import net.fabricmc.api.ModInitializer;

import java.util.Map;

public class CarpetABPServer implements CarpetExtension, ModInitializer
{
    @Override
    public String version()
    {
        return "carpet-abp";
    }

    public static void loadExtension()
    {
        CarpetServer.manageExtension(new CarpetABPServer());
    }

    @Override
    public void onInitialize()
    {
        CarpetABPServer.loadExtension();
    }
}
