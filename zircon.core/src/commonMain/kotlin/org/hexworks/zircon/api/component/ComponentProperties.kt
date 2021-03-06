package org.hexworks.zircon.api.component

import org.hexworks.zircon.api.behavior.Disablable
import org.hexworks.zircon.api.behavior.Hideable
import org.hexworks.zircon.api.behavior.Themeable
import org.hexworks.zircon.api.behavior.TilesetOverride

/**
 * This interface contains all the common *properties* which a UI component
 * can have.
 */
interface ComponentProperties : Disablable, Hideable, Themeable, TilesetOverride