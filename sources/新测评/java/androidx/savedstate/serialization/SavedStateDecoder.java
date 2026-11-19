package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.AbstractDecoder;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(m13557d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020(H\u0016J\b\u0010)\u001a\u00020\rH\u0016J\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020\u0019H\u0016J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120-H\u0002J\u000e\u0010.\u001a\b\u0012\u0004\u0012\u00020\r0-H\u0002J\b\u0010/\u001a\u000200H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u000208H\u0002J\b\u00109\u001a\u00020:H\u0002J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\r0<H\u0002¢\u0006\u0002\u0010=J\u0010\u0010>\u001a\u00020?2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010@\u001a\u00020\u001bH\u0016J!\u0010A\u001a\u0002HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0016¢\u0006\u0002\u0010EJ#\u0010F\u001a\u0004\u0018\u0001HB\"\u0004\b\u0000\u0010B2\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0002¢\u0006\u0002\u0010ER\u001a\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u0014X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006G"}, m13558d2 = {"Landroidx/savedstate/serialization/SavedStateDecoder;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "savedState", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "configuration", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "Landroid/os/Bundle;", "value", "", "key", "getKey$savedstate_release", "()Ljava/lang/String;", "index", "", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeBoolean", "", "decodeByte", "", "decodeShort", "", "decodeInt", "decodeLong", "", "decodeFloat", "", "decodeDouble", "", "decodeChar", "", "decodeString", "decodeEnum", "enumDescriptor", "decodeIntList", "", "decodeStringList", "decodeBooleanArray", "", "decodeCharArray", "", "decodeDoubleArray", "", "decodeFloatArray", "", "decodeIntArray", "", "decodeLongArray", "", "decodeStringArray", "", "()[Ljava/lang/String;", "beginStructure", "Lkotlinx/serialization/encoding/CompositeDecoder;", "decodeNotNullMark", "decodeSerializableValue", ExifInterface.GPS_DIRECTION_TRUE, "deserializer", "Lkotlinx/serialization/DeserializationStrategy;", "(Lkotlinx/serialization/DeserializationStrategy;)Ljava/lang/Object;", "decodeFormatSpecificTypes", "savedstate_release"}, m13559k = 1, m13560mv = {2, 0, 0}, m13562xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n*L\n1#1,215:1\n90#2:216\n90#2:217\n90#2:218\n90#2:219\n90#2:220\n90#2:221\n90#2:222\n90#2:223\n90#2:224\n90#2:225\n90#2:226\n90#2:227\n90#2:228\n90#2:229\n90#2:230\n90#2:231\n90#2:232\n90#2:233\n90#2:234\n90#2:235\n90#2:236\n90#2:237\n90#2:238\n*S KotlinDebug\n*F\n+ 1 SavedStateDecoder.kt\nandroidx/savedstate/serialization/SavedStateDecoder\n*L\n92#1:216\n116#1:217\n118#1:218\n120#1:219\n122#1:220\n124#1:221\n126#1:222\n128#1:223\n130#1:224\n132#1:225\n134#1:226\n137#1:227\n141#1:228\n145#1:229\n149#1:230\n153#1:231\n157#1:232\n161#1:233\n165#1:234\n169#1:235\n177#1:236\n184#1:237\n100#1:238\n*E\n"})
/* loaded from: classes3.dex */
public final class SavedStateDecoder extends AbstractDecoder {
    private final SavedStateConfiguration configuration;
    private int index;
    private String key;
    private final Bundle savedState;
    private final SerializersModule serializersModule;

    public SavedStateDecoder(Bundle savedState, SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    private final boolean[] decodeBooleanArray() {
        return SavedStateReader.m24094getBooleanArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private final char[] decodeCharArray() {
        return SavedStateReader.m24098getCharArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private final double[] decodeDoubleArray() {
        return SavedStateReader.m24108getDoubleArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private static final boolean decodeElementIndex$presentInEncoding(SavedStateDecoder savedStateDecoder, SerialDescriptor serialDescriptor, int i10) {
        return SavedStateReader.m24085containsimpl(SavedStateReader.m24084constructorimpl(savedStateDecoder.savedState), serialDescriptor.getElementName(i10));
    }

    private final float[] decodeFloatArray() {
        return SavedStateReader.m24112getFloatArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> T decodeFormatSpecificTypes(DeserializationStrategy<? extends T> deserializer) {
        T t10 = (T) SavedStateDecoder_androidKt.decodeFormatSpecificTypesOnPlatform(this, deserializer);
        if (t10 != null) {
            return t10;
        }
        SerialDescriptor descriptor = deserializer.getDescriptor();
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
            return (T) decodeIntList();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
            return (T) decodeStringList();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
            return (T) decodeBooleanArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
            return (T) decodeCharArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
            return (T) decodeDoubleArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
            return (T) decodeFloatArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
            return (T) decodeIntArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
            return (T) decodeLongArray();
        }
        if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
            return (T) decodeStringArray();
        }
        return null;
    }

    private final int[] decodeIntArray() {
        return SavedStateReader.m24116getIntArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private final List<Integer> decodeIntList() {
        return SavedStateReader.m24118getIntListimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private final long[] decodeLongArray() {
        return SavedStateReader.m24126getLongArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private final String[] decodeStringArray() {
        return SavedStateReader.m24156getStringArrayimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    private final List<String> decodeStringList() {
        return SavedStateReader.m24158getStringListimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public CompositeDecoder beginStructure(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return Intrinsics.areEqual(this.key, "") ? this : new SavedStateDecoder(SavedStateReader.m24141getSavedStateimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key), this.configuration);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeBoolean() {
        return SavedStateReader.m24093getBooleanimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public byte decodeByte() {
        return (byte) SavedStateReader.m24115getIntimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public char decodeChar() {
        return SavedStateReader.m24097getCharimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public double decodeDouble() {
        return SavedStateReader.m24107getDoubleimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.CompositeDecoder
    public int decodeElementIndex(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int iM24164sizeimpl = (Intrinsics.areEqual(descriptor.getKind(), StructureKind.LIST.INSTANCE) || Intrinsics.areEqual(descriptor.getKind(), StructureKind.MAP.INSTANCE)) ? SavedStateReader.m24164sizeimpl(SavedStateReader.m24084constructorimpl(this.savedState)) : descriptor.getElementsCount();
        while (true) {
            int i10 = this.index;
            if (i10 >= iM24164sizeimpl || !descriptor.isElementOptional(i10) || decodeElementIndex$presentInEncoding(this, descriptor, this.index)) {
                break;
            }
            this.index++;
        }
        int i11 = this.index;
        if (i11 >= iM24164sizeimpl) {
            return -1;
        }
        this.key = descriptor.getElementName(i11);
        int i12 = this.index;
        this.index = i12 + 1;
        return i12;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeEnum(SerialDescriptor enumDescriptor) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        return SavedStateReader.m24115getIntimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public float decodeFloat() {
        return SavedStateReader.m24111getFloatimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public int decodeInt() {
        return SavedStateReader.m24115getIntimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public long decodeLong() {
        return SavedStateReader.m24125getLongimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public boolean decodeNotNullMark() {
        return !SavedStateReader.m24163isNullimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public <T> T decodeSerializableValue(DeserializationStrategy<? extends T> deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        T t10 = (T) decodeFormatSpecificTypes(deserializer);
        return t10 == null ? (T) super.decodeSerializableValue(deserializer) : t10;
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public short decodeShort() {
        return (short) SavedStateReader.m24115getIntimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    @Override // kotlinx.serialization.encoding.AbstractDecoder, kotlinx.serialization.encoding.Decoder
    public String decodeString() {
        return SavedStateReader.m24155getStringimpl(SavedStateReader.m24084constructorimpl(this.savedState), this.key);
    }

    /* renamed from: getKey$savedstate_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: getSavedState$savedstate_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @Override // kotlinx.serialization.encoding.Decoder, kotlinx.serialization.encoding.CompositeDecoder
    public SerializersModule getSerializersModule() {
        return this.serializersModule;
    }
}
