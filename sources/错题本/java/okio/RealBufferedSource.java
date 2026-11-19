package okio;

import androidx.collection.AbstractC0584a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.AbstractC5830k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p204y1.AbstractC6768a;

@Metadata(m5109d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\n\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b \u0010!J)\u0010 \u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010#*\u00020\"2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0016¢\u0006\u0004\b \u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010'\u001a\u00020&2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010)J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b\f\u0010*J\u0017\u0010+\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010,J'\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020&2\u0006\u0010-\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\f\u0010.J\u0017\u0010\f\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020/H\u0016¢\u0006\u0004\b\f\u00100J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b+\u00101J\u0017\u00103\u001a\u00020\n2\u0006\u0010\t\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00106\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b6\u00108J\u0017\u0010;\u001a\u0002052\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010;\u001a\u0002052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010=J\u0011\u0010>\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b>\u00107J\u000f\u0010?\u001a\u000205H\u0016¢\u0006\u0004\b?\u00107J\u0017\u0010?\u001a\u0002052\u0006\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b?\u00108J\u000f\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bA\u0010BJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020CH\u0016¢\u0006\u0004\bF\u0010EJ\u000f\u0010G\u001a\u00020\u001fH\u0016¢\u0006\u0004\bG\u0010BJ\u000f\u0010H\u001a\u00020\u001fH\u0016¢\u0006\u0004\bH\u0010BJ\u000f\u0010I\u001a\u00020\nH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\nH\u0016¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\nH\u0016¢\u0006\u0004\bL\u0010JJ\u000f\u0010M\u001a\u00020\nH\u0016¢\u0006\u0004\bM\u0010JJ\u0017\u0010N\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\bN\u0010\u0013J\u0017\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u0016H\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010SJ'\u0010P\u001a\u00020\n2\u0006\u0010O\u001a\u00020\u00162\u0006\u0010R\u001a\u00020\n2\u0006\u0010T\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010UJ\u0017\u0010P\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\bP\u0010WJ\u001f\u0010P\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\bP\u0010XJ\u0017\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\u0019H\u0016¢\u0006\u0004\bZ\u0010WJ\u001f\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\nH\u0016¢\u0006\u0004\bZ\u0010XJ\u001f\u0010[\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u0019H\u0016¢\u0006\u0004\b[\u0010\\J/\u0010[\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\n2\u0006\u0010V\u001a\u00020\u00192\u0006\u0010]\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b[\u0010^J\u000f\u0010_\u001a\u00020\u0001H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010b\u001a\u00020aH\u0016¢\u0006\u0004\bb\u0010cJ\u000f\u0010d\u001a\u00020\u000eH\u0016¢\u0006\u0004\bd\u0010\u0010J\u000f\u0010e\u001a\u00020\u0011H\u0016¢\u0006\u0004\be\u0010fJ\u000f\u0010h\u001a\u00020gH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u000205H\u0016¢\u0006\u0004\bj\u00107R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010kR\u0014\u0010l\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0016\u0010n\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u001b\u0010\u0007\u001a\u00020\u00068Ö\u0002X\u0096\u0004¢\u0006\f\u0012\u0004\bq\u0010f\u001a\u0004\bp\u0010\b¨\u0006r"}, m5110d2 = {"Lokio/RealBufferedSource;", "Lokio/BufferedSource;", "Lokio/Source;", "source", "<init>", "(Lokio/Source;)V", "Lokio/Buffer;", "buffer", "()Lokio/Buffer;", "sink", "", "byteCount", "read", "(Lokio/Buffer;J)J", "", "exhausted", "()Z", "Ld6/s;", "require", "(J)V", "request", "(J)Z", "", "readByte", "()B", "Lokio/ByteString;", "readByteString", "()Lokio/ByteString;", "(J)Lokio/ByteString;", "Lokio/Options;", "options", "", "select", "(Lokio/Options;)I", "", ExifInterface.GPS_DIRECTION_TRUE, "Lokio/TypedOptions;", "(Lokio/TypedOptions;)Ljava/lang/Object;", "", "readByteArray", "()[B", "(J)[B", "([B)I", "readFully", "([B)V", TypedValues.CycleType.S_WAVE_OFFSET, "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "(Lokio/Buffer;J)V", "Lokio/Sink;", "readAll", "(Lokio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "()I", "", "readShort", "()S", "readShortLe", "readInt", "readIntLe", "readLong", "()J", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "skip", "b", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lokio/ByteString;)J", "(Lokio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLokio/ByteString;)Z", "bytesOffset", "(JLokio/ByteString;II)Z", "peek", "()Lokio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "isOpen", "close", "()V", "Lokio/Timeout;", "timeout", "()Lokio/Timeout;", "toString", "Lokio/Source;", "bufferField", "Lokio/Buffer;", "closed", "Z", "getBuffer", "getBuffer$annotations", "okio"}, m5111k = 1, m5112mv = {2, 1, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 2 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BufferedSource.kt\nokio/internal/-BufferedSource\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,205:1\n63#1:211\n63#1:222\n63#1:229\n63#1:235\n63#1:237\n63#1:241\n63#1:246\n63#1:264\n63#1:268\n63#1:275\n63#1:288\n63#1:297\n63#1:298\n63#1:299\n63#1:305\n63#1:313\n63#1:326\n63#1:330\n63#1:331\n63#1:332\n63#1:333\n63#1:338\n63#1:350\n63#1:366\n63#1:376\n63#1:379\n63#1:382\n63#1:385\n63#1:388\n63#1:391\n63#1:397\n63#1:414\n63#1:434\n63#1:449\n63#1:466\n63#1:479\n63#1:500\n63#1:507\n38#2:206\n39#2,3:208\n42#2,7:212\n52#2:219\n53#2:221\n57#2,2:223\n61#2:225\n62#2,2:227\n64#2,3:230\n70#2,2:233\n75#2:236\n76#2:238\n80#2,2:239\n85#2:242\n87#2,2:244\n89#2,13:247\n108#2:263\n109#2:265\n113#2,2:266\n118#2,6:269\n124#2,9:276\n135#2,3:285\n138#2,6:289\n144#2:296\n148#2,5:300\n153#2,5:306\n160#2,2:311\n162#2,11:314\n176#2:325\n177#2:327\n181#2,2:328\n186#2,4:334\n190#2,6:339\n200#2:345\n201#2,3:347\n204#2,8:351\n212#2,3:360\n219#2,3:363\n222#2,7:367\n232#2,2:374\n237#2,2:377\n242#2,2:380\n247#2,2:383\n252#2,2:386\n257#2,2:389\n262#2,5:392\n267#2,11:398\n281#2,5:409\n286#2,14:415\n303#2,2:429\n305#2,2:432\n307#2,7:435\n316#2,2:442\n318#2,4:445\n322#2,11:450\n336#2,2:461\n339#2,2:464\n341#2,7:467\n352#2,2:474\n355#2,2:477\n357#2,7:480\n373#2:487\n375#2,11:489\n387#2:501\n391#2:502\n395#2,4:503\n399#2:508\n401#2:509\n403#2:510\n1#3:207\n1#3:220\n1#3:226\n1#3:243\n1#3:346\n1#3:431\n1#3:444\n1#3:463\n1#3:476\n1#3:488\n26#4,3:260\n88#5:295\n88#5:359\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/RealBufferedSource\n*L\n67#1:211\n68#1:222\n70#1:229\n71#1:235\n72#1:237\n73#1:241\n74#1:246\n76#1:264\n77#1:268\n79#1:275\n81#1:288\n84#1:297\n85#1:298\n89#1:299\n93#1:305\n94#1:313\n95#1:326\n96#1:330\n99#1:331\n100#1:332\n105#1:333\n108#1:338\n110#1:350\n111#1:366\n112#1:376\n113#1:379\n114#1:382\n115#1:385\n116#1:388\n117#1:391\n118#1:397\n119#1:414\n120#1:434\n125#1:449\n129#1:466\n133#1:479\n147#1:500\n201#1:507\n67#1:206\n67#1:208,3\n67#1:212,7\n68#1:219\n68#1:221\n69#1:223,2\n70#1:225\n70#1:227,2\n70#1:230,3\n71#1:233,2\n72#1:236\n72#1:238\n73#1:239,2\n74#1:242\n74#1:244,2\n74#1:247,13\n76#1:263\n76#1:265\n77#1:266,2\n79#1:269,6\n79#1:276,9\n81#1:285,3\n81#1:289,6\n81#1:296\n93#1:300,5\n93#1:306,5\n94#1:311,2\n94#1:314,11\n95#1:325\n95#1:327\n96#1:328,2\n108#1:334,4\n108#1:339,6\n110#1:345\n110#1:347,3\n110#1:351,8\n110#1:360,3\n111#1:363,3\n111#1:367,7\n112#1:374,2\n113#1:377,2\n114#1:380,2\n115#1:383,2\n116#1:386,2\n117#1:389,2\n118#1:392,5\n118#1:398,11\n119#1:409,5\n119#1:415,14\n120#1:429,2\n120#1:432,2\n120#1:435,7\n125#1:442,2\n125#1:445,4\n125#1:450,11\n129#1:461,2\n129#1:464,2\n129#1:467,7\n133#1:474,2\n133#1:477,2\n133#1:480,7\n147#1:487\n147#1:489,11\n147#1:501\n149#1:502\n201#1:503,4\n201#1:508\n202#1:509\n203#1:510\n67#1:207\n68#1:220\n70#1:226\n74#1:243\n110#1:346\n120#1:431\n125#1:444\n129#1:463\n133#1:476\n147#1:488\n75#1:260,3\n81#1:295\n110#1:359\n*E\n"})
/* loaded from: classes4.dex */
public final class RealBufferedSource implements BufferedSource {

