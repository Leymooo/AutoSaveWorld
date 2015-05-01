/**
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 *
 */

package autosaveworld.modules.worldregen.plugins;

import net.sacredlabyrinth.Phaed.PreciousStones.PreciousStones;
import net.sacredlabyrinth.Phaed.PreciousStones.vectors.Field;

import org.bukkit.World;

public class PStonesDataProvider extends DataProvider {

	public PStonesDataProvider(World world) throws Throwable {
		super(world);
	}

	@Override
	protected void init() throws Throwable {
		for (Field field : PreciousStones.getInstance().getForceFieldManager().getFields("*", world)) {
			addChunksInBounds(field.getMinx(), field.getMinz(), field.getMaxx(), field.getMaxz());
		}
	}

}
