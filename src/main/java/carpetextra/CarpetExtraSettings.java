package carpetextra;

import carpet.api.settings.Rule;

import static carpet.api.settings.RuleCategory.*;

/**
 * Here is your example Settings class you can plug to use carpetmod /carpet settings command
 */
public class CarpetExtraSettings
{
    public static final String EXTRA = "extras";

    @Rule(
            categories = {EXTRA, SURVIVAL}
    )
    public static boolean accurateBlockPlacement = false;
}
