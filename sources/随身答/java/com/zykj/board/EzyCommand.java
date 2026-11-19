package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.AnyProto;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyCommandEnum;
import com.zykj.board.EzyGraphEnum;
import com.zykj.board.EzyHeader;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPageSnapshot;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyRectF;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class EzyCommand {

    /* renamed from: a */
    public static final Descriptors.Descriptor f9162a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f9163b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f9164c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f9165d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f9166e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f9167f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f9168g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f9169h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f9170i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f9171j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f9172k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f9173l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f9174m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f9175n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f9176o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f9177p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f9178q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f9179r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f9180s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f9181t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f9182u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f9183v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f9184w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f9185x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f9186y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rCommand.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017enums/CommandEnum.proto\u001a\u0015enums/GraphEnum.proto\u001a\u0011utils/RectF.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0013GraphSnapshot.proto\u001a\fHeader.proto\"\u0092\u000b\n\rCommandSource\u0012/\n\u000bcommandInfo\u0018\u0001 \u0003(\u000b2\u001a.CommandSource.CommandInfo\u001aÏ\n\n\u000bCommandInfo\u0012\u0011\n\tdelayTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006isPlay\u0018\u0003 \u0001(\b\u0012!\n\u000bcommandEnum\u0018\u0004 \u0001(\u000e2\f.CommandEnum\u0012\f\n\u0004data\u0018\u0005 \u0001(\f\u001a¥\u0001\n\tGraphData\u0012\u001d\n\tgraphEnum\u0018\u0001 \u0001(\u000e2\n.GraphEnum\u0012\u000f\n\u0007graphId\u0018\u0002 \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0015\n\rparentGraphId\u0018\u0004 \u0001(\t\u0012\u0016\n\u000esourceFileName\u0018\u0005 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\t\u001aF\n\u000bGraphRemove\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u001a¬\u0001\n\u000bGraphMatrix\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u0012\u001d\n\foriginMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0003 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0004 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0005 \u0001(\u0005\u001aÈ\u0001\n\u000bGraphChange\u0012\u000f\n\u0007graphId\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0005 \u0001(\u000b2\u0006.Paint\u0012\u0017\n\u0006points\u0018\u0006 \u0003(\u000b2\u0007.PointF\u0012\u001d\n\frenderMatrix\u0018\u0007 \u0001(\u000b2\u0007.Matrix\u0012\u0010\n\bfilePath\u0018\b \u0001(\t\u001aB\n\nAudioStart\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\u001at\n\fCameraMatrix\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0003 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0004 \u0001(\u0005\u001aD\n\u0006Camera\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u001a®\u0001\n\u0006Config\u0012\u0018\n\u0010originBackground\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000elastBackground\u0018\u0002 \u0001(\u0005\u00129\n\u001aoriginBackgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u0004 \u0001(\u000b2\u0015.BackgroundLineConfig\u001a6\n\nCursorMove\u0012\u0016\n\u000esourceFileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0002 \u0001(\u0005\u001a\u0086\u0001\n\u0007REBUILD\u0012-\n\bsnapshot\u0018\u0001 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0017\n\u000fbackgroundColor\u0018\u0002 \u0001(\u0005\u00123\n\u0014backgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfigB\u001c\n\u000ecom.zykj.boardB\nEzyCommandb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), EzyCommandEnum.m8598a(), EzyGraphEnum.m8608a(), EzyRectF.m9169c(), EzyMatrix.m8838c(), EzyPaint.m9092c(), EzyPointF.m9134c(), EzyPageSnapshot.m8964e(), EzyHeader.m8621i()});

    public static final class CommandSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final CommandSource f9187c = new CommandSource();

        /* renamed from: d */
        public static final Parser f9188d = new C7093a();

        /* renamed from: a */
        public List f9189a;

        /* renamed from: b */
        public byte f9190b;

        public static final class CommandInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: g */
            public static final CommandInfo f9191g = new CommandInfo();

            /* renamed from: h */
            public static final Parser f9192h = new C7091a();

            /* renamed from: a */
            public long f9193a;

            /* renamed from: b */
            public long f9194b;

            /* renamed from: c */
            public boolean f9195c;

            /* renamed from: d */
            public int f9196d;

            /* renamed from: e */
            public ByteString f9197e;

            /* renamed from: f */
            public byte f9198f;

            public static final class AudioStart extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final AudioStart f9199e = new AudioStart();

                /* renamed from: f */
                public static final Parser f9200f = new C7071a();

                /* renamed from: a */
                public volatile Object f9201a;

                /* renamed from: b */
                public long f9202b;

                /* renamed from: c */
                public volatile Object f9203c;

                /* renamed from: d */
                public byte f9204d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$a */
                public class C7071a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public AudioStart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7072b c7072bM8090w = AudioStart.m8090w();
                        try {
                            c7072bM8090w.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7072bM8090w.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7072bM8090w.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7072bM8090w.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7072bM8090w.buildPartial());
                        }
                    }
                }

                /* renamed from: A */
                public static AudioStart m8083A(byte[] bArr) {
                    return (AudioStart) f9200f.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9174m;
                }

                /* renamed from: q */
                public static AudioStart m8089q() {
                    return f9199e;
                }

                /* renamed from: w */
                public static C7072b m8090w() {
                    return f9199e.toBuilder();
                }

                /* renamed from: z */
                public static AudioStart m8091z(ByteString byteString) {
                    return (AudioStart) f9200f.parseFrom(byteString);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public C7072b toBuilder() {
                    return this == f9199e ? new C7072b() : new C7072b().m8110o(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof AudioStart)) {
                        return super.equals(obj);
                    }
                    AudioStart audioStart = (AudioStart) obj;
                    return getFileName().equals(audioStart.getFileName()) && m8094u() == audioStart.m8094u() && m8095v().equals(audioStart.m8095v()) && getUnknownFields().equals(audioStart.getUnknownFields());
                }

                public String getFileName() {
                    Object obj = this.f9201a;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9201a = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9200f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9201a) ? GeneratedMessageV3.computeStringSize(1, this.f9201a) : 0;
                    long j9 = this.f9202b;
                    if (j9 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt64Size(2, j9);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9203c)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f9203c);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(m8094u())) * 37) + 3) * 53) + m8095v().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9175n.ensureFieldAccessorsInitialized(AudioStart.class, C7072b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9204d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9204d = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new AudioStart();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public AudioStart getDefaultInstanceForType() {
                    return f9199e;
                }

                /* renamed from: u */
                public long m8094u() {
                    return this.f9202b;
                }

                /* renamed from: v */
                public String m8095v() {
                    Object obj = this.f9203c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9203c = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!GeneratedMessageV3.isStringEmpty(this.f9201a)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9201a);
                    }
                    long j9 = this.f9202b;
                    if (j9 != 0) {
                        codedOutputStream.writeInt64(2, j9);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9203c)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.f9203c);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7072b newBuilderForType() {
                    return m8090w();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C7072b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7072b(builderParent);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$b */
                public static final class C7072b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9205a;

                    /* renamed from: b */
                    public Object f9206b;

                    /* renamed from: c */
                    public long f9207c;

                    /* renamed from: d */
                    public Object f9208d;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7072b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7072b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public AudioStart build() {
                        AudioStart audioStartBuildPartial = buildPartial();
                        if (audioStartBuildPartial.isInitialized()) {
                            return audioStartBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioStartBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public AudioStart buildPartial() {
                        AudioStart audioStart = new AudioStart(this);
                        if (this.f9205a != 0) {
                            m8102f(audioStart);
                        }
                        onBuilt();
                        return audioStart;
                    }

                    /* renamed from: f */
                    public final void m8102f(AudioStart audioStart) {
                        int i9 = this.f9205a;
                        if ((i9 & 1) != 0) {
                            audioStart.f9201a = this.f9206b;
                        }
                        if ((i9 & 2) != 0) {
                            audioStart.f9202b = this.f9207c;
                        }
                        if ((i9 & 4) != 0) {
                            audioStart.f9203c = this.f9208d;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7072b clear() {
                        super.clear();
                        this.f9205a = 0;
                        this.f9206b = "";
                        this.f9207c = 0L;
                        this.f9208d = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9174m;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7072b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7072b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7072b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7072b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9175n.ensureFieldAccessorsInitialized(AudioStart.class, C7072b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public C7072b mo24685clone() {
                        return (C7072b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public AudioStart getDefaultInstanceForType() {
                        return AudioStart.m8089q();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7072b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f9206b = codedInputStream.readStringRequireUtf8();
                                            this.f9205a |= 1;
                                        } else if (tag == 16) {
                                            this.f9207c = codedInputStream.readInt64();
                                            this.f9205a |= 2;
                                        } else if (tag == 26) {
                                            this.f9208d = codedInputStream.readStringRequireUtf8();
                                            this.f9205a |= 4;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public C7072b mergeFrom(Message message) {
                        if (message instanceof AudioStart) {
                            return m8110o((AudioStart) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: o */
                    public C7072b m8110o(AudioStart audioStart) {
                        if (audioStart == AudioStart.m8089q()) {
                            return this;
                        }
                        if (!audioStart.getFileName().isEmpty()) {
                            this.f9206b = audioStart.f9201a;
                            this.f9205a |= 1;
                            onChanged();
                        }
                        if (audioStart.m8094u() != 0) {
                            m8112q(audioStart.m8094u());
                        }
                        if (!audioStart.m8095v().isEmpty()) {
                            this.f9208d = audioStart.f9203c;
                            this.f9205a |= 4;
                            onChanged();
                        }
                        mergeUnknownFields(audioStart.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public final C7072b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7072b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: q */
                    public C7072b m8112q(long j9) {
                        this.f9207c = j9;
                        this.f9205a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C7072b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7072b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: s */
                    public C7072b m8114s(String str) {
                        str.getClass();
                        this.f9206b = str;
                        this.f9205a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7072b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7072b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public final C7072b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7072b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C7072b() {
                        this.f9206b = "";
                        this.f9208d = "";
                    }

                    public C7072b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9206b = "";
                        this.f9208d = "";
                    }
                }

                public AudioStart(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9201a = "";
                    this.f9202b = 0L;
                    this.f9203c = "";
                    this.f9204d = (byte) -1;
                }

                private AudioStart() {
                    this.f9201a = "";
                    this.f9202b = 0L;
                    this.f9203c = "";
                    this.f9204d = (byte) -1;
                    this.f9201a = "";
                    this.f9203c = "";
                }
            }

            public static final class Camera extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final Camera f9209e = new Camera();

                /* renamed from: f */
                public static final Parser f9210f = new C7073a();

                /* renamed from: a */
                public int f9211a;

                /* renamed from: b */
                public EzyMatrix.Matrix f9212b;

                /* renamed from: c */
                public EzyMatrix.Matrix f9213c;

                /* renamed from: d */
                public byte f9214d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$a */
                public class C7073a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Camera parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7074b c7074bM8122w = Camera.m8122w();
                        try {
                            c7074bM8122w.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7074bM8122w.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7074bM8122w.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7074bM8122w.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7074bM8122w.buildPartial());
                        }
                    }
                }

                /* renamed from: A */
                public static Camera m8117A(byte[] bArr) {
                    return (Camera) f9210f.parseFrom(bArr);
                }

                /* renamed from: g */
                public static /* synthetic */ int m8120g(Camera camera, int i9) {
                    int i10 = i9 | camera.f9211a;
                    camera.f9211a = i10;
                    return i10;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9178q;
                }

                /* renamed from: k */
                public static Camera m8121k() {
                    return f9209e;
                }

                /* renamed from: w */
                public static C7074b m8122w() {
                    return f9209e.toBuilder();
                }

                /* renamed from: z */
                public static Camera m8123z(ByteString byteString) {
                    return (Camera) f9210f.parseFrom(byteString);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public C7074b toBuilder() {
                    return this == f9209e ? new C7074b() : new C7074b().m8153u(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Camera)) {
                        return super.equals(obj);
                    }
                    Camera camera = (Camera) obj;
                    if (m8129v() != camera.m8129v()) {
                        return false;
                    }
                    if ((!m8129v() || m8127t().equals(camera.m8127t())) && m8128u() == camera.m8128u()) {
                        return (!m8128u() || m8126q().equals(camera.m8126q())) && getUnknownFields().equals(camera.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9210f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeMessageSize = (this.f9211a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m8127t()) : 0;
                    if ((this.f9211a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m8126q());
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m8129v()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m8127t().hashCode();
                    }
                    if (m8128u()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m8126q().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9179r.ensureFieldAccessorsInitialized(Camera.class, C7074b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9214d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9214d = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public Camera getDefaultInstanceForType() {
                    return f9209e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Camera();
                }

                /* renamed from: q */
                public EzyMatrix.Matrix m8126q() {
                    EzyMatrix.Matrix matrix = this.f9213c;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: t */
                public EzyMatrix.Matrix m8127t() {
                    EzyMatrix.Matrix matrix = this.f9212b;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: u */
                public boolean m8128u() {
                    return (this.f9211a & 2) != 0;
                }

                /* renamed from: v */
                public boolean m8129v() {
                    return (this.f9211a & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if ((this.f9211a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m8127t());
                    }
                    if ((this.f9211a & 2) != 0) {
                        codedOutputStream.writeMessage(2, m8126q());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7074b newBuilderForType() {
                    return m8122w();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C7074b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7074b(builderParent);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$b */
                public static final class C7074b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9215a;

                    /* renamed from: b */
                    public EzyMatrix.Matrix f9216b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f9217c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f9218d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9219e;

                    /* renamed from: A */
                    public C7074b m8133A(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9217c;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f9216b = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f9215a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C7074b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7074b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C7074b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7074b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7074b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7074b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Camera build() {
                        Camera cameraBuildPartial = buildPartial();
                        if (cameraBuildPartial.isInitialized()) {
                            return cameraBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public Camera buildPartial() {
                        Camera camera = new Camera(this);
                        if (this.f9215a != 0) {
                            m8139f(camera);
                        }
                        onBuilt();
                        return camera;
                    }

                    /* renamed from: f */
                    public final void m8139f(Camera camera) {
                        int i9;
                        int i10 = this.f9215a;
                        if ((i10 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9217c;
                            camera.f9212b = singleFieldBuilderV3 == null ? this.f9216b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9219e;
                            camera.f9213c = singleFieldBuilderV32 == null ? this.f9218d : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i9 |= 2;
                        }
                        Camera.m8120g(camera, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7074b clear() {
                        super.clear();
                        this.f9215a = 0;
                        this.f9216b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9217c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9217c = null;
                        }
                        this.f9218d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9219e;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9219e = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9178q;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7074b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7074b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7074b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7074b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9179r.ensureFieldAccessorsInitialized(Camera.class, C7074b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7074b mo24685clone() {
                        return (C7074b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public Camera getDefaultInstanceForType() {
                        return Camera.m8121k();
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix m8145m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9219e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9218d;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    public final void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m8150r();
                            m8147o();
                        }
                    }

                    /* renamed from: n */
                    public EzyMatrix.Matrix.C7109b m8146n() {
                        this.f9215a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8147o().getBuilder();
                    }

                    /* renamed from: o */
                    public final SingleFieldBuilderV3 m8147o() {
                        if (this.f9219e == null) {
                            this.f9219e = new SingleFieldBuilderV3(m8145m(), getParentForChildren(), isClean());
                            this.f9218d = null;
                        }
                        return this.f9219e;
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m8148p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9217c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9216b;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C7109b m8149q() {
                        this.f9215a |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8150r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m8150r() {
                        if (this.f9217c == null) {
                            this.f9217c = new SingleFieldBuilderV3(m8148p(), getParentForChildren(), isClean());
                            this.f9216b = null;
                        }
                        return this.f9217c;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C7074b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m8150r().getBuilder(), extensionRegistryLite);
                                            this.f9215a |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m8147o().getBuilder(), extensionRegistryLite);
                                            this.f9215a |= 2;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7074b mergeFrom(Message message) {
                        if (message instanceof Camera) {
                            return m8153u((Camera) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C7074b m8153u(Camera camera) {
                        if (camera == Camera.m8121k()) {
                            return this;
                        }
                        if (camera.m8129v()) {
                            m8155w(camera.m8127t());
                        }
                        if (camera.m8128u()) {
                            m8154v(camera.m8126q());
                        }
                        mergeUnknownFields(camera.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C7074b m8154v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9219e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9215a & 2) == 0 || (matrix2 = this.f9218d) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9218d = matrix;
                        } else {
                            m8146n().m8877o(matrix);
                        }
                        if (this.f9218d != null) {
                            this.f9215a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C7074b m8155w(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9217c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9215a & 1) == 0 || (matrix2 = this.f9216b) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9216b = matrix;
                        } else {
                            m8149q().m8877o(matrix);
                        }
                        if (this.f9216b != null) {
                            this.f9215a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7074b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7074b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7074b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7074b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C7074b m8158z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9219e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f9218d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f9215a |= 2;
                        onChanged();
                        return this;
                    }

                    public C7074b() {
                        maybeForceBuilderInitialization();
                    }

                    public C7074b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Camera(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9214d = (byte) -1;
                }

                private Camera() {
                    this.f9214d = (byte) -1;
                }
            }

            public static final class CameraMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final CameraMatrix f9220g = new CameraMatrix();

                /* renamed from: h */
                public static final Parser f9221h = new C7075a();

                /* renamed from: a */
                public int f9222a;

                /* renamed from: b */
                public EzyMatrix.Matrix f9223b;

                /* renamed from: c */
                public EzyMatrix.Matrix f9224c;

                /* renamed from: d */
                public volatile Object f9225d;

                /* renamed from: e */
                public int f9226e;

                /* renamed from: f */
                public byte f9227f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$a */
                public class C7075a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7076b c7076bM8159B = CameraMatrix.m8159B();
                        try {
                            c7076bM8159B.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7076bM8159B.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7076bM8159B.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7076bM8159B.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7076bM8159B.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static C7076b m8159B() {
                    return f9220g.toBuilder();
                }

                /* renamed from: E */
                public static CameraMatrix m8160E(ByteString byteString) {
                    return (CameraMatrix) f9221h.parseFrom(byteString);
                }

                /* renamed from: F */
                public static CameraMatrix m8161F(byte[] bArr) {
                    return (CameraMatrix) f9221h.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9176o;
                }

                /* renamed from: q */
                public static /* synthetic */ int m8167q(CameraMatrix cameraMatrix, int i9) {
                    int i10 = i9 | cameraMatrix.f9222a;
                    cameraMatrix.f9222a = i10;
                    return i10;
                }

                /* renamed from: t */
                public static CameraMatrix m8168t() {
                    return f9220g;
                }

                /* renamed from: A */
                public boolean m8169A() {
                    return (this.f9222a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public C7076b newBuilderForType() {
                    return m8159B();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C7076b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7076b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: G, reason: merged with bridge method [inline-methods] */
                public C7076b toBuilder() {
                    return this == f9220g ? new C7076b() : new C7076b().m8202u(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CameraMatrix)) {
                        return super.equals(obj);
                    }
                    CameraMatrix cameraMatrix = (CameraMatrix) obj;
                    if (m8169A() != cameraMatrix.m8169A()) {
                        return false;
                    }
                    if ((!m8169A() || m8175w().equals(cameraMatrix.m8175w())) && m8178z() == cameraMatrix.m8178z()) {
                        return (!m8178z() || m8174v().equals(cameraMatrix.m8174v())) && m8176x().equals(cameraMatrix.m8176x()) && m8177y() == cameraMatrix.m8177y() && getUnknownFields().equals(cameraMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9221h;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeMessageSize = (this.f9222a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m8175w()) : 0;
                    if ((this.f9222a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m8174v());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9225d)) {
                        iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.f9225d);
                    }
                    int i10 = this.f9226e;
                    if (i10 != 0) {
                        iComputeMessageSize += CodedOutputStream.computeInt32Size(4, i10);
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m8169A()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m8175w().hashCode();
                    }
                    if (m8178z()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m8174v().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 3) * 53) + m8176x().hashCode()) * 37) + 4) * 53) + m8177y()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9177p.ensureFieldAccessorsInitialized(CameraMatrix.class, C7076b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9227f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9227f = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CameraMatrix();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public CameraMatrix getDefaultInstanceForType() {
                    return f9220g;
                }

                /* renamed from: v */
                public EzyMatrix.Matrix m8174v() {
                    EzyMatrix.Matrix matrix = this.f9224c;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: w */
                public EzyMatrix.Matrix m8175w() {
                    EzyMatrix.Matrix matrix = this.f9223b;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if ((this.f9222a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m8175w());
                    }
                    if ((this.f9222a & 2) != 0) {
                        codedOutputStream.writeMessage(2, m8174v());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9225d)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.f9225d);
                    }
                    int i9 = this.f9226e;
                    if (i9 != 0) {
                        codedOutputStream.writeInt32(4, i9);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public String m8176x() {
                    Object obj = this.f9225d;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9225d = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: y */
                public int m8177y() {
                    return this.f9226e;
                }

                /* renamed from: z */
                public boolean m8178z() {
                    return (this.f9222a & 2) != 0;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$b */
                public static final class C7076b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9228a;

                    /* renamed from: b */
                    public EzyMatrix.Matrix f9229b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f9230c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f9231d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9232e;

                    /* renamed from: f */
                    public Object f9233f;

                    /* renamed from: g */
                    public int f9234g;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m8181r();
                            m8180o();
                        }
                    }

                    /* renamed from: o */
                    private SingleFieldBuilderV3 m8180o() {
                        if (this.f9232e == null) {
                            this.f9232e = new SingleFieldBuilderV3(m8196m(), getParentForChildren(), isClean());
                            this.f9231d = null;
                        }
                        return this.f9232e;
                    }

                    /* renamed from: r */
                    private SingleFieldBuilderV3 m8181r() {
                        if (this.f9230c == null) {
                            this.f9230c = new SingleFieldBuilderV3(m8198p(), getParentForChildren(), isClean());
                            this.f9229b = null;
                        }
                        return this.f9230c;
                    }

                    /* renamed from: A */
                    public C7076b m8182A(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9230c;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f9229b = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f9228a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C7076b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7076b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    /* renamed from: C */
                    public C7076b m8184C(String str) {
                        str.getClass();
                        this.f9233f = str;
                        this.f9228a |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: D */
                    public C7076b m8185D(int i9) {
                        this.f9234g = i9;
                        this.f9228a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7076b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7076b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7076b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7076b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix build() {
                        CameraMatrix cameraMatrixBuildPartial = buildPartial();
                        if (cameraMatrixBuildPartial.isInitialized()) {
                            return cameraMatrixBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraMatrixBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix buildPartial() {
                        CameraMatrix cameraMatrix = new CameraMatrix(this);
                        if (this.f9228a != 0) {
                            m8190f(cameraMatrix);
                        }
                        onBuilt();
                        return cameraMatrix;
                    }

                    /* renamed from: f */
                    public final void m8190f(CameraMatrix cameraMatrix) {
                        int i9;
                        int i10 = this.f9228a;
                        if ((i10 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9230c;
                            cameraMatrix.f9223b = singleFieldBuilderV3 == null ? this.f9229b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9232e;
                            cameraMatrix.f9224c = singleFieldBuilderV32 == null ? this.f9231d : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i9 |= 2;
                        }
                        if ((i10 & 4) != 0) {
                            cameraMatrix.f9225d = this.f9233f;
                        }
                        if ((i10 & 8) != 0) {
                            cameraMatrix.f9226e = this.f9234g;
                        }
                        CameraMatrix.m8167q(cameraMatrix, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7076b clear() {
                        super.clear();
                        this.f9228a = 0;
                        this.f9229b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9230c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9230c = null;
                        }
                        this.f9231d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9232e;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9232e = null;
                        }
                        this.f9233f = "";
                        this.f9234g = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9176o;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7076b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7076b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7076b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7076b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9177p.ensureFieldAccessorsInitialized(CameraMatrix.class, C7076b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7076b mo24685clone() {
                        return (C7076b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix getDefaultInstanceForType() {
                        return CameraMatrix.m8168t();
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix m8196m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9232e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9231d;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    /* renamed from: n */
                    public EzyMatrix.Matrix.C7109b m8197n() {
                        this.f9228a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8180o().getBuilder();
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m8198p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9230c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9229b;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C7109b m8199q() {
                        this.f9228a |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8181r().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C7076b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m8181r().getBuilder(), extensionRegistryLite);
                                            this.f9228a |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m8180o().getBuilder(), extensionRegistryLite);
                                            this.f9228a |= 2;
                                        } else if (tag == 26) {
                                            this.f9233f = codedInputStream.readStringRequireUtf8();
                                            this.f9228a |= 4;
                                        } else if (tag == 32) {
                                            this.f9234g = codedInputStream.readInt32();
                                            this.f9228a |= 8;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7076b mergeFrom(Message message) {
                        if (message instanceof CameraMatrix) {
                            return m8202u((CameraMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C7076b m8202u(CameraMatrix cameraMatrix) {
                        if (cameraMatrix == CameraMatrix.m8168t()) {
                            return this;
                        }
                        if (cameraMatrix.m8169A()) {
                            m8204w(cameraMatrix.m8175w());
                        }
                        if (cameraMatrix.m8178z()) {
                            m8203v(cameraMatrix.m8174v());
                        }
                        if (!cameraMatrix.m8176x().isEmpty()) {
                            this.f9233f = cameraMatrix.f9225d;
                            this.f9228a |= 4;
                            onChanged();
                        }
                        if (cameraMatrix.m8177y() != 0) {
                            m8185D(cameraMatrix.m8177y());
                        }
                        mergeUnknownFields(cameraMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C7076b m8203v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9232e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9228a & 2) == 0 || (matrix2 = this.f9231d) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9231d = matrix;
                        } else {
                            m8197n().m8877o(matrix);
                        }
                        if (this.f9231d != null) {
                            this.f9228a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C7076b m8204w(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9230c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9228a & 1) == 0 || (matrix2 = this.f9229b) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9229b = matrix;
                        } else {
                            m8199q().m8877o(matrix);
                        }
                        if (this.f9229b != null) {
                            this.f9228a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7076b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7076b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7076b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7076b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C7076b m8207z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9232e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f9231d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f9228a |= 2;
                        onChanged();
                        return this;
                    }

                    public C7076b() {
                        this.f9233f = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7076b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9233f = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public CameraMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9225d = "";
                    this.f9226e = 0;
                    this.f9227f = (byte) -1;
                }

                private CameraMatrix() {
                    this.f9225d = "";
                    this.f9226e = 0;
                    this.f9227f = (byte) -1;
                    this.f9225d = "";
                }
            }

            public static final class Config extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final Config f9235g = new Config();

                /* renamed from: h */
                public static final Parser f9236h = new C7077a();

                /* renamed from: a */
                public int f9237a;

                /* renamed from: b */
                public int f9238b;

                /* renamed from: c */
                public int f9239c;

                /* renamed from: d */
                public EzyHeader.BackgroundLineConfig f9240d;

                /* renamed from: e */
                public EzyHeader.BackgroundLineConfig f9241e;

                /* renamed from: f */
                public byte f9242f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$a */
                public class C7077a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Config parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7078b c7078bM8208B = Config.m8208B();
                        try {
                            c7078bM8208B.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7078bM8208B.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7078bM8208B.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7078bM8208B.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7078bM8208B.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static C7078b m8208B() {
                    return f9235g.toBuilder();
                }

                /* renamed from: E */
                public static Config m8209E(ByteString byteString) {
                    return (Config) f9236h.parseFrom(byteString);
                }

                /* renamed from: F */
                public static Config m8210F(byte[] bArr) {
                    return (Config) f9236h.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9180s;
                }

                /* renamed from: k */
                public static /* synthetic */ int m8214k(Config config, int i9) {
                    int i10 = i9 | config.f9237a;
                    config.f9237a = i10;
                    return i10;
                }

                /* renamed from: t */
                public static Config m8217t() {
                    return f9235g;
                }

                /* renamed from: A */
                public boolean m8218A() {
                    return (this.f9237a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public C7078b newBuilderForType() {
                    return m8208B();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C7078b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7078b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: G, reason: merged with bridge method [inline-methods] */
                public C7078b toBuilder() {
                    return this == f9235g ? new C7078b() : new C7078b().m8251u(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof Config)) {
                        return super.equals(obj);
                    }
                    Config config = (Config) obj;
                    if (m8225x() != config.m8225x() || m8223v() != config.m8223v() || m8218A() != config.m8218A()) {
                        return false;
                    }
                    if ((!m8218A() || m8226y().equals(config.m8226y())) && m8227z() == config.m8227z()) {
                        return (!m8227z() || m8224w().equals(config.m8224w())) && getUnknownFields().equals(config.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9236h;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int i10 = this.f9238b;
                    int iComputeInt32Size = i10 != 0 ? CodedOutputStream.computeInt32Size(1, i10) : 0;
                    int i11 = this.f9239c;
                    if (i11 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i11);
                    }
                    if ((1 & this.f9237a) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m8226y());
                    }
                    if ((this.f9237a & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(4, m8224w());
                    }
                    int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8225x()) * 37) + 2) * 53) + m8223v();
                    if (m8218A()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m8226y().hashCode();
                    }
                    if (m8227z()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + m8224w().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9181t.ensureFieldAccessorsInitialized(Config.class, C7078b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9242f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9242f = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Config();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public Config getDefaultInstanceForType() {
                    return f9235g;
                }

                /* renamed from: v */
                public int m8223v() {
                    return this.f9239c;
                }

                /* renamed from: w */
                public EzyHeader.BackgroundLineConfig m8224w() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9241e;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8671q() : backgroundLineConfig;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i9 = this.f9238b;
                    if (i9 != 0) {
                        codedOutputStream.writeInt32(1, i9);
                    }
                    int i10 = this.f9239c;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    if ((this.f9237a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m8226y());
                    }
                    if ((this.f9237a & 2) != 0) {
                        codedOutputStream.writeMessage(4, m8224w());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public int m8225x() {
                    return this.f9238b;
                }

                /* renamed from: y */
                public EzyHeader.BackgroundLineConfig m8226y() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9240d;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8671q() : backgroundLineConfig;
                }

                /* renamed from: z */
                public boolean m8227z() {
                    return (this.f9237a & 2) != 0;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$b */
                public static final class C7078b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9243a;

                    /* renamed from: b */
                    public int f9244b;

                    /* renamed from: c */
                    public int f9245c;

                    /* renamed from: d */
                    public EzyHeader.BackgroundLineConfig f9246d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9247e;

                    /* renamed from: f */
                    public EzyHeader.BackgroundLineConfig f9248f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f9249g;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m8248r();
                            m8245o();
                        }
                    }

                    /* renamed from: A */
                    public C7078b m8229A(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9249g;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f9248f = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f9243a |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: B */
                    public C7078b m8230B(int i9) {
                        this.f9244b = i9;
                        this.f9243a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: C */
                    public C7078b m8231C(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9247e;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f9246d = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f9243a |= 4;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C7078b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7078b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7078b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7078b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7078b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7078b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Config build() {
                        Config configBuildPartial = buildPartial();
                        if (configBuildPartial.isInitialized()) {
                            return configBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) configBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public Config buildPartial() {
                        Config config = new Config(this);
                        if (this.f9243a != 0) {
                            m8237f(config);
                        }
                        onBuilt();
                        return config;
                    }

                    /* renamed from: f */
                    public final void m8237f(Config config) {
                        int i9;
                        int i10 = this.f9243a;
                        if ((i10 & 1) != 0) {
                            config.f9238b = this.f9244b;
                        }
                        if ((i10 & 2) != 0) {
                            config.f9239c = this.f9245c;
                        }
                        if ((i10 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9247e;
                            config.f9240d = singleFieldBuilderV3 == null ? this.f9246d : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 8) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9249g;
                            config.f9241e = singleFieldBuilderV32 == null ? this.f9248f : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i9 |= 2;
                        }
                        Config.m8214k(config, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7078b clear() {
                        super.clear();
                        this.f9243a = 0;
                        this.f9244b = 0;
                        this.f9245c = 0;
                        this.f9246d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9247e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9247e = null;
                        }
                        this.f9248f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9249g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9249g = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9180s;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7078b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7078b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7078b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7078b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9181t.ensureFieldAccessorsInitialized(Config.class, C7078b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7078b mo24685clone() {
                        return (C7078b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public Config getDefaultInstanceForType() {
                        return Config.m8217t();
                    }

                    /* renamed from: m */
                    public EzyHeader.BackgroundLineConfig m8243m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9249g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9248f;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8671q() : backgroundLineConfig;
                    }

                    /* renamed from: n */
                    public EzyHeader.BackgroundLineConfig.C7102b m8244n() {
                        this.f9243a |= 8;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C7102b) m8245o().getBuilder();
                    }

                    /* renamed from: o */
                    public final SingleFieldBuilderV3 m8245o() {
                        if (this.f9249g == null) {
                            this.f9249g = new SingleFieldBuilderV3(m8243m(), getParentForChildren(), isClean());
                            this.f9248f = null;
                        }
                        return this.f9249g;
                    }

                    /* renamed from: p */
                    public EzyHeader.BackgroundLineConfig m8246p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9247e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9246d;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8671q() : backgroundLineConfig;
                    }

                    /* renamed from: q */
                    public EzyHeader.BackgroundLineConfig.C7102b m8247q() {
                        this.f9243a |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C7102b) m8248r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m8248r() {
                        if (this.f9247e == null) {
                            this.f9247e = new SingleFieldBuilderV3(m8246p(), getParentForChildren(), isClean());
                            this.f9246d = null;
                        }
                        return this.f9247e;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C7078b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f9244b = codedInputStream.readInt32();
                                            this.f9243a |= 1;
                                        } else if (tag == 16) {
                                            this.f9245c = codedInputStream.readInt32();
                                            this.f9243a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m8248r().getBuilder(), extensionRegistryLite);
                                            this.f9243a |= 4;
                                        } else if (tag == 34) {
                                            codedInputStream.readMessage(m8245o().getBuilder(), extensionRegistryLite);
                                            this.f9243a |= 8;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7078b mergeFrom(Message message) {
                        if (message instanceof Config) {
                            return m8251u((Config) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C7078b m8251u(Config config) {
                        if (config == Config.m8217t()) {
                            return this;
                        }
                        if (config.m8225x() != 0) {
                            m8230B(config.m8225x());
                        }
                        if (config.m8223v() != 0) {
                            m8256z(config.m8223v());
                        }
                        if (config.m8218A()) {
                            m8253w(config.m8226y());
                        }
                        if (config.m8227z()) {
                            m8252v(config.m8224w());
                        }
                        mergeUnknownFields(config.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C7078b m8252v(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9249g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f9243a & 8) == 0 || (backgroundLineConfig2 = this.f9248f) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m8671q()) {
                            this.f9248f = backgroundLineConfig;
                        } else {
                            m8244n().m8694o(backgroundLineConfig);
                        }
                        if (this.f9248f != null) {
                            this.f9243a |= 8;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C7078b m8253w(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9247e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f9243a & 4) == 0 || (backgroundLineConfig2 = this.f9246d) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m8671q()) {
                            this.f9246d = backgroundLineConfig;
                        } else {
                            m8247q().m8694o(backgroundLineConfig);
                        }
                        if (this.f9246d != null) {
                            this.f9243a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7078b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7078b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7078b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7078b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C7078b m8256z(int i9) {
                        this.f9245c = i9;
                        this.f9243a |= 2;
                        onChanged();
                        return this;
                    }

                    public C7078b() {
                        maybeForceBuilderInitialization();
                    }

                    public C7078b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Config(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9238b = 0;
                    this.f9239c = 0;
                    this.f9242f = (byte) -1;
                }

                private Config() {
                    this.f9238b = 0;
                    this.f9239c = 0;
                    this.f9242f = (byte) -1;
                }
            }

            public static final class CursorMove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: d */
                public static final CursorMove f9250d = new CursorMove();

                /* renamed from: e */
                public static final Parser f9251e = new C7079a();

                /* renamed from: a */
                public volatile Object f9252a;

                /* renamed from: b */
                public int f9253b;

                /* renamed from: c */
                public byte f9254c;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$a */
                public class C7079a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CursorMove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7080b c7080bM8261u = CursorMove.m8261u();
                        try {
                            c7080bM8261u.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7080bM8261u.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7080bM8261u.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7080bM8261u.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7080bM8261u.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9182u;
                }

                /* renamed from: k */
                public static CursorMove m8260k() {
                    return f9250d;
                }

                /* renamed from: u */
                public static C7080b m8261u() {
                    return f9250d.toBuilder();
                }

                /* renamed from: x */
                public static CursorMove m8262x(ByteString byteString) {
                    return (CursorMove) f9251e.parseFrom(byteString);
                }

                /* renamed from: y */
                public static CursorMove m8263y(byte[] bArr) {
                    return (CursorMove) f9251e.parseFrom(bArr);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof CursorMove)) {
                        return super.equals(obj);
                    }
                    CursorMove cursorMove = (CursorMove) obj;
                    return m8265q().equals(cursorMove.m8265q()) && m8266t() == cursorMove.m8266t() && getUnknownFields().equals(cursorMove.getUnknownFields());
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9251e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9252a) ? GeneratedMessageV3.computeStringSize(1, this.f9252a) : 0;
                    int i10 = this.f9253b;
                    if (i10 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt32Size(2, i10);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8265q().hashCode()) * 37) + 2) * 53) + m8266t()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9183v.ensureFieldAccessorsInitialized(CursorMove.class, C7080b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9254c;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9254c = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public CursorMove getDefaultInstanceForType() {
                    return f9250d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CursorMove();
                }

                /* renamed from: q */
                public String m8265q() {
                    Object obj = this.f9252a;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9252a = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: t */
                public int m8266t() {
                    return this.f9253b;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7080b newBuilderForType() {
                    return m8261u();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C7080b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7080b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!GeneratedMessageV3.isStringEmpty(this.f9252a)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9252a);
                    }
                    int i9 = this.f9253b;
                    if (i9 != 0) {
                        codedOutputStream.writeInt32(2, i9);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7080b toBuilder() {
                    return this == f9250d ? new C7080b() : new C7080b().m8282o(this);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$b */
                public static final class C7080b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9255a;

                    /* renamed from: b */
                    public Object f9256b;

                    /* renamed from: c */
                    public int f9257c;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7080b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7080b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public CursorMove build() {
                        CursorMove cursorMoveBuildPartial = buildPartial();
                        if (cursorMoveBuildPartial.isInitialized()) {
                            return cursorMoveBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cursorMoveBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public CursorMove buildPartial() {
                        CursorMove cursorMove = new CursorMove(this);
                        if (this.f9255a != 0) {
                            m8274f(cursorMove);
                        }
                        onBuilt();
                        return cursorMove;
                    }

                    /* renamed from: f */
                    public final void m8274f(CursorMove cursorMove) {
                        int i9 = this.f9255a;
                        if ((i9 & 1) != 0) {
                            cursorMove.f9252a = this.f9256b;
                        }
                        if ((i9 & 2) != 0) {
                            cursorMove.f9253b = this.f9257c;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7080b clear() {
                        super.clear();
                        this.f9255a = 0;
                        this.f9256b = "";
                        this.f9257c = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9182u;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7080b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7080b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7080b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7080b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9183v.ensureFieldAccessorsInitialized(CursorMove.class, C7080b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7080b mo24685clone() {
                        return (C7080b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public CursorMove getDefaultInstanceForType() {
                        return CursorMove.m8260k();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7080b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f9256b = codedInputStream.readStringRequireUtf8();
                                            this.f9255a |= 1;
                                        } else if (tag == 16) {
                                            this.f9257c = codedInputStream.readInt32();
                                            this.f9255a |= 2;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public C7080b mergeFrom(Message message) {
                        if (message instanceof CursorMove) {
                            return m8282o((CursorMove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: o */
                    public C7080b m8282o(CursorMove cursorMove) {
                        if (cursorMove == CursorMove.m8260k()) {
                            return this;
                        }
                        if (!cursorMove.m8265q().isEmpty()) {
                            this.f9256b = cursorMove.f9252a;
                            this.f9255a |= 1;
                            onChanged();
                        }
                        if (cursorMove.m8266t() != 0) {
                            m8287t(cursorMove.m8266t());
                        }
                        mergeUnknownFields(cursorMove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public final C7080b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7080b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C7080b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7080b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C7080b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7080b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    /* renamed from: s */
                    public C7080b m8286s(String str) {
                        str.getClass();
                        this.f9256b = str;
                        this.f9255a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: t */
                    public C7080b m8287t(int i9) {
                        this.f9257c = i9;
                        this.f9255a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public final C7080b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7080b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C7080b() {
                        this.f9256b = "";
                    }

                    public C7080b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9256b = "";
                    }
                }

                public CursorMove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9252a = "";
                    this.f9253b = 0;
                    this.f9254c = (byte) -1;
                }

                private CursorMove() {
                    this.f9252a = "";
                    this.f9253b = 0;
                    this.f9254c = (byte) -1;
                    this.f9252a = "";
                }
            }

            public static final class GraphChange extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: k */
                public static final GraphChange f9258k = new GraphChange();

                /* renamed from: l */
                public static final Parser f9259l = new C7081a();

                /* renamed from: a */
                public int f9260a;

                /* renamed from: b */
                public volatile Object f9261b;

                /* renamed from: c */
                public int f9262c;

                /* renamed from: d */
                public EzyRectF.RectF f9263d;

                /* renamed from: e */
                public volatile Object f9264e;

                /* renamed from: f */
                public EzyPaint.Paint f9265f;

                /* renamed from: g */
                public List f9266g;

                /* renamed from: h */
                public EzyMatrix.Matrix f9267h;

                /* renamed from: i */
                public volatile Object f9268i;

                /* renamed from: j */
                public byte f9269j;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$a */
                public class C7081a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphChange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7082b c7082bM8293N = GraphChange.m8293N();
                        try {
                            c7082bM8293N.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7082bM8293N.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7082bM8293N.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7082bM8293N.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7082bM8293N.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static /* synthetic */ int m8290B(GraphChange graphChange, int i9) {
                    int i10 = i9 | graphChange.f9260a;
                    graphChange.f9260a = i10;
                    return i10;
                }

                /* renamed from: D */
                public static GraphChange m8292D() {
                    return f9258k;
                }

                /* renamed from: N */
                public static C7082b m8293N() {
                    return f9258k.toBuilder();
                }

                /* renamed from: Q */
                public static GraphChange m8294Q(ByteString byteString) {
                    return (GraphChange) f9259l.parseFrom(byteString);
                }

                /* renamed from: R */
                public static GraphChange m8295R(byte[] bArr) {
                    return (GraphChange) f9259l.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9172k;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: E, reason: merged with bridge method [inline-methods] */
                public GraphChange getDefaultInstanceForType() {
                    return f9258k;
                }

                /* renamed from: F */
                public String m8310F() {
                    Object obj = this.f9268i;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9268i = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: G */
                public int m8311G() {
                    return this.f9262c;
                }

                /* renamed from: H */
                public String m8312H() {
                    Object obj = this.f9261b;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9261b = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: I */
                public EzyRectF.RectF m8313I() {
                    EzyRectF.RectF rectF = this.f9263d;
                    return rectF == null ? EzyRectF.RectF.m9174n() : rectF;
                }

                /* renamed from: J */
                public EzyPaint.Paint m8314J() {
                    EzyPaint.Paint paint = this.f9265f;
                    return paint == null ? EzyPaint.Paint.m9099t() : paint;
                }

                /* renamed from: K */
                public EzyMatrix.Matrix m8315K() {
                    EzyMatrix.Matrix matrix = this.f9267h;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: L */
                public boolean m8316L() {
                    return (this.f9260a & 2) != 0;
                }

                /* renamed from: M */
                public boolean m8317M() {
                    return (this.f9260a & 4) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: O, reason: merged with bridge method [inline-methods] */
                public C7082b newBuilderForType() {
                    return m8293N();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: P, reason: merged with bridge method [inline-methods] */
                public C7082b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7082b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: S, reason: merged with bridge method [inline-methods] */
                public C7082b toBuilder() {
                    return this == f9258k ? new C7082b() : new C7082b().m8357y(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof GraphChange)) {
                        return super.equals(obj);
                    }
                    GraphChange graphChange = (GraphChange) obj;
                    if (!m8312H().equals(graphChange.m8312H()) || this.f9262c != graphChange.f9262c || hasOutRect() != graphChange.hasOutRect()) {
                        return false;
                    }
                    if ((hasOutRect() && !m8313I().equals(graphChange.m8313I())) || !getContent().equals(graphChange.getContent()) || m8316L() != graphChange.m8316L()) {
                        return false;
                    }
                    if ((!m8316L() || m8314J().equals(graphChange.m8314J())) && getPointsList().equals(graphChange.getPointsList()) && m8317M() == graphChange.m8317M()) {
                        return (!m8317M() || m8315K().equals(graphChange.m8315K())) && m8310F().equals(graphChange.m8310F()) && getUnknownFields().equals(graphChange.getUnknownFields());
                    }
                    return false;
                }

                public String getContent() {
                    Object obj = this.f9264e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9264e = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9259l;
                }

                public int getPointsCount() {
                    return this.f9266g.size();
                }

                public List getPointsList() {
                    return this.f9266g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f9261b) ? GeneratedMessageV3.computeStringSize(1, this.f9261b) : 0;
                    if (this.f9262c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f9262c);
                    }
                    if ((1 & this.f9260a) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(3, m8313I());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9264e)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f9264e);
                    }
                    if ((this.f9260a & 2) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(5, m8314J());
                    }
                    for (int i10 = 0; i10 < this.f9266g.size(); i10++) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f9266g.get(i10));
                    }
                    if ((this.f9260a & 4) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(7, m8315K());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9268i)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f9268i);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f9260a & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m8312H().hashCode()) * 37) + 2) * 53) + this.f9262c;
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m8313I().hashCode();
                    }
                    int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getContent().hashCode();
                    if (m8316L()) {
                        iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + m8314J().hashCode();
                    }
                    if (getPointsCount() > 0) {
                        iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getPointsList().hashCode();
                    }
                    if (m8317M()) {
                        iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + m8315K().hashCode();
                    }
                    int iHashCode3 = (((((iHashCode2 * 37) + 8) * 53) + m8310F().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9173l.ensureFieldAccessorsInitialized(GraphChange.class, C7082b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9269j;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9269j = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphChange();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!GeneratedMessageV3.isStringEmpty(this.f9261b)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f9261b);
                    }
                    if (this.f9262c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(2, this.f9262c);
                    }
                    if ((this.f9260a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m8313I());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9264e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9264e);
                    }
                    if ((this.f9260a & 2) != 0) {
                        codedOutputStream.writeMessage(5, m8314J());
                    }
                    for (int i9 = 0; i9 < this.f9266g.size(); i9++) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.f9266g.get(i9));
                    }
                    if ((this.f9260a & 4) != 0) {
                        codedOutputStream.writeMessage(7, m8315K());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9268i)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 8, this.f9268i);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$b */
                public static final class C7082b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9270a;

                    /* renamed from: b */
                    public Object f9271b;

                    /* renamed from: c */
                    public int f9272c;

                    /* renamed from: d */
                    public EzyRectF.RectF f9273d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9274e;

                    /* renamed from: f */
                    public Object f9275f;

                    /* renamed from: g */
                    public EzyPaint.Paint f9276g;

                    /* renamed from: h */
                    public SingleFieldBuilderV3 f9277h;

                    /* renamed from: i */
                    public List f9278i;

                    /* renamed from: j */
                    public RepeatedFieldBuilderV3 f9279j;

                    /* renamed from: k */
                    public EzyMatrix.Matrix f9280k;

                    /* renamed from: l */
                    public SingleFieldBuilderV3 f9281l;

                    /* renamed from: m */
                    public Object f9282m;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                            m8351s();
                            getPointsFieldBuilder();
                            m8354v();
                        }
                    }

                    /* renamed from: A */
                    public C7082b m8322A(EzyPaint.Paint paint) {
                        EzyPaint.Paint paint2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9277h;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(paint);
                        } else if ((this.f9270a & 16) == 0 || (paint2 = this.f9276g) == null || paint2 == EzyPaint.Paint.m9099t()) {
                            this.f9276g = paint;
                        } else {
                            m8350r().m9121o(paint);
                        }
                        if (this.f9276g != null) {
                            this.f9270a |= 16;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: B */
                    public C7082b m8323B(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9281l;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9270a & 64) == 0 || (matrix2 = this.f9280k) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9280k = matrix;
                        } else {
                            m8353u().m8877o(matrix);
                        }
                        if (this.f9280k != null) {
                            this.f9270a |= 64;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C7082b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7082b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: D */
                    public C7082b m8325D(String str) {
                        str.getClass();
                        this.f9275f = str;
                        this.f9270a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public C7082b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7082b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: F */
                    public C7082b m8327F(String str) {
                        str.getClass();
                        this.f9282m = str;
                        this.f9270a |= 128;
                        onChanged();
                        return this;
                    }

                    /* renamed from: G */
                    public C7082b m8328G(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f9270a |= 2;
                        this.f9272c = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: H */
                    public C7082b m8329H(int i9) {
                        this.f9272c = i9;
                        this.f9270a |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: I */
                    public C7082b m8330I(String str) {
                        str.getClass();
                        this.f9271b = str;
                        this.f9270a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: J */
                    public C7082b m8331J(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9274e;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f9273d = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f9270a |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: K */
                    public C7082b m8332K(EzyPaint.Paint paint) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9277h;
                        if (singleFieldBuilderV3 == null) {
                            paint.getClass();
                            this.f9276g = paint;
                        } else {
                            singleFieldBuilderV3.setMessage(paint);
                        }
                        this.f9270a |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: L */
                    public C7082b m8333L(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9281l;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f9280k = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f9270a |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: M, reason: merged with bridge method [inline-methods] */
                    public C7082b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7082b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: N, reason: merged with bridge method [inline-methods] */
                    public final C7082b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7082b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: b */
                    public C7082b m8336b(EzyPointF.PointF pointF) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9279j;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(pointF);
                            return this;
                        }
                        pointF.getClass();
                        ensurePointsIsMutable();
                        this.f9278i.add(pointF);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public C7082b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7082b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphChange build() {
                        GraphChange graphChangeBuildPartial = buildPartial();
                        if (graphChangeBuildPartial.isInitialized()) {
                            return graphChangeBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphChangeBuildPartial);
                    }

                    public final void ensurePointsIsMutable() {
                        if ((this.f9270a & 32) == 0) {
                            this.f9278i = new ArrayList(this.f9278i);
                            this.f9270a |= 32;
                        }
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphChange buildPartial() {
                        GraphChange graphChange = new GraphChange(this);
                        m8341h(graphChange);
                        if (this.f9270a != 0) {
                            m8340g(graphChange);
                        }
                        onBuilt();
                        return graphChange;
                    }

                    /* renamed from: g */
                    public final void m8340g(GraphChange graphChange) {
                        int i9;
                        int i10 = this.f9270a;
                        if ((i10 & 1) != 0) {
                            graphChange.f9261b = this.f9271b;
                        }
                        if ((i10 & 2) != 0) {
                            graphChange.f9262c = this.f9272c;
                        }
                        if ((i10 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9274e;
                            graphChange.f9263d = singleFieldBuilderV3 == null ? this.f9273d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 8) != 0) {
                            graphChange.f9264e = this.f9275f;
                        }
                        if ((i10 & 16) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9277h;
                            graphChange.f9265f = singleFieldBuilderV32 == null ? this.f9276g : (EzyPaint.Paint) singleFieldBuilderV32.build();
                            i9 |= 2;
                        }
                        if ((i10 & 64) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9281l;
                            graphChange.f9267h = singleFieldBuilderV33 == null ? this.f9280k : (EzyMatrix.Matrix) singleFieldBuilderV33.build();
                            i9 |= 4;
                        }
                        if ((i10 & 128) != 0) {
                            graphChange.f9268i = this.f9282m;
                        }
                        GraphChange.m8290B(graphChange, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9172k;
                    }

                    public final SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f9274e == null) {
                            this.f9274e = new SingleFieldBuilderV3(m8347o(), getParentForChildren(), isClean());
                            this.f9273d = null;
                        }
                        return this.f9274e;
                    }

                    public final RepeatedFieldBuilderV3 getPointsFieldBuilder() {
                        if (this.f9279j == null) {
                            this.f9279j = new RepeatedFieldBuilderV3(this.f9278i, (this.f9270a & 32) != 0, getParentForChildren(), isClean());
                            this.f9278i = null;
                        }
                        return this.f9279j;
                    }

                    /* renamed from: h */
                    public final void m8341h(GraphChange graphChange) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9279j;
                        if (repeatedFieldBuilderV3 != null) {
                            graphChange.f9266g = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f9270a & 32) != 0) {
                            this.f9278i = Collections.unmodifiableList(this.f9278i);
                            this.f9270a &= -33;
                        }
                        graphChange.f9266g = this.f9278i;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7082b clear() {
                        super.clear();
                        this.f9270a = 0;
                        this.f9271b = "";
                        this.f9272c = 0;
                        this.f9273d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9274e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9274e = null;
                        }
                        this.f9275f = "";
                        this.f9276g = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9277h;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9277h = null;
                        }
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9279j;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f9278i = Collections.EMPTY_LIST;
                        } else {
                            this.f9278i = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f9270a &= -33;
                        this.f9280k = null;
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9281l;
                        if (singleFieldBuilderV33 != null) {
                            singleFieldBuilderV33.dispose();
                            this.f9281l = null;
                        }
                        this.f9282m = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9173l.ensureFieldAccessorsInitialized(GraphChange.class, C7082b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7082b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7082b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C7082b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7082b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7082b mo24685clone() {
                        return (C7082b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public GraphChange getDefaultInstanceForType() {
                        return GraphChange.m8292D();
                    }

                    /* renamed from: o */
                    public EzyRectF.RectF m8347o() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9274e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f9273d;
                        return rectF == null ? EzyRectF.RectF.m9174n() : rectF;
                    }

                    /* renamed from: p */
                    public EzyRectF.RectF.C7130b m8348p() {
                        this.f9270a |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C7130b) getOutRectFieldBuilder().getBuilder();
                    }

                    /* renamed from: q */
                    public EzyPaint.Paint m8349q() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9277h;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                        }
                        EzyPaint.Paint paint = this.f9276g;
                        return paint == null ? EzyPaint.Paint.m9099t() : paint;
                    }

                    /* renamed from: r */
                    public EzyPaint.Paint.C7123b m8350r() {
                        this.f9270a |= 16;
                        onChanged();
                        return (EzyPaint.Paint.C7123b) m8351s().getBuilder();
                    }

                    /* renamed from: s */
                    public final SingleFieldBuilderV3 m8351s() {
                        if (this.f9277h == null) {
                            this.f9277h = new SingleFieldBuilderV3(m8349q(), getParentForChildren(), isClean());
                            this.f9276g = null;
                        }
                        return this.f9277h;
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix m8352t() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9281l;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9280k;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    /* renamed from: u */
                    public EzyMatrix.Matrix.C7109b m8353u() {
                        this.f9270a |= 64;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8354v().getBuilder();
                    }

                    /* renamed from: v */
                    public final SingleFieldBuilderV3 m8354v() {
                        if (this.f9281l == null) {
                            this.f9281l = new SingleFieldBuilderV3(m8352t(), getParentForChildren(), isClean());
                            this.f9280k = null;
                        }
                        return this.f9281l;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C7082b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f9271b = codedInputStream.readStringRequireUtf8();
                                            this.f9270a |= 1;
                                        } else if (tag == 16) {
                                            this.f9272c = codedInputStream.readEnum();
                                            this.f9270a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f9270a |= 4;
                                        } else if (tag == 34) {
                                            this.f9275f = codedInputStream.readStringRequireUtf8();
                                            this.f9270a |= 8;
                                        } else if (tag == 42) {
                                            codedInputStream.readMessage(m8351s().getBuilder(), extensionRegistryLite);
                                            this.f9270a |= 16;
                                        } else if (tag == 50) {
                                            EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9279j;
                                            if (repeatedFieldBuilderV3 == null) {
                                                ensurePointsIsMutable();
                                                this.f9278i.add(pointF);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(pointF);
                                            }
                                        } else if (tag == 58) {
                                            codedInputStream.readMessage(m8354v().getBuilder(), extensionRegistryLite);
                                            this.f9270a |= 64;
                                        } else if (tag == 66) {
                                            this.f9282m = codedInputStream.readStringRequireUtf8();
                                            this.f9270a |= 128;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public C7082b mergeFrom(Message message) {
                        if (message instanceof GraphChange) {
                            return m8357y((GraphChange) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: y */
                    public C7082b m8357y(GraphChange graphChange) {
                        if (graphChange == GraphChange.m8292D()) {
                            return this;
                        }
                        if (!graphChange.m8312H().isEmpty()) {
                            this.f9271b = graphChange.f9261b;
                            this.f9270a |= 1;
                            onChanged();
                        }
                        if (graphChange.f9262c != 0) {
                            m8329H(graphChange.m8311G());
                        }
                        if (graphChange.hasOutRect()) {
                            m8358z(graphChange.m8313I());
                        }
                        if (!graphChange.getContent().isEmpty()) {
                            this.f9275f = graphChange.f9264e;
                            this.f9270a |= 8;
                            onChanged();
                        }
                        if (graphChange.m8316L()) {
                            m8322A(graphChange.m8314J());
                        }
                        if (this.f9279j == null) {
                            if (!graphChange.f9266g.isEmpty()) {
                                if (this.f9278i.isEmpty()) {
                                    this.f9278i = graphChange.f9266g;
                                    this.f9270a &= -33;
                                } else {
                                    ensurePointsIsMutable();
                                    this.f9278i.addAll(graphChange.f9266g);
                                }
                                onChanged();
                            }
                        } else if (!graphChange.f9266g.isEmpty()) {
                            if (this.f9279j.isEmpty()) {
                                this.f9279j.dispose();
                                this.f9279j = null;
                                this.f9278i = graphChange.f9266g;
                                this.f9270a &= -33;
                                this.f9279j = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                            } else {
                                this.f9279j.addAllMessages(graphChange.f9266g);
                            }
                        }
                        if (graphChange.m8317M()) {
                            m8323B(graphChange.m8315K());
                        }
                        if (!graphChange.m8310F().isEmpty()) {
                            this.f9282m = graphChange.f9268i;
                            this.f9270a |= 128;
                            onChanged();
                        }
                        mergeUnknownFields(graphChange.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C7082b m8358z(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9274e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f9270a & 4) == 0 || (rectF2 = this.f9273d) == null || rectF2 == EzyRectF.RectF.m9174n()) {
                            this.f9273d = rectF;
                        } else {
                            m8348p().m9192o(rectF);
                        }
                        if (this.f9273d != null) {
                            this.f9270a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    public C7082b() {
                        this.f9271b = "";
                        this.f9272c = 0;
                        this.f9275f = "";
                        this.f9278i = Collections.EMPTY_LIST;
                        this.f9282m = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7082b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9271b = "";
                        this.f9272c = 0;
                        this.f9275f = "";
                        this.f9278i = Collections.EMPTY_LIST;
                        this.f9282m = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphChange(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9261b = "";
                    this.f9262c = 0;
                    this.f9264e = "";
                    this.f9268i = "";
                    this.f9269j = (byte) -1;
                }

                private GraphChange() {
                    this.f9261b = "";
                    this.f9262c = 0;
                    this.f9264e = "";
                    this.f9268i = "";
                    this.f9269j = (byte) -1;
                    this.f9261b = "";
                    this.f9262c = 0;
                    this.f9264e = "";
                    this.f9266g = Collections.EMPTY_LIST;
                    this.f9268i = "";
                }
            }

            public static final class GraphData extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: j */
                public static final GraphData f9283j = new GraphData();

                /* renamed from: k */
                public static final Parser f9284k = new C7083a();

                /* renamed from: a */
                public int f9285a;

                /* renamed from: b */
                public int f9286b;

                /* renamed from: c */
                public volatile Object f9287c;

                /* renamed from: d */
                public EzyRectF.RectF f9288d;

                /* renamed from: e */
                public volatile Object f9289e;

                /* renamed from: f */
                public volatile Object f9290f;

                /* renamed from: g */
                public int f9291g;

                /* renamed from: h */
                public volatile Object f9292h;

                /* renamed from: i */
                public byte f9293i;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$a */
                public class C7083a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7084b c7084bM8361L = GraphData.m8361L();
                        try {
                            c7084bM8361L.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7084bM8361L.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7084bM8361L.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7084bM8361L.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7084bM8361L.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static GraphData m8360B() {
                    return f9283j;
                }

                /* renamed from: L */
                public static C7084b m8361L() {
                    return f9283j.toBuilder();
                }

                /* renamed from: O */
                public static GraphData m8362O(ByteString byteString) {
                    return (GraphData) f9284k.parseFrom(byteString);
                }

                /* renamed from: P */
                public static GraphData m8363P(byte[] bArr) {
                    return (GraphData) f9284k.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9166e;
                }

                public static Parser parser() {
                    return f9284k;
                }

                /* renamed from: z */
                public static /* synthetic */ int m8376z(GraphData graphData, int i9) {
                    int i10 = i9 | graphData.f9285a;
                    graphData.f9285a = i10;
                    return i10;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: C, reason: merged with bridge method [inline-methods] */
                public GraphData getDefaultInstanceForType() {
                    return f9283j;
                }

                /* renamed from: D */
                public String m8378D() {
                    Object obj = this.f9292h;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9292h = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: E */
                public EzyGraphEnum.GraphEnum m8379E() {
                    EzyGraphEnum.GraphEnum graphEnumM8610c = EzyGraphEnum.GraphEnum.m8610c(this.f9286b);
                    return graphEnumM8610c == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM8610c;
                }

                /* renamed from: F */
                public int m8380F() {
                    return this.f9286b;
                }

                /* renamed from: G */
                public String m8381G() {
                    Object obj = this.f9287c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9287c = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: H */
                public EzyRectF.RectF m8382H() {
                    EzyRectF.RectF rectF = this.f9288d;
                    return rectF == null ? EzyRectF.RectF.m9174n() : rectF;
                }

                /* renamed from: I */
                public String m8383I() {
                    Object obj = this.f9289e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9289e = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: J */
                public String m8384J() {
                    Object obj = this.f9290f;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9290f = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: K */
                public int m8385K() {
                    return this.f9291g;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: M, reason: merged with bridge method [inline-methods] */
                public C7084b newBuilderForType() {
                    return m8361L();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: N, reason: merged with bridge method [inline-methods] */
                public C7084b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7084b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: Q, reason: merged with bridge method [inline-methods] */
                public C7084b toBuilder() {
                    return this == f9283j ? new C7084b() : new C7084b().m8409r(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof GraphData)) {
                        return super.equals(obj);
                    }
                    GraphData graphData = (GraphData) obj;
                    if (this.f9286b == graphData.f9286b && m8381G().equals(graphData.m8381G()) && hasOutRect() == graphData.hasOutRect()) {
                        return (!hasOutRect() || m8382H().equals(graphData.m8382H())) && m8383I().equals(graphData.m8383I()) && m8384J().equals(graphData.m8384J()) && m8385K() == graphData.m8385K() && m8378D().equals(graphData.m8378D()) && getUnknownFields().equals(graphData.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9284k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeEnumSize = this.f9286b != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f9286b) : 0;
                    if (!GeneratedMessageV3.isStringEmpty(this.f9287c)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.f9287c);
                    }
                    if ((this.f9285a & 1) != 0) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m8382H());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9289e)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.f9289e);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9290f)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(5, this.f9290f);
                    }
                    int i10 = this.f9291g;
                    if (i10 != 0) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, i10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9292h)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(7, this.f9292h);
                    }
                    int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f9285a & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f9286b) * 37) + 2) * 53) + m8381G().hashCode();
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m8382H().hashCode();
                    }
                    int iHashCode2 = (((((((((((((((((iHashCode * 37) + 4) * 53) + m8383I().hashCode()) * 37) + 5) * 53) + m8384J().hashCode()) * 37) + 6) * 53) + m8385K()) * 37) + 7) * 53) + m8378D().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9167f.ensureFieldAccessorsInitialized(GraphData.class, C7084b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9293i;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9293i = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphData();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (this.f9286b != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(1, this.f9286b);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9287c)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.f9287c);
                    }
                    if ((this.f9285a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m8382H());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9289e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9289e);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9290f)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 5, this.f9290f);
                    }
                    int i9 = this.f9291g;
                    if (i9 != 0) {
                        codedOutputStream.writeInt32(6, i9);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9292h)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 7, this.f9292h);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$b */
                public static final class C7084b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9294a;

                    /* renamed from: b */
                    public int f9295b;

                    /* renamed from: c */
                    public Object f9296c;

                    /* renamed from: d */
                    public EzyRectF.RectF f9297d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9298e;

                    /* renamed from: f */
                    public Object f9299f;

                    /* renamed from: g */
                    public Object f9300g;

                    /* renamed from: h */
                    public int f9301h;

                    /* renamed from: i */
                    public Object f9302i;

                    private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f9298e == null) {
                            this.f9298e = new SingleFieldBuilderV3(m8405n(), getParentForChildren(), isClean());
                            this.f9297d = null;
                        }
                        return this.f9298e;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                        }
                    }

                    /* renamed from: A */
                    public C7084b m8390A(String str) {
                        str.getClass();
                        this.f9299f = str;
                        this.f9294a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C7084b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7084b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    /* renamed from: C */
                    public C7084b m8392C(String str) {
                        str.getClass();
                        this.f9300g = str;
                        this.f9294a |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: D */
                    public C7084b m8393D(int i9) {
                        this.f9301h = i9;
                        this.f9294a |= 32;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7084b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7084b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7084b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7084b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public GraphData build() {
                        GraphData graphDataBuildPartial = buildPartial();
                        if (graphDataBuildPartial.isInitialized()) {
                            return graphDataBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphDataBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphData buildPartial() {
                        GraphData graphData = new GraphData(this);
                        if (this.f9294a != 0) {
                            m8398f(graphData);
                        }
                        onBuilt();
                        return graphData;
                    }

                    /* renamed from: f */
                    public final void m8398f(GraphData graphData) {
                        int i9;
                        int i10 = this.f9294a;
                        if ((i10 & 1) != 0) {
                            graphData.f9286b = this.f9295b;
                        }
                        if ((i10 & 2) != 0) {
                            graphData.f9287c = this.f9296c;
                        }
                        if ((i10 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9298e;
                            graphData.f9288d = singleFieldBuilderV3 == null ? this.f9297d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 8) != 0) {
                            graphData.f9289e = this.f9299f;
                        }
                        if ((i10 & 16) != 0) {
                            graphData.f9290f = this.f9300g;
                        }
                        if ((i10 & 32) != 0) {
                            graphData.f9291g = this.f9301h;
                        }
                        if ((i10 & 64) != 0) {
                            graphData.f9292h = this.f9302i;
                        }
                        GraphData.m8376z(graphData, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7084b clear() {
                        super.clear();
                        this.f9294a = 0;
                        this.f9295b = 0;
                        this.f9296c = "";
                        this.f9297d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9298e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9298e = null;
                        }
                        this.f9299f = "";
                        this.f9300g = "";
                        this.f9301h = 0;
                        this.f9302i = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9166e;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7084b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7084b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7084b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7084b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9167f.ensureFieldAccessorsInitialized(GraphData.class, C7084b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7084b mo24685clone() {
                        return (C7084b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public GraphData getDefaultInstanceForType() {
                        return GraphData.m8360B();
                    }

                    /* renamed from: m */
                    public String m8404m() {
                        Object obj = this.f9302i;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.f9302i = stringUtf8;
                        return stringUtf8;
                    }

                    /* renamed from: n */
                    public EzyRectF.RectF m8405n() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9298e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f9297d;
                        return rectF == null ? EzyRectF.RectF.m9174n() : rectF;
                    }

                    /* renamed from: o */
                    public EzyRectF.RectF.C7130b m8406o() {
                        this.f9294a |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C7130b) getOutRectFieldBuilder().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public C7084b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f9295b = codedInputStream.readEnum();
                                            this.f9294a |= 1;
                                        } else if (tag == 18) {
                                            this.f9296c = codedInputStream.readStringRequireUtf8();
                                            this.f9294a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f9294a |= 4;
                                        } else if (tag == 34) {
                                            this.f9299f = codedInputStream.readStringRequireUtf8();
                                            this.f9294a |= 8;
                                        } else if (tag == 42) {
                                            this.f9300g = codedInputStream.readStringRequireUtf8();
                                            this.f9294a |= 16;
                                        } else if (tag == 48) {
                                            this.f9301h = codedInputStream.readInt32();
                                            this.f9294a |= 32;
                                        } else if (tag == 58) {
                                            this.f9302i = codedInputStream.readStringRequireUtf8();
                                            this.f9294a |= 64;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C7084b mergeFrom(Message message) {
                        if (message instanceof GraphData) {
                            return m8409r((GraphData) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: r */
                    public C7084b m8409r(GraphData graphData) {
                        if (graphData == GraphData.m8360B()) {
                            return this;
                        }
                        if (graphData.f9286b != 0) {
                            m8415x(graphData.m8380F());
                        }
                        if (!graphData.m8381G().isEmpty()) {
                            this.f9296c = graphData.f9287c;
                            this.f9294a |= 2;
                            onChanged();
                        }
                        if (graphData.hasOutRect()) {
                            m8410s(graphData.m8382H());
                        }
                        if (!graphData.m8383I().isEmpty()) {
                            this.f9299f = graphData.f9289e;
                            this.f9294a |= 8;
                            onChanged();
                        }
                        if (!graphData.m8384J().isEmpty()) {
                            this.f9300g = graphData.f9290f;
                            this.f9294a |= 16;
                            onChanged();
                        }
                        if (graphData.m8385K() != 0) {
                            m8393D(graphData.m8385K());
                        }
                        if (!graphData.m8378D().isEmpty()) {
                            this.f9302i = graphData.f9292h;
                            this.f9294a |= 64;
                            onChanged();
                        }
                        mergeUnknownFields(graphData.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: s */
                    public C7084b m8410s(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9298e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f9294a & 4) == 0 || (rectF2 = this.f9297d) == null || rectF2 == EzyRectF.RectF.m9174n()) {
                            this.f9297d = rectF;
                        } else {
                            m8406o().m9192o(rectF);
                        }
                        if (this.f9297d != null) {
                            this.f9294a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C7084b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7084b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: u */
                    public C7084b m8412u(String str) {
                        str.getClass();
                        this.f9302i = str;
                        this.f9294a |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C7084b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7084b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: w */
                    public C7084b m8414w(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f9294a |= 1;
                        this.f9295b = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: x */
                    public C7084b m8415x(int i9) {
                        this.f9295b = i9;
                        this.f9294a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: y */
                    public C7084b m8416y(String str) {
                        str.getClass();
                        this.f9296c = str;
                        this.f9294a |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C7084b m8417z(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9298e;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f9297d = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f9294a |= 4;
                        onChanged();
                        return this;
                    }

                    public C7084b() {
                        this.f9295b = 0;
                        this.f9296c = "";
                        this.f9299f = "";
                        this.f9300g = "";
                        this.f9302i = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7084b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9295b = 0;
                        this.f9296c = "";
                        this.f9299f = "";
                        this.f9300g = "";
                        this.f9302i = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphData(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9286b = 0;
                    this.f9287c = "";
                    this.f9289e = "";
                    this.f9290f = "";
                    this.f9291g = 0;
                    this.f9292h = "";
                    this.f9293i = (byte) -1;
                }

                private GraphData() {
                    this.f9286b = 0;
                    this.f9287c = "";
                    this.f9289e = "";
                    this.f9290f = "";
                    this.f9291g = 0;
                    this.f9292h = "";
                    this.f9293i = (byte) -1;
                    this.f9286b = 0;
                    this.f9287c = "";
                    this.f9289e = "";
                    this.f9290f = "";
                    this.f9292h = "";
                }
            }

            public static final class GraphMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: h */
                public static final GraphMatrix f9303h = new GraphMatrix();

                /* renamed from: i */
                public static final Parser f9304i = new C7085a();

                /* renamed from: a */
                public int f9305a;

                /* renamed from: b */
                public List f9306b;

                /* renamed from: c */
                public EzyMatrix.Matrix f9307c;

                /* renamed from: d */
                public EzyMatrix.Matrix f9308d;

                /* renamed from: e */
                public volatile Object f9309e;

                /* renamed from: f */
                public int f9310f;

                /* renamed from: g */
                public byte f9311g;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$a */
                public class C7085a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7086b c7086bM8418H = GraphMatrix.m8418H();
                        try {
                            c7086bM8418H.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7086bM8418H.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7086bM8418H.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7086bM8418H.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7086bM8418H.buildPartial());
                        }
                    }
                }

                /* renamed from: H */
                public static C7086b m8418H() {
                    return f9303h.toBuilder();
                }

                /* renamed from: K */
                public static GraphMatrix m8419K(ByteString byteString) {
                    return (GraphMatrix) f9304i.parseFrom(byteString);
                }

                /* renamed from: L */
                public static GraphMatrix m8420L(byte[] bArr) {
                    return (GraphMatrix) f9304i.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9170i;
                }

                /* renamed from: v */
                public static /* synthetic */ int m8429v(GraphMatrix graphMatrix, int i9) {
                    int i10 = i9 | graphMatrix.f9305a;
                    graphMatrix.f9305a = i10;
                    return i10;
                }

                /* renamed from: x */
                public static GraphMatrix m8431x() {
                    return f9303h;
                }

                /* renamed from: A */
                public List m8432A() {
                    return this.f9306b;
                }

                /* renamed from: B */
                public EzyMatrix.Matrix m8433B() {
                    EzyMatrix.Matrix matrix = this.f9308d;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: C */
                public EzyMatrix.Matrix m8434C() {
                    EzyMatrix.Matrix matrix = this.f9307c;
                    return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                }

                /* renamed from: D */
                public String m8435D() {
                    Object obj = this.f9309e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9309e = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: E */
                public int m8436E() {
                    return this.f9310f;
                }

                /* renamed from: F */
                public boolean m8437F() {
                    return (this.f9305a & 2) != 0;
                }

                /* renamed from: G */
                public boolean m8438G() {
                    return (this.f9305a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: I, reason: merged with bridge method [inline-methods] */
                public C7086b newBuilderForType() {
                    return m8418H();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: J, reason: merged with bridge method [inline-methods] */
                public C7086b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7086b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: M, reason: merged with bridge method [inline-methods] */
                public C7086b toBuilder() {
                    return this == f9303h ? new C7086b() : new C7086b().m8473y(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof GraphMatrix)) {
                        return super.equals(obj);
                    }
                    GraphMatrix graphMatrix = (GraphMatrix) obj;
                    if (!m8432A().equals(graphMatrix.m8432A()) || m8438G() != graphMatrix.m8438G()) {
                        return false;
                    }
                    if ((!m8438G() || m8434C().equals(graphMatrix.m8434C())) && m8437F() == graphMatrix.m8437F()) {
                        return (!m8437F() || m8433B().equals(graphMatrix.m8433B())) && m8435D().equals(graphMatrix.m8435D()) && m8436E() == graphMatrix.m8436E() && getUnknownFields().equals(graphMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9304i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeInt32Size = 0;
                    for (int i10 = 0; i10 < this.f9306b.size(); i10++) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9306b.get(i10));
                    }
                    if ((this.f9305a & 1) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(2, m8434C());
                    }
                    if ((this.f9305a & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m8433B());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9309e)) {
                        iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.f9309e);
                    }
                    int i11 = this.f9310f;
                    if (i11 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i11);
                    }
                    int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m8443z() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m8432A().hashCode();
                    }
                    if (m8438G()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m8434C().hashCode();
                    }
                    if (m8437F()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m8433B().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 4) * 53) + m8435D().hashCode()) * 37) + 5) * 53) + m8436E()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9171j.ensureFieldAccessorsInitialized(GraphMatrix.class, C7086b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9311g;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9311g = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphMatrix();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    for (int i9 = 0; i9 < this.f9306b.size(); i9++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f9306b.get(i9));
                    }
                    if ((this.f9305a & 1) != 0) {
                        codedOutputStream.writeMessage(2, m8434C());
                    }
                    if ((this.f9305a & 2) != 0) {
                        codedOutputStream.writeMessage(3, m8433B());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9309e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9309e);
                    }
                    int i10 = this.f9310f;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(5, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public GraphMatrix getDefaultInstanceForType() {
                    return f9303h;
                }

                /* renamed from: z */
                public int m8443z() {
                    return this.f9306b.size();
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$b */
                public static final class C7086b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9312a;

                    /* renamed from: b */
                    public List f9313b;

                    /* renamed from: c */
                    public RepeatedFieldBuilderV3 f9314c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f9315d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9316e;

                    /* renamed from: f */
                    public EzyMatrix.Matrix f9317f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f9318g;

                    /* renamed from: h */
                    public Object f9319h;

                    /* renamed from: i */
                    public int f9320i;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m8466p();
                            m8446v();
                            m8445s();
                        }
                    }

                    /* renamed from: s */
                    private SingleFieldBuilderV3 m8445s() {
                        if (this.f9318g == null) {
                            this.f9318g = new SingleFieldBuilderV3(m8467q(), getParentForChildren(), isClean());
                            this.f9317f = null;
                        }
                        return this.f9318g;
                    }

                    /* renamed from: v */
                    private SingleFieldBuilderV3 m8446v() {
                        if (this.f9316e == null) {
                            this.f9316e = new SingleFieldBuilderV3(m8469t(), getParentForChildren(), isClean());
                            this.f9315d = null;
                        }
                        return this.f9316e;
                    }

                    /* renamed from: A */
                    public C7086b m8447A(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9316e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9312a & 2) == 0 || (matrix2 = this.f9315d) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9315d = matrix;
                        } else {
                            m8470u().m8877o(matrix);
                        }
                        if (this.f9315d != null) {
                            this.f9312a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public final C7086b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7086b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public C7086b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7086b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C7086b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7086b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    /* renamed from: E */
                    public C7086b m8451E(String str) {
                        str.getClass();
                        this.f9319h = str;
                        this.f9312a |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: F */
                    public C7086b m8452F(int i9) {
                        this.f9320i = i9;
                        this.f9312a |= 16;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public final C7086b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7086b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: b */
                    public C7086b m8454b(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9314c;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m8464n();
                        AbstractMessageLite.Builder.addAll(iterable, this.f9313b);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public C7086b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7086b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix build() {
                        GraphMatrix graphMatrixBuildPartial = buildPartial();
                        if (graphMatrixBuildPartial.isInitialized()) {
                            return graphMatrixBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphMatrixBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix buildPartial() {
                        GraphMatrix graphMatrix = new GraphMatrix(this);
                        m8459h(graphMatrix);
                        if (this.f9312a != 0) {
                            m8458g(graphMatrix);
                        }
                        onBuilt();
                        return graphMatrix;
                    }

                    /* renamed from: g */
                    public final void m8458g(GraphMatrix graphMatrix) {
                        int i9;
                        int i10 = this.f9312a;
                        if ((i10 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9316e;
                            graphMatrix.f9307c = singleFieldBuilderV3 == null ? this.f9315d : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9318g;
                            graphMatrix.f9308d = singleFieldBuilderV32 == null ? this.f9317f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i9 |= 2;
                        }
                        if ((i10 & 8) != 0) {
                            graphMatrix.f9309e = this.f9319h;
                        }
                        if ((i10 & 16) != 0) {
                            graphMatrix.f9310f = this.f9320i;
                        }
                        GraphMatrix.m8429v(graphMatrix, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9170i;
                    }

                    /* renamed from: h */
                    public final void m8459h(GraphMatrix graphMatrix) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9314c;
                        if (repeatedFieldBuilderV3 != null) {
                            graphMatrix.f9306b = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f9312a & 1) != 0) {
                            this.f9313b = Collections.unmodifiableList(this.f9313b);
                            this.f9312a &= -2;
                        }
                        graphMatrix.f9306b = this.f9313b;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7086b clear() {
                        super.clear();
                        this.f9312a = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9314c;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f9313b = Collections.EMPTY_LIST;
                        } else {
                            this.f9313b = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f9312a &= -2;
                        this.f9315d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9316e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9316e = null;
                        }
                        this.f9317f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9318g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9318g = null;
                        }
                        this.f9319h = "";
                        this.f9320i = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9171j.ensureFieldAccessorsInitialized(GraphMatrix.class, C7086b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7086b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7086b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C7086b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7086b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7086b mo24685clone() {
                        return (C7086b) super.mo24685clone();
                    }

                    /* renamed from: n */
                    public final void m8464n() {
                        if ((this.f9312a & 1) == 0) {
                            this.f9313b = new ArrayList(this.f9313b);
                            this.f9312a |= 1;
                        }
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix getDefaultInstanceForType() {
                        return GraphMatrix.m8431x();
                    }

                    /* renamed from: p */
                    public final RepeatedFieldBuilderV3 m8466p() {
                        if (this.f9314c == null) {
                            this.f9314c = new RepeatedFieldBuilderV3(this.f9313b, (this.f9312a & 1) != 0, getParentForChildren(), isClean());
                            this.f9313b = null;
                        }
                        return this.f9314c;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix m8467q() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9318g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9317f;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    /* renamed from: r */
                    public EzyMatrix.Matrix.C7109b m8468r() {
                        this.f9312a |= 4;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8445s().getBuilder();
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix m8469t() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9316e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9315d;
                        return matrix == null ? EzyMatrix.Matrix.m8850x() : matrix;
                    }

                    /* renamed from: u */
                    public EzyMatrix.Matrix.C7109b m8470u() {
                        this.f9312a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C7109b) m8446v().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C7086b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9314c;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m8464n();
                                                this.f9313b.add(graphData);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(graphData);
                                            }
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m8446v().getBuilder(), extensionRegistryLite);
                                            this.f9312a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m8445s().getBuilder(), extensionRegistryLite);
                                            this.f9312a |= 4;
                                        } else if (tag == 34) {
                                            this.f9319h = codedInputStream.readStringRequireUtf8();
                                            this.f9312a |= 8;
                                        } else if (tag == 40) {
                                            this.f9320i = codedInputStream.readInt32();
                                            this.f9312a |= 16;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public C7086b mergeFrom(Message message) {
                        if (message instanceof GraphMatrix) {
                            return m8473y((GraphMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: y */
                    public C7086b m8473y(GraphMatrix graphMatrix) {
                        if (graphMatrix == GraphMatrix.m8431x()) {
                            return this;
                        }
                        if (this.f9314c == null) {
                            if (!graphMatrix.f9306b.isEmpty()) {
                                if (this.f9313b.isEmpty()) {
                                    this.f9313b = graphMatrix.f9306b;
                                    this.f9312a &= -2;
                                } else {
                                    m8464n();
                                    this.f9313b.addAll(graphMatrix.f9306b);
                                }
                                onChanged();
                            }
                        } else if (!graphMatrix.f9306b.isEmpty()) {
                            if (this.f9314c.isEmpty()) {
                                this.f9314c.dispose();
                                this.f9314c = null;
                                this.f9313b = graphMatrix.f9306b;
                                this.f9312a &= -2;
                                this.f9314c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8466p() : null;
                            } else {
                                this.f9314c.addAllMessages(graphMatrix.f9306b);
                            }
                        }
                        if (graphMatrix.m8438G()) {
                            m8447A(graphMatrix.m8434C());
                        }
                        if (graphMatrix.m8437F()) {
                            m8474z(graphMatrix.m8433B());
                        }
                        if (!graphMatrix.m8435D().isEmpty()) {
                            this.f9319h = graphMatrix.f9309e;
                            this.f9312a |= 8;
                            onChanged();
                        }
                        if (graphMatrix.m8436E() != 0) {
                            m8452F(graphMatrix.m8436E());
                        }
                        mergeUnknownFields(graphMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C7086b m8474z(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9318g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9312a & 4) == 0 || (matrix2 = this.f9317f) == null || matrix2 == EzyMatrix.Matrix.m8850x()) {
                            this.f9317f = matrix;
                        } else {
                            m8468r().m8877o(matrix);
                        }
                        if (this.f9317f != null) {
                            this.f9312a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    public C7086b() {
                        this.f9313b = Collections.EMPTY_LIST;
                        this.f9319h = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7086b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9313b = Collections.EMPTY_LIST;
                        this.f9319h = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9309e = "";
                    this.f9310f = 0;
                    this.f9311g = (byte) -1;
                }

                private GraphMatrix() {
                    this.f9309e = "";
                    this.f9310f = 0;
                    this.f9311g = (byte) -1;
                    this.f9306b = Collections.EMPTY_LIST;
                    this.f9309e = "";
                }
            }

            public static final class GraphRemove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: c */
                public static final GraphRemove f9321c = new GraphRemove();

                /* renamed from: d */
                public static final Parser f9322d = new C7087a();

                /* renamed from: a */
                public List f9323a;

                /* renamed from: b */
                public byte f9324b;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$a */
                public class C7087a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphRemove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7088b c7088bM8479u = GraphRemove.m8479u();
                        try {
                            c7088bM8479u.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7088bM8479u.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7088bM8479u.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7088bM8479u.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7088bM8479u.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9168g;
                }

                /* renamed from: k */
                public static GraphRemove m8478k() {
                    return f9321c;
                }

                /* renamed from: u */
                public static C7088b m8479u() {
                    return f9321c.toBuilder();
                }

                /* renamed from: x */
                public static GraphRemove m8480x(ByteString byteString) {
                    return (GraphRemove) f9322d.parseFrom(byteString);
                }

                /* renamed from: y */
                public static GraphRemove m8481y(byte[] bArr) {
                    return (GraphRemove) f9322d.parseFrom(bArr);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof GraphRemove)) {
                        return super.equals(obj);
                    }
                    GraphRemove graphRemove = (GraphRemove) obj;
                    return m8484t().equals(graphRemove.m8484t()) && getUnknownFields().equals(graphRemove.getUnknownFields());
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9322d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeMessageSize = 0;
                    for (int i10 = 0; i10 < this.f9323a.size(); i10++) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9323a.get(i10));
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m8483q() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m8484t().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9169h.ensureFieldAccessorsInitialized(GraphRemove.class, C7088b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9324b;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9324b = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public GraphRemove getDefaultInstanceForType() {
                    return f9321c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphRemove();
                }

                /* renamed from: q */
                public int m8483q() {
                    return this.f9323a.size();
                }

                /* renamed from: t */
                public List m8484t() {
                    return this.f9323a;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7088b newBuilderForType() {
                    return m8479u();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C7088b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7088b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    for (int i9 = 0; i9 < this.f9323a.size(); i9++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f9323a.get(i9));
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7088b toBuilder() {
                    return this == f9321c ? new C7088b() : new C7088b().m8504s(this);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$b */
                public static final class C7088b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9325a;

                    /* renamed from: b */
                    public List f9326b;

                    /* renamed from: c */
                    public RepeatedFieldBuilderV3 f9327c;

                    /* renamed from: n */
                    private void m8489n() {
                        if ((this.f9325a & 1) == 0) {
                            this.f9326b = new ArrayList(this.f9326b);
                            this.f9325a |= 1;
                        }
                    }

                    /* renamed from: p */
                    private RepeatedFieldBuilderV3 m8490p() {
                        if (this.f9327c == null) {
                            this.f9327c = new RepeatedFieldBuilderV3(this.f9326b, (this.f9325a & 1) != 0, getParentForChildren(), isClean());
                            this.f9326b = null;
                        }
                        return this.f9327c;
                    }

                    /* renamed from: b */
                    public C7088b m8491b(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9327c;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m8489n();
                        AbstractMessageLite.Builder.addAll(iterable, this.f9326b);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public C7088b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7088b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphRemove build() {
                        GraphRemove graphRemoveBuildPartial = buildPartial();
                        if (graphRemoveBuildPartial.isInitialized()) {
                            return graphRemoveBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphRemoveBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphRemove buildPartial() {
                        GraphRemove graphRemove = new GraphRemove(this);
                        m8496h(graphRemove);
                        if (this.f9325a != 0) {
                            m8495g(graphRemove);
                        }
                        onBuilt();
                        return graphRemove;
                    }

                    /* renamed from: g */
                    public final void m8495g(GraphRemove graphRemove) {
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9168g;
                    }

                    /* renamed from: h */
                    public final void m8496h(GraphRemove graphRemove) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9327c;
                        if (repeatedFieldBuilderV3 != null) {
                            graphRemove.f9323a = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f9325a & 1) != 0) {
                            this.f9326b = Collections.unmodifiableList(this.f9326b);
                            this.f9325a &= -2;
                        }
                        graphRemove.f9323a = this.f9326b;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7088b clear() {
                        super.clear();
                        this.f9325a = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9327c;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f9326b = Collections.EMPTY_LIST;
                        } else {
                            this.f9326b = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f9325a &= -2;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9169h.ensureFieldAccessorsInitialized(GraphRemove.class, C7088b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7088b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7088b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C7088b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7088b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7088b mo24685clone() {
                        return (C7088b) super.mo24685clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public GraphRemove getDefaultInstanceForType() {
                        return GraphRemove.m8478k();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C7088b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9327c;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m8489n();
                                                this.f9326b.add(graphData);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(graphData);
                                            }
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C7088b mergeFrom(Message message) {
                        if (message instanceof GraphRemove) {
                            return m8504s((GraphRemove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: s */
                    public C7088b m8504s(GraphRemove graphRemove) {
                        if (graphRemove == GraphRemove.m8478k()) {
                            return this;
                        }
                        if (this.f9327c == null) {
                            if (!graphRemove.f9323a.isEmpty()) {
                                if (this.f9326b.isEmpty()) {
                                    this.f9326b = graphRemove.f9323a;
                                    this.f9325a &= -2;
                                } else {
                                    m8489n();
                                    this.f9326b.addAll(graphRemove.f9323a);
                                }
                                onChanged();
                            }
                        } else if (!graphRemove.f9323a.isEmpty()) {
                            if (this.f9327c.isEmpty()) {
                                this.f9327c.dispose();
                                this.f9327c = null;
                                this.f9326b = graphRemove.f9323a;
                                this.f9325a &= -2;
                                this.f9327c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8490p() : null;
                            } else {
                                this.f9327c.addAllMessages(graphRemove.f9323a);
                            }
                        }
                        mergeUnknownFields(graphRemove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C7088b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7088b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public C7088b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7088b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C7088b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7088b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C7088b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7088b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C7088b() {
                        this.f9326b = Collections.EMPTY_LIST;
                    }

                    public C7088b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9326b = Collections.EMPTY_LIST;
                    }
                }

                public GraphRemove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9324b = (byte) -1;
                }

                private GraphRemove() {
                    this.f9324b = (byte) -1;
                    this.f9323a = Collections.EMPTY_LIST;
                }
            }

            public static final class REBUILD extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: f */
                public static final REBUILD f9328f = new REBUILD();

                /* renamed from: g */
                public static final Parser f9329g = new C7089a();

                /* renamed from: a */
                public int f9330a;

                /* renamed from: b */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot f9331b;

                /* renamed from: c */
                public int f9332c;

                /* renamed from: d */
                public EzyHeader.BackgroundLineConfig f9333d;

                /* renamed from: e */
                public byte f9334e;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$a */
                public class C7089a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public REBUILD parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7090b c7090bM8517y = REBUILD.m8517y();
                        try {
                            c7090bM8517y.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7090bM8517y.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7090bM8517y.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7090bM8517y.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7090bM8517y.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static REBUILD m8509B(ByteString byteString) {
                    return (REBUILD) f9329g.parseFrom(byteString);
                }

                /* renamed from: C */
                public static REBUILD m8510C(byte[] bArr) {
                    return (REBUILD) f9329g.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f9184w;
                }

                /* renamed from: n */
                public static /* synthetic */ int m8515n(REBUILD rebuild, int i9) {
                    int i10 = i9 | rebuild.f9330a;
                    rebuild.f9330a = i10;
                    return i10;
                }

                /* renamed from: t */
                public static REBUILD m8516t() {
                    return f9328f;
                }

                /* renamed from: y */
                public static C7090b m8517y() {
                    return f9328f.toBuilder();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C7090b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7090b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C7090b toBuilder() {
                    return this == f9328f ? new C7090b() : new C7090b().m8548v(this);
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public boolean equals(Object obj) {
                    if (obj == this) {
                        return true;
                    }
                    if (!(obj instanceof REBUILD)) {
                        return super.equals(obj);
                    }
                    REBUILD rebuild = (REBUILD) obj;
                    if (m8524x() != rebuild.m8524x()) {
                        return false;
                    }
                    if ((!m8524x() || m8522v().equals(rebuild.m8522v())) && getBackgroundColor() == rebuild.getBackgroundColor() && m8523w() == rebuild.m8523w()) {
                        return (!m8523w() || m8520q().equals(rebuild.m8520q())) && getUnknownFields().equals(rebuild.getUnknownFields());
                    }
                    return false;
                }

                public int getBackgroundColor() {
                    return this.f9332c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9329g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i9 = this.memoizedSize;
                    if (i9 != -1) {
                        return i9;
                    }
                    int iComputeMessageSize = (this.f9330a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m8522v()) : 0;
                    int i10 = this.f9332c;
                    if (i10 != 0) {
                        iComputeMessageSize += CodedOutputStream.computeInt32Size(2, i10);
                    }
                    if ((this.f9330a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(3, m8520q());
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i9 = this.memoizedHashCode;
                    if (i9 != 0) {
                        return i9;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m8524x()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m8522v().hashCode();
                    }
                    int backgroundColor = (((iHashCode * 37) + 2) * 53) + getBackgroundColor();
                    if (m8523w()) {
                        backgroundColor = (((backgroundColor * 37) + 3) * 53) + m8520q().hashCode();
                    }
                    int iHashCode2 = (backgroundColor * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9185x.ensureFieldAccessorsInitialized(REBUILD.class, C7090b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9334e;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9334e = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new REBUILD();
                }

                /* renamed from: q */
                public EzyHeader.BackgroundLineConfig m8520q() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9333d;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8671q() : backgroundLineConfig;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public REBUILD getDefaultInstanceForType() {
                    return f9328f;
                }

                /* renamed from: v */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot m8522v() {
                    EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f9331b;
                    return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8988J() : graphSnapshot;
                }

                /* renamed from: w */
                public boolean m8523w() {
                    return (this.f9330a & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if ((this.f9330a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m8522v());
                    }
                    int i9 = this.f9332c;
                    if (i9 != 0) {
                        codedOutputStream.writeInt32(2, i9);
                    }
                    if ((this.f9330a & 2) != 0) {
                        codedOutputStream.writeMessage(3, m8520q());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public boolean m8524x() {
                    return (this.f9330a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C7090b newBuilderForType() {
                    return m8517y();
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$b */
                public static final class C7090b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9335a;

                    /* renamed from: b */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot f9336b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f9337c;

                    /* renamed from: d */
                    public int f9338d;

                    /* renamed from: e */
                    public EzyHeader.BackgroundLineConfig f9339e;

                    /* renamed from: f */
                    public SingleFieldBuilderV3 f9340f;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m8544r();
                            m8540n();
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public C7090b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                        return (C7090b) super.setRepeatedField(fieldDescriptor, i9, obj);
                    }

                    /* renamed from: B */
                    public C7090b m8528B(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9337c;
                        if (singleFieldBuilderV3 == null) {
                            graphSnapshot.getClass();
                            this.f9336b = graphSnapshot;
                        } else {
                            singleFieldBuilderV3.setMessage(graphSnapshot);
                        }
                        this.f9335a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C7090b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7090b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C7090b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7090b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public REBUILD build() {
                        REBUILD rebuildBuildPartial = buildPartial();
                        if (rebuildBuildPartial.isInitialized()) {
                            return rebuildBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) rebuildBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public REBUILD buildPartial() {
                        REBUILD rebuild = new REBUILD(this);
                        if (this.f9335a != 0) {
                            m8533f(rebuild);
                        }
                        onBuilt();
                        return rebuild;
                    }

                    /* renamed from: f */
                    public final void m8533f(REBUILD rebuild) {
                        int i9;
                        int i10 = this.f9335a;
                        if ((i10 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9337c;
                            rebuild.f9331b = singleFieldBuilderV3 == null ? this.f9336b : (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.build();
                            i9 = 1;
                        } else {
                            i9 = 0;
                        }
                        if ((i10 & 2) != 0) {
                            rebuild.f9332c = this.f9338d;
                        }
                        if ((i10 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9340f;
                            rebuild.f9333d = singleFieldBuilderV32 == null ? this.f9339e : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i9 |= 2;
                        }
                        REBUILD.m8515n(rebuild, i9);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C7090b clear() {
                        super.clear();
                        this.f9335a = 0;
                        this.f9336b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9337c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9337c = null;
                        }
                        this.f9338d = 0;
                        this.f9339e = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9340f;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9340f = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f9184w;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7090b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7090b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7090b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7090b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f9185x.ensureFieldAccessorsInitialized(REBUILD.class, C7090b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7090b mo24685clone() {
                        return (C7090b) super.mo24685clone();
                    }

                    /* renamed from: l */
                    public EzyHeader.BackgroundLineConfig m8538l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9340f;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9339e;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8671q() : backgroundLineConfig;
                    }

                    /* renamed from: m */
                    public EzyHeader.BackgroundLineConfig.C7102b m8539m() {
                        this.f9335a |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C7102b) m8540n().getBuilder();
                    }

                    /* renamed from: n */
                    public final SingleFieldBuilderV3 m8540n() {
                        if (this.f9340f == null) {
                            this.f9340f = new SingleFieldBuilderV3(m8538l(), getParentForChildren(), isClean());
                            this.f9339e = null;
                        }
                        return this.f9340f;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public REBUILD getDefaultInstanceForType() {
                        return REBUILD.m8516t();
                    }

                    /* renamed from: p */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m8542p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9337c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.getMessage();
                        }
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f9336b;
                        return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8988J() : graphSnapshot;
                    }

                    /* renamed from: q */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b m8543q() {
                        this.f9335a |= 1;
                        onChanged();
                        return (EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7118b) m8544r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m8544r() {
                        if (this.f9337c == null) {
                            this.f9337c = new SingleFieldBuilderV3(m8542p(), getParentForChildren(), isClean());
                            this.f9336b = null;
                        }
                        return this.f9337c;
                    }

                    /* renamed from: s */
                    public C7090b m8545s(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9340f;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f9335a & 4) == 0 || (backgroundLineConfig2 = this.f9339e) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m8671q()) {
                            this.f9339e = backgroundLineConfig;
                        } else {
                            m8539m().m8694o(backgroundLineConfig);
                        }
                        if (this.f9339e != null) {
                            this.f9335a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7090b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m8544r().getBuilder(), extensionRegistryLite);
                                            this.f9335a |= 1;
                                        } else if (tag == 16) {
                                            this.f9338d = codedInputStream.readInt32();
                                            this.f9335a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m8540n().getBuilder(), extensionRegistryLite);
                                            this.f9335a |= 4;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z9 = true;
                                } catch (InvalidProtocolBufferException e10) {
                                    throw e10.unwrapIOException();
                                }
                            } catch (Throwable th) {
                                onChanged();
                                throw th;
                            }
                        }
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public C7090b mergeFrom(Message message) {
                        if (message instanceof REBUILD) {
                            return m8548v((REBUILD) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: v */
                    public C7090b m8548v(REBUILD rebuild) {
                        if (rebuild == REBUILD.m8516t()) {
                            return this;
                        }
                        if (rebuild.m8524x()) {
                            m8549w(rebuild.m8522v());
                        }
                        if (rebuild.getBackgroundColor() != 0) {
                            m8551y(rebuild.getBackgroundColor());
                        }
                        if (rebuild.m8523w()) {
                            m8545s(rebuild.m8520q());
                        }
                        mergeUnknownFields(rebuild.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: w */
                    public C7090b m8549w(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9337c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(graphSnapshot);
                        } else if ((this.f9335a & 1) == 0 || (graphSnapshot2 = this.f9336b) == null || graphSnapshot2 == EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8988J()) {
                            this.f9336b = graphSnapshot;
                        } else {
                            m8543q().m9023B(graphSnapshot);
                        }
                        if (this.f9336b != null) {
                            this.f9335a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7090b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7090b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: y */
                    public C7090b m8551y(int i9) {
                        this.f9338d = i9;
                        this.f9335a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: z, reason: merged with bridge method [inline-methods] */
                    public C7090b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7090b) super.setField(fieldDescriptor, obj);
                    }

                    public C7090b() {
                        maybeForceBuilderInitialization();
                    }

                    public C7090b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public REBUILD(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9332c = 0;
                    this.f9334e = (byte) -1;
                }

                private REBUILD() {
                    this.f9332c = 0;
                    this.f9334e = (byte) -1;
                }
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$a */
            public class C7091a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public CommandInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7092b c7092bM8065B = CommandInfo.m8065B();
                    try {
                        c7092bM8065B.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7092bM8065B.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7092bM8065B.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7092bM8065B.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7092bM8065B.buildPartial());
                    }
                }
            }

            /* renamed from: B */
            public static C7092b m8065B() {
                return f9191g.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyCommand.f9164c;
            }

            public static Parser parser() {
                return f9192h;
            }

            /* renamed from: w */
            public static CommandInfo m8072w() {
                return f9191g;
            }

            /* renamed from: A */
            public boolean m8073A() {
                return this.f9195c;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: C, reason: merged with bridge method [inline-methods] */
            public C7092b newBuilderForType() {
                return m8065B();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: D, reason: merged with bridge method [inline-methods] */
            public C7092b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7092b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: E, reason: merged with bridge method [inline-methods] */
            public C7092b toBuilder() {
                return this == f9191g ? new C7092b() : new C7092b().m8565o(this);
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CommandInfo)) {
                    return super.equals(obj);
                }
                CommandInfo commandInfo = (CommandInfo) obj;
                return m8081y() == commandInfo.m8081y() && m8082z() == commandInfo.m8082z() && m8073A() == commandInfo.m8073A() && this.f9196d == commandInfo.f9196d && m8079v().equals(commandInfo.m8079v()) && getUnknownFields().equals(commandInfo.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f9192h;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i9 = this.memoizedSize;
                if (i9 != -1) {
                    return i9;
                }
                long j9 = this.f9193a;
                int iComputeInt64Size = j9 != 0 ? CodedOutputStream.computeInt64Size(1, j9) : 0;
                long j10 = this.f9194b;
                if (j10 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j10);
                }
                boolean z9 = this.f9195c;
                if (z9) {
                    iComputeInt64Size += CodedOutputStream.computeBoolSize(3, z9);
                }
                if (this.f9196d != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    iComputeInt64Size += CodedOutputStream.computeEnumSize(4, this.f9196d);
                }
                if (!this.f9197e.isEmpty()) {
                    iComputeInt64Size += CodedOutputStream.computeBytesSize(5, this.f9197e);
                }
                int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i9 = this.memoizedHashCode;
                if (i9 != 0) {
                    return i9;
                }
                int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(m8081y())) * 37) + 2) * 53) + Internal.hashLong(m8082z())) * 37) + 3) * 53) + Internal.hashBoolean(m8073A())) * 37) + 4) * 53) + this.f9196d) * 37) + 5) * 53) + m8079v().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f9165d.ensureFieldAccessorsInitialized(CommandInfo.class, C7092b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f9198f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f9198f = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new CommandInfo();
            }

            /* renamed from: t */
            public EzyCommandEnum.CommandEnum m8077t() {
                EzyCommandEnum.CommandEnum commandEnumM8600c = EzyCommandEnum.CommandEnum.m8600c(this.f9196d);
                return commandEnumM8600c == null ? EzyCommandEnum.CommandEnum.UNRECOGNIZED : commandEnumM8600c;
            }

            /* renamed from: u */
            public int m8078u() {
                return this.f9196d;
            }

            /* renamed from: v */
            public ByteString m8079v() {
                return this.f9197e;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j9 = this.f9193a;
                if (j9 != 0) {
                    codedOutputStream.writeInt64(1, j9);
                }
                long j10 = this.f9194b;
                if (j10 != 0) {
                    codedOutputStream.writeInt64(2, j10);
                }
                boolean z9 = this.f9195c;
                if (z9) {
                    codedOutputStream.writeBool(3, z9);
                }
                if (this.f9196d != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    codedOutputStream.writeEnum(4, this.f9196d);
                }
                if (!this.f9197e.isEmpty()) {
                    codedOutputStream.writeBytes(5, this.f9197e);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public CommandInfo getDefaultInstanceForType() {
                return f9191g;
            }

            /* renamed from: y */
            public long m8081y() {
                return this.f9193a;
            }

            /* renamed from: z */
            public long m8082z() {
                return this.f9194b;
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$b */
            public static final class C7092b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9341a;

                /* renamed from: b */
                public long f9342b;

                /* renamed from: c */
                public long f9343c;

                /* renamed from: d */
                public boolean f9344d;

                /* renamed from: e */
                public int f9345e;

                /* renamed from: f */
                public ByteString f9346f;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C7092b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7092b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public CommandInfo build() {
                    CommandInfo commandInfoBuildPartial = buildPartial();
                    if (commandInfoBuildPartial.isInitialized()) {
                        return commandInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public CommandInfo buildPartial() {
                    CommandInfo commandInfo = new CommandInfo(this);
                    if (this.f9341a != 0) {
                        m8557f(commandInfo);
                    }
                    onBuilt();
                    return commandInfo;
                }

                /* renamed from: f */
                public final void m8557f(CommandInfo commandInfo) {
                    int i9 = this.f9341a;
                    if ((i9 & 1) != 0) {
                        commandInfo.f9193a = this.f9342b;
                    }
                    if ((i9 & 2) != 0) {
                        commandInfo.f9194b = this.f9343c;
                    }
                    if ((i9 & 4) != 0) {
                        commandInfo.f9195c = this.f9344d;
                    }
                    if ((i9 & 8) != 0) {
                        commandInfo.f9196d = this.f9345e;
                    }
                    if ((i9 & 16) != 0) {
                        commandInfo.f9197e = this.f9346f;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C7092b clear() {
                    super.clear();
                    this.f9341a = 0;
                    this.f9342b = 0L;
                    this.f9343c = 0L;
                    this.f9344d = false;
                    this.f9345e = 0;
                    this.f9346f = ByteString.EMPTY;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyCommand.f9164c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7092b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7092b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7092b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7092b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f9165d.ensureFieldAccessorsInitialized(CommandInfo.class, C7092b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7092b mo24685clone() {
                    return (C7092b) super.mo24685clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public CommandInfo getDefaultInstanceForType() {
                    return CommandInfo.m8072w();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7092b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f9342b = codedInputStream.readInt64();
                                        this.f9341a |= 1;
                                    } else if (tag == 16) {
                                        this.f9343c = codedInputStream.readInt64();
                                        this.f9341a |= 2;
                                    } else if (tag == 24) {
                                        this.f9344d = codedInputStream.readBool();
                                        this.f9341a |= 4;
                                    } else if (tag == 32) {
                                        this.f9345e = codedInputStream.readEnum();
                                        this.f9341a |= 8;
                                    } else if (tag == 42) {
                                        this.f9346f = codedInputStream.readBytes();
                                        this.f9341a |= 16;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                }
                                z9 = true;
                            } catch (InvalidProtocolBufferException e10) {
                                throw e10.unwrapIOException();
                            }
                        } catch (Throwable th) {
                            onChanged();
                            throw th;
                        }
                    }
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7092b mergeFrom(Message message) {
                    if (message instanceof CommandInfo) {
                        return m8565o((CommandInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7092b m8565o(CommandInfo commandInfo) {
                    if (commandInfo == CommandInfo.m8072w()) {
                        return this;
                    }
                    if (commandInfo.m8081y() != 0) {
                        m8570t(commandInfo.m8081y());
                    }
                    if (commandInfo.m8082z() != 0) {
                        m8571u(commandInfo.m8082z());
                    }
                    if (commandInfo.m8073A()) {
                        m8573w(commandInfo.m8073A());
                    }
                    if (commandInfo.f9196d != 0) {
                        m8568r(commandInfo.m8078u());
                    }
                    if (commandInfo.m8079v() != ByteString.EMPTY) {
                        m8569s(commandInfo.m8079v());
                    }
                    mergeUnknownFields(commandInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7092b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7092b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: q */
                public C7092b m8567q(EzyCommandEnum.CommandEnum commandEnum) {
                    commandEnum.getClass();
                    this.f9341a |= 8;
                    this.f9345e = commandEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C7092b m8568r(int i9) {
                    this.f9345e = i9;
                    this.f9341a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7092b m8569s(ByteString byteString) {
                    byteString.getClass();
                    this.f9346f = byteString;
                    this.f9341a |= 16;
                    onChanged();
                    return this;
                }

                /* renamed from: t */
                public C7092b m8570t(long j9) {
                    this.f9342b = j9;
                    this.f9341a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C7092b m8571u(long j9) {
                    this.f9343c = j9;
                    this.f9341a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7092b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7092b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: w */
                public C7092b m8573w(boolean z9) {
                    this.f9344d = z9;
                    this.f9341a |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7092b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                    return (C7092b) super.setRepeatedField(fieldDescriptor, i9, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public final C7092b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7092b) super.setUnknownFields(unknownFieldSet);
                }

                public C7092b() {
                    this.f9345e = 0;
                    this.f9346f = ByteString.EMPTY;
                }

                public C7092b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9345e = 0;
                    this.f9346f = ByteString.EMPTY;
                }
            }

            public CommandInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f9193a = 0L;
                this.f9194b = 0L;
                this.f9195c = false;
                this.f9196d = 0;
                this.f9197e = ByteString.EMPTY;
                this.f9198f = (byte) -1;
            }

            private CommandInfo() {
                this.f9193a = 0L;
                this.f9194b = 0L;
                this.f9195c = false;
                this.f9196d = 0;
                ByteString byteString = ByteString.EMPTY;
                this.f9198f = (byte) -1;
                this.f9196d = 0;
                this.f9197e = byteString;
            }
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$a */
        public class C7093a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CommandSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7094b c7094bM8057u = CommandSource.m8057u();
                try {
                    c7094bM8057u.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7094bM8057u.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7094bM8057u.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7094bM8057u.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7094bM8057u.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyCommand.f9162a;
        }

        /* renamed from: q */
        public static CommandSource m8056q() {
            return f9187c;
        }

        /* renamed from: u */
        public static C7094b m8057u() {
            return f9187c.toBuilder();
        }

        /* renamed from: x */
        public static CommandSource m8058x(InputStream inputStream) {
            return (CommandSource) GeneratedMessageV3.parseWithIOException(f9188d, inputStream);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CommandSource)) {
                return super.equals(obj);
            }
            CommandSource commandSource = (CommandSource) obj;
            return m8060n().equals(commandSource.m8060n()) && getUnknownFields().equals(commandSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f9188d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i9 = this.memoizedSize;
            if (i9 != -1) {
                return i9;
            }
            int iComputeMessageSize = 0;
            for (int i10 = 0; i10 < this.f9189a.size(); i10++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9189a.get(i10));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i9 = this.memoizedHashCode;
            if (i9 != 0) {
                return i9;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m8059k() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m8060n().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyCommand.f9163b.ensureFieldAccessorsInitialized(CommandSource.class, C7094b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f9190b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f9190b = (byte) 1;
            return true;
        }

        /* renamed from: k */
        public int m8059k() {
            return this.f9189a.size();
        }

        /* renamed from: n */
        public List m8060n() {
            return this.f9189a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CommandSource();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public CommandSource getDefaultInstanceForType() {
            return f9187c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C7094b newBuilderForType() {
            return m8057u();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public C7094b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7094b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i9 = 0; i9 < this.f9189a.size(); i9++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f9189a.get(i9));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public C7094b toBuilder() {
            return this == f9187c ? new C7094b() : new C7094b().m8593t(this);
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$b */
        public static final class C7094b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9347a;

            /* renamed from: b */
            public List f9348b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9349c;

            /* renamed from: b */
            public C7094b m8577b(CommandInfo.C7092b c7092b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9349c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7092b.build());
                    return this;
                }
                m8587n();
                this.f9348b.add(c7092b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C7094b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7094b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public CommandSource build() {
                CommandSource commandSourceBuildPartial = buildPartial();
                if (commandSourceBuildPartial.isInitialized()) {
                    return commandSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public CommandSource buildPartial() {
                CommandSource commandSource = new CommandSource(this);
                m8582h(commandSource);
                if (this.f9347a != 0) {
                    m8581g(commandSource);
                }
                onBuilt();
                return commandSource;
            }

            /* renamed from: g */
            public final void m8581g(CommandSource commandSource) {
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyCommand.f9162a;
            }

            /* renamed from: h */
            public final void m8582h(CommandSource commandSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9349c;
                if (repeatedFieldBuilderV3 != null) {
                    commandSource.f9189a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9347a & 1) != 0) {
                    this.f9348b = Collections.unmodifiableList(this.f9348b);
                    this.f9347a &= -2;
                }
                commandSource.f9189a = this.f9348b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7094b clear() {
                super.clear();
                this.f9347a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9349c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9348b = Collections.EMPTY_LIST;
                } else {
                    this.f9348b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9347a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f9163b.ensureFieldAccessorsInitialized(CommandSource.class, C7094b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7094b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7094b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7094b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7094b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7094b mo24685clone() {
                return (C7094b) super.mo24685clone();
            }

            /* renamed from: n */
            public final void m8587n() {
                if ((this.f9347a & 1) == 0) {
                    this.f9348b = new ArrayList(this.f9348b);
                    this.f9347a |= 1;
                }
            }

            /* renamed from: o */
            public int m8588o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9349c;
                return repeatedFieldBuilderV3 == null ? this.f9348b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m8589p() {
                if (this.f9349c == null) {
                    this.f9349c = new RepeatedFieldBuilderV3(this.f9348b, (this.f9347a & 1) != 0, getParentForChildren(), isClean());
                    this.f9348b = null;
                }
                return this.f9349c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public CommandSource getDefaultInstanceForType() {
                return CommandSource.m8056q();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7094b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    CommandInfo commandInfo = (CommandInfo) codedInputStream.readMessage(CommandInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9349c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m8587n();
                                        this.f9348b.add(commandInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(commandInfo);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z9 = true;
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.unwrapIOException();
                        }
                    } catch (Throwable th) {
                        onChanged();
                        throw th;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7094b mergeFrom(Message message) {
                if (message instanceof CommandSource) {
                    return m8593t((CommandSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7094b m8593t(CommandSource commandSource) {
                if (commandSource == CommandSource.m8056q()) {
                    return this;
                }
                if (this.f9349c == null) {
                    if (!commandSource.f9189a.isEmpty()) {
                        if (this.f9348b.isEmpty()) {
                            this.f9348b = commandSource.f9189a;
                            this.f9347a &= -2;
                        } else {
                            m8587n();
                            this.f9348b.addAll(commandSource.f9189a);
                        }
                        onChanged();
                    }
                } else if (!commandSource.f9189a.isEmpty()) {
                    if (this.f9349c.isEmpty()) {
                        this.f9349c.dispose();
                        this.f9349c = null;
                        this.f9348b = commandSource.f9189a;
                        this.f9347a &= -2;
                        this.f9349c = GeneratedMessageV3.alwaysUseFieldBuilders ? m8589p() : null;
                    } else {
                        this.f9349c.addAllMessages(commandSource.f9189a);
                    }
                }
                mergeUnknownFields(commandSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7094b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7094b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7094b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7094b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7094b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i9, Object obj) {
                return (C7094b) super.setRepeatedField(fieldDescriptor, i9, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7094b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7094b) super.setUnknownFields(unknownFieldSet);
            }

            public C7094b() {
                this.f9348b = Collections.EMPTY_LIST;
            }

            public C7094b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9348b = Collections.EMPTY_LIST;
            }
        }

        public CommandSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f9190b = (byte) -1;
        }

        private CommandSource() {
            this.f9190b = (byte) -1;
            this.f9189a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m8052y().getMessageTypes().get(0);
        f9162a = descriptor;
        f9163b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f9164c = descriptor2;
        f9165d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DelayTime", "Duration", "IsPlay", "CommandEnum", "Data"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f9166e = descriptor3;
        f9167f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"GraphEnum", "GraphId", "OutRect", "ParentGraphId", "SourceFileName", "SourceId", "Extras"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f9168g = descriptor4;
        f9169h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GraphData"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        f9170i = descriptor5;
        f9171j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"GraphData", "OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        f9172k = descriptor6;
        f9173l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GraphId", "GraphEnum", "OutRect", "Content", "Paint", "Points", "RenderMatrix", "FilePath"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(4);
        f9174m = descriptor7;
        f9175n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"FileName", "Duration", "Validate"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(5);
        f9176o = descriptor8;
        f9177p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(6);
        f9178q = descriptor9;
        f9179r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"OriginMatrix", "LastMatrix"});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(7);
        f9180s = descriptor10;
        f9181t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"OriginBackground", "LastBackground", "OriginBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(8);
        f9182u = descriptor11;
        f9183v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor12 = descriptor2.getNestedTypes().get(9);
        f9184w = descriptor12;
        f9185x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Snapshot", "BackgroundColor", "BackgroundLineConfig"});
        AnyProto.getDescriptor();
        EzyCommandEnum.m8598a();
        EzyGraphEnum.m8608a();
        EzyRectF.m9169c();
        EzyMatrix.m8838c();
        EzyPaint.m9092c();
        EzyPointF.m9134c();
        EzyPageSnapshot.m8964e();
        EzyHeader.m8621i();
    }

    /* renamed from: y */
    public static Descriptors.FileDescriptor m8052y() {
        return f9186y;
    }
}
