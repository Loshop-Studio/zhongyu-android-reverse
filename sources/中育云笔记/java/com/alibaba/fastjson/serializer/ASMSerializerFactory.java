package com.alibaba.fastjson.serializer;

import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.alibaba.android.arouter.utils.Consts;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.FieldWriter;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.asm.Type;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;
import com.huawei.hms.framework.common.BundleUtil;
import com.taobao.sophix.PatchStatus;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import org.eclipse.paho.client.mqttv3.MqttTopic;

/* loaded from: classes3.dex */
public class ASMSerializerFactory implements Opcodes {
    static final String JSONSerializer = ASMUtils.type(JSONSerializer.class);
    static final String JavaBeanSerializer;
    static final String JavaBeanSerializer_desc;
    static final String ObjectSerializer;
    static final String ObjectSerializer_desc;
    static final String SerialContext_desc;
    static final String SerializeFilterable_desc;
    static final String SerializeWriter;
    static final String SerializeWriter_desc;
    protected final ASMClassLoader classLoader = new ASMClassLoader();
    private final AtomicLong seed = new AtomicLong();

    static {
        String strType = ASMUtils.type(ObjectSerializer.class);
        ObjectSerializer = strType;
        ObjectSerializer_desc = "L" + strType + ";";
        String strType2 = ASMUtils.type(SerializeWriter.class);
        SerializeWriter = strType2;
        SerializeWriter_desc = "L" + strType2 + ";";
        JavaBeanSerializer = ASMUtils.type(JavaBeanSerializer.class);
        JavaBeanSerializer_desc = "L" + ASMUtils.type(JavaBeanSerializer.class) + ";";
        SerialContext_desc = ASMUtils.desc((Class<?>) SerialContext.class);
        SerializeFilterable_desc = ASMUtils.desc((Class<?>) SerializeFilterable.class);
    }

    private void _after(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "writeAfter", "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _apply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Class<?> cls = fieldInfo.fieldClass;
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("byte"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("short"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("int"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("char"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var("long", 2));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(TypedValues.Custom.S_FLOAT));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var("double", 2));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(TypedValues.Custom.S_BOOLEAN));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "apply", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
    }