    @JvmField
    @NotNull
    public final Buffer bufferField;

    @JvmField
    public boolean closed;

    @JvmField
    @NotNull
    public final Source source;

    public RealBufferedSource(@NotNull Source source) {
        AbstractC5830k.m5330g(source, "source");
        this.source = source;
        this.bufferField = new Buffer();
    }

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    /* renamed from: buffer, reason: from getter */
    public Buffer getBufferField() {
        return this.bufferField;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.source.close();
        this.bufferField.clear();
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        return this.bufferField.exhausted() && this.source.read(this.bufferField, 8192L) == -1;
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b6) {
        return indexOf(b6, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        AbstractC5830k.m5330g(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.RealBufferedSource.inputStream.1
            @Override // java.io.InputStream
            public int available() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                return (int) Math.min(realBufferedSource.bufferField.size(), Integer.MAX_VALUE);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                RealBufferedSource.this.close();
            }

            @Override // java.io.InputStream
            public int read() throws IOException {
                RealBufferedSource realBufferedSource = RealBufferedSource.this;
                if (realBufferedSource.closed) {
                    throw new IOException("closed");
                }
                if (realBufferedSource.bufferField.size() == 0) {
                    RealBufferedSource realBufferedSource2 = RealBufferedSource.this;
                    if (realBufferedSource2.source.read(realBufferedSource2.bufferField, 8192L) == -1) {
                        return -1;
                    }
                }
                return RealBufferedSource.this.bufferField.readByte() & 255;
            }

            public String toString() {
                return RealBufferedSource.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public long transferTo(OutputStream out) throws IOException {
                AbstractC5830k.m5330g(out, "out");
                if (RealBufferedSource.this.closed) {
                    throw new IOException("closed");
                }
                long size = 0;
                while (true) {
                    if (RealBufferedSource.this.bufferField.size() == 0) {
                        RealBufferedSource realBufferedSource = RealBufferedSource.this;
                        if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                            return size;
                        }
                    }
                    size += RealBufferedSource.this.bufferField.size();
                    Buffer.writeTo$default(RealBufferedSource.this.bufferField, out, 0L, 2, null);
                }
            }

            @Override // java.io.InputStream
            public int read(byte[] data, int offset, int byteCount) throws IOException {
                AbstractC5830k.m5330g(data, "data");
                if (!RealBufferedSource.this.closed) {
                    SegmentedByteString.checkOffsetAndCount(data.length, offset, byteCount);
                    if (RealBufferedSource.this.bufferField.size() == 0) {
                        RealBufferedSource realBufferedSource = RealBufferedSource.this;
                        if (realBufferedSource.source.read(realBufferedSource.bufferField, 8192L) == -1) {
                            return -1;
                        }
                    }
                    return RealBufferedSource.this.bufferField.read(data, offset, byteCount);
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes) {
        AbstractC5830k.m5330g(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        AbstractC5830k.m5330g(sink, "sink");
        return read(sink, 0, sink.length);
    }

    @Override // okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        long j7 = 0;
        while (this.source.read(this.bufferField, 8192L) != -1) {
            long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j7 += jCompleteSegmentByteCount;
                sink.write(this.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (this.bufferField.size() <= 0) {
            return j7;
        }
        long size = this.bufferField.size() + j7;
        Buffer buffer = this.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        require(1L);
        return this.bufferField.readByte();
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteArray();
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readByteString();
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        byte b6;
        require(1L);
        long j7 = 0;
        while (true) {
            long j8 = j7 + 1;
            if (!request(j8)) {
                break;
            }
            b6 = this.bufferField.getByte(j7);
            if ((b6 < 48 || b6 > 57) && !(j7 == 0 && b6 == 45)) {
                break;
            }
            j7 = j8;
        }
        if (j7 == 0) {
            AbstractC6768a.m6440d(16);
            String string = Integer.toString(b6, 16);
            AbstractC5830k.m5329f(string, "toString(...)");
            throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(string));
        }
        return this.bufferField.readDecimalLong();
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        AbstractC5830k.m5330g(sink, "sink");
        try {
            require(sink.length);
            this.bufferField.readFully(sink);
        } catch (EOFException e) {
            int i = 0;
            while (this.bufferField.size() > 0) {
                Buffer buffer = this.bufferField;
                int i8 = buffer.read(sink, i, (int) buffer.size());
                if (i8 == -1) {
                    throw new AssertionError();
                }
                i += i8;
            }
            throw e;
        }
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        byte b6;
        require(1L);
        int i = 0;
        while (true) {
            int i8 = i + 1;
            if (!request(i8)) {
                break;
            }
            b6 = this.bufferField.getByte(i);
            if ((b6 < 48 || b6 > 57) && ((b6 < 97 || b6 > 102) && (b6 < 65 || b6 > 70))) {
                break;
            }
            i = i8;
        }
        if (i == 0) {
            AbstractC6768a.m6440d(16);
            String string = Integer.toString(b6, 16);
            AbstractC5830k.m5329f(string, "toString(...)");
            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
        }
        return this.bufferField.readHexadecimalUnsignedLong();
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        require(4L);
        return this.bufferField.readInt();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        require(4L);
        return this.bufferField.readIntLe();
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        require(8L);
        return this.bufferField.readLong();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        require(8L);
        return this.bufferField.readLongLe();
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        require(2L);
        return this.bufferField.readShort();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        require(2L);
        return this.bufferField.readShortLe();
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(long byteCount, @NotNull Charset charset) throws EOFException {
        AbstractC5830k.m5330g(charset, "charset");
        require(byteCount);
        return this.bufferField.readString(byteCount, charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8() throws IOException {
        this.bufferField.writeAll(this.source);
        return this.bufferField.readUtf8();
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        require(1L);
        byte b6 = this.bufferField.getByte(0L);
        if ((b6 & 224) == 192) {
            require(2L);
        } else if ((b6 & 240) == 224) {
            require(3L);
        } else if ((b6 & 248) == 240) {
            require(4L);
        }
        return this.bufferField.readUtf8CodePoint();
    }

    @Override // okio.BufferedSource
    @Nullable
    public String readUtf8Line() {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (this.bufferField.size() != 0) {
            return readUtf8(this.bufferField.size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public boolean request(long byteCount) {
        if (byteCount < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount < 0: ").toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (this.bufferField.size() < byteCount) {
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (!request(byteCount)) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        AbstractC5830k.m5330g(options, "options");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            int iSelectPrefix = okio.internal.Buffer.selectPrefix(this.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix != -1) {
                    this.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                    return iSelectPrefix;
                }
            } else if (this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
        }
        return -1;
    }

    @Override // okio.BufferedSource
    public void skip(long byteCount) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (byteCount > 0) {
            if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(byteCount, this.bufferField.size());
            this.bufferField.skip(jMin);
            byteCount -= jMin;
        }
    }

    @Override // okio.Source
    @NotNull
    /* renamed from: timeout */
    public Timeout getTimeout() {
        return this.source.getTimeout();
    }

    @NotNull
    public String toString() {
        return "buffer(" + this.source + ')';
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b6, long fromIndex) {
        return indexOf(b6, fromIndex, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long fromIndex) {
        AbstractC5830k.m5330g(targetBytes, "targetBytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOfElement = this.bufferField.indexOfElement(targetBytes, fromIndex);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, size);
        }
    }

    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) {
        AbstractC5830k.m5330g(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(byteCount, "byteCount < 0: ").toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (this.bufferField.size() == 0) {
            if (byteCount == 0) {
                return 0L;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
        }
        return this.bufferField.read(sink, Math.min(byteCount, this.bufferField.size()));
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(AbstractC0584a.m913n(limit, "limit < 0: ").toString());
        }
        long j7 = limit == Long.MAX_VALUE ? Long.MAX_VALUE : limit + 1;
        long jIndexOf = indexOf((byte) 10, 0L, j7);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, jIndexOf);
        }
        if (j7 < Long.MAX_VALUE && request(j7) && this.bufferField.getByte(j7 - 1) == 13 && request(j7 + 1) && this.bufferField.getByte(j7) == 10) {
            return okio.internal.Buffer.readUtf8Line(this.bufferField, j7);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = this.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.bufferField.size(), limit) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) {
        AbstractC5830k.m5330g(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes, int bytesOffset, int byteCount) {
        AbstractC5830k.m5330g(bytes, "bytes");
        if (!this.closed) {
            if (offset < 0 || bytesOffset < 0 || byteCount < 0 || bytes.size() - bytesOffset < byteCount) {
                return false;
            }
            for (int i = 0; i < byteCount; i++) {
                long j7 = i + offset;
                if (!request(1 + j7) || this.bufferField.getByte(j7) != bytes.getByte(bytesOffset + i)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b6, long fromIndex, long toIndex) {
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        long jMax = fromIndex;
        while (jMax < toIndex) {
            byte b9 = b6;
            long j7 = toIndex;
            long jIndexOf = this.bufferField.indexOf(b9, jMax, j7);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (size >= j7 || this.source.read(this.bufferField, 8192L) == -1) {
                break;
            }
            jMax = Math.max(jMax, size);
            b6 = b9;
            toIndex = j7;
        }
        return -1L;
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) throws IOException {
        AbstractC5830k.m5330g(charset, "charset");
        this.bufferField.writeAll(this.source);
        return this.bufferField.readString(charset);
    }

    @Override // okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteArray(byteCount);
    }

    @Override // okio.BufferedSource
    @NotNull
    public ByteString readByteString(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readByteString(byteCount);
    }

    @Override // okio.BufferedSource
    @NotNull
    public String readUtf8(long byteCount) throws EOFException {
        require(byteCount);
        return this.bufferField.readUtf8(byteCount);
    }

    @Override // okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long byteCount) throws IOException {
        AbstractC5830k.m5330g(sink, "sink");
        try {
            require(byteCount);
            this.bufferField.readFully(sink, byteCount);
        } catch (EOFException e) {
            sink.writeAll(this.bufferField);
            throw e;
        }
    }

    @Override // okio.BufferedSource
    @Nullable
    public <T> T select(@NotNull TypedOptions<T> options) throws IOException {
        AbstractC5830k.m5330g(options, "options");
        int iSelect = select(options.getOptions());
        if (iSelect == -1) {
            return null;
        }
        return options.get(iSelect);
    }

    @Override // okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long fromIndex) throws IOException {
        AbstractC5830k.m5330g(bytes, "bytes");
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        while (true) {
            long jIndexOf = this.bufferField.indexOf(bytes, fromIndex);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = this.bufferField.size();
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1L;
            }
            fromIndex = Math.max(fromIndex, (size - bytes.size()) + 1);
        }
    }

    @Override // okio.BufferedSource
    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        AbstractC5830k.m5330g(sink, "sink");
        long j7 = byteCount;
        SegmentedByteString.checkOffsetAndCount(sink.length, offset, j7);
        if (this.bufferField.size() == 0) {
            if (byteCount == 0) {
                return 0;
            }
            if (this.source.read(this.bufferField, 8192L) == -1) {
                return -1;
            }
        }
        return this.bufferField.read(sink, offset, (int) Math.min(j7, this.bufferField.size()));
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) {
        AbstractC5830k.m5330g(sink, "sink");
        if (this.bufferField.size() == 0 && this.source.read(this.bufferField, 8192L) == -1) {
            return -1;
        }
        return this.bufferField.read(sink);
    }
}
