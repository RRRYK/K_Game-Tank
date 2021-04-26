package org.itheima.game.model

import org.itheima.game.Config
import org.itheima.game.business.Attackable
import org.itheima.game.business.Blockable
import org.itheima.game.business.Sufferable
import org.itheima.kotlin.game.core.Painter

/**
 * 铁墙
 *
 * 具有阻塞能力
 * 具有接受攻击的能力
 */
class Steel(override val x: Int, override val y: Int) : Blockable,Sufferable {
    override val blood: Int = 1

    //位置
//    override var x: Int = 200
//    override var y: Int = 200
    //宽高
    override var width: Int = Config.block
    override var height: Int = Config.block

    //显示行为
    override fun draw() {
        Painter.drawImage("img/steel.gif", x, y)
    }

    override fun notifySuffer(attackable: Attackable): Array<View>? {
        return null
    }


}