    private void _before(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "writeBefore", "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _decimal(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("decimal"));
        _filters(methodVisitor, fieldInfo, context, label);
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();
        methodVisitor.visitLabel(label2);
        methodVisitor.visitVarInsn(25, context.var("decimal"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label3);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label4);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(25, context.var("decimal"));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;Ljava/math/BigDecimal;)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label4);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitLabel(label);
    }

    private void _double(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(57, context.var("double", 2));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(24, context.var("double", 2));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;D)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _enum(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label3);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "java/lang/Enum");
        methodVisitor.visitVarInsn(58, context.var("enum"));
        _filters(methodVisitor, fieldInfo, context, label3);
        methodVisitor.visitVarInsn(25, context.var("enum"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
        methodVisitor.visitLabel(label);
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Enum", HintConstants.AUTOFILL_HINT_NAME, "()Ljava/lang/String;");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValueStringWithDoubleQuote", "(CLjava/lang/String;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            String str = SerializeWriter;
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "write", "(I)V");
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitInsn(3);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "writeFieldName", "(Ljava/lang/String;Z)V");
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        }
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label2);
        methodVisitor.visitLabel(label3);
    }

    private void _filters(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (fieldInfo.fieldTransient) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.SkipTransientField.mask));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(Opcodes.IFNE, label);
        }
        _notWriteDefault(methodVisitor, fieldInfo, context, label);
        if (context.writeDirect) {
            return;
        }
        _apply(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        _processKey(methodVisitor, fieldInfo, context);
        _processValue(methodVisitor, fieldInfo, context, label);
    }

    private void _float(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(56, context.var(TypedValues.Custom.S_FLOAT));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(23, context.var(TypedValues.Custom.S_FLOAT));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;F)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _get(MethodVisitor methodVisitor, Context context, FieldInfo fieldInfo) {
        Method method = fieldInfo.method;
        if (method != null) {
            methodVisitor.visitVarInsn(25, context.var("entity"));
            Class<?> declaringClass = method.getDeclaringClass();
            methodVisitor.visitMethodInsn(declaringClass.isInterface() ? Opcodes.INVOKEINTERFACE : Opcodes.INVOKEVIRTUAL, ASMUtils.type(declaringClass), method.getName(), ASMUtils.desc(method));
            if (method.getReturnType().equals(fieldInfo.fieldClass)) {
                return;
            }
            methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, ASMUtils.type(fieldInfo.fieldClass));
            return;
        }
        methodVisitor.visitVarInsn(25, context.var("entity"));
        Field field = fieldInfo.field;
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, ASMUtils.type(fieldInfo.declaringClass), field.getName(), ASMUtils.desc(field.getType()));
        if (field.getType().equals(fieldInfo.fieldClass)) {
            return;
        }
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, ASMUtils.type(fieldInfo.fieldClass));
    }

    private void _getFieldSer(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        String str = context.className;
        String str2 = fieldInfo.name + "_asm_ser_";
        String str3 = ObjectSerializer_desc;
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, str, str2, str3);
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo.fieldClass)));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "getObjectWriter", "(Ljava/lang/Class;)" + str3);
        methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, context.className, fieldInfo.name + "_asm_ser_", str3);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, context.className, fieldInfo.name + "_asm_ser_", str3);
    }

    private void _getListFieldItemSer(Context context, MethodVisitor methodVisitor, FieldInfo fieldInfo, Class<?> cls) {
        Label label = new Label();
        methodVisitor.visitVarInsn(25, 0);
        String str = context.className;
        String str2 = fieldInfo.name + "_asm_list_item_ser_";
        String str3 = ObjectSerializer_desc;
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, str, str2, str3);
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "getObjectWriter", "(Ljava/lang/Class;)" + str3);
        methodVisitor.visitFieldInsn(Opcodes.PUTFIELD, context.className, fieldInfo.name + "_asm_list_item_ser_", str3);
        methodVisitor.visitLabel(label);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitFieldInsn(Opcodes.GETFIELD, context.className, fieldInfo.name + "_asm_list_item_ser_", str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void _if_write_null(com.alibaba.fastjson.asm.MethodVisitor r18, com.alibaba.fastjson.util.FieldInfo r19, com.alibaba.fastjson.serializer.ASMSerializerFactory.Context r20) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson.serializer.ASMSerializerFactory._if_write_null(com.alibaba.fastjson.asm.MethodVisitor, com.alibaba.fastjson.util.FieldInfo, com.alibaba.fastjson.serializer.ASMSerializerFactory$Context):void");
    }

    private void _int(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, int i10, char c10) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(54, i10);
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(21, i10);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;" + c10 + ")V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _labelApply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitLdcInsn(fieldInfo.label);
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "applyLabel", "(L" + JSONSerializer + ";Ljava/lang/String;)Z");
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
    }

    private void _list(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label;
        Label label2;
        Label label3;
        Class<?> cls2;
        String str;
        Label label4;
        Label label5;
        FieldInfo fieldInfo2;
        Label label6;
        int i10;
        int i11;
        int i12;
        Label label7;
        Label label8;
        java.lang.reflect.Type collectionItemType = TypeUtils.getCollectionItemType(fieldInfo.fieldType);
        Class<?> cls3 = null;
        Class<?> cls4 = collectionItemType instanceof Class ? (Class) collectionItemType : null;
        if (cls4 != Object.class && cls4 != Serializable.class) {
            cls3 = cls4;
        }
        Label label9 = new Label();
        Label label10 = new Label();
        Label label11 = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label9);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "java/util/List");
        methodVisitor.visitVarInsn(58, context.var("list"));
        _filters(methodVisitor, fieldInfo, context, label9);
        methodVisitor.visitVarInsn(25, context.var("list"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label10);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label11);
        methodVisitor.visitLabel(label10);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        String str2 = SerializeWriter;
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        methodVisitor.visitVarInsn(25, context.var("list"));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, "java/util/List", "size", "()I");
        methodVisitor.visitVarInsn(54, context.var("size"));
        Label label12 = new Label();
        Label label13 = new Label();
        methodVisitor.visitVarInsn(21, context.var("size"));
        methodVisitor.visitInsn(3);
        methodVisitor.visitJumpInsn(Opcodes.IF_ICMPNE, label12);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitLdcInsn("[]");
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "write", "(Ljava/lang/String;)V");
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label13);
        methodVisitor.visitLabel(label12);
        if (context.nonContext) {
            label = label13;
        } else {
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            label = label13;
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
        }
        if (collectionItemType == String.class && context.writeDirect) {
            i11 = 25;
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, context.var("list"));
            i12 = Opcodes.INVOKEVIRTUAL;
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "write", "(Ljava/util/List;)V");
            i10 = 1;
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 91);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "write", "(I)V");
            Label label14 = new Label();
            Label label15 = new Label();
            Label label16 = new Label();
            methodVisitor.visitInsn(3);
            methodVisitor.visitVarInsn(54, context.var("i"));
            methodVisitor.visitLabel(label14);
            methodVisitor.visitVarInsn(21, context.var("i"));
            methodVisitor.visitVarInsn(21, context.var("size"));
            methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, label16);
            methodVisitor.visitVarInsn(21, context.var("i"));
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label15);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 44);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "write", "(I)V");
            methodVisitor.visitLabel(label15);
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(21, context.var("i"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;");
            methodVisitor.visitVarInsn(58, context.var("list_item"));
            Label label17 = new Label();
            Label label18 = new Label();
            methodVisitor.visitVarInsn(25, context.var("list_item"));
            methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label18);
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "writeNull", "()V");
            methodVisitor.visitJumpInsn(Opcodes.GOTO, label17);
            methodVisitor.visitLabel(label18);
            Label label19 = new Label();
            Label label20 = new Label();
            if (cls3 == null || !Modifier.isPublic(cls3.getModifiers())) {
                label2 = label14;
                label3 = label17;
                cls2 = cls3;
                str = "out";
                label4 = label19;
                label5 = label16;
                fieldInfo2 = fieldInfo;
                label6 = label20;
            } else {
                str = "out";
                methodVisitor.visitVarInsn(25, context.var("list_item"));
                label5 = label16;
                label2 = label14;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                methodVisitor.visitJumpInsn(Opcodes.IF_ACMPNE, label20);
                fieldInfo2 = fieldInfo;
                _getListFieldItemSer(context, methodVisitor, fieldInfo2, cls3);
                cls2 = cls3;
                methodVisitor.visitVarInsn(58, context.var("list_item_desc"));
                Label label21 = new Label();
                Label label22 = new Label();
                if (context.writeDirect) {
                    String str3 = (context.nonContext && context.writeDirect) ? "writeDirectNonContext" : "write";
                    label3 = label17;
                    label8 = label20;
                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                    String str4 = JavaBeanSerializer;
                    methodVisitor.visitTypeInsn(Opcodes.INSTANCEOF, str4);
                    methodVisitor.visitJumpInsn(Opcodes.IFEQ, label21);
                    label7 = label19;
                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                    methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, str4);
                    methodVisitor.visitVarInsn(25, 1);
                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                    if (context.nonContext) {
                        methodVisitor.visitInsn(1);
                    } else {
                        methodVisitor.visitVarInsn(21, context.var("i"));
                        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    }
                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str4, str3, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    methodVisitor.visitJumpInsn(Opcodes.GOTO, label22);
                    methodVisitor.visitLabel(label21);
                } else {
                    label3 = label17;
                    label7 = label19;
                    label8 = label20;
                }
                methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                methodVisitor.visitVarInsn(25, 1);
                methodVisitor.visitVarInsn(25, context.var("list_item"));
                if (context.nonContext) {
                    methodVisitor.visitInsn(1);
                } else {
                    methodVisitor.visitVarInsn(21, context.var("i"));
                    methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                }
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, ObjectSerializer, "write", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodVisitor.visitLabel(label22);
                label4 = label7;
                methodVisitor.visitJumpInsn(Opcodes.GOTO, label4);
                label6 = label8;
            }
            methodVisitor.visitLabel(label6);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("list_item"));
            if (context.nonContext) {
                methodVisitor.visitInsn(1);
            } else {
                methodVisitor.visitVarInsn(21, context.var("i"));
                methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            }
            if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } else {
                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) collectionItemType)));
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo2.serialzeFeatures));
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
            methodVisitor.visitLabel(label4);
            methodVisitor.visitLabel(label3);
            i10 = 1;
            methodVisitor.visitIincInsn(context.var("i"), 1);
            methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
            methodVisitor.visitLabel(label5);
            i11 = 25;
            methodVisitor.visitVarInsn(25, context.var(str));
            methodVisitor.visitVarInsn(16, 93);
            i12 = Opcodes.INVOKEVIRTUAL;
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, "write", "(I)V");
        }
        methodVisitor.visitVarInsn(i11, i10);
        methodVisitor.visitMethodInsn(i12, JSONSerializer, "popContext", "()V");
        methodVisitor.visitLabel(label);
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label11);
        methodVisitor.visitLabel(label9);
    }

    private void _long(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(55, context.var("long", 2));
        _filters(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitVarInsn(25, Context.fieldName);
        methodVisitor.visitVarInsn(22, context.var("long", 2));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;J)V");
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label);
    }

    private void _nameApply(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (!context.writeDirect) {
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "applyName", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;)Z");
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
            _labelApply(methodVisitor, fieldInfo, context, label);
        }
        if (fieldInfo.field == null) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitLdcInsn(Integer.valueOf(SerializerFeature.IgnoreNonFieldGetter.mask));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor.visitJumpInsn(Opcodes.IFNE, label);
        }
    }

    private void _notWriteDefault(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        if (context.writeDirect) {
            return;
        }
        Label label2 = new Label();
        methodVisitor.visitVarInsn(21, context.var("notWriteDefaultValue"));
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, label2);
        Class<?> cls = fieldInfo.fieldClass;
        if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(TypedValues.Custom.S_BOOLEAN));
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        } else if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("byte"));
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("short"));
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("int"));
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var("long"));
            methodVisitor.visitInsn(9);
            methodVisitor.visitInsn(Opcodes.LCMP);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(TypedValues.Custom.S_FLOAT));
            methodVisitor.visitInsn(11);
            methodVisitor.visitInsn(Opcodes.FCMPL);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var("double"));
            methodVisitor.visitInsn(14);
            methodVisitor.visitInsn(Opcodes.DCMPL);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        }
        methodVisitor.visitLabel(label2);
    }

    private void _object(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var("object"));
        _filters(methodVisitor, fieldInfo, context, label);
        _writeObject(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitLabel(label);
    }

    private void _processKey(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        methodVisitor.visitVarInsn(21, context.var("hasNameFilters"));
        methodVisitor.visitJumpInsn(Opcodes.IFEQ, label);
        Class<?> cls = fieldInfo.fieldClass;
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("byte"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("short"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("int"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("char"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var("long", 2));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(TypedValues.Custom.S_FLOAT));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var("double", 2));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(TypedValues.Custom.S_BOOLEAN));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "processKey", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");
        methodVisitor.visitVarInsn(58, Context.fieldName);
        methodVisitor.visitLabel(label);
    }

    private void _processValue(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        Label label2 = new Label();
        Class<?> cls = fieldInfo.fieldClass;
        if (cls.isPrimitive()) {
            Label label3 = new Label();
            methodVisitor.visitVarInsn(21, context.var("checkValue"));
            methodVisitor.visitJumpInsn(Opcodes.IFNE, label3);
            methodVisitor.visitInsn(1);
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(58, Context.processValue);
            methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
            methodVisitor.visitLabel(label3);
        }
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitLdcInsn(Integer.valueOf(context.getFieldOrinal(fieldInfo.name)));
        String str = JavaBeanSerializer;
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "getBeanContext", "(I)" + ASMUtils.desc((Class<?>) BeanContext.class));
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, Context.fieldName);
        if (cls == Byte.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("byte"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Short.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("short"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Integer.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("int"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Character.TYPE) {
            methodVisitor.visitVarInsn(21, context.var("char"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Long.TYPE) {
            methodVisitor.visitVarInsn(22, context.var("long", 2));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Float.TYPE) {
            methodVisitor.visitVarInsn(23, context.var(TypedValues.Custom.S_FLOAT));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Double.TYPE) {
            methodVisitor.visitVarInsn(24, context.var("double", 2));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == Boolean.TYPE) {
            methodVisitor.visitVarInsn(21, context.var(TypedValues.Custom.S_BOOLEAN));
            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            methodVisitor.visitInsn(89);
            methodVisitor.visitVarInsn(58, Context.original);
        } else if (cls == BigDecimal.class) {
            methodVisitor.visitVarInsn(25, context.var("decimal"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (cls == String.class) {
            methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (cls.isEnum()) {
            methodVisitor.visitVarInsn(25, context.var("enum"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else if (List.class.isAssignableFrom(cls)) {
            methodVisitor.visitVarInsn(25, context.var("list"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(58, Context.original);
            methodVisitor.visitVarInsn(25, Context.original);
        }
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "processValue", "(L" + JSONSerializer + ";" + ASMUtils.desc((Class<?>) BeanContext.class) + "Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;");
        methodVisitor.visitVarInsn(58, Context.processValue);
        methodVisitor.visitVarInsn(25, Context.original);
        methodVisitor.visitVarInsn(25, Context.processValue);
        methodVisitor.visitJumpInsn(Opcodes.IF_ACMPEQ, label2);
        _writeObject(methodVisitor, fieldInfo, context, label);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label);
        methodVisitor.visitLabel(label2);
    }

    private void _seperator(MethodVisitor methodVisitor, Context context) {
        methodVisitor.visitVarInsn(16, 44);
        methodVisitor.visitVarInsn(54, context.var("seperator"));
    }

    private void _string(Class<?> cls, MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context) {
        Label label = new Label();
        if (fieldInfo.name.equals(context.beanInfo.typeKey)) {
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, 4);
            methodVisitor.visitVarInsn(25, 2);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
            methodVisitor.visitJumpInsn(Opcodes.IFNE, label);
        }
        _nameApply(methodVisitor, fieldInfo, context, label);
        _get(methodVisitor, context, fieldInfo);
        methodVisitor.visitVarInsn(58, context.var(TypedValues.Custom.S_STRING));
        _filters(methodVisitor, fieldInfo, context, label);
        Label label2 = new Label();
        Label label3 = new Label();
        methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label2);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label3);
        methodVisitor.visitLabel(label2);
        if ("trim".equals(fieldInfo.format)) {
            methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;");
            methodVisitor.visitVarInsn(58, context.var(TypedValues.Custom.S_STRING));
        }
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValueStringWithDoubleQuoteCheck", "(CLjava/lang/String;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(21, context.var("seperator"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, context.var(TypedValues.Custom.S_STRING));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;Ljava/lang/String;)V");
        }
        _seperator(methodVisitor, context);
        methodVisitor.visitLabel(label3);
        methodVisitor.visitLabel(label);
    }

    private void _writeFieldName(MethodVisitor methodVisitor, Context context) {
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldNameDirect", "(Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitInsn(3);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeFieldName", "(Ljava/lang/String;Z)V");
        }
    }

    private void _writeObject(MethodVisitor methodVisitor, FieldInfo fieldInfo, Context context, Label label) {
        String str;
        Label label2;
        Label label3;
        String format = fieldInfo.getFormat();
        Class<?> cls = fieldInfo.fieldClass;
        Label label4 = new Label();
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("object"));
        } else {
            methodVisitor.visitVarInsn(25, Context.processValue);
        }
        methodVisitor.visitInsn(89);
        methodVisitor.visitVarInsn(58, context.var("object"));
        methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label4);
        _if_write_null(methodVisitor, fieldInfo, context);
        methodVisitor.visitJumpInsn(Opcodes.GOTO, label);
        methodVisitor.visitLabel(label4);
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(21, context.var("seperator"));
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
        _writeFieldName(methodVisitor, context);
        Label label5 = new Label();
        Label label6 = new Label();
        if (!Modifier.isPublic(cls.getModifiers()) || ParserConfig.isPrimitive2(cls)) {
            str = format;
            label2 = label5;
            label3 = label6;
        } else {
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls)));
            methodVisitor.visitJumpInsn(Opcodes.IF_ACMPNE, label6);
            _getFieldSer(context, methodVisitor, fieldInfo);
            methodVisitor.visitVarInsn(58, context.var("fied_ser"));
            Label label7 = new Label();
            Label label8 = new Label();
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            String str2 = JavaBeanSerializer;
            methodVisitor.visitTypeInsn(Opcodes.INSTANCEOF, str2);
            methodVisitor.visitJumpInsn(Opcodes.IFEQ, label7);
            int i10 = fieldInfo.serialzeFeatures;
            boolean z10 = (i10 & SerializerFeature.DisableCircularReferenceDetect.mask) != 0;
            boolean z11 = (i10 & SerializerFeature.BeanToArray.mask) != 0;
            String str3 = (z10 || (context.nonContext && context.writeDirect)) ? z11 ? "writeAsArrayNonContext" : "writeDirectNonContext" : z11 ? "writeAsArray" : "write";
            str = format;
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, str2);
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(Opcodes.GETFIELD, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("(L");
            String str4 = JSONSerializer;
            sb2.append(str4);
            sb2.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str2, str3, sb2.toString());
            methodVisitor.visitJumpInsn(Opcodes.GOTO, label8);
            methodVisitor.visitLabel(label7);
            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
            methodVisitor.visitVarInsn(25, 1);
            methodVisitor.visitVarInsn(25, context.var("object"));
            methodVisitor.visitVarInsn(25, Context.fieldName);
            methodVisitor.visitVarInsn(25, 0);
            methodVisitor.visitFieldInsn(Opcodes.GETFIELD, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
            methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, ObjectSerializer, "write", "(L" + str4 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor.visitLabel(label8);
            label2 = label5;
            methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
            label3 = label6;
        }
        methodVisitor.visitLabel(label3);
        methodVisitor.visitVarInsn(25, 1);
        if (context.writeDirect) {
            methodVisitor.visitVarInsn(25, context.var("object"));
        } else {
            methodVisitor.visitVarInsn(25, Context.processValue);
        }
        if (str != null) {
            methodVisitor.visitLdcInsn(str);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
        } else {
            methodVisitor.visitVarInsn(25, Context.fieldName);
            java.lang.reflect.Type type = fieldInfo.fieldType;
            if ((type instanceof Class) && ((Class) type).isPrimitive()) {
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } else {
                if (fieldInfo.fieldClass == String.class) {
                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) String.class)));
                } else {
                    methodVisitor.visitVarInsn(25, 0);
                    methodVisitor.visitFieldInsn(Opcodes.GETFIELD, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
                }
                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
        }
        methodVisitor.visitLabel(label2);
        _seperator(methodVisitor, context);
    }

    private void generateWriteAsArray(Class<?> cls, MethodVisitor methodVisitor, FieldInfo[] fieldInfoArr, Context context) {
        int i10;
        String str;
        int i11;
        String str2;
        int i12;
        String str3;
        String str4;
        int i13;
        char c10;
        boolean z10;
        ASMSerializerFactory aSMSerializerFactory;
        char c11;
        Label label;
        int i14;
        Class<?> cls2;
        int i15;
        Label label2;
        Label label3;
        Label label4;
        String str5;
        Class<?> cls3;
        Label label5;
        String str6;
        int i16;
        int i17;
        String str7;
        int i18;
        Label label6;
        ASMSerializerFactory aSMSerializerFactory2 = this;
        FieldInfo[] fieldInfoArr2 = fieldInfoArr;
        Label label7 = new Label();
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 0);
        String str8 = JSONSerializer;
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str8, "hasPropertyFilters", "(" + SerializeFilterable_desc + ")Z");
        methodVisitor.visitJumpInsn(Opcodes.IFNE, label7);
        methodVisitor.visitVarInsn(25, 0);
        methodVisitor.visitVarInsn(25, 1);
        methodVisitor.visitVarInsn(25, 2);
        methodVisitor.visitVarInsn(25, 3);
        methodVisitor.visitVarInsn(25, 4);
        methodVisitor.visitVarInsn(21, 5);
        String str9 = JavaBeanSerializer;
        StringBuilder sb2 = new StringBuilder();
        String str10 = "(L";
        sb2.append("(L");
        sb2.append(str8);
        String str11 = ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V";
        sb2.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        methodVisitor.visitMethodInsn(Opcodes.INVOKESPECIAL, str9, "writeNoneASM", sb2.toString());
        methodVisitor.visitInsn(Opcodes.RETURN);
        methodVisitor.visitLabel(label7);
        String str12 = "out";
        methodVisitor.visitVarInsn(25, context.var("out"));
        methodVisitor.visitVarInsn(16, 91);
        String str13 = SerializeWriter;
        String str14 = "(I)V";
        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str13, "write", "(I)V");
        int i19 = 0;
        int length = fieldInfoArr2.length;
        if (length == 0) {
            methodVisitor.visitVarInsn(25, context.var("out"));
            methodVisitor.visitVarInsn(16, 93);
            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str13, "write", "(I)V");
            return;
        }
        int i20 = 0;
        while (i20 < length) {
            int i21 = i20 == length + (-1) ? 93 : 44;
            FieldInfo fieldInfo = fieldInfoArr2[i20];
            Class<?> cls4 = fieldInfo.fieldClass;
            methodVisitor.visitLdcInsn(fieldInfo.name);
            methodVisitor.visitVarInsn(58, Context.fieldName);
            if (cls4 == Byte.TYPE || cls4 == Short.TYPE || cls4 == Integer.TYPE) {
                i10 = i19;
                str = str12;
                int i22 = i21;
                i11 = length;
                str2 = str11;
                i12 = i20;
                str3 = str10;
                str4 = str14;
                i13 = Opcodes.INVOKEVIRTUAL;
                c10 = 25;
                z10 = true;
                methodVisitor.visitVarInsn(25, context.var(str));
                methodVisitor.visitInsn(89);
                aSMSerializerFactory = this;
                aSMSerializerFactory._get(methodVisitor, context, fieldInfo);
                String str15 = SerializeWriter;
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str15, "writeInt", str4);
                c11 = 16;
                methodVisitor.visitVarInsn(16, i22);
                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str15, "write", str4);
            } else {
                if (cls4 == Long.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str12));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    String str16 = SerializeWriter;
                    i13 = Opcodes.INVOKEVIRTUAL;
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str16, "writeLong", "(J)V");
                    methodVisitor.visitVarInsn(16, i21);
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str16, "write", str14);
                } else if (cls4 == Float.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str12));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    methodVisitor.visitInsn(4);
                    String str17 = SerializeWriter;
                    i13 = Opcodes.INVOKEVIRTUAL;
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str17, "writeFloat", "(FZ)V");
                    methodVisitor.visitVarInsn(16, i21);
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str17, "write", str14);
                } else if (cls4 == Double.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str12));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    methodVisitor.visitInsn(4);
                    String str18 = SerializeWriter;
                    i13 = Opcodes.INVOKEVIRTUAL;
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str18, "writeDouble", "(DZ)V");
                    methodVisitor.visitVarInsn(16, i21);
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str18, "write", str14);
                } else if (cls4 == Boolean.TYPE) {
                    methodVisitor.visitVarInsn(25, context.var(str12));
                    methodVisitor.visitInsn(89);
                    aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                    String str19 = SerializeWriter;
                    i13 = Opcodes.INVOKEVIRTUAL;
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str19, "write", "(Z)V");
                    methodVisitor.visitVarInsn(16, i21);
                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str19, "write", str14);
                } else {
                    if (cls4 == Character.TYPE) {
                        methodVisitor.visitVarInsn(25, context.var(str12));
                        aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Character", "toString", "(C)Ljava/lang/String;");
                        methodVisitor.visitVarInsn(16, i21);
                        String str20 = SerializeWriter;
                        i13 = Opcodes.INVOKEVIRTUAL;
                        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str20, "writeString", "(Ljava/lang/String;C)V");
                        str = str12;
                        i11 = length;
                        str2 = str11;
                        i12 = i20;
                        c11 = 16;
                        str3 = str10;
                        str4 = str14;
                    } else {
                        if (cls4 == String.class) {
                            methodVisitor.visitVarInsn(25, context.var(str12));
                            aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                            methodVisitor.visitVarInsn(16, i21);
                            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");
                            aSMSerializerFactory = aSMSerializerFactory2;
                            str = str12;
                            i11 = length;
                            str2 = str11;
                            i12 = i20;
                            str3 = str10;
                            str4 = str14;
                            z10 = true;
                            i10 = i19;
                            c10 = 25;
                            i13 = 182;
                        } else if (cls4.isEnum()) {
                            methodVisitor.visitVarInsn(25, context.var(str12));
                            methodVisitor.visitInsn(89);
                            aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                            String str21 = SerializeWriter;
                            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str21, "writeEnum", "(Ljava/lang/Enum;)V");
                            methodVisitor.visitVarInsn(16, i21);
                            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str21, "write", str14);
                            str = str12;
                            i11 = length;
                            str2 = str11;
                            i12 = i20;
                            i13 = 182;
                            str3 = str10;
                            str4 = str14;
                            c11 = 16;
                        } else if (List.class.isAssignableFrom(cls4)) {
                            java.lang.reflect.Type type = fieldInfo.fieldType;
                            java.lang.reflect.Type type2 = type instanceof Class ? Object.class : ((ParameterizedType) type).getActualTypeArguments()[i19];
                            if (!(type2 instanceof Class) || (cls2 = (Class) type2) == Object.class) {
                                cls2 = null;
                            }
                            aSMSerializerFactory2._get(methodVisitor, context, fieldInfo);
                            java.lang.reflect.Type type3 = type2;
                            methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, "java/util/List");
                            i11 = length;
                            methodVisitor.visitVarInsn(58, context.var("list"));
                            if (cls2 == String.class && context.writeDirect) {
                                methodVisitor.visitVarInsn(25, context.var(str12));
                                methodVisitor.visitVarInsn(25, context.var("list"));
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "write", "(Ljava/util/List;)V");
                                str6 = str12;
                                i15 = i21;
                                str2 = str11;
                                i12 = i20;
                                i18 = 182;
                                str3 = str10;
                                str7 = str14;
                                i17 = 16;
                                i16 = 25;
                            } else {
                                Label label8 = new Label();
                                Label label9 = new Label();
                                i12 = i20;
                                i15 = i21;
                                methodVisitor.visitVarInsn(25, context.var("list"));
                                methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label9);
                                methodVisitor.visitVarInsn(25, context.var(str12));
                                String str22 = SerializeWriter;
                                String str23 = str11;
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str22, "writeNull", "()V");
                                methodVisitor.visitJumpInsn(Opcodes.GOTO, label8);
                                methodVisitor.visitLabel(label9);
                                methodVisitor.visitVarInsn(25, context.var("list"));
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, "java/util/List", "size", "()I");
                                methodVisitor.visitVarInsn(54, context.var("size"));
                                methodVisitor.visitVarInsn(25, context.var(str12));
                                methodVisitor.visitVarInsn(16, 91);
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str22, "write", str14);
                                Label label10 = new Label();
                                Label label11 = new Label();
                                Label label12 = new Label();
                                methodVisitor.visitInsn(3);
                                String str24 = str10;
                                methodVisitor.visitVarInsn(54, context.var("i"));
                                methodVisitor.visitLabel(label10);
                                methodVisitor.visitVarInsn(21, context.var("i"));
                                methodVisitor.visitVarInsn(21, context.var("size"));
                                methodVisitor.visitJumpInsn(Opcodes.IF_ICMPGE, label12);
                                methodVisitor.visitVarInsn(21, context.var("i"));
                                methodVisitor.visitJumpInsn(Opcodes.IFEQ, label11);
                                methodVisitor.visitVarInsn(25, context.var(str12));
                                methodVisitor.visitVarInsn(16, 44);
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str22, "write", str14);
                                methodVisitor.visitLabel(label11);
                                methodVisitor.visitVarInsn(25, context.var("list"));
                                methodVisitor.visitVarInsn(21, context.var("i"));
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;");
                                methodVisitor.visitVarInsn(58, context.var("list_item"));
                                Label label13 = new Label();
                                Label label14 = new Label();
                                String str25 = str14;
                                methodVisitor.visitVarInsn(25, context.var("list_item"));
                                methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label14);
                                methodVisitor.visitVarInsn(25, context.var(str12));
                                String str26 = str12;
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str22, "writeNull", "()V");
                                methodVisitor.visitJumpInsn(Opcodes.GOTO, label13);
                                methodVisitor.visitLabel(label14);
                                Label label15 = new Label();
                                Label label16 = new Label();
                                if (cls2 == null || !Modifier.isPublic(cls2.getModifiers())) {
                                    label2 = label10;
                                    label3 = label13;
                                    label4 = label12;
                                    str5 = str22;
                                    cls3 = cls2;
                                    str2 = str23;
                                    str3 = str24;
                                    label5 = label16;
                                } else {
                                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                                    str5 = str22;
                                    label4 = label12;
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls2)));
                                    methodVisitor.visitJumpInsn(Opcodes.IF_ACMPNE, label16);
                                    aSMSerializerFactory2._getListFieldItemSer(context, methodVisitor, fieldInfo, cls2);
                                    methodVisitor.visitVarInsn(58, context.var("list_item_desc"));
                                    Label label17 = new Label();
                                    Label label18 = new Label();
                                    if (context.writeDirect) {
                                        cls3 = cls2;
                                        methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                        String str27 = JavaBeanSerializer;
                                        methodVisitor.visitTypeInsn(Opcodes.INSTANCEOF, str27);
                                        methodVisitor.visitJumpInsn(Opcodes.IFEQ, label17);
                                        methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                        methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, str27);
                                        methodVisitor.visitVarInsn(25, 1);
                                        methodVisitor.visitVarInsn(25, context.var("list_item"));
                                        if (context.nonContext) {
                                            methodVisitor.visitInsn(1);
                                            label2 = label10;
                                            label3 = label13;
                                        } else {
                                            methodVisitor.visitVarInsn(21, context.var("i"));
                                            label2 = label10;
                                            label3 = label13;
                                            methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                        }
                                        methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                                        methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                        StringBuilder sb3 = new StringBuilder();
                                        str3 = str24;
                                        sb3.append(str3);
                                        sb3.append(JSONSerializer);
                                        str2 = str23;
                                        sb3.append(str2);
                                        label6 = label16;
                                        methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str27, "writeAsArrayNonContext", sb3.toString());
                                        methodVisitor.visitJumpInsn(Opcodes.GOTO, label18);
                                        methodVisitor.visitLabel(label17);
                                    } else {
                                        label2 = label10;
                                        label3 = label13;
                                        cls3 = cls2;
                                        str2 = str23;
                                        str3 = str24;
                                        label6 = label16;
                                    }
                                    methodVisitor.visitVarInsn(25, context.var("list_item_desc"));
                                    methodVisitor.visitVarInsn(25, 1);
                                    methodVisitor.visitVarInsn(25, context.var("list_item"));
                                    if (context.nonContext) {
                                        methodVisitor.visitInsn(1);
                                    } else {
                                        methodVisitor.visitVarInsn(21, context.var("i"));
                                        methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                    }
                                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls3)));
                                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, ObjectSerializer, "write", str3 + JSONSerializer + str2);
                                    methodVisitor.visitLabel(label18);
                                    methodVisitor.visitJumpInsn(Opcodes.GOTO, label15);
                                    label5 = label6;
                                }
                                methodVisitor.visitLabel(label5);
                                methodVisitor.visitVarInsn(25, 1);
                                methodVisitor.visitVarInsn(25, context.var("list_item"));
                                if (context.nonContext) {
                                    methodVisitor.visitInsn(1);
                                } else {
                                    methodVisitor.visitVarInsn(21, context.var("i"));
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                }
                                if (cls3 == null || !Modifier.isPublic(cls3.getModifiers())) {
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                } else {
                                    methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc((Class<?>) type3)));
                                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                }
                                methodVisitor.visitLabel(label15);
                                methodVisitor.visitLabel(label3);
                                methodVisitor.visitIincInsn(context.var("i"), 1);
                                methodVisitor.visitJumpInsn(Opcodes.GOTO, label2);
                                methodVisitor.visitLabel(label4);
                                str6 = str26;
                                i16 = 25;
                                methodVisitor.visitVarInsn(25, context.var(str6));
                                i17 = 16;
                                methodVisitor.visitVarInsn(16, 93);
                                str7 = str25;
                                i18 = Opcodes.INVOKEVIRTUAL;
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str5, "write", str7);
                                methodVisitor.visitLabel(label8);
                            }
                            methodVisitor.visitVarInsn(i16, context.var(str6));
                            methodVisitor.visitVarInsn(i17, i15);
                            methodVisitor.visitMethodInsn(i18, SerializeWriter, "write", str7);
                            aSMSerializerFactory = this;
                            str = str6;
                            str4 = str7;
                            i13 = i18;
                            c11 = 16;
                            c10 = 25;
                            z10 = true;
                            i10 = i19;
                        } else {
                            String str28 = str12;
                            int i23 = i21;
                            i11 = length;
                            str2 = str11;
                            i12 = i20;
                            str3 = str10;
                            String str29 = str14;
                            Label label19 = new Label();
                            Label label20 = new Label();
                            _get(methodVisitor, context, fieldInfo);
                            methodVisitor.visitInsn(89);
                            methodVisitor.visitVarInsn(58, context.var("field_" + fieldInfo.fieldClass.getName()));
                            methodVisitor.visitJumpInsn(Opcodes.IFNONNULL, label20);
                            methodVisitor.visitVarInsn(25, context.var(str28));
                            String str30 = SerializeWriter;
                            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str30, "writeNull", "()V");
                            methodVisitor.visitJumpInsn(Opcodes.GOTO, label19);
                            methodVisitor.visitLabel(label20);
                            Label label21 = new Label();
                            Label label22 = new Label();
                            methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                            methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                            methodVisitor.visitJumpInsn(Opcodes.IF_ACMPNE, label22);
                            _getFieldSer(context, methodVisitor, fieldInfo);
                            methodVisitor.visitVarInsn(58, context.var("fied_ser"));
                            Label label23 = new Label();
                            Label label24 = new Label();
                            if (context.writeDirect && Modifier.isPublic(cls4.getModifiers())) {
                                methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                                String str31 = JavaBeanSerializer;
                                methodVisitor.visitTypeInsn(Opcodes.INSTANCEOF, str31);
                                methodVisitor.visitJumpInsn(Opcodes.IFEQ, label23);
                                methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                                methodVisitor.visitTypeInsn(Opcodes.CHECKCAST, str31);
                                methodVisitor.visitVarInsn(25, 1);
                                methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                                methodVisitor.visitVarInsn(25, Context.fieldName);
                                methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                                methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                label = label19;
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str31, "writeAsArrayNonContext", str3 + JSONSerializer + str2);
                                methodVisitor.visitJumpInsn(Opcodes.GOTO, label24);
                                methodVisitor.visitLabel(label23);
                            } else {
                                label = label19;
                            }
                            methodVisitor.visitVarInsn(25, context.var("fied_ser"));
                            methodVisitor.visitVarInsn(25, 1);
                            methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                            methodVisitor.visitVarInsn(25, Context.fieldName);
                            methodVisitor.visitLdcInsn(Type.getType(ASMUtils.desc(cls4)));
                            methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                            String str32 = ObjectSerializer;
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append(str3);
                            String str33 = JSONSerializer;
                            sb4.append(str33);
                            sb4.append(str2);
                            methodVisitor.visitMethodInsn(Opcodes.INVOKEINTERFACE, str32, "write", sb4.toString());
                            methodVisitor.visitLabel(label24);
                            methodVisitor.visitJumpInsn(Opcodes.GOTO, label21);
                            methodVisitor.visitLabel(label22);
                            String format = fieldInfo.getFormat();
                            z10 = true;
                            methodVisitor.visitVarInsn(25, 1);
                            methodVisitor.visitVarInsn(25, context.var("field_" + fieldInfo.fieldClass.getName()));
                            if (format != null) {
                                methodVisitor.visitLdcInsn(format);
                                i14 = Opcodes.INVOKEVIRTUAL;
                                methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str33, "writeWithFormat", "(Ljava/lang/Object;Ljava/lang/String;)V");
                            } else {
                                i14 = Opcodes.INVOKEVIRTUAL;
                                methodVisitor.visitVarInsn(25, Context.fieldName);
                                java.lang.reflect.Type type4 = fieldInfo.fieldType;
                                if ((type4 instanceof Class) && ((Class) type4).isPrimitive()) {
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str33, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;)V");
                                } else {
                                    i10 = i19;
                                    methodVisitor.visitVarInsn(25, i10);
                                    methodVisitor.visitFieldInsn(Opcodes.GETFIELD, context.className, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
                                    methodVisitor.visitLdcInsn(Integer.valueOf(fieldInfo.serialzeFeatures));
                                    i13 = Opcodes.INVOKEVIRTUAL;
                                    methodVisitor.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str33, "writeWithFieldName", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                                    methodVisitor.visitLabel(label21);
                                    methodVisitor.visitLabel(label);
                                    str = str28;
                                    c10 = 25;
                                    methodVisitor.visitVarInsn(25, context.var(str));
                                    methodVisitor.visitVarInsn(16, i23);
                                    str4 = str29;
                                    methodVisitor.visitMethodInsn(i13, str30, "write", str4);
                                    aSMSerializerFactory = this;
                                }
                            }
                            i10 = i19;
                            i13 = i14;
                            methodVisitor.visitLabel(label21);
                            methodVisitor.visitLabel(label);
                            str = str28;
                            c10 = 25;
                            methodVisitor.visitVarInsn(25, context.var(str));
                            methodVisitor.visitVarInsn(16, i23);
                            str4 = str29;
                            methodVisitor.visitMethodInsn(i13, str30, "write", str4);
                            aSMSerializerFactory = this;
                        }
                        c11 = 16;
                    }
                    c10 = 25;
                    z10 = true;
                    aSMSerializerFactory = aSMSerializerFactory2;
                    i10 = i19;
                }
                aSMSerializerFactory = aSMSerializerFactory2;
                str = str12;
                i11 = length;
                str2 = str11;
                i12 = i20;
                str3 = str10;
                str4 = str14;
                c11 = 16;
                c10 = 25;
                z10 = true;
                i10 = i19;
            }
            i20 = i12 + 1;
            str14 = str4;
            str10 = str3;
            i19 = i10;
            str12 = str;
            str11 = str2;
            aSMSerializerFactory2 = aSMSerializerFactory;
            length = i11;
            fieldInfoArr2 = fieldInfoArr;
        }
    }

    private void generateWriteMethod(Class<?> cls, MethodVisitor methodVisitor, FieldInfo[] fieldInfoArr, Context context) {
        Label label;
        String str;
        int i10;
        int i11;
        ASMSerializerFactory aSMSerializerFactory = this;
        Class<?> cls2 = cls;
        MethodVisitor methodVisitor2 = methodVisitor;
        Label label2 = new Label();
        int length = fieldInfoArr.length;
        if (context.writeDirect) {
            label = label2;
        } else {
            Label label3 = new Label();
            Label label4 = new Label();
            label = label2;
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitLdcInsn(Integer.valueOf(SerializerFeature.PrettyFormat.mask));
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor2.visitJumpInsn(Opcodes.IFNE, label4);
            int length2 = fieldInfoArr.length;
            int i12 = 0;
            while (true) {
                if (i12 >= length2) {
                    methodVisitor2.visitJumpInsn(Opcodes.GOTO, label3);
                    break;
                } else {
                    if (fieldInfoArr[i12].method != null) {
                        methodVisitor2.visitVarInsn(25, context.var("out"));
                        methodVisitor2.visitLdcInsn(Integer.valueOf(SerializerFeature.IgnoreErrorGetter.mask));
                        methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
                        methodVisitor2.visitJumpInsn(Opcodes.IFEQ, label3);
                        break;
                    }
                    i12++;
                }
            }
            methodVisitor2.visitLabel(label4);
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKESPECIAL, JavaBeanSerializer, "write", "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor2.visitInsn(Opcodes.RETURN);
            methodVisitor2.visitLabel(label3);
        }
        if (!context.nonContext) {
            Label label5 = new Label();
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "writeReference", "(L" + JSONSerializer + ";Ljava/lang/Object;I)Z");
            methodVisitor2.visitJumpInsn(Opcodes.IFEQ, label5);
            methodVisitor2.visitInsn(Opcodes.RETURN);
            methodVisitor2.visitLabel(label5);
        }
        String str2 = context.writeDirect ? context.nonContext ? "writeAsArrayNonContext" : "writeAsArray" : "writeAsArrayNormal";
        int i13 = context.beanInfo.features;
        SerializerFeature serializerFeature = SerializerFeature.BeanToArray;
        if ((i13 & serializerFeature.mask) == 0) {
            Label label6 = new Label();
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitLdcInsn(Integer.valueOf(serializerFeature.mask));
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            methodVisitor2.visitJumpInsn(Opcodes.IFEQ, label6);
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, context.className, str2, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor2.visitInsn(Opcodes.RETURN);
            methodVisitor2.visitLabel(label6);
        } else {
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(21, 5);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, context.className, str2, "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            methodVisitor2.visitInsn(Opcodes.RETURN);
        }
        if (!context.nonContext) {
            methodVisitor2.visitVarInsn(25, 1);
            String str3 = JSONSerializer;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("()");
            String str4 = SerialContext_desc;
            sb2.append(str4);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str3, "getContext", sb2.toString());
            methodVisitor2.visitVarInsn(58, context.var("parent"));
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, context.var("parent"));
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitVarInsn(25, 3);
            methodVisitor2.visitLdcInsn(Integer.valueOf(context.beanInfo.features));
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str3, "setContext", "(" + str4 + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }
        boolean z10 = (context.beanInfo.features & SerializerFeature.WriteClassName.mask) != 0;
        if (z10 || !context.writeDirect) {
            Label label7 = new Label();
            Label label8 = new Label();
            Label label9 = new Label();
            if (z10) {
                str = "parent";
                i10 = Opcodes.INVOKEVIRTUAL;
            } else {
                methodVisitor2.visitVarInsn(25, 1);
                methodVisitor2.visitVarInsn(25, 4);
                methodVisitor2.visitVarInsn(25, 2);
                String str5 = JSONSerializer;
                str = "parent";
                i10 = Opcodes.INVOKEVIRTUAL;
                methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str5, "isWriteClassName", "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                methodVisitor2.visitJumpInsn(Opcodes.IFEQ, label8);
            }
            methodVisitor2.visitVarInsn(25, 4);
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitMethodInsn(i10, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            methodVisitor2.visitJumpInsn(Opcodes.IF_ACMPEQ, label8);
            methodVisitor2.visitLabel(label9);
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitVarInsn(16, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH);
            methodVisitor2.visitMethodInsn(i10, SerializeWriter, "write", "(I)V");
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitVarInsn(25, 1);
            if (context.beanInfo.typeKey != null) {
                methodVisitor2.visitLdcInsn(context.beanInfo.typeKey);
            } else {
                methodVisitor2.visitInsn(1);
            }
            methodVisitor2.visitVarInsn(25, 2);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JavaBeanSerializer, "writeClassName", "(L" + JSONSerializer + ";Ljava/lang/String;Ljava/lang/Object;)V");
            methodVisitor2.visitVarInsn(16, 44);
            methodVisitor2.visitJumpInsn(Opcodes.GOTO, label7);
            methodVisitor2.visitLabel(label8);
            methodVisitor2.visitVarInsn(16, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH);
            methodVisitor2.visitLabel(label7);
        } else {
            methodVisitor2.visitVarInsn(16, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH);
            str = "parent";
        }
        methodVisitor2.visitVarInsn(54, context.var("seperator"));
        if (!context.writeDirect) {
            aSMSerializerFactory._before(methodVisitor2, context);
        }
        if (context.writeDirect) {
            i11 = 0;
        } else {
            methodVisitor2.visitVarInsn(25, context.var("out"));
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isNotWriteDefaultValue", "()Z");
            methodVisitor2.visitVarInsn(54, context.var("notWriteDefaultValue"));
            methodVisitor2.visitVarInsn(25, 1);
            methodVisitor2.visitVarInsn(25, 0);
            String str6 = JSONSerializer;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("(");
            String str7 = SerializeFilterable_desc;
            sb3.append(str7);
            sb3.append(")Z");
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str6, "checkValue", sb3.toString());
            methodVisitor2.visitVarInsn(54, context.var("checkValue"));
            methodVisitor2.visitVarInsn(25, 1);
            i11 = 0;
            methodVisitor2.visitVarInsn(25, 0);
            methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str6, "hasNameFilters", "(" + str7 + ")Z");
            methodVisitor2.visitVarInsn(54, context.var("hasNameFilters"));
        }
        int i14 = i11;
        while (i14 < length) {
            FieldInfo fieldInfo = fieldInfoArr[i14];
            Class<?> cls3 = fieldInfo.fieldClass;
            methodVisitor2.visitLdcInsn(fieldInfo.name);
            methodVisitor2.visitVarInsn(58, Context.fieldName);
            if (cls3 == Byte.TYPE || cls3 == Short.TYPE || cls3 == Integer.TYPE) {
                aSMSerializerFactory._int(cls2, methodVisitor2, fieldInfo, context, context.var(cls3.getName()), 'I');
            } else if (cls3 == Long.TYPE) {
                aSMSerializerFactory._long(cls2, methodVisitor2, fieldInfo, context);
            } else if (cls3 == Float.TYPE) {
                aSMSerializerFactory._float(cls2, methodVisitor2, fieldInfo, context);
            } else if (cls3 == Double.TYPE) {
                aSMSerializerFactory._double(cls2, methodVisitor2, fieldInfo, context);
            } else if (cls3 == Boolean.TYPE) {
                aSMSerializerFactory._int(cls2, methodVisitor2, fieldInfo, context, context.var(TypedValues.Custom.S_BOOLEAN), 'Z');
                aSMSerializerFactory = this;
                methodVisitor2 = methodVisitor;
            } else if (cls3 == Character.TYPE) {
                aSMSerializerFactory = this;
                methodVisitor2 = methodVisitor;
                aSMSerializerFactory._int(cls, methodVisitor2, fieldInfo, context, context.var("char"), 'C');
            } else {
                aSMSerializerFactory = this;
                methodVisitor2 = methodVisitor;
                if (cls3 == String.class) {
                    aSMSerializerFactory._string(cls, methodVisitor2, fieldInfo, context);
                } else if (cls3 == BigDecimal.class) {
                    aSMSerializerFactory._decimal(cls, methodVisitor2, fieldInfo, context);
                } else if (List.class.isAssignableFrom(cls3)) {
                    aSMSerializerFactory._list(cls, methodVisitor2, fieldInfo, context);
                } else if (cls3.isEnum()) {
                    aSMSerializerFactory._enum(cls, methodVisitor2, fieldInfo, context);
                } else {
                    aSMSerializerFactory._object(cls, methodVisitor2, fieldInfo, context);
                }
            }
            i14++;
            cls2 = cls;
        }
        if (!context.writeDirect) {
            aSMSerializerFactory._after(methodVisitor2, context);
        }
        Label label10 = new Label();
        Label label11 = new Label();
        methodVisitor2.visitVarInsn(21, context.var("seperator"));
        methodVisitor2.visitIntInsn(16, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH);
        methodVisitor2.visitJumpInsn(Opcodes.IF_ICMPNE, label10);
        methodVisitor2.visitVarInsn(25, context.var("out"));
        methodVisitor2.visitVarInsn(16, PatchStatus.CODE_LOAD_RES_ADDASSERTPATH);
        String str8 = SerializeWriter;
        methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str8, "write", "(I)V");
        methodVisitor2.visitLabel(label10);
        methodVisitor2.visitVarInsn(25, context.var("out"));
        methodVisitor2.visitVarInsn(16, 125);
        methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str8, "write", "(I)V");
        methodVisitor2.visitLabel(label11);
        methodVisitor2.visitLabel(label);
        if (context.nonContext) {
            return;
        }
        methodVisitor2.visitVarInsn(25, 1);
        methodVisitor2.visitVarInsn(25, context.var(str));
        methodVisitor2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, JSONSerializer, "setContext", "(" + SerialContext_desc + ")V");
    }

    public JavaBeanSerializer createJavaBeanSerializer(SerializeBeanInfo serializeBeanInfo) {
        String str;
        boolean z10;
        Class<SerializeBeanInfo> cls;
        String str2;
        int i10;
        ClassWriter classWriter;
        String str3;
        int i11;
        boolean z11;
        boolean z12;
        String str4;
        boolean z13;
        boolean z14;
        boolean z15;
        String str5;
        FieldInfo[] fieldInfoArr;
        ClassWriter classWriter2;
        int i12;
        char c10;
        FieldInfo[] fieldInfoArr2;
        int i13;
        String str6;
        Method method;
        Class<?> cls2 = serializeBeanInfo.beanType;
        if (cls2.isPrimitive()) {
            throw new JSONException("unsupportd class " + cls2.getName());
        }
        JSONType jSONType = (JSONType) TypeUtils.getAnnotation(cls2, JSONType.class);
        FieldInfo[] fieldInfoArr3 = serializeBeanInfo.fields;
        for (FieldInfo fieldInfo : fieldInfoArr3) {
            if (fieldInfo.field == null && (method = fieldInfo.method) != null && method.getDeclaringClass().isInterface()) {
                return new JavaBeanSerializer(serializeBeanInfo);
            }
        }
        FieldInfo[] fieldInfoArr4 = serializeBeanInfo.sortedFields;
        boolean z16 = fieldInfoArr4 == serializeBeanInfo.fields;
        if (fieldInfoArr4.length > 256) {
            return new JavaBeanSerializer(serializeBeanInfo);
        }
        for (FieldInfo fieldInfo2 : fieldInfoArr4) {
            if (!ASMUtils.checkName(fieldInfo2.getMember().getName())) {
                return new JavaBeanSerializer(serializeBeanInfo);
            }
        }
        String str7 = "ASMSerializer_" + this.seed.incrementAndGet() + BundleUtil.UNDERLINE_TAG + cls2.getSimpleName();
        Package r42 = ASMSerializerFactory.class.getPackage();
        if (r42 != null) {
            String name = r42.getName();
            String str8 = name.replace('.', '/') + MqttTopic.TOPIC_LEVEL_SEPARATOR + str7;
            str7 = name + Consts.DOT + str7;
            str = str8;
        } else {
            str = str7;
        }
        ClassWriter classWriter3 = new ClassWriter();
        classWriter3.visit(49, 33, str, JavaBeanSerializer, new String[]{ObjectSerializer});
        ClassWriter classWriter4 = classWriter3;
        int length = fieldInfoArr4.length;
        int i14 = 0;
        while (i14 < length) {
            FieldInfo fieldInfo3 = fieldInfoArr4[i14];
            if (fieldInfo3.fieldClass.isPrimitive() || fieldInfo3.fieldClass == String.class) {
                str6 = str7;
            } else {
                StringBuilder sb2 = new StringBuilder();
                str6 = str7;
                sb2.append(fieldInfo3.name);
                sb2.append("_asm_fieldType");
                new FieldWriter(classWriter4, 1, sb2.toString(), "Ljava/lang/reflect/Type;").visitEnd();
                if (List.class.isAssignableFrom(fieldInfo3.fieldClass)) {
                    new FieldWriter(classWriter4, 1, fieldInfo3.name + "_asm_list_item_ser_", ObjectSerializer_desc).visitEnd();
                }
                new FieldWriter(classWriter4, 1, fieldInfo3.name + "_asm_ser_", ObjectSerializer_desc).visitEnd();
            }
            i14++;
            str7 = str6;
        }
        String str9 = str7;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("(");
        Class<SerializeBeanInfo> cls3 = SerializeBeanInfo.class;
        sb3.append(ASMUtils.desc(cls3));
        sb3.append(")V");
        MethodWriter methodWriter = new MethodWriter(classWriter4, 1, "<init>", sb3.toString(), null, null);
        methodWriter.visitVarInsn(25, 0);
        methodWriter.visitVarInsn(25, 1);
        methodWriter.visitMethodInsn(Opcodes.INVOKESPECIAL, JavaBeanSerializer, "<init>", "(" + ASMUtils.desc(cls3) + ")V");
        int i15 = 0;
        while (i15 < fieldInfoArr4.length) {
            FieldInfo fieldInfo4 = fieldInfoArr4[i15];
            if (fieldInfo4.fieldClass.isPrimitive() || fieldInfo4.fieldClass == String.class) {
                fieldInfoArr2 = fieldInfoArr4;
                i13 = i15;
            } else {
                methodWriter.visitVarInsn(25, 0);
                if (fieldInfo4.method != null) {
                    methodWriter.visitLdcInsn(Type.getType(ASMUtils.desc(fieldInfo4.declaringClass)));
                    methodWriter.visitLdcInsn(fieldInfo4.method.getName());
                    fieldInfoArr2 = fieldInfoArr4;
                    i13 = i15;
                    methodWriter.visitMethodInsn(Opcodes.INVOKESTATIC, ASMUtils.type(ASMUtils.class), "getMethodType", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");
                } else {
                    fieldInfoArr2 = fieldInfoArr4;
                    i13 = i15;
                    methodWriter.visitVarInsn(25, 0);
                    methodWriter.visitLdcInsn(Integer.valueOf(i13));
                    methodWriter.visitMethodInsn(Opcodes.INVOKESPECIAL, JavaBeanSerializer, "getFieldType", "(I)Ljava/lang/reflect/Type;");
                }
                methodWriter.visitFieldInsn(Opcodes.PUTFIELD, str, fieldInfo4.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
            }
            i15 = i13 + 1;
            fieldInfoArr4 = fieldInfoArr2;
        }
        FieldInfo[] fieldInfoArr5 = fieldInfoArr4;
        methodWriter.visitInsn(Opcodes.RETURN);
        methodWriter.visitMaxs(4, 4);
        methodWriter.visitEnd();
        if (jSONType != null) {
            for (SerializerFeature serializerFeature : jSONType.serialzeFeatures()) {
                if (serializerFeature == SerializerFeature.DisableCircularReferenceDetect) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        } else {
            z10 = false;
        }
        int i16 = 0;
        while (true) {
            JSONType jSONType2 = jSONType;
            cls = cls3;
            if (i16 >= 3) {
                break;
            }
            if (i16 == 0) {
                str4 = "write";
                z14 = z10;
                z13 = true;
            } else if (i16 == 1) {
                str4 = "writeNormal";
                z14 = z10;
                z13 = false;
            } else {
                str4 = "writeDirectNonContext";
                z13 = true;
                z14 = true;
            }
            FieldInfo[] fieldInfoArr6 = fieldInfoArr5;
            String str10 = str9;
            Context context = new Context(fieldInfoArr6, serializeBeanInfo, str, z13, z14);
            int i17 = i16;
            StringBuilder sb4 = new StringBuilder();
            sb4.append("(L");
            String str11 = JSONSerializer;
            sb4.append(str11);
            sb4.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter2 = new MethodWriter(classWriter4, 1, str4, sb4.toString(), null, new String[]{"java/io/IOException"});
            Label label = new Label();
            methodWriter2.visitVarInsn(25, 2);
            methodWriter2.visitJumpInsn(Opcodes.IFNONNULL, label);
            methodWriter2.visitVarInsn(25, 1);
            boolean z17 = z14;
            methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str11, "writeNull", "()V");
            methodWriter2.visitInsn(Opcodes.RETURN);
            methodWriter2.visitLabel(label);
            methodWriter2.visitVarInsn(25, 1);
            methodWriter2.visitFieldInsn(Opcodes.GETFIELD, str11, "out", SerializeWriter_desc);
            methodWriter2.visitVarInsn(58, context.var("out"));
            if (z16 || context.writeDirect || !(jSONType2 == null || jSONType2.alphabetic())) {
                z15 = z16;
                str5 = "(L";
            } else {
                Label label2 = new Label();
                methodWriter2.visitVarInsn(25, context.var("out"));
                z15 = z16;
                methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isSortField", "()Z");
                methodWriter2.visitJumpInsn(Opcodes.IFNE, label2);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                StringBuilder sb5 = new StringBuilder();
                str5 = "(L";
                sb5.append(str5);
                sb5.append(str11);
                sb5.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "writeUnsorted", sb5.toString());
                methodWriter2.visitInsn(Opcodes.RETURN);
                methodWriter2.visitLabel(label2);
            }
            if (!context.writeDirect || z17) {
                fieldInfoArr = fieldInfoArr3;
                classWriter2 = classWriter4;
                i12 = Opcodes.RETURN;
                c10 = 4;
            } else {
                Label label3 = new Label();
                Label label4 = new Label();
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                String str12 = JavaBeanSerializer;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str5);
                sb6.append(str11);
                classWriter2 = classWriter4;
                sb6.append(";)Z");
                fieldInfoArr = fieldInfoArr3;
                methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str12, "writeDirect", sb6.toString());
                methodWriter2.visitJumpInsn(Opcodes.IFNE, label4);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "writeNormal", str5 + str11 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                methodWriter2.visitInsn(Opcodes.RETURN);
                methodWriter2.visitLabel(label4);
                methodWriter2.visitVarInsn(25, context.var("out"));
                methodWriter2.visitLdcInsn(Integer.valueOf(SerializerFeature.DisableCircularReferenceDetect.mask));
                methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
                methodWriter2.visitJumpInsn(Opcodes.IFEQ, label3);
                methodWriter2.visitVarInsn(25, 0);
                methodWriter2.visitVarInsn(25, 1);
                methodWriter2.visitVarInsn(25, 2);
                methodWriter2.visitVarInsn(25, 3);
                c10 = 4;
                methodWriter2.visitVarInsn(25, 4);
                methodWriter2.visitVarInsn(21, 5);
                methodWriter2.visitMethodInsn(Opcodes.INVOKEVIRTUAL, str, "writeDirectNonContext", str5 + str11 + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                i12 = Opcodes.RETURN;
                methodWriter2.visitInsn(Opcodes.RETURN);
                methodWriter2.visitLabel(label3);
            }
            methodWriter2.visitVarInsn(25, 2);
            methodWriter2.visitTypeInsn(Opcodes.CHECKCAST, ASMUtils.type(cls2));
            methodWriter2.visitVarInsn(58, context.var("entity"));
            generateWriteMethod(cls2, methodWriter2, fieldInfoArr6, context);
            methodWriter2.visitInsn(i12);
            methodWriter2.visitMaxs(7, context.variantIndex + 2);
            methodWriter2.visitEnd();
            i16 = i17 + 1;
            fieldInfoArr5 = fieldInfoArr6;
            jSONType = jSONType2;
            cls3 = cls;
            z16 = z15;
            classWriter4 = classWriter2;
            str9 = str10;
            fieldInfoArr3 = fieldInfoArr;
        }
        FieldInfo[] fieldInfoArr7 = fieldInfoArr3;
        ClassWriter classWriter5 = classWriter4;
        String str13 = str9;
        FieldInfo[] fieldInfoArr8 = fieldInfoArr5;
        if (z16) {
            str2 = "(L";
            i10 = 180;
            classWriter = classWriter5;
        } else {
            str2 = "(L";
            Context context2 = new Context(fieldInfoArr8, serializeBeanInfo, str, false, z10);
            StringBuilder sb7 = new StringBuilder();
            sb7.append(str2);
            String str14 = JSONSerializer;
            sb7.append(str14);
            sb7.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            i10 = 180;
            classWriter = classWriter5;
            MethodWriter methodWriter3 = new MethodWriter(classWriter, 1, "writeUnsorted", sb7.toString(), null, new String[]{"java/io/IOException"});
            methodWriter3.visitVarInsn(25, 1);
            methodWriter3.visitFieldInsn(Opcodes.GETFIELD, str14, "out", SerializeWriter_desc);
            methodWriter3.visitVarInsn(58, context2.var("out"));
            methodWriter3.visitVarInsn(25, 2);
            methodWriter3.visitTypeInsn(Opcodes.CHECKCAST, ASMUtils.type(cls2));
            methodWriter3.visitVarInsn(58, context2.var("entity"));
            generateWriteMethod(cls2, methodWriter3, fieldInfoArr7, context2);
            methodWriter3.visitInsn(Opcodes.RETURN);
            methodWriter3.visitMaxs(7, context2.variantIndex + 2);
            methodWriter3.visitEnd();
        }
        int i18 = 0;
        for (int i19 = 3; i18 < i19; i19 = i19) {
            if (i18 == 0) {
                str3 = "writeAsArray";
                i11 = i10;
                z12 = z10;
                z11 = true;
            } else if (i18 == 1) {
                str3 = "writeAsArrayNormal";
                i11 = i10;
                z12 = z10;
                z11 = false;
            } else {
                str3 = "writeAsArrayNonContext";
                i11 = i10;
                z11 = true;
                z12 = true;
            }
            int i20 = i11;
            Context context3 = new Context(fieldInfoArr8, serializeBeanInfo, str, z11, z12);
            int i21 = i18;
            StringBuilder sb8 = new StringBuilder();
            sb8.append(str2);
            String str15 = JSONSerializer;
            sb8.append(str15);
            sb8.append(";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            MethodWriter methodWriter4 = new MethodWriter(classWriter, 1, str3, sb8.toString(), null, new String[]{"java/io/IOException"});
            methodWriter4.visitVarInsn(25, 1);
            methodWriter4.visitFieldInsn(i20, str15, "out", SerializeWriter_desc);
            methodWriter4.visitVarInsn(58, context3.var("out"));
            methodWriter4.visitVarInsn(25, 2);
            methodWriter4.visitTypeInsn(Opcodes.CHECKCAST, ASMUtils.type(cls2));
            methodWriter4.visitVarInsn(58, context3.var("entity"));
            generateWriteAsArray(cls2, methodWriter4, fieldInfoArr8, context3);
            methodWriter4.visitInsn(Opcodes.RETURN);
            methodWriter4.visitMaxs(7, context3.variantIndex + 2);
            methodWriter4.visitEnd();
            i18 = i21 + 1;
            i10 = i20;
        }
        byte[] byteArray = classWriter.toByteArray();
        return (JavaBeanSerializer) this.classLoader.defineClassPublic(str13, byteArray, 0, byteArray.length).getConstructor(cls).newInstance(serializeBeanInfo);
    }

    public static class Context {
        static final int features = 5;
        static int fieldName = 6;
        static final int obj = 2;
        static int original = 7;
        static final int paramFieldName = 3;
        static final int paramFieldType = 4;
        static int processValue = 8;
        static final int serializer = 1;
        private final SerializeBeanInfo beanInfo;
        private final String className;
        private final FieldInfo[] getters;
        private final boolean nonContext;
        private final boolean writeDirect;
        private Map<String, Integer> variants = new HashMap();
        private int variantIndex = 9;

        public Context(FieldInfo[] fieldInfoArr, SerializeBeanInfo serializeBeanInfo, String str, boolean z10, boolean z11) {
            this.getters = fieldInfoArr;
            this.className = str;
            this.beanInfo = serializeBeanInfo;
            this.writeDirect = z10;
            this.nonContext = z11 || serializeBeanInfo.beanType.isEnum();
        }

        public int getFieldOrinal(String str) {
            int length = this.getters.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (this.getters[i10].name.equals(str)) {
                    return i10;
                }
            }
            return -1;
        }

        public int var(String str) {
            if (this.variants.get(str) == null) {
                Map<String, Integer> map = this.variants;
                int i10 = this.variantIndex;
                this.variantIndex = i10 + 1;
                map.put(str, Integer.valueOf(i10));
            }
            return this.variants.get(str).intValue();
        }

        public int var(String str, int i10) {
            if (this.variants.get(str) == null) {
                this.variants.put(str, Integer.valueOf(this.variantIndex));
                this.variantIndex += i10;
            }
            return this.variants.get(str).intValue();
        }
    }
}
