package com.alibaba.fastjson;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexerBase;

/* loaded from: classes3.dex */
public class JSONPatch {

    /* renamed from: com.alibaba.fastjson.JSONPatch$1 */
    public static /* synthetic */ class C55131 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType;

        static {
            int[] iArr = new int[OperationType.values().length];
            $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType = iArr;
            try {
                iArr[OperationType.add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType[OperationType.replace.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType[OperationType.remove.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType[OperationType.copy.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType[OperationType.move.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType[OperationType.test.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @JSONType(orders = {"op", TypedValues.TransitionType.S_FROM, "path", "value"})
    public static class Operation {
        public String from;
        public String path;

        @JSONField(name = "op")
        public OperationType type;
        public Object value;
    }

    public enum OperationType {
        add,
        remove,
        replace,
        move,
        copy,
        test
    }

    public static String apply(String str, String str2) {
        return JSON.toJSONString(apply(JSON.parse(str, Feature.OrderedField), str2));
    }

    private static boolean isObject(String str) {
        if (str == null) {
            return false;
        }
        int i10 = 0;
        while (true) {
            if (i10 >= str.length()) {
                break;
            }
            char cCharAt = str.charAt(i10);
            if (JSONLexerBase.isWhitespace(cCharAt)) {
                i10++;
            } else if (cCharAt == '{') {
                return true;
            }
        }
        return false;
    }

    public static Object apply(Object obj, String str) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        Operation[] operationArr;
        if (isObject(str)) {
            operationArr = new Operation[]{(Operation) JSON.parseObject(str, Operation.class)};
        } else {
            operationArr = (Operation[]) JSON.parseObject(str, Operation[].class);
        }
        for (Operation operation : operationArr) {
            JSONPath jSONPathCompile = JSONPath.compile(operation.path);
            switch (C55131.$SwitchMap$com$alibaba$fastjson$JSONPatch$OperationType[operation.type.ordinal()]) {
                case 1:
                    jSONPathCompile.patchAdd(obj, operation.value, false);
                    break;
                case 2:
                    jSONPathCompile.patchAdd(obj, operation.value, true);
                    break;
                case 3:
                    jSONPathCompile.remove(obj);
                    break;
                case 4:
                case 5:
                    JSONPath jSONPathCompile2 = JSONPath.compile(operation.from);
                    Object objEval = jSONPathCompile2.eval(obj);
                    if (operation.type == OperationType.move && !jSONPathCompile2.remove(obj)) {
                        throw new JSONException("json patch move error : " + operation.from + " -> " + operation.path);
                    }
                    jSONPathCompile.set(obj, objEval);
                    break;
                    break;
                case 6:
                    Object objEval2 = jSONPathCompile.eval(obj);
                    if (objEval2 == null) {
                        return Boolean.valueOf(operation.value == null);
                    }
                    return Boolean.valueOf(objEval2.equals(operation.value));
            }
        }
        return obj;
    }
}
