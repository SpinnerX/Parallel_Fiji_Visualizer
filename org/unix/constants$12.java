// Generated by jextract

package org.unix;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import jdk.incubator.foreign.*;
import static jdk.incubator.foreign.ValueLayout.*;
class constants$12 {

    static final FunctionDescriptor ferror$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror$MH = RuntimeHelper.downcallHandle(
        "ferror",
        constants$12.ferror$FUNC, false
    );
    static final FunctionDescriptor clearerr_unlocked$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle clearerr_unlocked$MH = RuntimeHelper.downcallHandle(
        "clearerr_unlocked",
        constants$12.clearerr_unlocked$FUNC, false
    );
    static final FunctionDescriptor feof_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle feof_unlocked$MH = RuntimeHelper.downcallHandle(
        "feof_unlocked",
        constants$12.feof_unlocked$FUNC, false
    );
    static final FunctionDescriptor ferror_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror_unlocked$MH = RuntimeHelper.downcallHandle(
        "ferror_unlocked",
        constants$12.ferror_unlocked$FUNC, false
    );
    static final FunctionDescriptor perror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle perror$MH = RuntimeHelper.downcallHandle(
        "perror",
        constants$12.perror$FUNC, false
    );
    static final FunctionDescriptor fileno$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno$MH = RuntimeHelper.downcallHandle(
        "fileno",
        constants$12.fileno$FUNC, false
    );
}

