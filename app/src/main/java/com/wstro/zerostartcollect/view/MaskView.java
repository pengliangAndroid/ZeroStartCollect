package com.wstro.zerostartcollect.view;

import android.support.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * ClassName: MaskView <br/>
 * Function: TODO ADD FUNCTION. <br/>
 *
 * @author pengl
 * @date 2017/10/4
 */
public class MaskView {

    /**
     * 是否可见的标志, 0000 1000
     */
    private static final int VISIBILITY_MASK = 0x0000000C;


    public static final int VISIBLE = 0x00000000;

    public static final int INVISIBLE = 0x00000004;

    public static final int GONE = 0x00000008;

    private int stateFlag;

    @IntDef({VISIBLE, INVISIBLE, GONE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface Visibility {}


    public void setStateFlag(@Visibility int stateFlag) {
        this.stateFlag = stateFlag;
    }

    public boolean isVisible(){
        return (stateFlag & VISIBILITY_MASK) == VISIBLE;
    }

    public int getVisibility(){
        return stateFlag & VISIBILITY_MASK;
    }

}
