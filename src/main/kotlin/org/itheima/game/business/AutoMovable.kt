package org.itheima.game.business

import org.itheima.game.enums.Direction
import org.itheima.game.model.View

/**
 * 自动移动的能力
 */
interface AutoMovable : View {

    //方向
    val currentDirection: Direction
    //速度
    val speed: Int

    fun autoMove()
}