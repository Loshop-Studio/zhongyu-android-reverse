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
    public static final Descriptors.Descriptor f8889a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f8890b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f8891c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f8892d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f8893e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f8894f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f8895g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f8896h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f8897i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f8898j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f8899k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f8900l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f8901m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f8902n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f8903o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f8904p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f8905q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f8906r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f8907s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f8908t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f8909u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f8910v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f8911w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f8912x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f8913y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rCommand.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017enums/CommandEnum.proto\u001a\u0015enums/GraphEnum.proto\u001a\u0011utils/RectF.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0013GraphSnapshot.proto\u001a\fHeader.proto\"\u0092\u000b\n\rCommandSource\u0012/\n\u000bcommandInfo\u0018\u0001 \u0003(\u000b2\u001a.CommandSource.CommandInfo\u001aÏ\n\n\u000bCommandInfo\u0012\u0011\n\tdelayTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006isPlay\u0018\u0003 \u0001(\b\u0012!\n\u000bcommandEnum\u0018\u0004 \u0001(\u000e2\f.CommandEnum\u0012\f\n\u0004data\u0018\u0005 \u0001(\f\u001a¥\u0001\n\tGraphData\u0012\u001d\n\tgraphEnum\u0018\u0001 \u0001(\u000e2\n.GraphEnum\u0012\u000f\n\u0007graphId\u0018\u0002 \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0015\n\rparentGraphId\u0018\u0004 \u0001(\t\u0012\u0016\n\u000esourceFileName\u0018\u0005 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\t\u001aF\n\u000bGraphRemove\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u001a¬\u0001\n\u000bGraphMatrix\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u0012\u001d\n\foriginMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0003 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0004 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0005 \u0001(\u0005\u001aÈ\u0001\n\u000bGraphChange\u0012\u000f\n\u0007graphId\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0005 \u0001(\u000b2\u0006.Paint\u0012\u0017\n\u0006points\u0018\u0006 \u0003(\u000b2\u0007.PointF\u0012\u001d\n\frenderMatrix\u0018\u0007 \u0001(\u000b2\u0007.Matrix\u0012\u0010\n\bfilePath\u0018\b \u0001(\t\u001aB\n\nAudioStart\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\u001at\n\fCameraMatrix\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0003 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0004 \u0001(\u0005\u001aD\n\u0006Camera\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u001a®\u0001\n\u0006Config\u0012\u0018\n\u0010originBackground\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000elastBackground\u0018\u0002 \u0001(\u0005\u00129\n\u001aoriginBackgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u0004 \u0001(\u000b2\u0015.BackgroundLineConfig\u001a6\n\nCursorMove\u0012\u0016\n\u000esourceFileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0002 \u0001(\u0005\u001a\u0086\u0001\n\u0007REBUILD\u0012-\n\bsnapshot\u0018\u0001 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0017\n\u000fbackgroundColor\u0018\u0002 \u0001(\u0005\u00123\n\u0014backgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfigB\u001c\n\u000ecom.zykj.boardB\nEzyCommandb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), EzyCommandEnum.m7976a(), EzyGraphEnum.m7984a(), EzyRectF.m8542c(), EzyMatrix.m8214c(), EzyPaint.m8466c(), EzyPointF.m8508c(), EzyPageSnapshot.m8339e(), EzyHeader.m7996i()});

    public static final class CommandSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final CommandSource f8914c = new CommandSource();

        /* renamed from: d */
        public static final Parser f8915d = new C7203a();

        /* renamed from: a */
        public List f8916a;

        /* renamed from: b */
        public byte f8917b;

        public static final class CommandInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: g */
            public static final CommandInfo f8918g = new CommandInfo();

            /* renamed from: h */
            public static final Parser f8919h = new C7201a();

            /* renamed from: a */
            public long f8920a;

            /* renamed from: b */
            public long f8921b;

            /* renamed from: c */
            public boolean f8922c;

            /* renamed from: d */
            public int f8923d;

            /* renamed from: e */
            public ByteString f8924e;

            /* renamed from: f */
            public byte f8925f;

            public static final class AudioStart extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final AudioStart f8926e = new AudioStart();

                /* renamed from: f */
                public static final Parser f8927f = new C7181a();

                /* renamed from: a */
                public volatile Object f8928a;

                /* renamed from: b */
                public long f8929b;

                /* renamed from: c */
                public volatile Object f8930c;

                /* renamed from: d */
                public byte f8931d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$a */
                public class C7181a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public AudioStart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7182b c7182bM7462k = AudioStart.m7462k();
                        try {
                            c7182bM7462k.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7182bM7462k.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7182bM7462k.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7182bM7462k.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7182bM7462k.buildPartial());
                        }
                    }
                }

                /* renamed from: g */
                public static AudioStart m7461g() {
                    return f8926e;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8901m;
                }

                /* renamed from: k */
                public static C7182b m7462k() {
                    return f8926e.toBuilder();
                }

                /* renamed from: n */
                public static AudioStart m7463n(ByteString byteString) {
                    return (AudioStart) f8927f.parseFrom(byteString);
                }

                /* renamed from: o */
                public static AudioStart m7464o(byte[] bArr) {
                    return (AudioStart) f8927f.parseFrom(bArr);
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
                    return getFileName().equals(audioStart.getFileName()) && m7466i() == audioStart.m7466i() && m7467j().equals(audioStart.m7467j()) && getUnknownFields().equals(audioStart.getUnknownFields());
                }

                public String getFileName() {
                    Object obj = this.f8928a;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8928a = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8927f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8928a) ? GeneratedMessageV3.computeStringSize(1, this.f8928a) : 0;
                    long j10 = this.f8929b;
                    if (j10 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt64Size(2, j10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8930c)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f8930c);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public AudioStart getDefaultInstanceForType() {
                    return f8926e;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(m7466i())) * 37) + 3) * 53) + m7467j().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                /* renamed from: i */
                public long m7466i() {
                    return this.f8929b;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8902n.ensureFieldAccessorsInitialized(AudioStart.class, C7182b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8931d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8931d = (byte) 1;
                    return true;
                }

                /* renamed from: j */
                public String m7467j() {
                    Object obj = this.f8930c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8930c = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C7182b newBuilderForType() {
                    return m7462k();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7182b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7182b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new AudioStart();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C7182b toBuilder() {
                    return this == f8926e ? new C7182b() : new C7182b().m7483o(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (!GeneratedMessageV3.isStringEmpty(this.f8928a)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8928a);
                    }
                    long j10 = this.f8929b;
                    if (j10 != 0) {
                        codedOutputStream.writeInt64(2, j10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8930c)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.f8930c);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$b */
                public static final class C7182b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8932a;

                    /* renamed from: b */
                    public Object f8933b;

                    /* renamed from: c */
                    public long f8934c;

                    /* renamed from: d */
                    public Object f8935d;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7182b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7182b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public AudioStart build() {
                        AudioStart audioStartBuildPartial = buildPartial();
                        if (audioStartBuildPartial.isInitialized()) {
                            return audioStartBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioStartBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public AudioStart buildPartial() {
                        AudioStart audioStart = new AudioStart(this);
                        if (this.f8932a != 0) {
                            m7475g(audioStart);
                        }
                        onBuilt();
                        return audioStart;
                    }

                    /* renamed from: g */
                    public final void m7475g(AudioStart audioStart) {
                        int i10 = this.f8932a;
                        if ((i10 & 1) != 0) {
                            audioStart.f8928a = this.f8933b;
                        }
                        if ((i10 & 2) != 0) {
                            audioStart.f8929b = this.f8934c;
                        }
                        if ((i10 & 4) != 0) {
                            audioStart.f8930c = this.f8935d;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8901m;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7182b clear() {
                        super.clear();
                        this.f8932a = 0;
                        this.f8933b = "";
                        this.f8934c = 0L;
                        this.f8935d = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7182b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7182b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8902n.ensureFieldAccessorsInitialized(AudioStart.class, C7182b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7182b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7182b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public C7182b mo27381clone() {
                        return (C7182b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public AudioStart getDefaultInstanceForType() {
                        return AudioStart.m7461g();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7182b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f8933b = codedInputStream.readStringRequireUtf8();
                                            this.f8932a |= 1;
                                        } else if (tag == 16) {
                                            this.f8934c = codedInputStream.readInt64();
                                            this.f8932a |= 2;
                                        } else if (tag == 26) {
                                            this.f8935d = codedInputStream.readStringRequireUtf8();
                                            this.f8932a |= 4;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7182b mergeFrom(Message message) {
                        if (message instanceof AudioStart) {
                            return m7483o((AudioStart) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: o */
                    public C7182b m7483o(AudioStart audioStart) {
                        if (audioStart == AudioStart.m7461g()) {
                            return this;
                        }
                        if (!audioStart.getFileName().isEmpty()) {
                            this.f8933b = audioStart.f8928a;
                            this.f8932a |= 1;
                            onChanged();
                        }
                        if (audioStart.m7466i() != 0) {
                            m7485q(audioStart.m7466i());
                        }
                        if (!audioStart.m7467j().isEmpty()) {
                            this.f8935d = audioStart.f8930c;
                            this.f8932a |= 4;
                            onChanged();
                        }
                        mergeUnknownFields(audioStart.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public final C7182b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7182b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: q */
                    public C7182b m7485q(long j10) {
                        this.f8934c = j10;
                        this.f8932a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C7182b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7182b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: s */
                    public C7182b m7487s(String str) {
                        str.getClass();
                        this.f8933b = str;
                        this.f8932a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7182b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7182b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public final C7182b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7182b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C7182b() {
                        this.f8933b = "";
                        this.f8935d = "";
                    }

                    public C7182b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8933b = "";
                        this.f8935d = "";
                    }
                }

                public AudioStart(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8928a = "";
                    this.f8929b = 0L;
                    this.f8930c = "";
                    this.f8931d = (byte) -1;
                }

                private AudioStart() {
                    this.f8928a = "";
                    this.f8929b = 0L;
                    this.f8930c = "";
                    this.f8931d = (byte) -1;
                    this.f8928a = "";
                    this.f8930c = "";
                }
            }

            public static final class Camera extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final Camera f8936e = new Camera();

                /* renamed from: f */
                public static final Parser f8937f = new C7183a();

                /* renamed from: a */
                public int f8938a;

                /* renamed from: b */
                public EzyMatrix.Matrix f8939b;

                /* renamed from: c */
                public EzyMatrix.Matrix f8940c;

                /* renamed from: d */
                public byte f8941d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$a */
                public class C7183a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Camera parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7184b c7184bM7495l = Camera.m7495l();
                        try {
                            c7184bM7495l.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7184bM7495l.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7184bM7495l.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7184bM7495l.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7184bM7495l.buildPartial());
                        }
                    }
                }

                /* renamed from: d */
                public static /* synthetic */ int m7493d(Camera camera, int i10) {
                    int i11 = i10 | camera.f8938a;
                    camera.f8938a = i11;
                    return i11;
                }

                /* renamed from: e */
                public static Camera m7494e() {
                    return f8936e;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8905q;
                }

                /* renamed from: l */
                public static C7184b m7495l() {
                    return f8936e.toBuilder();
                }

                /* renamed from: o */
                public static Camera m7496o(ByteString byteString) {
                    return (Camera) f8937f.parseFrom(byteString);
                }

                /* renamed from: p */
                public static Camera m7497p(byte[] bArr) {
                    return (Camera) f8937f.parseFrom(bArr);
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
                    if (m7502k() != camera.m7502k()) {
                        return false;
                    }
                    if ((!m7502k() || m7500i().equals(camera.m7500i())) && m7501j() == camera.m7501j()) {
                        return (!m7501j() || m7499h().equals(camera.m7499h())) && getUnknownFields().equals(camera.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public Camera getDefaultInstanceForType() {
                    return f8936e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8937f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f8938a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7500i()) : 0;
                    if ((this.f8938a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m7499h());
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                /* renamed from: h */
                public EzyMatrix.Matrix m7499h() {
                    EzyMatrix.Matrix matrix = this.f8940c;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m7502k()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7500i().hashCode();
                    }
                    if (m7501j()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m7499h().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                /* renamed from: i */
                public EzyMatrix.Matrix m7500i() {
                    EzyMatrix.Matrix matrix = this.f8939b;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8906r.ensureFieldAccessorsInitialized(Camera.class, C7184b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8941d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8941d = (byte) 1;
                    return true;
                }

                /* renamed from: j */
                public boolean m7501j() {
                    return (this.f8938a & 2) != 0;
                }

                /* renamed from: k */
                public boolean m7502k() {
                    return (this.f8938a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7184b newBuilderForType() {
                    return m7495l();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7184b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7184b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Camera();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7184b toBuilder() {
                    return this == f8936e ? new C7184b() : new C7184b().m7527u(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if ((this.f8938a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m7500i());
                    }
                    if ((this.f8938a & 2) != 0) {
                        codedOutputStream.writeMessage(2, m7499h());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$b */
                public static final class C7184b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8942a;

                    /* renamed from: b */
                    public EzyMatrix.Matrix f8943b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f8944c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f8945d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f8946e;

                    /* renamed from: A */
                    public C7184b m7507A(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8944c;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f8943b = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f8942a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C7184b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7184b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C7184b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7184b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7184b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7184b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public Camera build() {
                        Camera cameraBuildPartial = buildPartial();
                        if (cameraBuildPartial.isInitialized()) {
                            return cameraBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public Camera buildPartial() {
                        Camera camera = new Camera(this);
                        if (this.f8942a != 0) {
                            m7513g(camera);
                        }
                        onBuilt();
                        return camera;
                    }

                    /* renamed from: g */
                    public final void m7513g(Camera camera) {
                        int i10;
                        int i11 = this.f8942a;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8944c;
                            camera.f8939b = singleFieldBuilderV3 == null ? this.f8943b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8946e;
                            camera.f8940c = singleFieldBuilderV32 == null ? this.f8945d : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        Camera.m7493d(camera, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8905q;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7184b clear() {
                        super.clear();
                        this.f8942a = 0;
                        this.f8943b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8944c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f8944c = null;
                        }
                        this.f8945d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8946e;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f8946e = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7184b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7184b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8906r.ensureFieldAccessorsInitialized(Camera.class, C7184b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7184b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7184b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7184b mo27381clone() {
                        return (C7184b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public Camera getDefaultInstanceForType() {
                        return Camera.m7494e();
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix m7519m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8946e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f8945d;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    public final void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7524r();
                            m7521o();
                        }
                    }

                    /* renamed from: n */
                    public EzyMatrix.Matrix.C7219b m7520n() {
                        this.f8942a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7521o().getBuilder();
                    }

                    /* renamed from: o */
                    public final SingleFieldBuilderV3 m7521o() {
                        if (this.f8946e == null) {
                            this.f8946e = new SingleFieldBuilderV3(m7519m(), getParentForChildren(), isClean());
                            this.f8945d = null;
                        }
                        return this.f8946e;
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m7522p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8944c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f8943b;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C7219b m7523q() {
                        this.f8942a |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7524r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m7524r() {
                        if (this.f8944c == null) {
                            this.f8944c = new SingleFieldBuilderV3(m7522p(), getParentForChildren(), isClean());
                            this.f8943b = null;
                        }
                        return this.f8944c;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C7184b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m7524r().getBuilder(), extensionRegistryLite);
                                            this.f8942a |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m7521o().getBuilder(), extensionRegistryLite);
                                            this.f8942a |= 2;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7184b mergeFrom(Message message) {
                        if (message instanceof Camera) {
                            return m7527u((Camera) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C7184b m7527u(Camera camera) {
                        if (camera == Camera.m7494e()) {
                            return this;
                        }
                        if (camera.m7502k()) {
                            m7529w(camera.m7500i());
                        }
                        if (camera.m7501j()) {
                            m7528v(camera.m7499h());
                        }
                        mergeUnknownFields(camera.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C7184b m7528v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8946e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8942a & 2) == 0 || (matrix2 = this.f8945d) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f8945d = matrix;
                        } else {
                            m7520n().m8253o(matrix);
                        }
                        if (this.f8945d != null) {
                            this.f8942a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C7184b m7529w(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8944c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8942a & 1) == 0 || (matrix2 = this.f8943b) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f8943b = matrix;
                        } else {
                            m7523q().m8253o(matrix);
                        }
                        if (this.f8943b != null) {
                            this.f8942a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7184b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7184b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7184b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7184b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C7184b m7532z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8946e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f8945d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f8942a |= 2;
                        onChanged();
                        return this;
                    }

                    public C7184b() {
                        maybeForceBuilderInitialization();
                    }

                    public C7184b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Camera(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8941d = (byte) -1;
                }

                private Camera() {
                    this.f8941d = (byte) -1;
                }
            }

            public static final class CameraMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final CameraMatrix f8947g = new CameraMatrix();

                /* renamed from: h */
                public static final Parser f8948h = new C7185a();

                /* renamed from: a */
                public int f8949a;

                /* renamed from: b */
                public EzyMatrix.Matrix f8950b;

                /* renamed from: c */
                public EzyMatrix.Matrix f8951c;

                /* renamed from: d */
                public volatile Object f8952d;

                /* renamed from: e */
                public int f8953e;

                /* renamed from: f */
                public byte f8954f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$a */
                public class C7185a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7186b c7186bM7540p = CameraMatrix.m7540p();
                        try {
                            c7186bM7540p.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7186bM7540p.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7186bM7540p.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7186bM7540p.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7186bM7540p.buildPartial());
                        }
                    }
                }

                /* renamed from: g */
                public static /* synthetic */ int m7538g(CameraMatrix cameraMatrix, int i10) {
                    int i11 = i10 | cameraMatrix.f8949a;
                    cameraMatrix.f8949a = i11;
                    return i11;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8903o;
                }

                /* renamed from: h */
                public static CameraMatrix m7539h() {
                    return f8947g;
                }

                /* renamed from: p */
                public static C7186b m7540p() {
                    return f8947g.toBuilder();
                }

                /* renamed from: s */
                public static CameraMatrix m7541s(ByteString byteString) {
                    return (CameraMatrix) f8948h.parseFrom(byteString);
                }

                /* renamed from: t */
                public static CameraMatrix m7542t(byte[] bArr) {
                    return (CameraMatrix) f8948h.parseFrom(bArr);
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
                    if (m7549o() != cameraMatrix.m7549o()) {
                        return false;
                    }
                    if ((!m7549o() || m7545k().equals(cameraMatrix.m7545k())) && m7548n() == cameraMatrix.m7548n()) {
                        return (!m7548n() || m7544j().equals(cameraMatrix.m7544j())) && m7546l().equals(cameraMatrix.m7546l()) && m7547m() == cameraMatrix.m7547m() && getUnknownFields().equals(cameraMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8948h;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f8949a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7545k()) : 0;
                    if ((this.f8949a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m7544j());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8952d)) {
                        iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.f8952d);
                    }
                    int i11 = this.f8953e;
                    if (i11 != 0) {
                        iComputeMessageSize += CodedOutputStream.computeInt32Size(4, i11);
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m7549o()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7545k().hashCode();
                    }
                    if (m7548n()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m7544j().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 3) * 53) + m7546l().hashCode()) * 37) + 4) * 53) + m7547m()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public CameraMatrix getDefaultInstanceForType() {
                    return f8947g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8904p.ensureFieldAccessorsInitialized(CameraMatrix.class, C7186b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8954f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8954f = (byte) 1;
                    return true;
                }

                /* renamed from: j */
                public EzyMatrix.Matrix m7544j() {
                    EzyMatrix.Matrix matrix = this.f8951c;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                /* renamed from: k */
                public EzyMatrix.Matrix m7545k() {
                    EzyMatrix.Matrix matrix = this.f8950b;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                /* renamed from: l */
                public String m7546l() {
                    Object obj = this.f8952d;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8952d = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: m */
                public int m7547m() {
                    return this.f8953e;
                }

                /* renamed from: n */
                public boolean m7548n() {
                    return (this.f8949a & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CameraMatrix();
                }

                /* renamed from: o */
                public boolean m7549o() {
                    return (this.f8949a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7186b newBuilderForType() {
                    return m7540p();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7186b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7186b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C7186b toBuilder() {
                    return this == f8947g ? new C7186b() : new C7186b().m7576u(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if ((this.f8949a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m7545k());
                    }
                    if ((this.f8949a & 2) != 0) {
                        codedOutputStream.writeMessage(2, m7544j());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8952d)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.f8952d);
                    }
                    int i10 = this.f8953e;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(4, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$b */
                public static final class C7186b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8955a;

                    /* renamed from: b */
                    public EzyMatrix.Matrix f8956b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f8957c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f8958d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f8959e;

                    /* renamed from: f */
                    public Object f8960f;

                    /* renamed from: g */
                    public int f8961g;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7555r();
                            m7554o();
                        }
                    }

                    /* renamed from: o */
                    private SingleFieldBuilderV3 m7554o() {
                        if (this.f8959e == null) {
                            this.f8959e = new SingleFieldBuilderV3(m7570m(), getParentForChildren(), isClean());
                            this.f8958d = null;
                        }
                        return this.f8959e;
                    }

                    /* renamed from: r */
                    private SingleFieldBuilderV3 m7555r() {
                        if (this.f8957c == null) {
                            this.f8957c = new SingleFieldBuilderV3(m7572p(), getParentForChildren(), isClean());
                            this.f8956b = null;
                        }
                        return this.f8957c;
                    }

                    /* renamed from: A */
                    public C7186b m7556A(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8957c;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f8956b = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f8955a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C7186b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7186b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: C */
                    public C7186b m7558C(String str) {
                        str.getClass();
                        this.f8960f = str;
                        this.f8955a |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: D */
                    public C7186b m7559D(int i10) {
                        this.f8961g = i10;
                        this.f8955a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7186b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7186b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7186b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7186b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix build() {
                        CameraMatrix cameraMatrixBuildPartial = buildPartial();
                        if (cameraMatrixBuildPartial.isInitialized()) {
                            return cameraMatrixBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraMatrixBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix buildPartial() {
                        CameraMatrix cameraMatrix = new CameraMatrix(this);
                        if (this.f8955a != 0) {
                            m7564g(cameraMatrix);
                        }
                        onBuilt();
                        return cameraMatrix;
                    }

                    /* renamed from: g */
                    public final void m7564g(CameraMatrix cameraMatrix) {
                        int i10;
                        int i11 = this.f8955a;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8957c;
                            cameraMatrix.f8950b = singleFieldBuilderV3 == null ? this.f8956b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8959e;
                            cameraMatrix.f8951c = singleFieldBuilderV32 == null ? this.f8958d : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 4) != 0) {
                            cameraMatrix.f8952d = this.f8960f;
                        }
                        if ((i11 & 8) != 0) {
                            cameraMatrix.f8953e = this.f8961g;
                        }
                        CameraMatrix.m7538g(cameraMatrix, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8903o;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7186b clear() {
                        super.clear();
                        this.f8955a = 0;
                        this.f8956b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8957c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f8957c = null;
                        }
                        this.f8958d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8959e;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f8959e = null;
                        }
                        this.f8960f = "";
                        this.f8961g = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7186b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7186b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8904p.ensureFieldAccessorsInitialized(CameraMatrix.class, C7186b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7186b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7186b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7186b mo27381clone() {
                        return (C7186b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix getDefaultInstanceForType() {
                        return CameraMatrix.m7539h();
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix m7570m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8959e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f8958d;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    /* renamed from: n */
                    public EzyMatrix.Matrix.C7219b m7571n() {
                        this.f8955a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7554o().getBuilder();
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m7572p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8957c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f8956b;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C7219b m7573q() {
                        this.f8955a |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7555r().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C7186b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m7555r().getBuilder(), extensionRegistryLite);
                                            this.f8955a |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m7554o().getBuilder(), extensionRegistryLite);
                                            this.f8955a |= 2;
                                        } else if (tag == 26) {
                                            this.f8960f = codedInputStream.readStringRequireUtf8();
                                            this.f8955a |= 4;
                                        } else if (tag == 32) {
                                            this.f8961g = codedInputStream.readInt32();
                                            this.f8955a |= 8;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7186b mergeFrom(Message message) {
                        if (message instanceof CameraMatrix) {
                            return m7576u((CameraMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C7186b m7576u(CameraMatrix cameraMatrix) {
                        if (cameraMatrix == CameraMatrix.m7539h()) {
                            return this;
                        }
                        if (cameraMatrix.m7549o()) {
                            m7578w(cameraMatrix.m7545k());
                        }
                        if (cameraMatrix.m7548n()) {
                            m7577v(cameraMatrix.m7544j());
                        }
                        if (!cameraMatrix.m7546l().isEmpty()) {
                            this.f8960f = cameraMatrix.f8952d;
                            this.f8955a |= 4;
                            onChanged();
                        }
                        if (cameraMatrix.m7547m() != 0) {
                            m7559D(cameraMatrix.m7547m());
                        }
                        mergeUnknownFields(cameraMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C7186b m7577v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8959e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8955a & 2) == 0 || (matrix2 = this.f8958d) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f8958d = matrix;
                        } else {
                            m7571n().m8253o(matrix);
                        }
                        if (this.f8958d != null) {
                            this.f8955a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C7186b m7578w(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8957c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8955a & 1) == 0 || (matrix2 = this.f8956b) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f8956b = matrix;
                        } else {
                            m7573q().m8253o(matrix);
                        }
                        if (this.f8956b != null) {
                            this.f8955a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7186b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7186b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7186b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7186b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C7186b m7581z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8959e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f8958d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f8955a |= 2;
                        onChanged();
                        return this;
                    }

                    public C7186b() {
                        this.f8960f = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7186b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8960f = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public CameraMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8952d = "";
                    this.f8953e = 0;
                    this.f8954f = (byte) -1;
                }

                private CameraMatrix() {
                    this.f8952d = "";
                    this.f8953e = 0;
                    this.f8954f = (byte) -1;
                    this.f8952d = "";
                }
            }

            public static final class Config extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final Config f8962g = new Config();

                /* renamed from: h */
                public static final Parser f8963h = new C7187a();

                /* renamed from: a */
                public int f8964a;

                /* renamed from: b */
                public int f8965b;

                /* renamed from: c */
                public int f8966c;

                /* renamed from: d */
                public EzyHeader.BackgroundLineConfig f8967d;

                /* renamed from: e */
                public EzyHeader.BackgroundLineConfig f8968e;

                /* renamed from: f */
                public byte f8969f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$a */
                public class C7187a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Config parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7188b c7188bM7589p = Config.m7589p();
                        try {
                            c7188bM7589p.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7188bM7589p.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7188bM7589p.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7188bM7589p.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7188bM7589p.buildPartial());
                        }
                    }
                }

                /* renamed from: d */
                public static /* synthetic */ int m7585d(Config config, int i10) {
                    int i11 = i10 | config.f8964a;
                    config.f8964a = i11;
                    return i11;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8907s;
                }

                /* renamed from: h */
                public static Config m7588h() {
                    return f8962g;
                }

                /* renamed from: p */
                public static C7188b m7589p() {
                    return f8962g.toBuilder();
                }

                /* renamed from: s */
                public static Config m7590s(ByteString byteString) {
                    return (Config) f8963h.parseFrom(byteString);
                }

                /* renamed from: t */
                public static Config m7591t(byte[] bArr) {
                    return (Config) f8963h.parseFrom(bArr);
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
                    if (m7595l() != config.m7595l() || m7593j() != config.m7593j() || m7598o() != config.m7598o()) {
                        return false;
                    }
                    if ((!m7598o() || m7596m().equals(config.m7596m())) && m7597n() == config.m7597n()) {
                        return (!m7597n() || m7594k().equals(config.m7594k())) && getUnknownFields().equals(config.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8963h;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.f8965b;
                    int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                    int i12 = this.f8966c;
                    if (i12 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                    }
                    if ((1 & this.f8964a) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m7596m());
                    }
                    if ((this.f8964a & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(4, m7594k());
                    }
                    int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7595l()) * 37) + 2) * 53) + m7593j();
                    if (m7598o()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7596m().hashCode();
                    }
                    if (m7597n()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + m7594k().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public Config getDefaultInstanceForType() {
                    return f8962g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8908t.ensureFieldAccessorsInitialized(Config.class, C7188b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8969f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8969f = (byte) 1;
                    return true;
                }

                /* renamed from: j */
                public int m7593j() {
                    return this.f8966c;
                }

                /* renamed from: k */
                public EzyHeader.BackgroundLineConfig m7594k() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f8968e;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8046g() : backgroundLineConfig;
                }

                /* renamed from: l */
                public int m7595l() {
                    return this.f8965b;
                }

                /* renamed from: m */
                public EzyHeader.BackgroundLineConfig m7596m() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f8967d;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8046g() : backgroundLineConfig;
                }

                /* renamed from: n */
                public boolean m7597n() {
                    return (this.f8964a & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Config();
                }

                /* renamed from: o */
                public boolean m7598o() {
                    return (this.f8964a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C7188b newBuilderForType() {
                    return m7589p();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7188b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7188b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C7188b toBuilder() {
                    return this == f8962g ? new C7188b() : new C7188b().m7625u(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    int i10 = this.f8965b;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(1, i10);
                    }
                    int i11 = this.f8966c;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(2, i11);
                    }
                    if ((this.f8964a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m7596m());
                    }
                    if ((this.f8964a & 2) != 0) {
                        codedOutputStream.writeMessage(4, m7594k());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$b */
                public static final class C7188b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8970a;

                    /* renamed from: b */
                    public int f8971b;

                    /* renamed from: c */
                    public int f8972c;

                    /* renamed from: d */
                    public EzyHeader.BackgroundLineConfig f8973d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f8974e;

                    /* renamed from: f */
                    public EzyHeader.BackgroundLineConfig f8975f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f8976g;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7622r();
                            m7619o();
                        }
                    }

                    /* renamed from: A */
                    public C7188b m7603A(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8976g;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f8975f = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f8970a |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: B */
                    public C7188b m7604B(int i10) {
                        this.f8971b = i10;
                        this.f8970a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: C */
                    public C7188b m7605C(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8974e;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f8973d = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f8970a |= 4;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C7188b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7188b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7188b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7188b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7188b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7188b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public Config build() {
                        Config configBuildPartial = buildPartial();
                        if (configBuildPartial.isInitialized()) {
                            return configBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) configBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public Config buildPartial() {
                        Config config = new Config(this);
                        if (this.f8970a != 0) {
                            m7611g(config);
                        }
                        onBuilt();
                        return config;
                    }

                    /* renamed from: g */
                    public final void m7611g(Config config) {
                        int i10;
                        int i11 = this.f8970a;
                        if ((i11 & 1) != 0) {
                            config.f8965b = this.f8971b;
                        }
                        if ((i11 & 2) != 0) {
                            config.f8966c = this.f8972c;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8974e;
                            config.f8967d = singleFieldBuilderV3 == null ? this.f8973d : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8976g;
                            config.f8968e = singleFieldBuilderV32 == null ? this.f8975f : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        Config.m7585d(config, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8907s;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7188b clear() {
                        super.clear();
                        this.f8970a = 0;
                        this.f8971b = 0;
                        this.f8972c = 0;
                        this.f8973d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8974e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f8974e = null;
                        }
                        this.f8975f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8976g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f8976g = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7188b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7188b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8908t.ensureFieldAccessorsInitialized(Config.class, C7188b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7188b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7188b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7188b mo27381clone() {
                        return (C7188b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public Config getDefaultInstanceForType() {
                        return Config.m7588h();
                    }

                    /* renamed from: m */
                    public EzyHeader.BackgroundLineConfig m7617m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8976g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f8975f;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8046g() : backgroundLineConfig;
                    }

                    /* renamed from: n */
                    public EzyHeader.BackgroundLineConfig.C7212b m7618n() {
                        this.f8970a |= 8;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C7212b) m7619o().getBuilder();
                    }

                    /* renamed from: o */
                    public final SingleFieldBuilderV3 m7619o() {
                        if (this.f8976g == null) {
                            this.f8976g = new SingleFieldBuilderV3(m7617m(), getParentForChildren(), isClean());
                            this.f8975f = null;
                        }
                        return this.f8976g;
                    }

                    /* renamed from: p */
                    public EzyHeader.BackgroundLineConfig m7620p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8974e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f8973d;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8046g() : backgroundLineConfig;
                    }

                    /* renamed from: q */
                    public EzyHeader.BackgroundLineConfig.C7212b m7621q() {
                        this.f8970a |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C7212b) m7622r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m7622r() {
                        if (this.f8974e == null) {
                            this.f8974e = new SingleFieldBuilderV3(m7620p(), getParentForChildren(), isClean());
                            this.f8973d = null;
                        }
                        return this.f8974e;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C7188b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f8971b = codedInputStream.readInt32();
                                            this.f8970a |= 1;
                                        } else if (tag == 16) {
                                            this.f8972c = codedInputStream.readInt32();
                                            this.f8970a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m7622r().getBuilder(), extensionRegistryLite);
                                            this.f8970a |= 4;
                                        } else if (tag == 34) {
                                            codedInputStream.readMessage(m7619o().getBuilder(), extensionRegistryLite);
                                            this.f8970a |= 8;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7188b mergeFrom(Message message) {
                        if (message instanceof Config) {
                            return m7625u((Config) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C7188b m7625u(Config config) {
                        if (config == Config.m7588h()) {
                            return this;
                        }
                        if (config.m7595l() != 0) {
                            m7604B(config.m7595l());
                        }
                        if (config.m7593j() != 0) {
                            m7630z(config.m7593j());
                        }
                        if (config.m7598o()) {
                            m7627w(config.m7596m());
                        }
                        if (config.m7597n()) {
                            m7626v(config.m7594k());
                        }
                        mergeUnknownFields(config.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C7188b m7626v(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8976g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f8970a & 8) == 0 || (backgroundLineConfig2 = this.f8975f) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m8046g()) {
                            this.f8975f = backgroundLineConfig;
                        } else {
                            m7618n().m8069o(backgroundLineConfig);
                        }
                        if (this.f8975f != null) {
                            this.f8970a |= 8;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C7188b m7627w(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8974e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f8970a & 4) == 0 || (backgroundLineConfig2 = this.f8973d) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m8046g()) {
                            this.f8973d = backgroundLineConfig;
                        } else {
                            m7621q().m8069o(backgroundLineConfig);
                        }
                        if (this.f8973d != null) {
                            this.f8970a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7188b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7188b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7188b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7188b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C7188b m7630z(int i10) {
                        this.f8972c = i10;
                        this.f8970a |= 2;
                        onChanged();
                        return this;
                    }

                    public C7188b() {
                        maybeForceBuilderInitialization();
                    }

                    public C7188b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Config(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8965b = 0;
                    this.f8966c = 0;
                    this.f8969f = (byte) -1;
                }

                private Config() {
                    this.f8965b = 0;
                    this.f8966c = 0;
                    this.f8969f = (byte) -1;
                }
            }

            public static final class CursorMove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: d */
                public static final CursorMove f8977d = new CursorMove();

                /* renamed from: e */
                public static final Parser f8978e = new C7189a();

                /* renamed from: a */
                public volatile Object f8979a;

                /* renamed from: b */
                public int f8980b;

                /* renamed from: c */
                public byte f8981c;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$a */
                public class C7189a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CursorMove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7190b c7190bM7635i = CursorMove.m7635i();
                        try {
                            c7190bM7635i.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7190bM7635i.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7190bM7635i.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7190bM7635i.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7190bM7635i.buildPartial());
                        }
                    }
                }

                /* renamed from: d */
                public static CursorMove m7634d() {
                    return f8977d;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8909u;
                }

                /* renamed from: i */
                public static C7190b m7635i() {
                    return f8977d.toBuilder();
                }

                /* renamed from: l */
                public static CursorMove m7636l(ByteString byteString) {
                    return (CursorMove) f8978e.parseFrom(byteString);
                }

                /* renamed from: m */
                public static CursorMove m7637m(byte[] bArr) {
                    return (CursorMove) f8978e.parseFrom(bArr);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public CursorMove getDefaultInstanceForType() {
                    return f8977d;
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
                    return m7639g().equals(cursorMove.m7639g()) && m7640h() == cursorMove.m7640h() && getUnknownFields().equals(cursorMove.getUnknownFields());
                }

                /* renamed from: g */
                public String m7639g() {
                    Object obj = this.f8979a;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8979a = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8978e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8979a) ? GeneratedMessageV3.computeStringSize(1, this.f8979a) : 0;
                    int i11 = this.f8980b;
                    if (i11 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt32Size(2, i11);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                /* renamed from: h */
                public int m7640h() {
                    return this.f8980b;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7639g().hashCode()) * 37) + 2) * 53) + m7640h()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8910v.ensureFieldAccessorsInitialized(CursorMove.class, C7190b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8981c;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8981c = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7190b newBuilderForType() {
                    return m7635i();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7190b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7190b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7190b toBuilder() {
                    return this == f8977d ? new C7190b() : new C7190b().m7656o(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CursorMove();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (!GeneratedMessageV3.isStringEmpty(this.f8979a)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8979a);
                    }
                    int i10 = this.f8980b;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$b */
                public static final class C7190b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8982a;

                    /* renamed from: b */
                    public Object f8983b;

                    /* renamed from: c */
                    public int f8984c;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7190b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7190b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public CursorMove build() {
                        CursorMove cursorMoveBuildPartial = buildPartial();
                        if (cursorMoveBuildPartial.isInitialized()) {
                            return cursorMoveBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cursorMoveBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public CursorMove buildPartial() {
                        CursorMove cursorMove = new CursorMove(this);
                        if (this.f8982a != 0) {
                            m7648g(cursorMove);
                        }
                        onBuilt();
                        return cursorMove;
                    }

                    /* renamed from: g */
                    public final void m7648g(CursorMove cursorMove) {
                        int i10 = this.f8982a;
                        if ((i10 & 1) != 0) {
                            cursorMove.f8979a = this.f8983b;
                        }
                        if ((i10 & 2) != 0) {
                            cursorMove.f8980b = this.f8984c;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8909u;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7190b clear() {
                        super.clear();
                        this.f8982a = 0;
                        this.f8983b = "";
                        this.f8984c = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7190b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7190b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8910v.ensureFieldAccessorsInitialized(CursorMove.class, C7190b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7190b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7190b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7190b mo27381clone() {
                        return (C7190b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public CursorMove getDefaultInstanceForType() {
                        return CursorMove.m7634d();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7190b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f8983b = codedInputStream.readStringRequireUtf8();
                                            this.f8982a |= 1;
                                        } else if (tag == 16) {
                                            this.f8984c = codedInputStream.readInt32();
                                            this.f8982a |= 2;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7190b mergeFrom(Message message) {
                        if (message instanceof CursorMove) {
                            return m7656o((CursorMove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: o */
                    public C7190b m7656o(CursorMove cursorMove) {
                        if (cursorMove == CursorMove.m7634d()) {
                            return this;
                        }
                        if (!cursorMove.m7639g().isEmpty()) {
                            this.f8983b = cursorMove.f8979a;
                            this.f8982a |= 1;
                            onChanged();
                        }
                        if (cursorMove.m7640h() != 0) {
                            m7661t(cursorMove.m7640h());
                        }
                        mergeUnknownFields(cursorMove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public final C7190b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7190b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C7190b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7190b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C7190b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7190b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: s */
                    public C7190b m7660s(String str) {
                        str.getClass();
                        this.f8983b = str;
                        this.f8982a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: t */
                    public C7190b m7661t(int i10) {
                        this.f8984c = i10;
                        this.f8982a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public final C7190b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7190b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C7190b() {
                        this.f8983b = "";
                    }

                    public C7190b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8983b = "";
                    }
                }

                public CursorMove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8979a = "";
                    this.f8980b = 0;
                    this.f8981c = (byte) -1;
                }

                private CursorMove() {
                    this.f8979a = "";
                    this.f8980b = 0;
                    this.f8981c = (byte) -1;
                    this.f8979a = "";
                }
            }

            public static final class GraphChange extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: k */
                public static final GraphChange f8985k = new GraphChange();

                /* renamed from: l */
                public static final Parser f8986l = new C7191a();

                /* renamed from: a */
                public int f8987a;

                /* renamed from: b */
                public volatile Object f8988b;

                /* renamed from: c */
                public int f8989c;

                /* renamed from: d */
                public EzyRectF.RectF f8990d;

                /* renamed from: e */
                public volatile Object f8991e;

                /* renamed from: f */
                public EzyPaint.Paint f8992f;

                /* renamed from: g */
                public List f8993g;

                /* renamed from: h */
                public EzyMatrix.Matrix f8994h;

                /* renamed from: i */
                public volatile Object f8995i;

                /* renamed from: j */
                public byte f8996j;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$a */
                public class C7191a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphChange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7192b c7192bM7663D = GraphChange.m7663D();
                        try {
                            c7192bM7663D.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7192bM7663D.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7192bM7663D.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7192bM7663D.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7192bM7663D.buildPartial());
                        }
                    }
                }

                /* renamed from: D */
                public static C7192b m7663D() {
                    return f8985k.toBuilder();
                }

                /* renamed from: G */
                public static GraphChange m7664G(ByteString byteString) {
                    return (GraphChange) f8986l.parseFrom(byteString);
                }

                /* renamed from: H */
                public static GraphChange m7665H(byte[] bArr) {
                    return (GraphChange) f8986l.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8899k;
                }

                /* renamed from: p */
                public static /* synthetic */ int m7680p(GraphChange graphChange, int i10) {
                    int i11 = i10 | graphChange.f8987a;
                    graphChange.f8987a = i11;
                    return i11;
                }

                /* renamed from: r */
                public static GraphChange m7682r() {
                    return f8985k;
                }

                /* renamed from: A */
                public EzyMatrix.Matrix m7683A() {
                    EzyMatrix.Matrix matrix = this.f8994h;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                /* renamed from: B */
                public boolean m7684B() {
                    return (this.f8987a & 2) != 0;
                }

                /* renamed from: C */
                public boolean m7685C() {
                    return (this.f8987a & 4) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: E, reason: merged with bridge method [inline-methods] */
                public C7192b newBuilderForType() {
                    return m7663D();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public C7192b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7192b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: I, reason: merged with bridge method [inline-methods] */
                public C7192b toBuilder() {
                    return this == f8985k ? new C7192b() : new C7192b().m7698A(this);
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
                    if (!m7692v().equals(graphChange.m7692v()) || this.f8989c != graphChange.f8989c || hasOutRect() != graphChange.hasOutRect()) {
                        return false;
                    }
                    if ((hasOutRect() && !m7693w().equals(graphChange.m7693w())) || !getContent().equals(graphChange.getContent()) || m7684B() != graphChange.m7684B()) {
                        return false;
                    }
                    if ((!m7684B() || m7694x().equals(graphChange.m7694x())) && m7696z().equals(graphChange.m7696z()) && m7685C() == graphChange.m7685C()) {
                        return (!m7685C() || m7683A().equals(graphChange.m7683A())) && m7690t().equals(graphChange.m7690t()) && getUnknownFields().equals(graphChange.getUnknownFields());
                    }
                    return false;
                }

                public String getContent() {
                    Object obj = this.f8991e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8991e = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8986l;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f8988b) ? GeneratedMessageV3.computeStringSize(1, this.f8988b) : 0;
                    if (this.f8989c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f8989c);
                    }
                    if ((1 & this.f8987a) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(3, m7693w());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8991e)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f8991e);
                    }
                    if ((this.f8987a & 2) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(5, m7694x());
                    }
                    for (int i11 = 0; i11 < this.f8993g.size(); i11++) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f8993g.get(i11));
                    }
                    if ((this.f8987a & 4) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(7, m7683A());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8995i)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f8995i);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f8987a & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7692v().hashCode()) * 37) + 2) * 53) + this.f8989c;
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7693w().hashCode();
                    }
                    int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getContent().hashCode();
                    if (m7684B()) {
                        iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + m7694x().hashCode();
                    }
                    if (m7695y() > 0) {
                        iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + m7696z().hashCode();
                    }
                    if (m7685C()) {
                        iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + m7683A().hashCode();
                    }
                    int iHashCode3 = (((((iHashCode2 * 37) + 8) * 53) + m7690t().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8900l.ensureFieldAccessorsInitialized(GraphChange.class, C7192b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8996j;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8996j = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphChange();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public GraphChange getDefaultInstanceForType() {
                    return f8985k;
                }

                /* renamed from: t */
                public String m7690t() {
                    Object obj = this.f8995i;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8995i = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: u */
                public int m7691u() {
                    return this.f8989c;
                }

                /* renamed from: v */
                public String m7692v() {
                    Object obj = this.f8988b;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8988b = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: w */
                public EzyRectF.RectF m7693w() {
                    EzyRectF.RectF rectF = this.f8990d;
                    return rectF == null ? EzyRectF.RectF.m8547e() : rectF;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (!GeneratedMessageV3.isStringEmpty(this.f8988b)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f8988b);
                    }
                    if (this.f8989c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(2, this.f8989c);
                    }
                    if ((this.f8987a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m7693w());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8991e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f8991e);
                    }
                    if ((this.f8987a & 2) != 0) {
                        codedOutputStream.writeMessage(5, m7694x());
                    }
                    for (int i10 = 0; i10 < this.f8993g.size(); i10++) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.f8993g.get(i10));
                    }
                    if ((this.f8987a & 4) != 0) {
                        codedOutputStream.writeMessage(7, m7683A());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8995i)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 8, this.f8995i);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public EzyPaint.Paint m7694x() {
                    EzyPaint.Paint paint = this.f8992f;
                    return paint == null ? EzyPaint.Paint.m8473h() : paint;
                }

                /* renamed from: y */
                public int m7695y() {
                    return this.f8993g.size();
                }

                /* renamed from: z */
                public List m7696z() {
                    return this.f8993g;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$b */
                public static final class C7192b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8997a;

                    /* renamed from: b */
                    public Object f8998b;

                    /* renamed from: c */
                    public int f8999c;

                    /* renamed from: d */
                    public EzyRectF.RectF f9000d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9001e;

                    /* renamed from: f */
                    public Object f9002f;

                    /* renamed from: g */
                    public EzyPaint.Paint f9003g;

                    /* renamed from: h */
                    public SingleFieldBuilderV3 f9004h;

                    /* renamed from: i */
                    public List f9005i;

                    /* renamed from: j */
                    public RepeatedFieldBuilderV3 f9006j;

                    /* renamed from: k */
                    public EzyMatrix.Matrix f9007k;

                    /* renamed from: l */
                    public SingleFieldBuilderV3 f9008l;

                    /* renamed from: m */
                    public Object f9009m;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                            m7730t();
                            m7731u();
                            m7734x();
                        }
                    }

                    /* renamed from: A */
                    public C7192b m7698A(GraphChange graphChange) {
                        if (graphChange == GraphChange.m7682r()) {
                            return this;
                        }
                        if (!graphChange.m7692v().isEmpty()) {
                            this.f8998b = graphChange.f8988b;
                            this.f8997a |= 1;
                            onChanged();
                        }
                        if (graphChange.f8989c != 0) {
                            m7707J(graphChange.m7691u());
                        }
                        if (graphChange.hasOutRect()) {
                            m7699B(graphChange.m7693w());
                        }
                        if (!graphChange.getContent().isEmpty()) {
                            this.f9002f = graphChange.f8991e;
                            this.f8997a |= 8;
                            onChanged();
                        }
                        if (graphChange.m7684B()) {
                            m7700C(graphChange.m7694x());
                        }
                        if (this.f9006j == null) {
                            if (!graphChange.f8993g.isEmpty()) {
                                if (this.f9005i.isEmpty()) {
                                    this.f9005i = graphChange.f8993g;
                                    this.f8997a &= -33;
                                } else {
                                    m7724n();
                                    this.f9005i.addAll(graphChange.f8993g);
                                }
                                onChanged();
                            }
                        } else if (!graphChange.f8993g.isEmpty()) {
                            if (this.f9006j.isEmpty()) {
                                this.f9006j.dispose();
                                this.f9006j = null;
                                this.f9005i = graphChange.f8993g;
                                this.f8997a &= -33;
                                this.f9006j = GeneratedMessageV3.alwaysUseFieldBuilders ? m7731u() : null;
                            } else {
                                this.f9006j.addAllMessages(graphChange.f8993g);
                            }
                        }
                        if (graphChange.m7685C()) {
                            m7701D(graphChange.m7683A());
                        }
                        if (!graphChange.m7690t().isEmpty()) {
                            this.f9009m = graphChange.f8995i;
                            this.f8997a |= 128;
                            onChanged();
                        }
                        mergeUnknownFields(graphChange.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: B */
                    public C7192b m7699B(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9001e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f8997a & 4) == 0 || (rectF2 = this.f9000d) == null || rectF2 == EzyRectF.RectF.m8547e()) {
                            this.f9000d = rectF;
                        } else {
                            m7727q().m8565o(rectF);
                        }
                        if (this.f9000d != null) {
                            this.f8997a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: C */
                    public C7192b m7700C(EzyPaint.Paint paint) {
                        EzyPaint.Paint paint2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9004h;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(paint);
                        } else if ((this.f8997a & 16) == 0 || (paint2 = this.f9003g) == null || paint2 == EzyPaint.Paint.m8473h()) {
                            this.f9003g = paint;
                        } else {
                            m7729s().m8495o(paint);
                        }
                        if (this.f9003g != null) {
                            this.f8997a |= 16;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: D */
                    public C7192b m7701D(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9008l;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8997a & 64) == 0 || (matrix2 = this.f9007k) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f9007k = matrix;
                        } else {
                            m7733w().m8253o(matrix);
                        }
                        if (this.f9007k != null) {
                            this.f8997a |= 64;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7192b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7192b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: F */
                    public C7192b m7703F(String str) {
                        str.getClass();
                        this.f9002f = str;
                        this.f8997a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public C7192b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7192b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: H */
                    public C7192b m7705H(String str) {
                        str.getClass();
                        this.f9009m = str;
                        this.f8997a |= 128;
                        onChanged();
                        return this;
                    }

                    /* renamed from: I */
                    public C7192b m7706I(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f8997a |= 2;
                        this.f8999c = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: J */
                    public C7192b m7707J(int i10) {
                        this.f8999c = i10;
                        this.f8997a |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: K */
                    public C7192b m7708K(String str) {
                        str.getClass();
                        this.f8998b = str;
                        this.f8997a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: L */
                    public C7192b m7709L(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9001e;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f9000d = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f8997a |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: M */
                    public C7192b m7710M(EzyPaint.Paint paint) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9004h;
                        if (singleFieldBuilderV3 == null) {
                            paint.getClass();
                            this.f9003g = paint;
                        } else {
                            singleFieldBuilderV3.setMessage(paint);
                        }
                        this.f8997a |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: N */
                    public C7192b m7711N(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9008l;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f9007k = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f8997a |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: O, reason: merged with bridge method [inline-methods] */
                    public C7192b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7192b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: P, reason: merged with bridge method [inline-methods] */
                    public final C7192b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7192b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: c */
                    public C7192b m7714c(EzyPointF.PointF pointF) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9006j;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(pointF);
                            return this;
                        }
                        pointF.getClass();
                        m7724n();
                        this.f9005i.add(pointF);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public C7192b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7192b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphChange build() {
                        GraphChange graphChangeBuildPartial = buildPartial();
                        if (graphChangeBuildPartial.isInitialized()) {
                            return graphChangeBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphChangeBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public GraphChange buildPartial() {
                        GraphChange graphChange = new GraphChange(this);
                        m7719i(graphChange);
                        if (this.f8997a != 0) {
                            m7718h(graphChange);
                        }
                        onBuilt();
                        return graphChange;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8899k;
                    }

                    public final SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f9001e == null) {
                            this.f9001e = new SingleFieldBuilderV3(m7726p(), getParentForChildren(), isClean());
                            this.f9000d = null;
                        }
                        return this.f9001e;
                    }

                    /* renamed from: h */
                    public final void m7718h(GraphChange graphChange) {
                        int i10;
                        int i11 = this.f8997a;
                        if ((i11 & 1) != 0) {
                            graphChange.f8988b = this.f8998b;
                        }
                        if ((i11 & 2) != 0) {
                            graphChange.f8989c = this.f8999c;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9001e;
                            graphChange.f8990d = singleFieldBuilderV3 == null ? this.f9000d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            graphChange.f8991e = this.f9002f;
                        }
                        if ((i11 & 16) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9004h;
                            graphChange.f8992f = singleFieldBuilderV32 == null ? this.f9003g : (EzyPaint.Paint) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 64) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9008l;
                            graphChange.f8994h = singleFieldBuilderV33 == null ? this.f9007k : (EzyMatrix.Matrix) singleFieldBuilderV33.build();
                            i10 |= 4;
                        }
                        if ((i11 & 128) != 0) {
                            graphChange.f8995i = this.f9009m;
                        }
                        GraphChange.m7680p(graphChange, i10);
                    }

                    /* renamed from: i */
                    public final void m7719i(GraphChange graphChange) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9006j;
                        if (repeatedFieldBuilderV3 != null) {
                            graphChange.f8993g = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f8997a & 32) != 0) {
                            this.f9005i = Collections.unmodifiableList(this.f9005i);
                            this.f8997a &= -33;
                        }
                        graphChange.f8993g = this.f9005i;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8900l.ensureFieldAccessorsInitialized(GraphChange.class, C7192b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7192b clear() {
                        super.clear();
                        this.f8997a = 0;
                        this.f8998b = "";
                        this.f8999c = 0;
                        this.f9000d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9001e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9001e = null;
                        }
                        this.f9002f = "";
                        this.f9003g = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9004h;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9004h = null;
                        }
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9006j;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f9005i = Collections.EMPTY_LIST;
                        } else {
                            this.f9005i = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f8997a &= -33;
                        this.f9007k = null;
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f9008l;
                        if (singleFieldBuilderV33 != null) {
                            singleFieldBuilderV33.dispose();
                            this.f9008l = null;
                        }
                        this.f9009m = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7192b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7192b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C7192b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7192b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7192b mo27381clone() {
                        return (C7192b) super.mo27381clone();
                    }

                    /* renamed from: n */
                    public final void m7724n() {
                        if ((this.f8997a & 32) == 0) {
                            this.f9005i = new ArrayList(this.f9005i);
                            this.f8997a |= 32;
                        }
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public GraphChange getDefaultInstanceForType() {
                        return GraphChange.m7682r();
                    }

                    /* renamed from: p */
                    public EzyRectF.RectF m7726p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9001e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f9000d;
                        return rectF == null ? EzyRectF.RectF.m8547e() : rectF;
                    }

                    /* renamed from: q */
                    public EzyRectF.RectF.C7240b m7727q() {
                        this.f8997a |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C7240b) getOutRectFieldBuilder().getBuilder();
                    }

                    /* renamed from: r */
                    public EzyPaint.Paint m7728r() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9004h;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                        }
                        EzyPaint.Paint paint = this.f9003g;
                        return paint == null ? EzyPaint.Paint.m8473h() : paint;
                    }

                    /* renamed from: s */
                    public EzyPaint.Paint.C7233b m7729s() {
                        this.f8997a |= 16;
                        onChanged();
                        return (EzyPaint.Paint.C7233b) m7730t().getBuilder();
                    }

                    /* renamed from: t */
                    public final SingleFieldBuilderV3 m7730t() {
                        if (this.f9004h == null) {
                            this.f9004h = new SingleFieldBuilderV3(m7728r(), getParentForChildren(), isClean());
                            this.f9003g = null;
                        }
                        return this.f9004h;
                    }

                    /* renamed from: u */
                    public final RepeatedFieldBuilderV3 m7731u() {
                        if (this.f9006j == null) {
                            this.f9006j = new RepeatedFieldBuilderV3(this.f9005i, (this.f8997a & 32) != 0, getParentForChildren(), isClean());
                            this.f9005i = null;
                        }
                        return this.f9006j;
                    }

                    /* renamed from: v */
                    public EzyMatrix.Matrix m7732v() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9008l;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9007k;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    /* renamed from: w */
                    public EzyMatrix.Matrix.C7219b m7733w() {
                        this.f8997a |= 64;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7734x().getBuilder();
                    }

                    /* renamed from: x */
                    public final SingleFieldBuilderV3 m7734x() {
                        if (this.f9008l == null) {
                            this.f9008l = new SingleFieldBuilderV3(m7732v(), getParentForChildren(), isClean());
                            this.f9007k = null;
                        }
                        return this.f9008l;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C7192b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f8998b = codedInputStream.readStringRequireUtf8();
                                            this.f8997a |= 1;
                                        } else if (tag == 16) {
                                            this.f8999c = codedInputStream.readEnum();
                                            this.f8997a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f8997a |= 4;
                                        } else if (tag == 34) {
                                            this.f9002f = codedInputStream.readStringRequireUtf8();
                                            this.f8997a |= 8;
                                        } else if (tag == 42) {
                                            codedInputStream.readMessage(m7730t().getBuilder(), extensionRegistryLite);
                                            this.f8997a |= 16;
                                        } else if (tag == 50) {
                                            EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9006j;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m7724n();
                                                this.f9005i.add(pointF);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(pointF);
                                            }
                                        } else if (tag == 58) {
                                            codedInputStream.readMessage(m7734x().getBuilder(), extensionRegistryLite);
                                            this.f8997a |= 64;
                                        } else if (tag == 66) {
                                            this.f9009m = codedInputStream.readStringRequireUtf8();
                                            this.f8997a |= 128;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    /* renamed from: z, reason: merged with bridge method [inline-methods] */
                    public C7192b mergeFrom(Message message) {
                        if (message instanceof GraphChange) {
                            return m7698A((GraphChange) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    public C7192b() {
                        this.f8998b = "";
                        this.f8999c = 0;
                        this.f9002f = "";
                        this.f9005i = Collections.EMPTY_LIST;
                        this.f9009m = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7192b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8998b = "";
                        this.f8999c = 0;
                        this.f9002f = "";
                        this.f9005i = Collections.EMPTY_LIST;
                        this.f9009m = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphChange(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8988b = "";
                    this.f8989c = 0;
                    this.f8991e = "";
                    this.f8995i = "";
                    this.f8996j = (byte) -1;
                }

                private GraphChange() {
                    this.f8988b = "";
                    this.f8989c = 0;
                    this.f8991e = "";
                    this.f8995i = "";
                    this.f8996j = (byte) -1;
                    this.f8988b = "";
                    this.f8989c = 0;
                    this.f8991e = "";
                    this.f8993g = Collections.EMPTY_LIST;
                    this.f8995i = "";
                }
            }

            public static final class GraphData extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: j */
                public static final GraphData f9010j = new GraphData();

                /* renamed from: k */
                public static final Parser f9011k = new C7193a();

                /* renamed from: a */
                public int f9012a;

                /* renamed from: b */
                public int f9013b;

                /* renamed from: c */
                public volatile Object f9014c;

                /* renamed from: d */
                public EzyRectF.RectF f9015d;

                /* renamed from: e */
                public volatile Object f9016e;

                /* renamed from: f */
                public volatile Object f9017f;

                /* renamed from: g */
                public int f9018g;

                /* renamed from: h */
                public volatile Object f9019h;

                /* renamed from: i */
                public byte f9020i;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$a */
                public class C7193a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7194b c7194bM7754z = GraphData.m7754z();
                        try {
                            c7194bM7754z.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7194bM7754z.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7194bM7754z.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7194bM7754z.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7194bM7754z.buildPartial());
                        }
                    }
                }

                /* renamed from: C */
                public static GraphData m7737C(ByteString byteString) {
                    return (GraphData) f9011k.parseFrom(byteString);
                }

                /* renamed from: D */
                public static GraphData m7738D(byte[] bArr) {
                    return (GraphData) f9011k.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8893e;
                }

                /* renamed from: n */
                public static /* synthetic */ int m7751n(GraphData graphData, int i10) {
                    int i11 = i10 | graphData.f9012a;
                    graphData.f9012a = i11;
                    return i11;
                }

                /* renamed from: p */
                public static GraphData m7753p() {
                    return f9010j;
                }

                public static Parser parser() {
                    return f9011k;
                }

                /* renamed from: z */
                public static C7194b m7754z() {
                    return f9010j.toBuilder();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C7194b newBuilderForType() {
                    return m7754z();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public C7194b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7194b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: E, reason: merged with bridge method [inline-methods] */
                public C7194b toBuilder() {
                    return this == f9010j ? new C7194b() : new C7194b().m7787r(this);
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
                    if (this.f9013b == graphData.f9013b && m7762u().equals(graphData.m7762u()) && hasOutRect() == graphData.hasOutRect()) {
                        return (!hasOutRect() || m7763v().equals(graphData.m7763v())) && m7764w().equals(graphData.m7764w()) && m7765x().equals(graphData.m7765x()) && m7766y() == graphData.m7766y() && m7759r().equals(graphData.m7759r()) && getUnknownFields().equals(graphData.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9011k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeEnumSize = this.f9013b != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f9013b) : 0;
                    if (!GeneratedMessageV3.isStringEmpty(this.f9014c)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.f9014c);
                    }
                    if ((this.f9012a & 1) != 0) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m7763v());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9016e)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.f9016e);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9017f)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(5, this.f9017f);
                    }
                    int i11 = this.f9018g;
                    if (i11 != 0) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, i11);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9019h)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(7, this.f9019h);
                    }
                    int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f9012a & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f9013b) * 37) + 2) * 53) + m7762u().hashCode();
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7763v().hashCode();
                    }
                    int iHashCode2 = (((((((((((((((((iHashCode * 37) + 4) * 53) + m7764w().hashCode()) * 37) + 5) * 53) + m7765x().hashCode()) * 37) + 6) * 53) + m7766y()) * 37) + 7) * 53) + m7759r().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8894f.ensureFieldAccessorsInitialized(GraphData.class, C7194b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9020i;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9020i = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphData();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public GraphData getDefaultInstanceForType() {
                    return f9010j;
                }

                /* renamed from: r */
                public String m7759r() {
                    Object obj = this.f9019h;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9019h = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: s */
                public EzyGraphEnum.GraphEnum m7760s() {
                    EzyGraphEnum.GraphEnum graphEnumM7985a = EzyGraphEnum.GraphEnum.m7985a(this.f9013b);
                    return graphEnumM7985a == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM7985a;
                }

                /* renamed from: t */
                public int m7761t() {
                    return this.f9013b;
                }

                /* renamed from: u */
                public String m7762u() {
                    Object obj = this.f9014c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9014c = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: v */
                public EzyRectF.RectF m7763v() {
                    EzyRectF.RectF rectF = this.f9015d;
                    return rectF == null ? EzyRectF.RectF.m8547e() : rectF;
                }

                /* renamed from: w */
                public String m7764w() {
                    Object obj = this.f9016e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9016e = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (this.f9013b != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(1, this.f9013b);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9014c)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.f9014c);
                    }
                    if ((this.f9012a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m7763v());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9016e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9016e);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9017f)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 5, this.f9017f);
                    }
                    int i10 = this.f9018g;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(6, i10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9019h)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 7, this.f9019h);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public String m7765x() {
                    Object obj = this.f9017f;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9017f = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: y */
                public int m7766y() {
                    return this.f9018g;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$b */
                public static final class C7194b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9021a;

                    /* renamed from: b */
                    public int f9022b;

                    /* renamed from: c */
                    public Object f9023c;

                    /* renamed from: d */
                    public EzyRectF.RectF f9024d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9025e;

                    /* renamed from: f */
                    public Object f9026f;

                    /* renamed from: g */
                    public Object f9027g;

                    /* renamed from: h */
                    public int f9028h;

                    /* renamed from: i */
                    public Object f9029i;

                    private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f9025e == null) {
                            this.f9025e = new SingleFieldBuilderV3(m7783n(), getParentForChildren(), isClean());
                            this.f9024d = null;
                        }
                        return this.f9025e;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                        }
                    }

                    /* renamed from: A */
                    public C7194b m7768A(String str) {
                        str.getClass();
                        this.f9026f = str;
                        this.f9021a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C7194b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7194b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: C */
                    public C7194b m7770C(String str) {
                        str.getClass();
                        this.f9027g = str;
                        this.f9021a |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: D */
                    public C7194b m7771D(int i10) {
                        this.f9028h = i10;
                        this.f9021a |= 32;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C7194b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7194b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7194b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7194b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphData build() {
                        GraphData graphDataBuildPartial = buildPartial();
                        if (graphDataBuildPartial.isInitialized()) {
                            return graphDataBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphDataBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphData buildPartial() {
                        GraphData graphData = new GraphData(this);
                        if (this.f9021a != 0) {
                            m7776g(graphData);
                        }
                        onBuilt();
                        return graphData;
                    }

                    /* renamed from: g */
                    public final void m7776g(GraphData graphData) {
                        int i10;
                        int i11 = this.f9021a;
                        if ((i11 & 1) != 0) {
                            graphData.f9013b = this.f9022b;
                        }
                        if ((i11 & 2) != 0) {
                            graphData.f9014c = this.f9023c;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9025e;
                            graphData.f9015d = singleFieldBuilderV3 == null ? this.f9024d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            graphData.f9016e = this.f9026f;
                        }
                        if ((i11 & 16) != 0) {
                            graphData.f9017f = this.f9027g;
                        }
                        if ((i11 & 32) != 0) {
                            graphData.f9018g = this.f9028h;
                        }
                        if ((i11 & 64) != 0) {
                            graphData.f9019h = this.f9029i;
                        }
                        GraphData.m7751n(graphData, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8893e;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7194b clear() {
                        super.clear();
                        this.f9021a = 0;
                        this.f9022b = 0;
                        this.f9023c = "";
                        this.f9024d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9025e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9025e = null;
                        }
                        this.f9026f = "";
                        this.f9027g = "";
                        this.f9028h = 0;
                        this.f9029i = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7194b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7194b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8894f.ensureFieldAccessorsInitialized(GraphData.class, C7194b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7194b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7194b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7194b mo27381clone() {
                        return (C7194b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public GraphData getDefaultInstanceForType() {
                        return GraphData.m7753p();
                    }

                    /* renamed from: m */
                    public String m7782m() {
                        Object obj = this.f9029i;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.f9029i = stringUtf8;
                        return stringUtf8;
                    }

                    /* renamed from: n */
                    public EzyRectF.RectF m7783n() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9025e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f9024d;
                        return rectF == null ? EzyRectF.RectF.m8547e() : rectF;
                    }

                    /* renamed from: o */
                    public EzyRectF.RectF.C7240b m7784o() {
                        this.f9021a |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C7240b) getOutRectFieldBuilder().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public C7194b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f9022b = codedInputStream.readEnum();
                                            this.f9021a |= 1;
                                        } else if (tag == 18) {
                                            this.f9023c = codedInputStream.readStringRequireUtf8();
                                            this.f9021a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f9021a |= 4;
                                        } else if (tag == 34) {
                                            this.f9026f = codedInputStream.readStringRequireUtf8();
                                            this.f9021a |= 8;
                                        } else if (tag == 42) {
                                            this.f9027g = codedInputStream.readStringRequireUtf8();
                                            this.f9021a |= 16;
                                        } else if (tag == 48) {
                                            this.f9028h = codedInputStream.readInt32();
                                            this.f9021a |= 32;
                                        } else if (tag == 58) {
                                            this.f9029i = codedInputStream.readStringRequireUtf8();
                                            this.f9021a |= 64;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7194b mergeFrom(Message message) {
                        if (message instanceof GraphData) {
                            return m7787r((GraphData) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: r */
                    public C7194b m7787r(GraphData graphData) {
                        if (graphData == GraphData.m7753p()) {
                            return this;
                        }
                        if (graphData.f9013b != 0) {
                            m7793x(graphData.m7761t());
                        }
                        if (!graphData.m7762u().isEmpty()) {
                            this.f9023c = graphData.f9014c;
                            this.f9021a |= 2;
                            onChanged();
                        }
                        if (graphData.hasOutRect()) {
                            m7788s(graphData.m7763v());
                        }
                        if (!graphData.m7764w().isEmpty()) {
                            this.f9026f = graphData.f9016e;
                            this.f9021a |= 8;
                            onChanged();
                        }
                        if (!graphData.m7765x().isEmpty()) {
                            this.f9027g = graphData.f9017f;
                            this.f9021a |= 16;
                            onChanged();
                        }
                        if (graphData.m7766y() != 0) {
                            m7771D(graphData.m7766y());
                        }
                        if (!graphData.m7759r().isEmpty()) {
                            this.f9029i = graphData.f9019h;
                            this.f9021a |= 64;
                            onChanged();
                        }
                        mergeUnknownFields(graphData.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: s */
                    public C7194b m7788s(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9025e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f9021a & 4) == 0 || (rectF2 = this.f9024d) == null || rectF2 == EzyRectF.RectF.m8547e()) {
                            this.f9024d = rectF;
                        } else {
                            m7784o().m8565o(rectF);
                        }
                        if (this.f9024d != null) {
                            this.f9021a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C7194b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7194b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: u */
                    public C7194b m7790u(String str) {
                        str.getClass();
                        this.f9029i = str;
                        this.f9021a |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C7194b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7194b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: w */
                    public C7194b m7792w(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f9021a |= 1;
                        this.f9022b = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: x */
                    public C7194b m7793x(int i10) {
                        this.f9022b = i10;
                        this.f9021a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: y */
                    public C7194b m7794y(String str) {
                        str.getClass();
                        this.f9023c = str;
                        this.f9021a |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C7194b m7795z(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9025e;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f9024d = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f9021a |= 4;
                        onChanged();
                        return this;
                    }

                    public C7194b() {
                        this.f9022b = 0;
                        this.f9023c = "";
                        this.f9026f = "";
                        this.f9027g = "";
                        this.f9029i = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7194b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9022b = 0;
                        this.f9023c = "";
                        this.f9026f = "";
                        this.f9027g = "";
                        this.f9029i = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphData(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9013b = 0;
                    this.f9014c = "";
                    this.f9016e = "";
                    this.f9017f = "";
                    this.f9018g = 0;
                    this.f9019h = "";
                    this.f9020i = (byte) -1;
                }

                private GraphData() {
                    this.f9013b = 0;
                    this.f9014c = "";
                    this.f9016e = "";
                    this.f9017f = "";
                    this.f9018g = 0;
                    this.f9019h = "";
                    this.f9020i = (byte) -1;
                    this.f9013b = 0;
                    this.f9014c = "";
                    this.f9016e = "";
                    this.f9017f = "";
                    this.f9019h = "";
                }
            }

            public static final class GraphMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: h */
                public static final GraphMatrix f9030h = new GraphMatrix();

                /* renamed from: i */
                public static final Parser f9031i = new C7195a();

                /* renamed from: a */
                public int f9032a;

                /* renamed from: b */
                public List f9033b;

                /* renamed from: c */
                public EzyMatrix.Matrix f9034c;

                /* renamed from: d */
                public EzyMatrix.Matrix f9035d;

                /* renamed from: e */
                public volatile Object f9036e;

                /* renamed from: f */
                public int f9037f;

                /* renamed from: g */
                public byte f9038g;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$a */
                public class C7195a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7196b c7196bM7807v = GraphMatrix.m7807v();
                        try {
                            c7196bM7807v.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7196bM7807v.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7196bM7807v.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7196bM7807v.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7196bM7807v.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8897i;
                }

                /* renamed from: j */
                public static /* synthetic */ int m7804j(GraphMatrix graphMatrix, int i10) {
                    int i11 = i10 | graphMatrix.f9032a;
                    graphMatrix.f9032a = i11;
                    return i11;
                }

                /* renamed from: l */
                public static GraphMatrix m7806l() {
                    return f9030h;
                }

                /* renamed from: v */
                public static C7196b m7807v() {
                    return f9030h.toBuilder();
                }

                /* renamed from: y */
                public static GraphMatrix m7808y(ByteString byteString) {
                    return (GraphMatrix) f9031i.parseFrom(byteString);
                }

                /* renamed from: z */
                public static GraphMatrix m7809z(byte[] bArr) {
                    return (GraphMatrix) f9031i.parseFrom(bArr);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C7196b toBuilder() {
                    return this == f9030h ? new C7196b() : new C7196b().m7851y(this);
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
                    if (!m7813o().equals(graphMatrix.m7813o()) || m7819u() != graphMatrix.m7819u()) {
                        return false;
                    }
                    if ((!m7819u() || m7815q().equals(graphMatrix.m7815q())) && m7818t() == graphMatrix.m7818t()) {
                        return (!m7818t() || m7814p().equals(graphMatrix.m7814p())) && m7816r().equals(graphMatrix.m7816r()) && m7817s() == graphMatrix.m7817s() && getUnknownFields().equals(graphMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9031i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeInt32Size = 0;
                    for (int i11 = 0; i11 < this.f9033b.size(); i11++) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9033b.get(i11));
                    }
                    if ((this.f9032a & 1) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(2, m7815q());
                    }
                    if ((this.f9032a & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m7814p());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9036e)) {
                        iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.f9036e);
                    }
                    int i12 = this.f9037f;
                    if (i12 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(5, i12);
                    }
                    int serializedSize = iComputeInt32Size + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m7812n() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7813o().hashCode();
                    }
                    if (m7819u()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m7815q().hashCode();
                    }
                    if (m7818t()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7814p().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 4) * 53) + m7816r().hashCode()) * 37) + 5) * 53) + m7817s()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8898j.ensureFieldAccessorsInitialized(GraphMatrix.class, C7196b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9038g;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9038g = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public GraphMatrix getDefaultInstanceForType() {
                    return f9030h;
                }

                /* renamed from: n */
                public int m7812n() {
                    return this.f9033b.size();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphMatrix();
                }

                /* renamed from: o */
                public List m7813o() {
                    return this.f9033b;
                }

                /* renamed from: p */
                public EzyMatrix.Matrix m7814p() {
                    EzyMatrix.Matrix matrix = this.f9035d;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                /* renamed from: q */
                public EzyMatrix.Matrix m7815q() {
                    EzyMatrix.Matrix matrix = this.f9034c;
                    return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                }

                /* renamed from: r */
                public String m7816r() {
                    Object obj = this.f9036e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f9036e = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: s */
                public int m7817s() {
                    return this.f9037f;
                }

                /* renamed from: t */
                public boolean m7818t() {
                    return (this.f9032a & 2) != 0;
                }

                /* renamed from: u */
                public boolean m7819u() {
                    return (this.f9032a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C7196b newBuilderForType() {
                    return m7807v();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    for (int i10 = 0; i10 < this.f9033b.size(); i10++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f9033b.get(i10));
                    }
                    if ((this.f9032a & 1) != 0) {
                        codedOutputStream.writeMessage(2, m7815q());
                    }
                    if ((this.f9032a & 2) != 0) {
                        codedOutputStream.writeMessage(3, m7814p());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f9036e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f9036e);
                    }
                    int i11 = this.f9037f;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(5, i11);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7196b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7196b(builderParent);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$b */
                public static final class C7196b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9039a;

                    /* renamed from: b */
                    public List f9040b;

                    /* renamed from: c */
                    public RepeatedFieldBuilderV3 f9041c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f9042d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f9043e;

                    /* renamed from: f */
                    public EzyMatrix.Matrix f9044f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f9045g;

                    /* renamed from: h */
                    public Object f9046h;

                    /* renamed from: i */
                    public int f9047i;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7844p();
                            m7824v();
                            m7823s();
                        }
                    }

                    /* renamed from: s */
                    private SingleFieldBuilderV3 m7823s() {
                        if (this.f9045g == null) {
                            this.f9045g = new SingleFieldBuilderV3(m7845q(), getParentForChildren(), isClean());
                            this.f9044f = null;
                        }
                        return this.f9045g;
                    }

                    /* renamed from: v */
                    private SingleFieldBuilderV3 m7824v() {
                        if (this.f9043e == null) {
                            this.f9043e = new SingleFieldBuilderV3(m7847t(), getParentForChildren(), isClean());
                            this.f9042d = null;
                        }
                        return this.f9043e;
                    }

                    /* renamed from: A */
                    public C7196b m7825A(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9043e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9039a & 2) == 0 || (matrix2 = this.f9042d) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f9042d = matrix;
                        } else {
                            m7848u().m8253o(matrix);
                        }
                        if (this.f9042d != null) {
                            this.f9039a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public final C7196b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7196b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public C7196b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7196b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C7196b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7196b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: E */
                    public C7196b m7829E(String str) {
                        str.getClass();
                        this.f9046h = str;
                        this.f9039a |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: F */
                    public C7196b m7830F(int i10) {
                        this.f9047i = i10;
                        this.f9039a |= 16;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public final C7196b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7196b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: c */
                    public C7196b m7832c(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9041c;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m7842n();
                        AbstractMessageLite.Builder.addAll(iterable, this.f9040b);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public C7196b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7196b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix build() {
                        GraphMatrix graphMatrixBuildPartial = buildPartial();
                        if (graphMatrixBuildPartial.isInitialized()) {
                            return graphMatrixBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphMatrixBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix buildPartial() {
                        GraphMatrix graphMatrix = new GraphMatrix(this);
                        m7837i(graphMatrix);
                        if (this.f9039a != 0) {
                            m7836h(graphMatrix);
                        }
                        onBuilt();
                        return graphMatrix;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8897i;
                    }

                    /* renamed from: h */
                    public final void m7836h(GraphMatrix graphMatrix) {
                        int i10;
                        int i11 = this.f9039a;
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9043e;
                            graphMatrix.f9034c = singleFieldBuilderV3 == null ? this.f9042d : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9045g;
                            graphMatrix.f9035d = singleFieldBuilderV32 == null ? this.f9044f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 8) != 0) {
                            graphMatrix.f9036e = this.f9046h;
                        }
                        if ((i11 & 16) != 0) {
                            graphMatrix.f9037f = this.f9047i;
                        }
                        GraphMatrix.m7804j(graphMatrix, i10);
                    }

                    /* renamed from: i */
                    public final void m7837i(GraphMatrix graphMatrix) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9041c;
                        if (repeatedFieldBuilderV3 != null) {
                            graphMatrix.f9033b = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f9039a & 1) != 0) {
                            this.f9040b = Collections.unmodifiableList(this.f9040b);
                            this.f9039a &= -2;
                        }
                        graphMatrix.f9033b = this.f9040b;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8898j.ensureFieldAccessorsInitialized(GraphMatrix.class, C7196b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7196b clear() {
                        super.clear();
                        this.f9039a = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9041c;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f9040b = Collections.EMPTY_LIST;
                        } else {
                            this.f9040b = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f9039a &= -2;
                        this.f9042d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9043e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9043e = null;
                        }
                        this.f9044f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9045g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9045g = null;
                        }
                        this.f9046h = "";
                        this.f9047i = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7196b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7196b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C7196b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7196b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7196b mo27381clone() {
                        return (C7196b) super.mo27381clone();
                    }

                    /* renamed from: n */
                    public final void m7842n() {
                        if ((this.f9039a & 1) == 0) {
                            this.f9040b = new ArrayList(this.f9040b);
                            this.f9039a |= 1;
                        }
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix getDefaultInstanceForType() {
                        return GraphMatrix.m7806l();
                    }

                    /* renamed from: p */
                    public final RepeatedFieldBuilderV3 m7844p() {
                        if (this.f9041c == null) {
                            this.f9041c = new RepeatedFieldBuilderV3(this.f9040b, (this.f9039a & 1) != 0, getParentForChildren(), isClean());
                            this.f9040b = null;
                        }
                        return this.f9041c;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix m7845q() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9045g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9044f;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    /* renamed from: r */
                    public EzyMatrix.Matrix.C7219b m7846r() {
                        this.f9039a |= 4;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7823s().getBuilder();
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix m7847t() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9043e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f9042d;
                        return matrix == null ? EzyMatrix.Matrix.m8225l() : matrix;
                    }

                    /* renamed from: u */
                    public EzyMatrix.Matrix.C7219b m7848u() {
                        this.f9039a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C7219b) m7824v().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C7196b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9041c;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m7842n();
                                                this.f9040b.add(graphData);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(graphData);
                                            }
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m7824v().getBuilder(), extensionRegistryLite);
                                            this.f9039a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m7823s().getBuilder(), extensionRegistryLite);
                                            this.f9039a |= 4;
                                        } else if (tag == 34) {
                                            this.f9046h = codedInputStream.readStringRequireUtf8();
                                            this.f9039a |= 8;
                                        } else if (tag == 40) {
                                            this.f9047i = codedInputStream.readInt32();
                                            this.f9039a |= 16;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7196b mergeFrom(Message message) {
                        if (message instanceof GraphMatrix) {
                            return m7851y((GraphMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: y */
                    public C7196b m7851y(GraphMatrix graphMatrix) {
                        if (graphMatrix == GraphMatrix.m7806l()) {
                            return this;
                        }
                        if (this.f9041c == null) {
                            if (!graphMatrix.f9033b.isEmpty()) {
                                if (this.f9040b.isEmpty()) {
                                    this.f9040b = graphMatrix.f9033b;
                                    this.f9039a &= -2;
                                } else {
                                    m7842n();
                                    this.f9040b.addAll(graphMatrix.f9033b);
                                }
                                onChanged();
                            }
                        } else if (!graphMatrix.f9033b.isEmpty()) {
                            if (this.f9041c.isEmpty()) {
                                this.f9041c.dispose();
                                this.f9041c = null;
                                this.f9040b = graphMatrix.f9033b;
                                this.f9039a &= -2;
                                this.f9041c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7844p() : null;
                            } else {
                                this.f9041c.addAllMessages(graphMatrix.f9033b);
                            }
                        }
                        if (graphMatrix.m7819u()) {
                            m7825A(graphMatrix.m7815q());
                        }
                        if (graphMatrix.m7818t()) {
                            m7852z(graphMatrix.m7814p());
                        }
                        if (!graphMatrix.m7816r().isEmpty()) {
                            this.f9046h = graphMatrix.f9036e;
                            this.f9039a |= 8;
                            onChanged();
                        }
                        if (graphMatrix.m7817s() != 0) {
                            m7830F(graphMatrix.m7817s());
                        }
                        mergeUnknownFields(graphMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C7196b m7852z(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9045g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f9039a & 4) == 0 || (matrix2 = this.f9044f) == null || matrix2 == EzyMatrix.Matrix.m8225l()) {
                            this.f9044f = matrix;
                        } else {
                            m7846r().m8253o(matrix);
                        }
                        if (this.f9044f != null) {
                            this.f9039a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    public C7196b() {
                        this.f9040b = Collections.EMPTY_LIST;
                        this.f9046h = "";
                        maybeForceBuilderInitialization();
                    }

                    public C7196b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9040b = Collections.EMPTY_LIST;
                        this.f9046h = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9036e = "";
                    this.f9037f = 0;
                    this.f9038g = (byte) -1;
                }

                private GraphMatrix() {
                    this.f9036e = "";
                    this.f9037f = 0;
                    this.f9038g = (byte) -1;
                    this.f9033b = Collections.EMPTY_LIST;
                    this.f9036e = "";
                }
            }

            public static final class GraphRemove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: c */
                public static final GraphRemove f9048c = new GraphRemove();

                /* renamed from: d */
                public static final Parser f9049d = new C7197a();

                /* renamed from: a */
                public List f9050a;

                /* renamed from: b */
                public byte f9051b;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$a */
                public class C7197a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphRemove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7198b c7198bM7857i = GraphRemove.m7857i();
                        try {
                            c7198bM7857i.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7198bM7857i.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7198bM7857i.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7198bM7857i.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7198bM7857i.buildPartial());
                        }
                    }
                }

                /* renamed from: d */
                public static GraphRemove m7856d() {
                    return f9048c;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8895g;
                }

                /* renamed from: i */
                public static C7198b m7857i() {
                    return f9048c.toBuilder();
                }

                /* renamed from: l */
                public static GraphRemove m7858l(ByteString byteString) {
                    return (GraphRemove) f9049d.parseFrom(byteString);
                }

                /* renamed from: m */
                public static GraphRemove m7859m(byte[] bArr) {
                    return (GraphRemove) f9049d.parseFrom(bArr);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public GraphRemove getDefaultInstanceForType() {
                    return f9048c;
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
                    return m7862h().equals(graphRemove.m7862h()) && getUnknownFields().equals(graphRemove.getUnknownFields());
                }

                /* renamed from: g */
                public int m7861g() {
                    return this.f9050a.size();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9049d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = 0;
                    for (int i11 = 0; i11 < this.f9050a.size(); i11++) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f9050a.get(i11));
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                /* renamed from: h */
                public List m7862h() {
                    return this.f9050a;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m7861g() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7862h().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8896h.ensureFieldAccessorsInitialized(GraphRemove.class, C7198b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9051b;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9051b = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7198b newBuilderForType() {
                    return m7857i();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7198b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7198b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7198b toBuilder() {
                    return this == f9048c ? new C7198b() : new C7198b().m7882s(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphRemove();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    for (int i10 = 0; i10 < this.f9050a.size(); i10++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f9050a.get(i10));
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$b */
                public static final class C7198b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9052a;

                    /* renamed from: b */
                    public List f9053b;

                    /* renamed from: c */
                    public RepeatedFieldBuilderV3 f9054c;

                    /* renamed from: n */
                    private void m7867n() {
                        if ((this.f9052a & 1) == 0) {
                            this.f9053b = new ArrayList(this.f9053b);
                            this.f9052a |= 1;
                        }
                    }

                    /* renamed from: p */
                    private RepeatedFieldBuilderV3 m7868p() {
                        if (this.f9054c == null) {
                            this.f9054c = new RepeatedFieldBuilderV3(this.f9053b, (this.f9052a & 1) != 0, getParentForChildren(), isClean());
                            this.f9053b = null;
                        }
                        return this.f9054c;
                    }

                    /* renamed from: c */
                    public C7198b m7869c(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9054c;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m7867n();
                        AbstractMessageLite.Builder.addAll(iterable, this.f9053b);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public C7198b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7198b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphRemove build() {
                        GraphRemove graphRemoveBuildPartial = buildPartial();
                        if (graphRemoveBuildPartial.isInitialized()) {
                            return graphRemoveBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphRemoveBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public GraphRemove buildPartial() {
                        GraphRemove graphRemove = new GraphRemove(this);
                        m7874i(graphRemove);
                        if (this.f9052a != 0) {
                            m7873h(graphRemove);
                        }
                        onBuilt();
                        return graphRemove;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8895g;
                    }

                    /* renamed from: h */
                    public final void m7873h(GraphRemove graphRemove) {
                    }

                    /* renamed from: i */
                    public final void m7874i(GraphRemove graphRemove) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9054c;
                        if (repeatedFieldBuilderV3 != null) {
                            graphRemove.f9050a = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f9052a & 1) != 0) {
                            this.f9053b = Collections.unmodifiableList(this.f9053b);
                            this.f9052a &= -2;
                        }
                        graphRemove.f9050a = this.f9053b;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8896h.ensureFieldAccessorsInitialized(GraphRemove.class, C7198b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7198b clear() {
                        super.clear();
                        this.f9052a = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9054c;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f9053b = Collections.EMPTY_LIST;
                        } else {
                            this.f9053b = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f9052a &= -2;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7198b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7198b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C7198b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7198b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C7198b mo27381clone() {
                        return (C7198b) super.mo27381clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public GraphRemove getDefaultInstanceForType() {
                        return GraphRemove.m7856d();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C7198b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9054c;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m7867n();
                                                this.f9053b.add(graphData);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(graphData);
                                            }
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7198b mergeFrom(Message message) {
                        if (message instanceof GraphRemove) {
                            return m7882s((GraphRemove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: s */
                    public C7198b m7882s(GraphRemove graphRemove) {
                        if (graphRemove == GraphRemove.m7856d()) {
                            return this;
                        }
                        if (this.f9054c == null) {
                            if (!graphRemove.f9050a.isEmpty()) {
                                if (this.f9053b.isEmpty()) {
                                    this.f9053b = graphRemove.f9050a;
                                    this.f9052a &= -2;
                                } else {
                                    m7867n();
                                    this.f9053b.addAll(graphRemove.f9050a);
                                }
                                onChanged();
                            }
                        } else if (!graphRemove.f9050a.isEmpty()) {
                            if (this.f9054c.isEmpty()) {
                                this.f9054c.dispose();
                                this.f9054c = null;
                                this.f9053b = graphRemove.f9050a;
                                this.f9052a &= -2;
                                this.f9054c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7868p() : null;
                            } else {
                                this.f9054c.addAllMessages(graphRemove.f9050a);
                            }
                        }
                        mergeUnknownFields(graphRemove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C7198b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7198b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public C7198b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7198b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C7198b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7198b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C7198b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7198b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C7198b() {
                        this.f9053b = Collections.EMPTY_LIST;
                    }

                    public C7198b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f9053b = Collections.EMPTY_LIST;
                    }
                }

                public GraphRemove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9051b = (byte) -1;
                }

                private GraphRemove() {
                    this.f9051b = (byte) -1;
                    this.f9050a = Collections.EMPTY_LIST;
                }
            }

            public static final class REBUILD extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: f */
                public static final REBUILD f9055f = new REBUILD();

                /* renamed from: g */
                public static final Parser f9056g = new C7199a();

                /* renamed from: a */
                public int f9057a;

                /* renamed from: b */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot f9058b;

                /* renamed from: c */
                public int f9059c;

                /* renamed from: d */
                public EzyHeader.BackgroundLineConfig f9060d;

                /* renamed from: e */
                public byte f9061e;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$a */
                public class C7199a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public REBUILD parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C7200b c7200bM7893m = REBUILD.m7893m();
                        try {
                            c7200bM7893m.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c7200bM7893m.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c7200bM7893m.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7200bM7893m.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7200bM7893m.buildPartial());
                        }
                    }
                }

                /* renamed from: e */
                public static /* synthetic */ int m7891e(REBUILD rebuild, int i10) {
                    int i11 = i10 | rebuild.f9057a;
                    rebuild.f9057a = i11;
                    return i11;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f8911w;
                }

                /* renamed from: h */
                public static REBUILD m7892h() {
                    return f9055f;
                }

                /* renamed from: m */
                public static C7200b m7893m() {
                    return f9055f.toBuilder();
                }

                /* renamed from: p */
                public static REBUILD m7894p(ByteString byteString) {
                    return (REBUILD) f9056g.parseFrom(byteString);
                }

                /* renamed from: q */
                public static REBUILD m7895q(byte[] bArr) {
                    return (REBUILD) f9056g.parseFrom(bArr);
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
                    if (m7900l() != rebuild.m7900l()) {
                        return false;
                    }
                    if ((!m7900l() || m7898j().equals(rebuild.m7898j())) && getBackgroundColor() == rebuild.getBackgroundColor() && m7899k() == rebuild.m7899k()) {
                        return (!m7899k() || m7896g().equals(rebuild.m7896g())) && getUnknownFields().equals(rebuild.getUnknownFields());
                    }
                    return false;
                }

                /* renamed from: g */
                public EzyHeader.BackgroundLineConfig m7896g() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9060d;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8046g() : backgroundLineConfig;
                }

                public int getBackgroundColor() {
                    return this.f9059c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f9056g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f9057a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7898j()) : 0;
                    int i11 = this.f9059c;
                    if (i11 != 0) {
                        iComputeMessageSize += CodedOutputStream.computeInt32Size(2, i11);
                    }
                    if ((this.f9057a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(3, m7896g());
                    }
                    int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = 779 + getDescriptor().hashCode();
                    if (m7900l()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7898j().hashCode();
                    }
                    int backgroundColor = (((iHashCode * 37) + 2) * 53) + getBackgroundColor();
                    if (m7899k()) {
                        backgroundColor = (((backgroundColor * 37) + 3) * 53) + m7896g().hashCode();
                    }
                    int iHashCode2 = (backgroundColor * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public REBUILD getDefaultInstanceForType() {
                    return f9055f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8912x.ensureFieldAccessorsInitialized(REBUILD.class, C7200b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f9061e;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f9061e = (byte) 1;
                    return true;
                }

                /* renamed from: j */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot m7898j() {
                    EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f9058b;
                    return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8377x() : graphSnapshot;
                }

                /* renamed from: k */
                public boolean m7899k() {
                    return (this.f9057a & 2) != 0;
                }

                /* renamed from: l */
                public boolean m7900l() {
                    return (this.f9057a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C7200b newBuilderForType() {
                    return m7893m();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new REBUILD();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public C7200b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C7200b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C7200b toBuilder() {
                    return this == f9055f ? new C7200b() : new C7200b().m7926v(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if ((this.f9057a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m7898j());
                    }
                    int i10 = this.f9059c;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    if ((this.f9057a & 2) != 0) {
                        codedOutputStream.writeMessage(3, m7896g());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$b */
                public static final class C7200b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f9062a;

                    /* renamed from: b */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot f9063b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f9064c;

                    /* renamed from: d */
                    public int f9065d;

                    /* renamed from: e */
                    public EzyHeader.BackgroundLineConfig f9066e;

                    /* renamed from: f */
                    public SingleFieldBuilderV3 f9067f;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7922r();
                            m7918n();
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public C7200b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C7200b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: B */
                    public C7200b m7906B(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9064c;
                        if (singleFieldBuilderV3 == null) {
                            graphSnapshot.getClass();
                            this.f9063b = graphSnapshot;
                        } else {
                            singleFieldBuilderV3.setMessage(graphSnapshot);
                        }
                        this.f9062a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C7200b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7200b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C7200b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7200b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public REBUILD build() {
                        REBUILD rebuildBuildPartial = buildPartial();
                        if (rebuildBuildPartial.isInitialized()) {
                            return rebuildBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) rebuildBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public REBUILD buildPartial() {
                        REBUILD rebuild = new REBUILD(this);
                        if (this.f9062a != 0) {
                            m7911g(rebuild);
                        }
                        onBuilt();
                        return rebuild;
                    }

                    /* renamed from: g */
                    public final void m7911g(REBUILD rebuild) {
                        int i10;
                        int i11 = this.f9062a;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9064c;
                            rebuild.f9058b = singleFieldBuilderV3 == null ? this.f9063b : (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            rebuild.f9059c = this.f9065d;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9067f;
                            rebuild.f9060d = singleFieldBuilderV32 == null ? this.f9066e : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        REBUILD.m7891e(rebuild, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f8911w;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C7200b clear() {
                        super.clear();
                        this.f9062a = 0;
                        this.f9063b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9064c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f9064c = null;
                        }
                        this.f9065d = 0;
                        this.f9066e = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f9067f;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f9067f = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C7200b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C7200b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f8912x.ensureFieldAccessorsInitialized(REBUILD.class, C7200b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C7200b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C7200b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C7200b mo27381clone() {
                        return (C7200b) super.mo27381clone();
                    }

                    /* renamed from: l */
                    public EzyHeader.BackgroundLineConfig m7916l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9067f;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f9066e;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m8046g() : backgroundLineConfig;
                    }

                    /* renamed from: m */
                    public EzyHeader.BackgroundLineConfig.C7212b m7917m() {
                        this.f9062a |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C7212b) m7918n().getBuilder();
                    }

                    /* renamed from: n */
                    public final SingleFieldBuilderV3 m7918n() {
                        if (this.f9067f == null) {
                            this.f9067f = new SingleFieldBuilderV3(m7916l(), getParentForChildren(), isClean());
                            this.f9066e = null;
                        }
                        return this.f9067f;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public REBUILD getDefaultInstanceForType() {
                        return REBUILD.m7892h();
                    }

                    /* renamed from: p */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m7920p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9064c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.getMessage();
                        }
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f9063b;
                        return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8377x() : graphSnapshot;
                    }

                    /* renamed from: q */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b m7921q() {
                        this.f9062a |= 1;
                        onChanged();
                        return (EzyPageSnapshot.PageSnapshot.GraphSnapshot.C7228b) m7922r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m7922r() {
                        if (this.f9064c == null) {
                            this.f9064c = new SingleFieldBuilderV3(m7920p(), getParentForChildren(), isClean());
                            this.f9063b = null;
                        }
                        return this.f9064c;
                    }

                    /* renamed from: s */
                    public C7200b m7923s(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9067f;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f9062a & 4) == 0 || (backgroundLineConfig2 = this.f9066e) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m8046g()) {
                            this.f9066e = backgroundLineConfig;
                        } else {
                            m7917m().m8069o(backgroundLineConfig);
                        }
                        if (this.f9066e != null) {
                            this.f9062a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C7200b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m7922r().getBuilder(), extensionRegistryLite);
                                            this.f9062a |= 1;
                                        } else if (tag == 16) {
                                            this.f9065d = codedInputStream.readInt32();
                                            this.f9062a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m7918n().getBuilder(), extensionRegistryLite);
                                            this.f9062a |= 4;
                                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    }
                                    z10 = true;
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
                    public C7200b mergeFrom(Message message) {
                        if (message instanceof REBUILD) {
                            return m7926v((REBUILD) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: v */
                    public C7200b m7926v(REBUILD rebuild) {
                        if (rebuild == REBUILD.m7892h()) {
                            return this;
                        }
                        if (rebuild.m7900l()) {
                            m7927w(rebuild.m7898j());
                        }
                        if (rebuild.getBackgroundColor() != 0) {
                            m7929y(rebuild.getBackgroundColor());
                        }
                        if (rebuild.m7899k()) {
                            m7923s(rebuild.m7896g());
                        }
                        mergeUnknownFields(rebuild.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: w */
                    public C7200b m7927w(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f9064c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(graphSnapshot);
                        } else if ((this.f9062a & 1) == 0 || (graphSnapshot2 = this.f9063b) == null || graphSnapshot2 == EzyPageSnapshot.PageSnapshot.GraphSnapshot.m8377x()) {
                            this.f9063b = graphSnapshot;
                        } else {
                            m7921q().m8397B(graphSnapshot);
                        }
                        if (this.f9063b != null) {
                            this.f9062a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C7200b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C7200b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: y */
                    public C7200b m7929y(int i10) {
                        this.f9065d = i10;
                        this.f9062a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: z, reason: merged with bridge method [inline-methods] */
                    public C7200b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C7200b) super.setField(fieldDescriptor, obj);
                    }

                    public C7200b() {
                        maybeForceBuilderInitialization();
                    }

                    public C7200b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public REBUILD(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f9059c = 0;
                    this.f9061e = (byte) -1;
                }

                private REBUILD() {
                    this.f9059c = 0;
                    this.f9061e = (byte) -1;
                }
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$a */
            public class C7201a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public CommandInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C7202b c7202bM7445p = CommandInfo.m7445p();
                    try {
                        c7202bM7445p.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c7202bM7445p.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c7202bM7445p.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7202bM7445p.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7202bM7445p.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyCommand.f8891c;
            }

            /* renamed from: k */
            public static CommandInfo m7444k() {
                return f8918g;
            }

            /* renamed from: p */
            public static C7202b m7445p() {
                return f8918g.toBuilder();
            }

            public static Parser parser() {
                return f8919h;
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
                return m7450m() == commandInfo.m7450m() && m7451n() == commandInfo.m7451n() && m7452o() == commandInfo.m7452o() && this.f8923d == commandInfo.f8923d && m7448j().equals(commandInfo.m7448j()) && getUnknownFields().equals(commandInfo.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f8919h;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                long j10 = this.f8920a;
                int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
                long j11 = this.f8921b;
                if (j11 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j11);
                }
                boolean z10 = this.f8922c;
                if (z10) {
                    iComputeInt64Size += CodedOutputStream.computeBoolSize(3, z10);
                }
                if (this.f8923d != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    iComputeInt64Size += CodedOutputStream.computeEnumSize(4, this.f8923d);
                }
                if (!this.f8924e.isEmpty()) {
                    iComputeInt64Size += CodedOutputStream.computeBytesSize(5, this.f8924e);
                }
                int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            /* renamed from: h */
            public EzyCommandEnum.CommandEnum m7446h() {
                EzyCommandEnum.CommandEnum commandEnumM7977a = EzyCommandEnum.CommandEnum.m7977a(this.f8923d);
                return commandEnumM7977a == null ? EzyCommandEnum.CommandEnum.UNRECOGNIZED : commandEnumM7977a;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(m7450m())) * 37) + 2) * 53) + Internal.hashLong(m7451n())) * 37) + 3) * 53) + Internal.hashBoolean(m7452o())) * 37) + 4) * 53) + this.f8923d) * 37) + 5) * 53) + m7448j().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            /* renamed from: i */
            public int m7447i() {
                return this.f8923d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f8892d.ensureFieldAccessorsInitialized(CommandInfo.class, C7202b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f8925f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f8925f = (byte) 1;
                return true;
            }

            /* renamed from: j */
            public ByteString m7448j() {
                return this.f8924e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public CommandInfo getDefaultInstanceForType() {
                return f8918g;
            }

            /* renamed from: m */
            public long m7450m() {
                return this.f8920a;
            }

            /* renamed from: n */
            public long m7451n() {
                return this.f8921b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new CommandInfo();
            }

            /* renamed from: o */
            public boolean m7452o() {
                return this.f8922c;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C7202b newBuilderForType() {
                return m7445p();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7202b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C7202b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7202b toBuilder() {
                return this == f8918g ? new C7202b() : new C7202b().m7943o(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                long j10 = this.f8920a;
                if (j10 != 0) {
                    codedOutputStream.writeInt64(1, j10);
                }
                long j11 = this.f8921b;
                if (j11 != 0) {
                    codedOutputStream.writeInt64(2, j11);
                }
                boolean z10 = this.f8922c;
                if (z10) {
                    codedOutputStream.writeBool(3, z10);
                }
                if (this.f8923d != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    codedOutputStream.writeEnum(4, this.f8923d);
                }
                if (!this.f8924e.isEmpty()) {
                    codedOutputStream.writeBytes(5, this.f8924e);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$b */
            public static final class C7202b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f9068a;

                /* renamed from: b */
                public long f9069b;

                /* renamed from: c */
                public long f9070c;

                /* renamed from: d */
                public boolean f9071d;

                /* renamed from: e */
                public int f9072e;

                /* renamed from: f */
                public ByteString f9073f;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public C7202b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7202b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public CommandInfo build() {
                    CommandInfo commandInfoBuildPartial = buildPartial();
                    if (commandInfoBuildPartial.isInitialized()) {
                        return commandInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public CommandInfo buildPartial() {
                    CommandInfo commandInfo = new CommandInfo(this);
                    if (this.f9068a != 0) {
                        m7935g(commandInfo);
                    }
                    onBuilt();
                    return commandInfo;
                }

                /* renamed from: g */
                public final void m7935g(CommandInfo commandInfo) {
                    int i10 = this.f9068a;
                    if ((i10 & 1) != 0) {
                        commandInfo.f8920a = this.f9069b;
                    }
                    if ((i10 & 2) != 0) {
                        commandInfo.f8921b = this.f9070c;
                    }
                    if ((i10 & 4) != 0) {
                        commandInfo.f8922c = this.f9071d;
                    }
                    if ((i10 & 8) != 0) {
                        commandInfo.f8923d = this.f9072e;
                    }
                    if ((i10 & 16) != 0) {
                        commandInfo.f8924e = this.f9073f;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyCommand.f8891c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C7202b clear() {
                    super.clear();
                    this.f9068a = 0;
                    this.f9069b = 0L;
                    this.f9070c = 0L;
                    this.f9071d = false;
                    this.f9072e = 0;
                    this.f9073f = ByteString.EMPTY;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C7202b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C7202b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f8892d.ensureFieldAccessorsInitialized(CommandInfo.class, C7202b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C7202b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C7202b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C7202b mo27381clone() {
                    return (C7202b) super.mo27381clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public CommandInfo getDefaultInstanceForType() {
                    return CommandInfo.m7444k();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C7202b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f9069b = codedInputStream.readInt64();
                                        this.f9068a |= 1;
                                    } else if (tag == 16) {
                                        this.f9070c = codedInputStream.readInt64();
                                        this.f9068a |= 2;
                                    } else if (tag == 24) {
                                        this.f9071d = codedInputStream.readBool();
                                        this.f9068a |= 4;
                                    } else if (tag == 32) {
                                        this.f9072e = codedInputStream.readEnum();
                                        this.f9068a |= 8;
                                    } else if (tag == 42) {
                                        this.f9073f = codedInputStream.readBytes();
                                        this.f9068a |= 16;
                                    } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                }
                                z10 = true;
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
                public C7202b mergeFrom(Message message) {
                    if (message instanceof CommandInfo) {
                        return m7943o((CommandInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: o */
                public C7202b m7943o(CommandInfo commandInfo) {
                    if (commandInfo == CommandInfo.m7444k()) {
                        return this;
                    }
                    if (commandInfo.m7450m() != 0) {
                        m7948t(commandInfo.m7450m());
                    }
                    if (commandInfo.m7451n() != 0) {
                        m7949u(commandInfo.m7451n());
                    }
                    if (commandInfo.m7452o()) {
                        m7951w(commandInfo.m7452o());
                    }
                    if (commandInfo.f8923d != 0) {
                        m7946r(commandInfo.m7447i());
                    }
                    if (commandInfo.m7448j() != ByteString.EMPTY) {
                        m7947s(commandInfo.m7448j());
                    }
                    mergeUnknownFields(commandInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C7202b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7202b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: q */
                public C7202b m7945q(EzyCommandEnum.CommandEnum commandEnum) {
                    commandEnum.getClass();
                    this.f9068a |= 8;
                    this.f9072e = commandEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C7202b m7946r(int i10) {
                    this.f9072e = i10;
                    this.f9068a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C7202b m7947s(ByteString byteString) {
                    byteString.getClass();
                    this.f9073f = byteString;
                    this.f9068a |= 16;
                    onChanged();
                    return this;
                }

                /* renamed from: t */
                public C7202b m7948t(long j10) {
                    this.f9069b = j10;
                    this.f9068a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C7202b m7949u(long j10) {
                    this.f9070c = j10;
                    this.f9068a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C7202b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C7202b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: w */
                public C7202b m7951w(boolean z10) {
                    this.f9071d = z10;
                    this.f9068a |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C7202b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C7202b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public final C7202b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C7202b) super.setUnknownFields(unknownFieldSet);
                }

                public C7202b() {
                    this.f9072e = 0;
                    this.f9073f = ByteString.EMPTY;
                }

                public C7202b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f9072e = 0;
                    this.f9073f = ByteString.EMPTY;
                }
            }

            public CommandInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f8920a = 0L;
                this.f8921b = 0L;
                this.f8922c = false;
                this.f8923d = 0;
                this.f8924e = ByteString.EMPTY;
                this.f8925f = (byte) -1;
            }

            private CommandInfo() {
                this.f8920a = 0L;
                this.f8921b = 0L;
                this.f8922c = false;
                this.f8923d = 0;
                ByteString byteString = ByteString.EMPTY;
                this.f8925f = (byte) -1;
                this.f8923d = 0;
                this.f8924e = byteString;
            }
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$a */
        public class C7203a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CommandSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C7204b c7204bM7430i = CommandSource.m7430i();
                try {
                    c7204bM7430i.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c7204bM7430i.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c7204bM7430i.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c7204bM7430i.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c7204bM7430i.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static CommandSource m7429g() {
            return f8914c;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyCommand.f8889a;
        }

        /* renamed from: i */
        public static C7204b m7430i() {
            return f8914c.toBuilder();
        }

        /* renamed from: l */
        public static CommandSource m7431l(InputStream inputStream) {
            return (CommandSource) GeneratedMessageV3.parseWithIOException(f8915d, inputStream);
        }

        /* renamed from: d */
        public int m7432d() {
            return this.f8916a.size();
        }

        /* renamed from: e */
        public List m7433e() {
            return this.f8916a;
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
            return m7433e().equals(commandSource.m7433e()) && getUnknownFields().equals(commandSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f8915d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f8916a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8916a.get(i11));
            }
            int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public CommandSource getDefaultInstanceForType() {
            return f8914c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (m7432d() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m7433e().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyCommand.f8890b.ensureFieldAccessorsInitialized(CommandSource.class, C7204b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f8917b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f8917b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public C7204b newBuilderForType() {
            return m7430i();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7204b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7204b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C7204b toBuilder() {
            return this == f8914c ? new C7204b() : new C7204b().m7971t(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CommandSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f8916a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f8916a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$b */
        public static final class C7204b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f9074a;

            /* renamed from: b */
            public List f9075b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f9076c;

            /* renamed from: c */
            public C7204b m7955c(CommandInfo.C7202b c7202b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9076c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c7202b.build());
                    return this;
                }
                m7965n();
                this.f9075b.add(c7202b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public C7204b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7204b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public CommandSource build() {
                CommandSource commandSourceBuildPartial = buildPartial();
                if (commandSourceBuildPartial.isInitialized()) {
                    return commandSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public CommandSource buildPartial() {
                CommandSource commandSource = new CommandSource(this);
                m7960i(commandSource);
                if (this.f9074a != 0) {
                    m7959h(commandSource);
                }
                onBuilt();
                return commandSource;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyCommand.f8889a;
            }

            /* renamed from: h */
            public final void m7959h(CommandSource commandSource) {
            }

            /* renamed from: i */
            public final void m7960i(CommandSource commandSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9076c;
                if (repeatedFieldBuilderV3 != null) {
                    commandSource.f8916a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f9074a & 1) != 0) {
                    this.f9075b = Collections.unmodifiableList(this.f9075b);
                    this.f9074a &= -2;
                }
                commandSource.f8916a = this.f9075b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f8890b.ensureFieldAccessorsInitialized(CommandSource.class, C7204b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7204b clear() {
                super.clear();
                this.f9074a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9076c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f9075b = Collections.EMPTY_LIST;
                } else {
                    this.f9075b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f9074a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C7204b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7204b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C7204b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7204b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C7204b mo27381clone() {
                return (C7204b) super.mo27381clone();
            }

            /* renamed from: n */
            public final void m7965n() {
                if ((this.f9074a & 1) == 0) {
                    this.f9075b = new ArrayList(this.f9075b);
                    this.f9074a |= 1;
                }
            }

            /* renamed from: o */
            public int m7966o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9076c;
                return repeatedFieldBuilderV3 == null ? this.f9075b.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m7967p() {
                if (this.f9076c == null) {
                    this.f9076c = new RepeatedFieldBuilderV3(this.f9075b, (this.f9074a & 1) != 0, getParentForChildren(), isClean());
                    this.f9075b = null;
                }
                return this.f9076c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public CommandSource getDefaultInstanceForType() {
                return CommandSource.m7429g();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7204b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    CommandInfo commandInfo = (CommandInfo) codedInputStream.readMessage(CommandInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f9076c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m7965n();
                                        this.f9075b.add(commandInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(commandInfo);
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z10 = true;
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
            public C7204b mergeFrom(Message message) {
                if (message instanceof CommandSource) {
                    return m7971t((CommandSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: t */
            public C7204b m7971t(CommandSource commandSource) {
                if (commandSource == CommandSource.m7429g()) {
                    return this;
                }
                if (this.f9076c == null) {
                    if (!commandSource.f8916a.isEmpty()) {
                        if (this.f9075b.isEmpty()) {
                            this.f9075b = commandSource.f8916a;
                            this.f9074a &= -2;
                        } else {
                            m7965n();
                            this.f9075b.addAll(commandSource.f8916a);
                        }
                        onChanged();
                    }
                } else if (!commandSource.f8916a.isEmpty()) {
                    if (this.f9076c.isEmpty()) {
                        this.f9076c.dispose();
                        this.f9076c = null;
                        this.f9075b = commandSource.f8916a;
                        this.f9074a &= -2;
                        this.f9076c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7967p() : null;
                    } else {
                        this.f9076c.addAllMessages(commandSource.f8916a);
                    }
                }
                mergeUnknownFields(commandSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public final C7204b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7204b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C7204b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7204b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public C7204b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7204b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: x, reason: merged with bridge method [inline-methods] */
            public final C7204b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C7204b) super.setUnknownFields(unknownFieldSet);
            }

            public C7204b() {
                this.f9075b = Collections.EMPTY_LIST;
            }

            public C7204b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f9075b = Collections.EMPTY_LIST;
            }
        }

        public CommandSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f8917b = (byte) -1;
        }

        private CommandSource() {
            this.f8917b = (byte) -1;
            this.f8916a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m7425y().getMessageTypes().get(0);
        f8889a = descriptor;
        f8890b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f8891c = descriptor2;
        f8892d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DelayTime", "Duration", "IsPlay", "CommandEnum", "Data"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f8893e = descriptor3;
        f8894f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"GraphEnum", "GraphId", "OutRect", "ParentGraphId", "SourceFileName", "SourceId", "Extras"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f8895g = descriptor4;
        f8896h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GraphData"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        f8897i = descriptor5;
        f8898j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"GraphData", "OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        f8899k = descriptor6;
        f8900l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GraphId", "GraphEnum", "OutRect", "Content", "Paint", "Points", "RenderMatrix", "FilePath"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(4);
        f8901m = descriptor7;
        f8902n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"FileName", "Duration", "Validate"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(5);
        f8903o = descriptor8;
        f8904p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(6);
        f8905q = descriptor9;
        f8906r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"OriginMatrix", "LastMatrix"});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(7);
        f8907s = descriptor10;
        f8908t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"OriginBackground", "LastBackground", "OriginBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(8);
        f8909u = descriptor11;
        f8910v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor12 = descriptor2.getNestedTypes().get(9);
        f8911w = descriptor12;
        f8912x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Snapshot", "BackgroundColor", "BackgroundLineConfig"});
        AnyProto.getDescriptor();
        EzyCommandEnum.m7976a();
        EzyGraphEnum.m7984a();
        EzyRectF.m8542c();
        EzyMatrix.m8214c();
        EzyPaint.m8466c();
        EzyPointF.m8508c();
        EzyPageSnapshot.m8339e();
        EzyHeader.m7996i();
    }

    /* renamed from: y */
    public static Descriptors.FileDescriptor m7425y() {
        return f8913y;
    }
}
