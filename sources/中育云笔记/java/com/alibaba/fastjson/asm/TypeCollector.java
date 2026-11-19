package com.alibaba.fastjson.asm;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.ASMUtils;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class TypeCollector {
    private static String JSONType = ASMUtils.desc((Class<?>) JSONType.class);
    private static final Map<String, String> primitives = new HashMap<String, String>() { // from class: com.alibaba.fastjson.asm.TypeCollector.1
        {
            put("int", "I");
            put(TypedValues.Custom.S_BOOLEAN, "Z");
            put("byte", "B");
            put("char", "C");
            put("short", ExifInterface.LATITUDE_SOUTH);
            put(TypedValues.Custom.S_FLOAT, "F");
            put("long", "J");
            put("double", "D");
        }
    };
    protected MethodCollector collector = null;
    protected boolean jsonType;
    private final String methodName;
    private final Class<?>[] parameterTypes;

    public TypeCollector(String str, Class<?>[] clsArr) {
        this.methodName = str;
        this.parameterTypes = clsArr;
    }

    private boolean correctTypeName(Type type, String str) {
        String className = type.getClassName();
        StringBuilder sb2 = new StringBuilder();
        while (className.endsWith("[]")) {
            sb2.append('[');
            className = className.substring(0, className.length() - 2);
        }
        if (sb2.length() != 0) {
            Map<String, String> map = primitives;
            if (map.containsKey(className)) {
                sb2.append(map.get(className));
                className = sb2.toString();
            } else {
                sb2.append('L');
                sb2.append(className);
                sb2.append(';');
                className = sb2.toString();
            }
        }
        return className.equals(str);
    }

    public String[] getParameterNamesForMethod() {
        MethodCollector methodCollector = this.collector;
        return (methodCollector == null || !methodCollector.debugInfoPresent) ? new String[0] : methodCollector.getResult().split(",");
    }

    public boolean hasJsonType() {
        return this.jsonType;
    }

    public boolean matched() {
        return this.collector != null;
    }

    public void visitAnnotation(String str) {
        if (JSONType.equals(str)) {
            this.jsonType = true;
        }
    }

    public MethodCollector visitMethod(int i10, String str, String str2) {
        if (this.collector != null || !str.equals(this.methodName)) {
            return null;
        }
        Type[] argumentTypes = Type.getArgumentTypes(str2);
        int i11 = 0;
        for (Type type : argumentTypes) {
            String className = type.getClassName();
            if (className.equals("long") || className.equals("double")) {
                i11++;
            }
        }
        if (argumentTypes.length != this.parameterTypes.length) {
            return null;
        }
        for (int i12 = 0; i12 < argumentTypes.length; i12++) {
            if (!correctTypeName(argumentTypes[i12], this.parameterTypes[i12].getName())) {
                return null;
            }
        }
        MethodCollector methodCollector = new MethodCollector(!Modifier.isStatic(i10) ? 1 : 0, argumentTypes.length + i11);
        this.collector = methodCollector;
        return methodCollector;
    }
}
