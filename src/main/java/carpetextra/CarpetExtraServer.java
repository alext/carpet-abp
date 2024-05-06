package carpetextra;

import carpet.CarpetExtension;
import carpet.CarpetServer;
import net.fabricmc.api.ModInitializer;

import java.util.Map;

public class CarpetExtraServer implements CarpetExtension, ModInitializer
{
    @Override
    public String version()
    {
        return "carpet-extra";
    }

    public static void loadExtension()
    {
        CarpetServer.manageExtension(new CarpetExtraServer());
    }

    @Override
    public void onInitialize()
    {
        CarpetExtraServer.loadExtension();
    }
}
