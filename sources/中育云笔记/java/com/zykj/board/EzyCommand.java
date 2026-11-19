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
import com.google.protobuf.GeneratedMessage;
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

/* loaded from: classes5.dex */
public abstract class EzyCommand {

    /* renamed from: a */
    public static final Descriptors.Descriptor f18710a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f18711b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f18712c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f18713d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f18714e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f18715f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f18716g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f18717h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f18718i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f18719j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f18720k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f18721l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f18722m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f18723n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f18724o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f18725p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f18726q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f18727r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f18728s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f18729t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f18730u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f18731v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f18732w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f18733x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f18734y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rCommand.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017enums/CommandEnum.proto\u001a\u0015enums/GraphEnum.proto\u001a\u0011utils/RectF.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0013GraphSnapshot.proto\u001a\fHeader.proto\"\u0092\u000b\n\rCommandSource\u0012/\n\u000bcommandInfo\u0018\u0001 \u0003(\u000b2\u001a.CommandSource.CommandInfo\u001aÏ\n\n\u000bCommandInfo\u0012\u0011\n\tdelayTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006isPlay\u0018\u0003 \u0001(\b\u0012!\n\u000bcommandEnum\u0018\u0004 \u0001(\u000e2\f.CommandEnum\u0012\f\n\u0004data\u0018\u0005 \u0001(\f\u001a¥\u0001\n\tGraphData\u0012\u001d\n\tgraphEnum\u0018\u0001 \u0001(\u000e2\n.GraphEnum\u0012\u000f\n\u0007graphId\u0018\u0002 \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0015\n\rparentGraphId\u0018\u0004 \u0001(\t\u0012\u0016\n\u000esourceFileName\u0018\u0005 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\t\u001aF\n\u000bGraphRemove\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u001a¬\u0001\n\u000bGraphMatrix\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u0012\u001d\n\foriginMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0003 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0004 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0005 \u0001(\u0005\u001aÈ\u0001\n\u000bGraphChange\u0012\u000f\n\u0007graphId\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0005 \u0001(\u000b2\u0006.Paint\u0012\u0017\n\u0006points\u0018\u0006 \u0003(\u000b2\u0007.PointF\u0012\u001d\n\frenderMatrix\u0018\u0007 \u0001(\u000b2\u0007.Matrix\u0012\u0010\n\bfilePath\u0018\b \u0001(\t\u001aB\n\nAudioStart\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\u001at\n\fCameraMatrix\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0003 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0004 \u0001(\u0005\u001aD\n\u0006Camera\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u001a®\u0001\n\u0006Config\u0012\u0018\n\u0010originBackground\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000elastBackground\u0018\u0002 \u0001(\u0005\u00129\n\u001aoriginBackgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u0004 \u0001(\u000b2\u0015.BackgroundLineConfig\u001a6\n\nCursorMove\u0012\u0016\n\u000esourceFileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0002 \u0001(\u0005\u001a\u0086\u0001\n\u0007REBUILD\u0012-\n\bsnapshot\u0018\u0001 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0017\n\u000fbackgroundColor\u0018\u0002 \u0001(\u0005\u00123\n\u0014backgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfigB\u001c\n\u000ecom.zykj.boardB\nEzyCommandb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), EzyCommandEnum.m15217a(), EzyGraphEnum.m15225a(), EzyRectF.m15787c(), EzyMatrix.m15454c(), EzyPaint.m15711c(), EzyPointF.m15753c(), EzyPageSnapshot.m15580e(), EzyHeader.m15237i()});

    public static final class CommandSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final CommandSource f18735e = new CommandSource();

        /* renamed from: f */
        public static final Parser f18736f = new C8471a();

        /* renamed from: c */
        public List f18737c;

        /* renamed from: d */
        public byte f18738d;

        public static final class CommandInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: i */
            public static final CommandInfo f18739i = new CommandInfo();

            /* renamed from: j */
            public static final Parser f18740j = new C8469a();

            /* renamed from: c */
            public long f18741c;

            /* renamed from: d */
            public long f18742d;

            /* renamed from: e */
            public boolean f18743e;

            /* renamed from: f */
            public int f18744f;

            /* renamed from: g */
            public ByteString f18745g;

            /* renamed from: h */
            public byte f18746h;

            public static final class AudioStart extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final AudioStart f18747g = new AudioStart();

                /* renamed from: h */
                public static final Parser f18748h = new C8449a();

                /* renamed from: c */
                public volatile Object f18749c;

                /* renamed from: d */
                public long f18750d;

                /* renamed from: e */
                public volatile Object f18751e;

                /* renamed from: f */
                public byte f18752f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$a */
                public class C8449a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public AudioStart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8450b c8450bM14708o = AudioStart.m14708o();
                        try {
                            c8450bM14708o.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8450bM14708o.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8450bM14708o.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8450bM14708o.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8450bM14708o.buildPartial());
                        }
                    }
                }

                /* renamed from: g */
                public static AudioStart m14707g() {
                    return f18747g;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18722m;
                }

                /* renamed from: o */
                public static C8450b m14708o() {
                    return f18747g.toBuilder();
                }

                /* renamed from: t */
                public static AudioStart m14709t(ByteString byteString) {
                    return (AudioStart) f18748h.parseFrom(byteString);
                }

                /* renamed from: u */
                public static AudioStart m14710u(byte[] bArr) {
                    return (AudioStart) f18748h.parseFrom(bArr);
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
                    return getFileName().equals(audioStart.getFileName()) && m14712m() == audioStart.m14712m() && m14713n().equals(audioStart.m14713n()) && getUnknownFields().equals(audioStart.getUnknownFields());
                }

                public String getFileName() {
                    Object obj = this.f18749c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18749c = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18748h;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f18749c) ? GeneratedMessage.computeStringSize(1, this.f18749c) : 0;
                    long j10 = this.f18750d;
                    if (j10 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt64Size(2, j10);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18751e)) {
                        iComputeStringSize += GeneratedMessage.computeStringSize(3, this.f18751e);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(m14712m())) * 37) + 3) * 53) + m14713n().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18723n.ensureFieldAccessorsInitialized(AudioStart.class, C8450b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18752f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18752f = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public AudioStart getDefaultInstanceForType() {
                    return f18747g;
                }

                /* renamed from: m */
                public long m14712m() {
                    return this.f18750d;
                }

                /* renamed from: n */
                public String m14713n() {
                    Object obj = this.f18751e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18751e = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new AudioStart();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8450b newBuilderForType() {
                    return m14708o();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C8450b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8450b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C8450b toBuilder() {
                    return this == f18747g ? new C8450b() : new C8450b().m14729n(this);
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (!GeneratedMessage.isStringEmpty(this.f18749c)) {
                        GeneratedMessage.writeString(codedOutputStream, 1, this.f18749c);
                    }
                    long j10 = this.f18750d;
                    if (j10 != 0) {
                        codedOutputStream.writeInt64(2, j10);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18751e)) {
                        GeneratedMessage.writeString(codedOutputStream, 3, this.f18751e);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$b */
                public static final class C8450b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18753c;

                    /* renamed from: d */
                    public Object f18754d;

                    /* renamed from: e */
                    public long f18755e;

                    /* renamed from: f */
                    public Object f18756f;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8450b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8450b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18753c != 0) {
                            m14721f(audioStart);
                        }
                        onBuilt();
                        return audioStart;
                    }

                    /* renamed from: f */
                    public final void m14721f(AudioStart audioStart) {
                        int i10 = this.f18753c;
                        if ((i10 & 1) != 0) {
                            audioStart.f18749c = this.f18754d;
                        }
                        if ((i10 & 2) != 0) {
                            audioStart.f18750d = this.f18755e;
                        }
                        if ((i10 & 4) != 0) {
                            audioStart.f18751e = this.f18756f;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8450b clear() {
                        super.clear();
                        this.f18753c = 0;
                        this.f18754d = "";
                        this.f18755e = 0L;
                        this.f18756f = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18722m;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8450b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8450b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8450b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8450b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18723n.ensureFieldAccessorsInitialized(AudioStart.class, C8450b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public C8450b mo33979clone() {
                        return (C8450b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public AudioStart getDefaultInstanceForType() {
                        return AudioStart.m14707g();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C8450b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f18754d = codedInputStream.readStringRequireUtf8();
                                            this.f18753c |= 1;
                                        } else if (tag == 16) {
                                            this.f18755e = codedInputStream.readInt64();
                                            this.f18753c |= 2;
                                        } else if (tag == 26) {
                                            this.f18756f = codedInputStream.readStringRequireUtf8();
                                            this.f18753c |= 4;
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
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C8450b mergeFrom(Message message) {
                        if (message instanceof AudioStart) {
                            return m14729n((AudioStart) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: n */
                    public C8450b m14729n(AudioStart audioStart) {
                        if (audioStart == AudioStart.m14707g()) {
                            return this;
                        }
                        if (!audioStart.getFileName().isEmpty()) {
                            this.f18754d = audioStart.f18749c;
                            this.f18753c |= 1;
                            onChanged();
                        }
                        if (audioStart.m14712m() != 0) {
                            m14731p(audioStart.m14712m());
                        }
                        if (!audioStart.m14713n().isEmpty()) {
                            this.f18756f = audioStart.f18751e;
                            this.f18753c |= 4;
                            onChanged();
                        }
                        mergeUnknownFields(audioStart.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public final C8450b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8450b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: p */
                    public C8450b m14731p(long j10) {
                        this.f18755e = j10;
                        this.f18753c |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C8450b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8450b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: r */
                    public C8450b m14733r(String str) {
                        str.getClass();
                        this.f18754d = str;
                        this.f18753c |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C8450b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8450b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C8450b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8450b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C8450b() {
                        this.f18754d = "";
                        this.f18756f = "";
                    }

                    public C8450b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18754d = "";
                        this.f18756f = "";
                    }
                }

                public AudioStart(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18749c = "";
                    this.f18750d = 0L;
                    this.f18751e = "";
                    this.f18752f = (byte) -1;
                }

                private AudioStart() {
                    this.f18749c = "";
                    this.f18750d = 0L;
                    this.f18751e = "";
                    this.f18752f = (byte) -1;
                    this.f18749c = "";
                    this.f18751e = "";
                }
            }

            public static final class Camera extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final Camera f18757g = new Camera();

                /* renamed from: h */
                public static final Parser f18758h = new C8451a();

                /* renamed from: c */
                public int f18759c;

                /* renamed from: d */
                public EzyMatrix.Matrix f18760d;

                /* renamed from: e */
                public EzyMatrix.Matrix f18761e;

                /* renamed from: f */
                public byte f18762f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$a */
                public class C8451a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Camera parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8452b c8452bM14740o = Camera.m14740o();
                        try {
                            c8452bM14740o.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8452bM14740o.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8452bM14740o.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8452bM14740o.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8452bM14740o.buildPartial());
                        }
                    }
                }

                /* renamed from: d */
                public static /* synthetic */ int m14738d(Camera camera, int i10) {
                    int i11 = i10 | camera.f18759c;
                    camera.f18759c = i11;
                    return i11;
                }

                /* renamed from: e */
                public static Camera m14739e() {
                    return f18757g;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18726q;
                }

                /* renamed from: o */
                public static C8452b m14740o() {
                    return f18757g.toBuilder();
                }

                /* renamed from: t */
                public static Camera m14741t(ByteString byteString) {
                    return (Camera) f18758h.parseFrom(byteString);
                }

                /* renamed from: u */
                public static Camera m14742u(byte[] bArr) {
                    return (Camera) f18758h.parseFrom(bArr);
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
                    if (m14747n() != camera.m14747n()) {
                        return false;
                    }
                    if ((!m14747n() || m14745k().equals(camera.m14745k())) && m14746m() == camera.m14746m()) {
                        return (!m14746m() || m14744g().equals(camera.m14744g())) && getUnknownFields().equals(camera.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public Camera getDefaultInstanceForType() {
                    return f18757g;
                }

                /* renamed from: g */
                public EzyMatrix.Matrix m14744g() {
                    EzyMatrix.Matrix matrix = this.f18761e;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18758h;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f18759c & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m14745k()) : 0;
                    if ((this.f18759c & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m14744g());
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
                    if (m14747n()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m14745k().hashCode();
                    }
                    if (m14746m()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m14744g().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18727r.ensureFieldAccessorsInitialized(Camera.class, C8452b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18762f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18762f = (byte) 1;
                    return true;
                }

                /* renamed from: k */
                public EzyMatrix.Matrix m14745k() {
                    EzyMatrix.Matrix matrix = this.f18760d;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                /* renamed from: m */
                public boolean m14746m() {
                    return (this.f18759c & 2) != 0;
                }

                /* renamed from: n */
                public boolean m14747n() {
                    return (this.f18759c & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Camera();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8452b newBuilderForType() {
                    return m14740o();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C8452b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8452b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C8452b toBuilder() {
                    return this == f18757g ? new C8452b() : new C8452b().m14771t(this);
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if ((this.f18759c & 1) != 0) {
                        codedOutputStream.writeMessage(1, m14745k());
                    }
                    if ((this.f18759c & 2) != 0) {
                        codedOutputStream.writeMessage(2, m14744g());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$b */
                public static final class C8452b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18763c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f18764d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f18765e;

                    /* renamed from: f */
                    public EzyMatrix.Matrix f18766f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f18767g;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public C8452b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8452b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public final C8452b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8452b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8452b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8452b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18763c != 0) {
                            m14757f(camera);
                        }
                        onBuilt();
                        return camera;
                    }

                    /* renamed from: f */
                    public final void m14757f(Camera camera) {
                        int i10;
                        int i11 = this.f18763c;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18765e;
                            camera.f18760d = singleFieldBuilderV3 == null ? this.f18764d : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18767g;
                            camera.f18761e = singleFieldBuilderV32 == null ? this.f18766f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        Camera.m14738d(camera, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8452b clear() {
                        super.clear();
                        this.f18763c = 0;
                        this.f18764d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18765e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18765e = null;
                        }
                        this.f18766f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18767g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f18767g = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18726q;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8452b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8452b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8452b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8452b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18727r.ensureFieldAccessorsInitialized(Camera.class, C8452b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8452b mo33979clone() {
                        return (C8452b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public Camera getDefaultInstanceForType() {
                        return Camera.m14739e();
                    }

                    /* renamed from: l */
                    public EzyMatrix.Matrix m14763l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18767g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18766f;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix.C8487b m14764m() {
                        this.f18763c |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m14765n().getBuilder();
                    }

                    public final void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            m14768q();
                            m14765n();
                        }
                    }

                    /* renamed from: n */
                    public final SingleFieldBuilderV3 m14765n() {
                        if (this.f18767g == null) {
                            this.f18767g = new SingleFieldBuilderV3(m14763l(), getParentForChildren(), isClean());
                            this.f18766f = null;
                        }
                        return this.f18767g;
                    }

                    /* renamed from: o */
                    public EzyMatrix.Matrix m14766o() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18765e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18764d;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix.C8487b m14767p() {
                        this.f18763c |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m14768q().getBuilder();
                    }

                    /* renamed from: q */
                    public final SingleFieldBuilderV3 m14768q() {
                        if (this.f18765e == null) {
                            this.f18765e = new SingleFieldBuilderV3(m14766o(), getParentForChildren(), isClean());
                            this.f18764d = null;
                        }
                        return this.f18765e;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C8452b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m14768q().getBuilder(), extensionRegistryLite);
                                            this.f18763c |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m14765n().getBuilder(), extensionRegistryLite);
                                            this.f18763c |= 2;
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
                    public C8452b mergeFrom(Message message) {
                        if (message instanceof Camera) {
                            return m14771t((Camera) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: t */
                    public C8452b m14771t(Camera camera) {
                        if (camera == Camera.m14739e()) {
                            return this;
                        }
                        if (camera.m14747n()) {
                            m14773v(camera.m14745k());
                        }
                        if (camera.m14746m()) {
                            m14772u(camera.m14744g());
                        }
                        mergeUnknownFields(camera.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: u */
                    public C8452b m14772u(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18767g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18763c & 2) == 0 || (matrix2 = this.f18766f) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18766f = matrix;
                        } else {
                            m14764m().m15492n(matrix);
                        }
                        if (this.f18766f != null) {
                            this.f18763c |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: v */
                    public C8452b m14773v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18765e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18763c & 1) == 0 || (matrix2 = this.f18764d) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18764d = matrix;
                        } else {
                            m14767p().m15492n(matrix);
                        }
                        if (this.f18764d != null) {
                            this.f18763c |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C8452b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8452b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public C8452b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8452b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: y */
                    public C8452b m14776y(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18767g;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f18766f = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f18763c |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C8452b m14777z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18765e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f18764d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f18763c |= 1;
                        onChanged();
                        return this;
                    }

                    public C8452b() {
                        maybeForceBuilderInitialization();
                    }

                    public C8452b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Camera(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18762f = (byte) -1;
                }

                private Camera() {
                    this.f18762f = (byte) -1;
                }
            }

            public static final class CameraMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: i */
                public static final CameraMatrix f18768i = new CameraMatrix();

                /* renamed from: j */
                public static final Parser f18769j = new C8453a();

                /* renamed from: c */
                public int f18770c;

                /* renamed from: d */
                public EzyMatrix.Matrix f18771d;

                /* renamed from: e */
                public EzyMatrix.Matrix f18772e;

                /* renamed from: f */
                public volatile Object f18773f;

                /* renamed from: g */
                public int f18774g;

                /* renamed from: h */
                public byte f18775h;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$a */
                public class C8453a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8454b c8454bM14787v = CameraMatrix.m14787v();
                        try {
                            c8454bM14787v.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8454bM14787v.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8454bM14787v.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8454bM14787v.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8454bM14787v.buildPartial());
                        }
                    }
                }

                /* renamed from: A */
                public static CameraMatrix m14778A(ByteString byteString) {
                    return (CameraMatrix) f18769j.parseFrom(byteString);
                }

                /* renamed from: C */
                public static CameraMatrix m14779C(byte[] bArr) {
                    return (CameraMatrix) f18769j.parseFrom(bArr);
                }

                /* renamed from: g */
                public static /* synthetic */ int m14785g(CameraMatrix cameraMatrix, int i10) {
                    int i11 = i10 | cameraMatrix.f18770c;
                    cameraMatrix.f18770c = i11;
                    return i11;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18724o;
                }

                /* renamed from: k */
                public static CameraMatrix m14786k() {
                    return f18768i;
                }

                /* renamed from: v */
                public static C8454b m14787v() {
                    return f18768i.toBuilder();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C8454b toBuilder() {
                    return this == f18768i ? new C8454b() : new C8454b().m14820t(this);
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
                    if (m14795u() != cameraMatrix.m14795u()) {
                        return false;
                    }
                    if ((!m14795u() || m14791o().equals(cameraMatrix.m14791o())) && m14794t() == cameraMatrix.m14794t()) {
                        return (!m14794t() || m14790n().equals(cameraMatrix.m14790n())) && m14792p().equals(cameraMatrix.m14792p()) && m14793r() == cameraMatrix.m14793r() && getUnknownFields().equals(cameraMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18769j;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f18770c & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m14791o()) : 0;
                    if ((this.f18770c & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m14790n());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18773f)) {
                        iComputeMessageSize += GeneratedMessage.computeStringSize(3, this.f18773f);
                    }
                    int i11 = this.f18774g;
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
                    if (m14795u()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m14791o().hashCode();
                    }
                    if (m14794t()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m14790n().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 3) * 53) + m14792p().hashCode()) * 37) + 4) * 53) + m14793r()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18725p.ensureFieldAccessorsInitialized(CameraMatrix.class, C8454b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18775h;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18775h = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public CameraMatrix getDefaultInstanceForType() {
                    return f18768i;
                }

                /* renamed from: n */
                public EzyMatrix.Matrix m14790n() {
                    EzyMatrix.Matrix matrix = this.f18772e;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CameraMatrix();
                }

                /* renamed from: o */
                public EzyMatrix.Matrix m14791o() {
                    EzyMatrix.Matrix matrix = this.f18771d;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                /* renamed from: p */
                public String m14792p() {
                    Object obj = this.f18773f;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18773f = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: r */
                public int m14793r() {
                    return this.f18774g;
                }

                /* renamed from: t */
                public boolean m14794t() {
                    return (this.f18770c & 2) != 0;
                }

                /* renamed from: u */
                public boolean m14795u() {
                    return (this.f18770c & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if ((this.f18770c & 1) != 0) {
                        codedOutputStream.writeMessage(1, m14791o());
                    }
                    if ((this.f18770c & 2) != 0) {
                        codedOutputStream.writeMessage(2, m14790n());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18773f)) {
                        GeneratedMessage.writeString(codedOutputStream, 3, this.f18773f);
                    }
                    int i10 = this.f18774g;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(4, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C8454b newBuilderForType() {
                    return m14787v();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C8454b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8454b(builderParent);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$b */
                public static final class C8454b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18776c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f18777d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f18778e;

                    /* renamed from: f */
                    public EzyMatrix.Matrix f18779f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f18780g;

                    /* renamed from: h */
                    public Object f18781h;

                    /* renamed from: i */
                    public int f18782i;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            m14800q();
                            m14799n();
                        }
                    }

                    /* renamed from: n */
                    private SingleFieldBuilderV3 m14799n() {
                        if (this.f18780g == null) {
                            this.f18780g = new SingleFieldBuilderV3(m14814l(), getParentForChildren(), isClean());
                            this.f18779f = null;
                        }
                        return this.f18780g;
                    }

                    /* renamed from: q */
                    private SingleFieldBuilderV3 m14800q() {
                        if (this.f18778e == null) {
                            this.f18778e = new SingleFieldBuilderV3(m14816o(), getParentForChildren(), isClean());
                            this.f18777d = null;
                        }
                        return this.f18778e;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public C8454b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8454b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: B */
                    public C8454b m14802B(String str) {
                        str.getClass();
                        this.f18781h = str;
                        this.f18776c |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: C */
                    public C8454b m14803C(int i10) {
                        this.f18782i = i10;
                        this.f18776c |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public final C8454b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8454b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8454b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8454b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18776c != 0) {
                            m14808f(cameraMatrix);
                        }
                        onBuilt();
                        return cameraMatrix;
                    }

                    /* renamed from: f */
                    public final void m14808f(CameraMatrix cameraMatrix) {
                        int i10;
                        int i11 = this.f18776c;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18778e;
                            cameraMatrix.f18771d = singleFieldBuilderV3 == null ? this.f18777d : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18780g;
                            cameraMatrix.f18772e = singleFieldBuilderV32 == null ? this.f18779f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 4) != 0) {
                            cameraMatrix.f18773f = this.f18781h;
                        }
                        if ((i11 & 8) != 0) {
                            cameraMatrix.f18774g = this.f18782i;
                        }
                        CameraMatrix.m14785g(cameraMatrix, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8454b clear() {
                        super.clear();
                        this.f18776c = 0;
                        this.f18777d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18778e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18778e = null;
                        }
                        this.f18779f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18780g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f18780g = null;
                        }
                        this.f18781h = "";
                        this.f18782i = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18724o;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8454b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8454b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8454b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8454b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18725p.ensureFieldAccessorsInitialized(CameraMatrix.class, C8454b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8454b mo33979clone() {
                        return (C8454b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix getDefaultInstanceForType() {
                        return CameraMatrix.m14786k();
                    }

                    /* renamed from: l */
                    public EzyMatrix.Matrix m14814l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18780g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18779f;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix.C8487b m14815m() {
                        this.f18776c |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m14799n().getBuilder();
                    }

                    /* renamed from: o */
                    public EzyMatrix.Matrix m14816o() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18778e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18777d;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix.C8487b m14817p() {
                        this.f18776c |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m14800q().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C8454b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m14800q().getBuilder(), extensionRegistryLite);
                                            this.f18776c |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m14799n().getBuilder(), extensionRegistryLite);
                                            this.f18776c |= 2;
                                        } else if (tag == 26) {
                                            this.f18781h = codedInputStream.readStringRequireUtf8();
                                            this.f18776c |= 4;
                                        } else if (tag == 32) {
                                            this.f18782i = codedInputStream.readInt32();
                                            this.f18776c |= 8;
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
                    public C8454b mergeFrom(Message message) {
                        if (message instanceof CameraMatrix) {
                            return m14820t((CameraMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: t */
                    public C8454b m14820t(CameraMatrix cameraMatrix) {
                        if (cameraMatrix == CameraMatrix.m14786k()) {
                            return this;
                        }
                        if (cameraMatrix.m14795u()) {
                            m14822v(cameraMatrix.m14791o());
                        }
                        if (cameraMatrix.m14794t()) {
                            m14821u(cameraMatrix.m14790n());
                        }
                        if (!cameraMatrix.m14792p().isEmpty()) {
                            this.f18781h = cameraMatrix.f18773f;
                            this.f18776c |= 4;
                            onChanged();
                        }
                        if (cameraMatrix.m14793r() != 0) {
                            m14803C(cameraMatrix.m14793r());
                        }
                        mergeUnknownFields(cameraMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: u */
                    public C8454b m14821u(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18780g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18776c & 2) == 0 || (matrix2 = this.f18779f) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18779f = matrix;
                        } else {
                            m14815m().m15492n(matrix);
                        }
                        if (this.f18779f != null) {
                            this.f18776c |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: v */
                    public C8454b m14822v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18778e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18776c & 1) == 0 || (matrix2 = this.f18777d) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18777d = matrix;
                        } else {
                            m14817p().m15492n(matrix);
                        }
                        if (this.f18777d != null) {
                            this.f18776c |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C8454b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8454b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public C8454b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8454b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: y */
                    public C8454b m14825y(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18780g;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f18779f = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f18776c |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C8454b m14826z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18778e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f18777d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f18776c |= 1;
                        onChanged();
                        return this;
                    }

                    public C8454b() {
                        this.f18781h = "";
                        maybeForceBuilderInitialization();
                    }

                    public C8454b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18781h = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public CameraMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18773f = "";
                    this.f18774g = 0;
                    this.f18775h = (byte) -1;
                }

                private CameraMatrix() {
                    this.f18773f = "";
                    this.f18774g = 0;
                    this.f18775h = (byte) -1;
                    this.f18773f = "";
                }
            }

            public static final class Config extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: i */
                public static final Config f18783i = new Config();

                /* renamed from: j */
                public static final Parser f18784j = new C8455a();

                /* renamed from: c */
                public int f18785c;

                /* renamed from: d */
                public int f18786d;

                /* renamed from: e */
                public int f18787e;

                /* renamed from: f */
                public EzyHeader.BackgroundLineConfig f18788f;

                /* renamed from: g */
                public EzyHeader.BackgroundLineConfig f18789g;

                /* renamed from: h */
                public byte f18790h;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$a */
                public class C8455a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Config parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8456b c8456bM14836v = Config.m14836v();
                        try {
                            c8456bM14836v.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8456bM14836v.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8456bM14836v.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8456bM14836v.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8456bM14836v.buildPartial());
                        }
                    }
                }

                /* renamed from: A */
                public static Config m14827A(ByteString byteString) {
                    return (Config) f18784j.parseFrom(byteString);
                }

                /* renamed from: C */
                public static Config m14828C(byte[] bArr) {
                    return (Config) f18784j.parseFrom(bArr);
                }

                /* renamed from: e */
                public static /* synthetic */ int m14832e(Config config, int i10) {
                    int i11 = i10 | config.f18785c;
                    config.f18785c = i11;
                    return i11;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18728s;
                }

                /* renamed from: k */
                public static Config m14835k() {
                    return f18783i;
                }

                /* renamed from: v */
                public static C8456b m14836v() {
                    return f18783i.toBuilder();
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C8456b toBuilder() {
                    return this == f18783i ? new C8456b() : new C8456b().m14869t(this);
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
                    if (m14841p() != config.m14841p() || m14839n() != config.m14839n() || m14844u() != config.m14844u()) {
                        return false;
                    }
                    if ((!m14844u() || m14842r().equals(config.m14842r())) && m14843t() == config.m14843t()) {
                        return (!m14843t() || m14840o().equals(config.m14840o())) && getUnknownFields().equals(config.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18784j;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.f18786d;
                    int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                    int i12 = this.f18787e;
                    if (i12 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                    }
                    if ((1 & this.f18785c) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m14842r());
                    }
                    if ((this.f18785c & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(4, m14840o());
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
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m14841p()) * 37) + 2) * 53) + m14839n();
                    if (m14844u()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m14842r().hashCode();
                    }
                    if (m14843t()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + m14840o().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18729t.ensureFieldAccessorsInitialized(Config.class, C8456b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18790h;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18790h = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Config getDefaultInstanceForType() {
                    return f18783i;
                }

                /* renamed from: n */
                public int m14839n() {
                    return this.f18787e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Config();
                }

                /* renamed from: o */
                public EzyHeader.BackgroundLineConfig m14840o() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f18789g;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m15287g() : backgroundLineConfig;
                }

                /* renamed from: p */
                public int m14841p() {
                    return this.f18786d;
                }

                /* renamed from: r */
                public EzyHeader.BackgroundLineConfig m14842r() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f18788f;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m15287g() : backgroundLineConfig;
                }

                /* renamed from: t */
                public boolean m14843t() {
                    return (this.f18785c & 2) != 0;
                }

                /* renamed from: u */
                public boolean m14844u() {
                    return (this.f18785c & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    int i10 = this.f18786d;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(1, i10);
                    }
                    int i11 = this.f18787e;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(2, i11);
                    }
                    if ((this.f18785c & 1) != 0) {
                        codedOutputStream.writeMessage(3, m14842r());
                    }
                    if ((this.f18785c & 2) != 0) {
                        codedOutputStream.writeMessage(4, m14840o());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C8456b newBuilderForType() {
                    return m14836v();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C8456b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8456b(builderParent);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$b */
                public static final class C8456b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18791c;

                    /* renamed from: d */
                    public int f18792d;

                    /* renamed from: e */
                    public int f18793e;

                    /* renamed from: f */
                    public EzyHeader.BackgroundLineConfig f18794f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f18795g;

                    /* renamed from: h */
                    public EzyHeader.BackgroundLineConfig f18796h;

                    /* renamed from: i */
                    public SingleFieldBuilderV3 f18797i;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            m14866q();
                            m14863n();
                        }
                    }

                    /* renamed from: A */
                    public C8456b m14848A(int i10) {
                        this.f18792d = i10;
                        this.f18791c |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: B */
                    public C8456b m14849B(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18795g;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f18794f = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f18791c |= 4;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public C8456b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8456b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public final C8456b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8456b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8456b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8456b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18791c != 0) {
                            m14855f(config);
                        }
                        onBuilt();
                        return config;
                    }

                    /* renamed from: f */
                    public final void m14855f(Config config) {
                        int i10;
                        int i11 = this.f18791c;
                        if ((i11 & 1) != 0) {
                            config.f18786d = this.f18792d;
                        }
                        if ((i11 & 2) != 0) {
                            config.f18787e = this.f18793e;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18795g;
                            config.f18788f = singleFieldBuilderV3 == null ? this.f18794f : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18797i;
                            config.f18789g = singleFieldBuilderV32 == null ? this.f18796h : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        Config.m14832e(config, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8456b clear() {
                        super.clear();
                        this.f18791c = 0;
                        this.f18792d = 0;
                        this.f18793e = 0;
                        this.f18794f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18795g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18795g = null;
                        }
                        this.f18796h = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18797i;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f18797i = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18728s;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8456b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8456b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8456b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8456b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18729t.ensureFieldAccessorsInitialized(Config.class, C8456b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8456b mo33979clone() {
                        return (C8456b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public Config getDefaultInstanceForType() {
                        return Config.m14835k();
                    }

                    /* renamed from: l */
                    public EzyHeader.BackgroundLineConfig m14861l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18797i;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f18796h;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m15287g() : backgroundLineConfig;
                    }

                    /* renamed from: m */
                    public EzyHeader.BackgroundLineConfig.C8480b m14862m() {
                        this.f18791c |= 8;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C8480b) m14863n().getBuilder();
                    }

                    /* renamed from: n */
                    public final SingleFieldBuilderV3 m14863n() {
                        if (this.f18797i == null) {
                            this.f18797i = new SingleFieldBuilderV3(m14861l(), getParentForChildren(), isClean());
                            this.f18796h = null;
                        }
                        return this.f18797i;
                    }

                    /* renamed from: o */
                    public EzyHeader.BackgroundLineConfig m14864o() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18795g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f18794f;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m15287g() : backgroundLineConfig;
                    }

                    /* renamed from: p */
                    public EzyHeader.BackgroundLineConfig.C8480b m14865p() {
                        this.f18791c |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C8480b) m14866q().getBuilder();
                    }

                    /* renamed from: q */
                    public final SingleFieldBuilderV3 m14866q() {
                        if (this.f18795g == null) {
                            this.f18795g = new SingleFieldBuilderV3(m14864o(), getParentForChildren(), isClean());
                            this.f18794f = null;
                        }
                        return this.f18795g;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C8456b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f18792d = codedInputStream.readInt32();
                                            this.f18791c |= 1;
                                        } else if (tag == 16) {
                                            this.f18793e = codedInputStream.readInt32();
                                            this.f18791c |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m14866q().getBuilder(), extensionRegistryLite);
                                            this.f18791c |= 4;
                                        } else if (tag == 34) {
                                            codedInputStream.readMessage(m14863n().getBuilder(), extensionRegistryLite);
                                            this.f18791c |= 8;
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
                    public C8456b mergeFrom(Message message) {
                        if (message instanceof Config) {
                            return m14869t((Config) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: t */
                    public C8456b m14869t(Config config) {
                        if (config == Config.m14835k()) {
                            return this;
                        }
                        if (config.m14841p() != 0) {
                            m14848A(config.m14841p());
                        }
                        if (config.m14839n() != 0) {
                            m14874y(config.m14839n());
                        }
                        if (config.m14844u()) {
                            m14871v(config.m14842r());
                        }
                        if (config.m14843t()) {
                            m14870u(config.m14840o());
                        }
                        mergeUnknownFields(config.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: u */
                    public C8456b m14870u(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18797i;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f18791c & 8) == 0 || (backgroundLineConfig2 = this.f18796h) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m15287g()) {
                            this.f18796h = backgroundLineConfig;
                        } else {
                            m14862m().m15310n(backgroundLineConfig);
                        }
                        if (this.f18796h != null) {
                            this.f18791c |= 8;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: v */
                    public C8456b m14871v(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18795g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f18791c & 4) == 0 || (backgroundLineConfig2 = this.f18794f) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m15287g()) {
                            this.f18794f = backgroundLineConfig;
                        } else {
                            m14865p().m15310n(backgroundLineConfig);
                        }
                        if (this.f18794f != null) {
                            this.f18791c |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C8456b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8456b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public C8456b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8456b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: y */
                    public C8456b m14874y(int i10) {
                        this.f18793e = i10;
                        this.f18791c |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C8456b m14875z(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18797i;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f18796h = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f18791c |= 8;
                        onChanged();
                        return this;
                    }

                    public C8456b() {
                        maybeForceBuilderInitialization();
                    }

                    public C8456b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Config(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18786d = 0;
                    this.f18787e = 0;
                    this.f18790h = (byte) -1;
                }

                private Config() {
                    this.f18786d = 0;
                    this.f18787e = 0;
                    this.f18790h = (byte) -1;
                }
            }

            public static final class CursorMove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: f */
                public static final CursorMove f18798f = new CursorMove();

                /* renamed from: g */
                public static final Parser f18799g = new C8457a();

                /* renamed from: c */
                public volatile Object f18800c;

                /* renamed from: d */
                public int f18801d;

                /* renamed from: e */
                public byte f18802e;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$a */
                public class C8457a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CursorMove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8458b c8458bM14880m = CursorMove.m14880m();
                        try {
                            c8458bM14880m.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8458bM14880m.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8458bM14880m.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8458bM14880m.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8458bM14880m.buildPartial());
                        }
                    }
                }

                /* renamed from: e */
                public static CursorMove m14879e() {
                    return f18798f;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18730u;
                }

                /* renamed from: m */
                public static C8458b m14880m() {
                    return f18798f.toBuilder();
                }

                /* renamed from: p */
                public static CursorMove m14881p(ByteString byteString) {
                    return (CursorMove) f18799g.parseFrom(byteString);
                }

                /* renamed from: r */
                public static CursorMove m14882r(byte[] bArr) {
                    return (CursorMove) f18799g.parseFrom(bArr);
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
                    return m14884g().equals(cursorMove.m14884g()) && m14885k() == cursorMove.m14885k() && getUnknownFields().equals(cursorMove.getUnknownFields());
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public CursorMove getDefaultInstanceForType() {
                    return f18798f;
                }

                /* renamed from: g */
                public String m14884g() {
                    Object obj = this.f18800c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18800c = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18799g;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f18800c) ? GeneratedMessage.computeStringSize(1, this.f18800c) : 0;
                    int i11 = this.f18801d;
                    if (i11 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt32Size(2, i11);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m14884g().hashCode()) * 37) + 2) * 53) + m14885k()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18731v.ensureFieldAccessorsInitialized(CursorMove.class, C8458b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18802e;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18802e = (byte) 1;
                    return true;
                }

                /* renamed from: k */
                public int m14885k() {
                    return this.f18801d;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C8458b newBuilderForType() {
                    return m14880m();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CursorMove();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public C8458b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8458b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C8458b toBuilder() {
                    return this == f18798f ? new C8458b() : new C8458b().m14901n(this);
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (!GeneratedMessage.isStringEmpty(this.f18800c)) {
                        GeneratedMessage.writeString(codedOutputStream, 1, this.f18800c);
                    }
                    int i10 = this.f18801d;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$b */
                public static final class C8458b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18803c;

                    /* renamed from: d */
                    public Object f18804d;

                    /* renamed from: e */
                    public int f18805e;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8458b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8458b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18803c != 0) {
                            m14893f(cursorMove);
                        }
                        onBuilt();
                        return cursorMove;
                    }

                    /* renamed from: f */
                    public final void m14893f(CursorMove cursorMove) {
                        int i10 = this.f18803c;
                        if ((i10 & 1) != 0) {
                            cursorMove.f18800c = this.f18804d;
                        }
                        if ((i10 & 2) != 0) {
                            cursorMove.f18801d = this.f18805e;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8458b clear() {
                        super.clear();
                        this.f18803c = 0;
                        this.f18804d = "";
                        this.f18805e = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18730u;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8458b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8458b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8458b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8458b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18731v.ensureFieldAccessorsInitialized(CursorMove.class, C8458b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8458b mo33979clone() {
                        return (C8458b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public CursorMove getDefaultInstanceForType() {
                        return CursorMove.m14879e();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C8458b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f18804d = codedInputStream.readStringRequireUtf8();
                                            this.f18803c |= 1;
                                        } else if (tag == 16) {
                                            this.f18805e = codedInputStream.readInt32();
                                            this.f18803c |= 2;
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
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C8458b mergeFrom(Message message) {
                        if (message instanceof CursorMove) {
                            return m14901n((CursorMove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: n */
                    public C8458b m14901n(CursorMove cursorMove) {
                        if (cursorMove == CursorMove.m14879e()) {
                            return this;
                        }
                        if (!cursorMove.m14884g().isEmpty()) {
                            this.f18804d = cursorMove.f18800c;
                            this.f18803c |= 1;
                            onChanged();
                        }
                        if (cursorMove.m14885k() != 0) {
                            m14906s(cursorMove.m14885k());
                        }
                        mergeUnknownFields(cursorMove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public final C8458b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8458b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public C8458b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8458b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C8458b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8458b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: r */
                    public C8458b m14905r(String str) {
                        str.getClass();
                        this.f18804d = str;
                        this.f18803c |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: s */
                    public C8458b m14906s(int i10) {
                        this.f18805e = i10;
                        this.f18803c |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C8458b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8458b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C8458b() {
                        this.f18804d = "";
                    }

                    public C8458b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18804d = "";
                    }
                }

                public CursorMove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18800c = "";
                    this.f18801d = 0;
                    this.f18802e = (byte) -1;
                }

                private CursorMove() {
                    this.f18800c = "";
                    this.f18801d = 0;
                    this.f18802e = (byte) -1;
                    this.f18800c = "";
                }
            }

            public static final class GraphChange extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: m */
                public static final GraphChange f18806m = new GraphChange();

                /* renamed from: n */
                public static final Parser f18807n = new C8459a();

                /* renamed from: c */
                public int f18808c;

                /* renamed from: d */
                public volatile Object f18809d;

                /* renamed from: e */
                public int f18810e;

                /* renamed from: f */
                public EzyRectF.RectF f18811f;

                /* renamed from: g */
                public volatile Object f18812g;

                /* renamed from: h */
                public EzyPaint.Paint f18813h;

                /* renamed from: i */
                public List f18814i;

                /* renamed from: j */
                public EzyMatrix.Matrix f18815j;

                /* renamed from: k */
                public volatile Object f18816k;

                /* renamed from: l */
                public byte f18817l;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$a */
                public class C8459a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphChange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8460b c8460bM14908K = GraphChange.m14908K();
                        try {
                            c8460bM14908K.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8460bM14908K.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8460bM14908K.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8460bM14908K.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8460bM14908K.buildPartial());
                        }
                    }
                }

                /* renamed from: K */
                public static C8460b m14908K() {
                    return f18806m.toBuilder();
                }

                /* renamed from: N */
                public static GraphChange m14909N(ByteString byteString) {
                    return (GraphChange) f18807n.parseFrom(byteString);
                }

                /* renamed from: O */
                public static GraphChange m14910O(byte[] bArr) {
                    return (GraphChange) f18807n.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18720k;
                }

                /* renamed from: v */
                public static /* synthetic */ int m14925v(GraphChange graphChange, int i10) {
                    int i11 = i10 | graphChange.f18808c;
                    graphChange.f18808c = i11;
                    return i11;
                }

                /* renamed from: z */
                public static GraphChange m14927z() {
                    return f18806m;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public GraphChange getDefaultInstanceForType() {
                    return f18806m;
                }

                /* renamed from: C */
                public String m14929C() {
                    Object obj = this.f18816k;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18816k = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: D */
                public int m14930D() {
                    return this.f18810e;
                }

                /* renamed from: E */
                public String m14931E() {
                    Object obj = this.f18809d;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18809d = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: F */
                public EzyRectF.RectF m14932F() {
                    EzyRectF.RectF rectF = this.f18811f;
                    return rectF == null ? EzyRectF.RectF.m15792f() : rectF;
                }

                /* renamed from: G */
                public EzyPaint.Paint m14933G() {
                    EzyPaint.Paint paint = this.f18813h;
                    return paint == null ? EzyPaint.Paint.m15718k() : paint;
                }

                /* renamed from: H */
                public EzyMatrix.Matrix m14934H() {
                    EzyMatrix.Matrix matrix = this.f18815j;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                /* renamed from: I */
                public boolean m14935I() {
                    return (this.f18808c & 2) != 0;
                }

                /* renamed from: J */
                public boolean m14936J() {
                    return (this.f18808c & 4) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: L, reason: merged with bridge method [inline-methods] */
                public C8460b newBuilderForType() {
                    return m14908K();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: M, reason: merged with bridge method [inline-methods] */
                public C8460b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8460b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: P, reason: merged with bridge method [inline-methods] */
                public C8460b toBuilder() {
                    return this == f18806m ? new C8460b() : new C8460b().m14975x(this);
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
                    if (!m14931E().equals(graphChange.m14931E()) || this.f18810e != graphChange.f18810e || hasOutRect() != graphChange.hasOutRect()) {
                        return false;
                    }
                    if ((hasOutRect() && !m14932F().equals(graphChange.m14932F())) || !getContent().equals(graphChange.getContent()) || m14935I() != graphChange.m14935I()) {
                        return false;
                    }
                    if ((!m14935I() || m14933G().equals(graphChange.m14933G())) && getPointsList().equals(graphChange.getPointsList()) && m14936J() == graphChange.m14936J()) {
                        return (!m14936J() || m14934H().equals(graphChange.m14934H())) && m14929C().equals(graphChange.m14929C()) && getUnknownFields().equals(graphChange.getUnknownFields());
                    }
                    return false;
                }

                public String getContent() {
                    Object obj = this.f18812g;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18812g = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18807n;
                }

                public int getPointsCount() {
                    return this.f18814i.size();
                }

                public List getPointsList() {
                    return this.f18814i;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f18809d) ? GeneratedMessage.computeStringSize(1, this.f18809d) : 0;
                    if (this.f18810e != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f18810e);
                    }
                    if ((1 & this.f18808c) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(3, m14932F());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18812g)) {
                        iComputeStringSize += GeneratedMessage.computeStringSize(4, this.f18812g);
                    }
                    if ((this.f18808c & 2) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(5, m14933G());
                    }
                    for (int i11 = 0; i11 < this.f18814i.size(); i11++) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f18814i.get(i11));
                    }
                    if ((this.f18808c & 4) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(7, m14934H());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18816k)) {
                        iComputeStringSize += GeneratedMessage.computeStringSize(8, this.f18816k);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f18808c & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m14931E().hashCode()) * 37) + 2) * 53) + this.f18810e;
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m14932F().hashCode();
                    }
                    int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getContent().hashCode();
                    if (m14935I()) {
                        iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + m14933G().hashCode();
                    }
                    if (getPointsCount() > 0) {
                        iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getPointsList().hashCode();
                    }
                    if (m14936J()) {
                        iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + m14934H().hashCode();
                    }
                    int iHashCode3 = (((((iHashCode2 * 37) + 8) * 53) + m14929C().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18721l.ensureFieldAccessorsInitialized(GraphChange.class, C8460b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18817l;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18817l = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphChange();
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (!GeneratedMessage.isStringEmpty(this.f18809d)) {
                        GeneratedMessage.writeString(codedOutputStream, 1, this.f18809d);
                    }
                    if (this.f18810e != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(2, this.f18810e);
                    }
                    if ((this.f18808c & 1) != 0) {
                        codedOutputStream.writeMessage(3, m14932F());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18812g)) {
                        GeneratedMessage.writeString(codedOutputStream, 4, this.f18812g);
                    }
                    if ((this.f18808c & 2) != 0) {
                        codedOutputStream.writeMessage(5, m14933G());
                    }
                    for (int i10 = 0; i10 < this.f18814i.size(); i10++) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.f18814i.get(i10));
                    }
                    if ((this.f18808c & 4) != 0) {
                        codedOutputStream.writeMessage(7, m14934H());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18816k)) {
                        GeneratedMessage.writeString(codedOutputStream, 8, this.f18816k);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$b */
                public static final class C8460b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18818c;

                    /* renamed from: d */
                    public Object f18819d;

                    /* renamed from: e */
                    public int f18820e;

                    /* renamed from: f */
                    public EzyRectF.RectF f18821f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f18822g;

                    /* renamed from: h */
                    public Object f18823h;

                    /* renamed from: i */
                    public EzyPaint.Paint f18824i;

                    /* renamed from: j */
                    public SingleFieldBuilderV3 f18825j;

                    /* renamed from: k */
                    public List f18826k;

                    /* renamed from: l */
                    public RepeatedFieldBuilderV3 f18827l;

                    /* renamed from: m */
                    public EzyMatrix.Matrix f18828m;

                    /* renamed from: n */
                    public SingleFieldBuilderV3 f18829n;

                    /* renamed from: o */
                    public Object f18830o;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                            m14969r();
                            getPointsFieldBuilder();
                            m14972u();
                        }
                    }

                    /* renamed from: A */
                    public C8460b m14941A(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18829n;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18818c & 64) == 0 || (matrix2 = this.f18828m) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18828m = matrix;
                        } else {
                            m14971t().m15492n(matrix);
                        }
                        if (this.f18828m != null) {
                            this.f18818c |= 64;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public final C8460b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8460b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: C */
                    public C8460b m14943C(String str) {
                        str.getClass();
                        this.f18823h = str;
                        this.f18818c |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C8460b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8460b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: E */
                    public C8460b m14945E(String str) {
                        str.getClass();
                        this.f18830o = str;
                        this.f18818c |= 128;
                        onChanged();
                        return this;
                    }

                    /* renamed from: F */
                    public C8460b m14946F(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f18818c |= 2;
                        this.f18820e = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: G */
                    public C8460b m14947G(int i10) {
                        this.f18820e = i10;
                        this.f18818c |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: H */
                    public C8460b m14948H(String str) {
                        str.getClass();
                        this.f18819d = str;
                        this.f18818c |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: I */
                    public C8460b m14949I(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18822g;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f18821f = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f18818c |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: J */
                    public C8460b m14950J(EzyPaint.Paint paint) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18825j;
                        if (singleFieldBuilderV3 == null) {
                            paint.getClass();
                            this.f18824i = paint;
                        } else {
                            singleFieldBuilderV3.setMessage(paint);
                        }
                        this.f18818c |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: K */
                    public C8460b m14951K(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18829n;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f18828m = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f18818c |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: L, reason: merged with bridge method [inline-methods] */
                    public C8460b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8460b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final C8460b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8460b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: b */
                    public C8460b m14954b(EzyPointF.PointF pointF) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18827l;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(pointF);
                            return this;
                        }
                        pointF.getClass();
                        ensurePointsIsMutable();
                        this.f18826k.add(pointF);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public C8460b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8460b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if ((this.f18818c & 32) == 0) {
                            this.f18826k = new ArrayList(this.f18826k);
                            this.f18818c |= 32;
                        }
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public GraphChange buildPartial() {
                        GraphChange graphChange = new GraphChange(this);
                        m14959h(graphChange);
                        if (this.f18818c != 0) {
                            m14958g(graphChange);
                        }
                        onBuilt();
                        return graphChange;
                    }

                    /* renamed from: g */
                    public final void m14958g(GraphChange graphChange) {
                        int i10;
                        int i11 = this.f18818c;
                        if ((i11 & 1) != 0) {
                            graphChange.f18809d = this.f18819d;
                        }
                        if ((i11 & 2) != 0) {
                            graphChange.f18810e = this.f18820e;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18822g;
                            graphChange.f18811f = singleFieldBuilderV3 == null ? this.f18821f : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            graphChange.f18812g = this.f18823h;
                        }
                        if ((i11 & 16) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18825j;
                            graphChange.f18813h = singleFieldBuilderV32 == null ? this.f18824i : (EzyPaint.Paint) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 64) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f18829n;
                            graphChange.f18815j = singleFieldBuilderV33 == null ? this.f18828m : (EzyMatrix.Matrix) singleFieldBuilderV33.build();
                            i10 |= 4;
                        }
                        if ((i11 & 128) != 0) {
                            graphChange.f18816k = this.f18830o;
                        }
                        GraphChange.m14925v(graphChange, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18720k;
                    }

                    public final SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f18822g == null) {
                            this.f18822g = new SingleFieldBuilderV3(m14965n(), getParentForChildren(), isClean());
                            this.f18821f = null;
                        }
                        return this.f18822g;
                    }

                    public final RepeatedFieldBuilderV3 getPointsFieldBuilder() {
                        if (this.f18827l == null) {
                            this.f18827l = new RepeatedFieldBuilderV3(this.f18826k, (this.f18818c & 32) != 0, getParentForChildren(), isClean());
                            this.f18826k = null;
                        }
                        return this.f18827l;
                    }

                    /* renamed from: h */
                    public final void m14959h(GraphChange graphChange) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18827l;
                        if (repeatedFieldBuilderV3 != null) {
                            graphChange.f18814i = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f18818c & 32) != 0) {
                            this.f18826k = Collections.unmodifiableList(this.f18826k);
                            this.f18818c &= -33;
                        }
                        graphChange.f18814i = this.f18826k;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8460b clear() {
                        super.clear();
                        this.f18818c = 0;
                        this.f18819d = "";
                        this.f18820e = 0;
                        this.f18821f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18822g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18822g = null;
                        }
                        this.f18823h = "";
                        this.f18824i = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18825j;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f18825j = null;
                        }
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18827l;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f18826k = Collections.EMPTY_LIST;
                        } else {
                            this.f18826k = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f18818c &= -33;
                        this.f18828m = null;
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f18829n;
                        if (singleFieldBuilderV33 != null) {
                            singleFieldBuilderV33.dispose();
                            this.f18829n = null;
                        }
                        this.f18830o = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18721l.ensureFieldAccessorsInitialized(GraphChange.class, C8460b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8460b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8460b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C8460b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8460b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C8460b mo33979clone() {
                        return (C8460b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public GraphChange getDefaultInstanceForType() {
                        return GraphChange.m14927z();
                    }

                    /* renamed from: n */
                    public EzyRectF.RectF m14965n() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18822g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f18821f;
                        return rectF == null ? EzyRectF.RectF.m15792f() : rectF;
                    }

                    /* renamed from: o */
                    public EzyRectF.RectF.C8508b m14966o() {
                        this.f18818c |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C8508b) getOutRectFieldBuilder().getBuilder();
                    }

                    /* renamed from: p */
                    public EzyPaint.Paint m14967p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18825j;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                        }
                        EzyPaint.Paint paint = this.f18824i;
                        return paint == null ? EzyPaint.Paint.m15718k() : paint;
                    }

                    /* renamed from: q */
                    public EzyPaint.Paint.C8501b m14968q() {
                        this.f18818c |= 16;
                        onChanged();
                        return (EzyPaint.Paint.C8501b) m14969r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m14969r() {
                        if (this.f18825j == null) {
                            this.f18825j = new SingleFieldBuilderV3(m14967p(), getParentForChildren(), isClean());
                            this.f18824i = null;
                        }
                        return this.f18825j;
                    }

                    /* renamed from: s */
                    public EzyMatrix.Matrix m14970s() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18829n;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18828m;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix.C8487b m14971t() {
                        this.f18818c |= 64;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m14972u().getBuilder();
                    }

                    /* renamed from: u */
                    public final SingleFieldBuilderV3 m14972u() {
                        if (this.f18829n == null) {
                            this.f18829n = new SingleFieldBuilderV3(m14970s(), getParentForChildren(), isClean());
                            this.f18828m = null;
                        }
                        return this.f18829n;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C8460b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f18819d = codedInputStream.readStringRequireUtf8();
                                            this.f18818c |= 1;
                                        } else if (tag == 16) {
                                            this.f18820e = codedInputStream.readEnum();
                                            this.f18818c |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f18818c |= 4;
                                        } else if (tag == 34) {
                                            this.f18823h = codedInputStream.readStringRequireUtf8();
                                            this.f18818c |= 8;
                                        } else if (tag == 42) {
                                            codedInputStream.readMessage(m14969r().getBuilder(), extensionRegistryLite);
                                            this.f18818c |= 16;
                                        } else if (tag == 50) {
                                            EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18827l;
                                            if (repeatedFieldBuilderV3 == null) {
                                                ensurePointsIsMutable();
                                                this.f18826k.add(pointF);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(pointF);
                                            }
                                        } else if (tag == 58) {
                                            codedInputStream.readMessage(m14972u().getBuilder(), extensionRegistryLite);
                                            this.f18818c |= 64;
                                        } else if (tag == 66) {
                                            this.f18830o = codedInputStream.readStringRequireUtf8();
                                            this.f18818c |= 128;
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
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C8460b mergeFrom(Message message) {
                        if (message instanceof GraphChange) {
                            return m14975x((GraphChange) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: x */
                    public C8460b m14975x(GraphChange graphChange) {
                        if (graphChange == GraphChange.m14927z()) {
                            return this;
                        }
                        if (!graphChange.m14931E().isEmpty()) {
                            this.f18819d = graphChange.f18809d;
                            this.f18818c |= 1;
                            onChanged();
                        }
                        if (graphChange.f18810e != 0) {
                            m14947G(graphChange.m14930D());
                        }
                        if (graphChange.hasOutRect()) {
                            m14976y(graphChange.m14932F());
                        }
                        if (!graphChange.getContent().isEmpty()) {
                            this.f18823h = graphChange.f18812g;
                            this.f18818c |= 8;
                            onChanged();
                        }
                        if (graphChange.m14935I()) {
                            m14977z(graphChange.m14933G());
                        }
                        if (this.f18827l == null) {
                            if (!graphChange.f18814i.isEmpty()) {
                                if (this.f18826k.isEmpty()) {
                                    this.f18826k = graphChange.f18814i;
                                    this.f18818c &= -33;
                                } else {
                                    ensurePointsIsMutable();
                                    this.f18826k.addAll(graphChange.f18814i);
                                }
                                onChanged();
                            }
                        } else if (!graphChange.f18814i.isEmpty()) {
                            if (this.f18827l.isEmpty()) {
                                this.f18827l.dispose();
                                this.f18827l = null;
                                this.f18826k = graphChange.f18814i;
                                this.f18818c &= -33;
                                this.f18827l = GeneratedMessage.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                            } else {
                                this.f18827l.addAllMessages(graphChange.f18814i);
                            }
                        }
                        if (graphChange.m14936J()) {
                            m14941A(graphChange.m14934H());
                        }
                        if (!graphChange.m14929C().isEmpty()) {
                            this.f18830o = graphChange.f18816k;
                            this.f18818c |= 128;
                            onChanged();
                        }
                        mergeUnknownFields(graphChange.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: y */
                    public C8460b m14976y(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18822g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f18818c & 4) == 0 || (rectF2 = this.f18821f) == null || rectF2 == EzyRectF.RectF.m15792f()) {
                            this.f18821f = rectF;
                        } else {
                            m14966o().m15810n(rectF);
                        }
                        if (this.f18821f != null) {
                            this.f18818c |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: z */
                    public C8460b m14977z(EzyPaint.Paint paint) {
                        EzyPaint.Paint paint2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18825j;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(paint);
                        } else if ((this.f18818c & 16) == 0 || (paint2 = this.f18824i) == null || paint2 == EzyPaint.Paint.m15718k()) {
                            this.f18824i = paint;
                        } else {
                            m14968q().m15740n(paint);
                        }
                        if (this.f18824i != null) {
                            this.f18818c |= 16;
                            onChanged();
                        }
                        return this;
                    }

                    public C8460b() {
                        this.f18819d = "";
                        this.f18820e = 0;
                        this.f18823h = "";
                        this.f18826k = Collections.EMPTY_LIST;
                        this.f18830o = "";
                        maybeForceBuilderInitialization();
                    }

                    public C8460b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18819d = "";
                        this.f18820e = 0;
                        this.f18823h = "";
                        this.f18826k = Collections.EMPTY_LIST;
                        this.f18830o = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphChange(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18809d = "";
                    this.f18810e = 0;
                    this.f18812g = "";
                    this.f18816k = "";
                    this.f18817l = (byte) -1;
                }

                private GraphChange() {
                    this.f18809d = "";
                    this.f18810e = 0;
                    this.f18812g = "";
                    this.f18816k = "";
                    this.f18817l = (byte) -1;
                    this.f18809d = "";
                    this.f18810e = 0;
                    this.f18812g = "";
                    this.f18814i = Collections.EMPTY_LIST;
                    this.f18816k = "";
                }
            }

            public static final class GraphData extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: l */
                public static final GraphData f18831l = new GraphData();

                /* renamed from: m */
                public static final Parser f18832m = new C8461a();

                /* renamed from: c */
                public int f18833c;

                /* renamed from: d */
                public int f18834d;

                /* renamed from: e */
                public volatile Object f18835e;

                /* renamed from: f */
                public EzyRectF.RectF f18836f;

                /* renamed from: g */
                public volatile Object f18837g;

                /* renamed from: h */
                public volatile Object f18838h;

                /* renamed from: i */
                public int f18839i;

                /* renamed from: j */
                public volatile Object f18840j;

                /* renamed from: k */
                public byte f18841k;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$a */
                public class C8461a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8462b c8462bM14978I = GraphData.m14978I();
                        try {
                            c8462bM14978I.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8462bM14978I.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8462bM14978I.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8462bM14978I.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8462bM14978I.buildPartial());
                        }
                    }
                }

                /* renamed from: I */
                public static C8462b m14978I() {
                    return f18831l.toBuilder();
                }

                /* renamed from: L */
                public static GraphData m14979L(ByteString byteString) {
                    return (GraphData) f18832m.parseFrom(byteString);
                }

                /* renamed from: M */
                public static GraphData m14980M(byte[] bArr) {
                    return (GraphData) f18832m.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18714e;
                }

                public static Parser parser() {
                    return f18832m;
                }

                /* renamed from: t */
                public static /* synthetic */ int m14993t(GraphData graphData, int i10) {
                    int i11 = i10 | graphData.f18833c;
                    graphData.f18833c = i11;
                    return i11;
                }

                /* renamed from: v */
                public static GraphData m14995v() {
                    return f18831l;
                }

                /* renamed from: A */
                public EzyGraphEnum.GraphEnum m14996A() {
                    EzyGraphEnum.GraphEnum graphEnumM15226a = EzyGraphEnum.GraphEnum.m15226a(this.f18834d);
                    return graphEnumM15226a == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM15226a;
                }

                /* renamed from: C */
                public int m14997C() {
                    return this.f18834d;
                }

                /* renamed from: D */
                public String m14998D() {
                    Object obj = this.f18835e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18835e = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: E */
                public EzyRectF.RectF m14999E() {
                    EzyRectF.RectF rectF = this.f18836f;
                    return rectF == null ? EzyRectF.RectF.m15792f() : rectF;
                }

                /* renamed from: F */
                public String m15000F() {
                    Object obj = this.f18837g;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18837g = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: G */
                public String m15001G() {
                    Object obj = this.f18838h;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18838h = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: H */
                public int m15002H() {
                    return this.f18839i;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: J, reason: merged with bridge method [inline-methods] */
                public C8462b newBuilderForType() {
                    return m14978I();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: K, reason: merged with bridge method [inline-methods] */
                public C8462b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8462b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: N, reason: merged with bridge method [inline-methods] */
                public C8462b toBuilder() {
                    return this == f18831l ? new C8462b() : new C8462b().m15027q(this);
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
                    if (this.f18834d == graphData.f18834d && m14998D().equals(graphData.m14998D()) && hasOutRect() == graphData.hasOutRect()) {
                        return (!hasOutRect() || m14999E().equals(graphData.m14999E())) && m15000F().equals(graphData.m15000F()) && m15001G().equals(graphData.m15001G()) && m15002H() == graphData.m15002H() && m15007z().equals(graphData.m15007z()) && getUnknownFields().equals(graphData.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18832m;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeEnumSize = this.f18834d != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f18834d) : 0;
                    if (!GeneratedMessage.isStringEmpty(this.f18835e)) {
                        iComputeEnumSize += GeneratedMessage.computeStringSize(2, this.f18835e);
                    }
                    if ((this.f18833c & 1) != 0) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m14999E());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18837g)) {
                        iComputeEnumSize += GeneratedMessage.computeStringSize(4, this.f18837g);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18838h)) {
                        iComputeEnumSize += GeneratedMessage.computeStringSize(5, this.f18838h);
                    }
                    int i11 = this.f18839i;
                    if (i11 != 0) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, i11);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18840j)) {
                        iComputeEnumSize += GeneratedMessage.computeStringSize(7, this.f18840j);
                    }
                    int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f18833c & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f18834d) * 37) + 2) * 53) + m14998D().hashCode();
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m14999E().hashCode();
                    }
                    int iHashCode2 = (((((((((((((((((iHashCode * 37) + 4) * 53) + m15000F().hashCode()) * 37) + 5) * 53) + m15001G().hashCode()) * 37) + 6) * 53) + m15002H()) * 37) + 7) * 53) + m15007z().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18715f.ensureFieldAccessorsInitialized(GraphData.class, C8462b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18841k;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18841k = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphData();
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if (this.f18834d != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(1, this.f18834d);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18835e)) {
                        GeneratedMessage.writeString(codedOutputStream, 2, this.f18835e);
                    }
                    if ((this.f18833c & 1) != 0) {
                        codedOutputStream.writeMessage(3, m14999E());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18837g)) {
                        GeneratedMessage.writeString(codedOutputStream, 4, this.f18837g);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18838h)) {
                        GeneratedMessage.writeString(codedOutputStream, 5, this.f18838h);
                    }
                    int i10 = this.f18839i;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(6, i10);
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18840j)) {
                        GeneratedMessage.writeString(codedOutputStream, 7, this.f18840j);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public GraphData getDefaultInstanceForType() {
                    return f18831l;
                }

                /* renamed from: z */
                public String m15007z() {
                    Object obj = this.f18840j;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18840j = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$b */
                public static final class C8462b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18842c;

                    /* renamed from: d */
                    public int f18843d;

                    /* renamed from: e */
                    public Object f18844e;

                    /* renamed from: f */
                    public EzyRectF.RectF f18845f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f18846g;

                    /* renamed from: h */
                    public Object f18847h;

                    /* renamed from: i */
                    public Object f18848i;

                    /* renamed from: j */
                    public int f18849j;

                    /* renamed from: k */
                    public Object f18850k;

                    private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f18846g == null) {
                            this.f18846g = new SingleFieldBuilderV3(m15023m(), getParentForChildren(), isClean());
                            this.f18845f = null;
                        }
                        return this.f18846g;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public C8462b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8462b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: B */
                    public C8462b m15010B(String str) {
                        str.getClass();
                        this.f18848i = str;
                        this.f18842c |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: C */
                    public C8462b m15011C(int i10) {
                        this.f18849j = i10;
                        this.f18842c |= 32;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public final C8462b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8462b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8462b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8462b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18842c != 0) {
                            m15016f(graphData);
                        }
                        onBuilt();
                        return graphData;
                    }

                    /* renamed from: f */
                    public final void m15016f(GraphData graphData) {
                        int i10;
                        int i11 = this.f18842c;
                        if ((i11 & 1) != 0) {
                            graphData.f18834d = this.f18843d;
                        }
                        if ((i11 & 2) != 0) {
                            graphData.f18835e = this.f18844e;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18846g;
                            graphData.f18836f = singleFieldBuilderV3 == null ? this.f18845f : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            graphData.f18837g = this.f18847h;
                        }
                        if ((i11 & 16) != 0) {
                            graphData.f18838h = this.f18848i;
                        }
                        if ((i11 & 32) != 0) {
                            graphData.f18839i = this.f18849j;
                        }
                        if ((i11 & 64) != 0) {
                            graphData.f18840j = this.f18850k;
                        }
                        GraphData.m14993t(graphData, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8462b clear() {
                        super.clear();
                        this.f18842c = 0;
                        this.f18843d = 0;
                        this.f18844e = "";
                        this.f18845f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18846g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18846g = null;
                        }
                        this.f18847h = "";
                        this.f18848i = "";
                        this.f18849j = 0;
                        this.f18850k = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18714e;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8462b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8462b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8462b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8462b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18715f.ensureFieldAccessorsInitialized(GraphData.class, C8462b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8462b mo33979clone() {
                        return (C8462b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public GraphData getDefaultInstanceForType() {
                        return GraphData.m14995v();
                    }

                    /* renamed from: l */
                    public String m15022l() {
                        Object obj = this.f18850k;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.f18850k = stringUtf8;
                        return stringUtf8;
                    }

                    /* renamed from: m */
                    public EzyRectF.RectF m15023m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18846g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f18845f;
                        return rectF == null ? EzyRectF.RectF.m15792f() : rectF;
                    }

                    /* renamed from: n */
                    public EzyRectF.RectF.C8508b m15024n() {
                        this.f18842c |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C8508b) getOutRectFieldBuilder().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: o, reason: merged with bridge method [inline-methods] */
                    public C8462b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f18843d = codedInputStream.readEnum();
                                            this.f18842c |= 1;
                                        } else if (tag == 18) {
                                            this.f18844e = codedInputStream.readStringRequireUtf8();
                                            this.f18842c |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f18842c |= 4;
                                        } else if (tag == 34) {
                                            this.f18847h = codedInputStream.readStringRequireUtf8();
                                            this.f18842c |= 8;
                                        } else if (tag == 42) {
                                            this.f18848i = codedInputStream.readStringRequireUtf8();
                                            this.f18842c |= 16;
                                        } else if (tag == 48) {
                                            this.f18849j = codedInputStream.readInt32();
                                            this.f18842c |= 32;
                                        } else if (tag == 58) {
                                            this.f18850k = codedInputStream.readStringRequireUtf8();
                                            this.f18842c |= 64;
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
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public C8462b mergeFrom(Message message) {
                        if (message instanceof GraphData) {
                            return m15027q((GraphData) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: q */
                    public C8462b m15027q(GraphData graphData) {
                        if (graphData == GraphData.m14995v()) {
                            return this;
                        }
                        if (graphData.f18834d != 0) {
                            m15033w(graphData.m14997C());
                        }
                        if (!graphData.m14998D().isEmpty()) {
                            this.f18844e = graphData.f18835e;
                            this.f18842c |= 2;
                            onChanged();
                        }
                        if (graphData.hasOutRect()) {
                            m15028r(graphData.m14999E());
                        }
                        if (!graphData.m15000F().isEmpty()) {
                            this.f18847h = graphData.f18837g;
                            this.f18842c |= 8;
                            onChanged();
                        }
                        if (!graphData.m15001G().isEmpty()) {
                            this.f18848i = graphData.f18838h;
                            this.f18842c |= 16;
                            onChanged();
                        }
                        if (graphData.m15002H() != 0) {
                            m15011C(graphData.m15002H());
                        }
                        if (!graphData.m15007z().isEmpty()) {
                            this.f18850k = graphData.f18840j;
                            this.f18842c |= 64;
                            onChanged();
                        }
                        mergeUnknownFields(graphData.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: r */
                    public C8462b m15028r(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18846g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f18842c & 4) == 0 || (rectF2 = this.f18845f) == null || rectF2 == EzyRectF.RectF.m15792f()) {
                            this.f18845f = rectF;
                        } else {
                            m15024n().m15810n(rectF);
                        }
                        if (this.f18845f != null) {
                            this.f18842c |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final C8462b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8462b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: t */
                    public C8462b m15030t(String str) {
                        str.getClass();
                        this.f18850k = str;
                        this.f18842c |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public C8462b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8462b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: v */
                    public C8462b m15032v(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f18842c |= 1;
                        this.f18843d = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: w */
                    public C8462b m15033w(int i10) {
                        this.f18843d = i10;
                        this.f18842c |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: x */
                    public C8462b m15034x(String str) {
                        str.getClass();
                        this.f18844e = str;
                        this.f18842c |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: y */
                    public C8462b m15035y(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18846g;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f18845f = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f18842c |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C8462b m15036z(String str) {
                        str.getClass();
                        this.f18847h = str;
                        this.f18842c |= 8;
                        onChanged();
                        return this;
                    }

                    public C8462b() {
                        this.f18843d = 0;
                        this.f18844e = "";
                        this.f18847h = "";
                        this.f18848i = "";
                        this.f18850k = "";
                        maybeForceBuilderInitialization();
                    }

                    public C8462b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18843d = 0;
                        this.f18844e = "";
                        this.f18847h = "";
                        this.f18848i = "";
                        this.f18850k = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphData(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18834d = 0;
                    this.f18835e = "";
                    this.f18837g = "";
                    this.f18838h = "";
                    this.f18839i = 0;
                    this.f18840j = "";
                    this.f18841k = (byte) -1;
                }

                private GraphData() {
                    this.f18834d = 0;
                    this.f18835e = "";
                    this.f18837g = "";
                    this.f18838h = "";
                    this.f18839i = 0;
                    this.f18840j = "";
                    this.f18841k = (byte) -1;
                    this.f18834d = 0;
                    this.f18835e = "";
                    this.f18837g = "";
                    this.f18838h = "";
                    this.f18840j = "";
                }
            }

            public static final class GraphMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: j */
                public static final GraphMatrix f18851j = new GraphMatrix();

                /* renamed from: k */
                public static final Parser f18852k = new C8463a();

                /* renamed from: c */
                public int f18853c;

                /* renamed from: d */
                public List f18854d;

                /* renamed from: e */
                public EzyMatrix.Matrix f18855e;

                /* renamed from: f */
                public EzyMatrix.Matrix f18856f;

                /* renamed from: g */
                public volatile Object f18857g;

                /* renamed from: h */
                public int f18858h;

                /* renamed from: i */
                public byte f18859i;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$a */
                public class C8463a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8464b c8464bM15037E = GraphMatrix.m15037E();
                        try {
                            c8464bM15037E.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8464bM15037E.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8464bM15037E.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8464bM15037E.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8464bM15037E.buildPartial());
                        }
                    }
                }

                /* renamed from: E */
                public static C8464b m15037E() {
                    return f18851j.toBuilder();
                }

                /* renamed from: H */
                public static GraphMatrix m15038H(ByteString byteString) {
                    return (GraphMatrix) f18852k.parseFrom(byteString);
                }

                /* renamed from: I */
                public static GraphMatrix m15039I(byte[] bArr) {
                    return (GraphMatrix) f18852k.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18718i;
                }

                /* renamed from: n */
                public static /* synthetic */ int m15048n(GraphMatrix graphMatrix, int i10) {
                    int i11 = i10 | graphMatrix.f18853c;
                    graphMatrix.f18853c = i11;
                    return i11;
                }

                /* renamed from: p */
                public static GraphMatrix m15050p() {
                    return f18851j;
                }

                /* renamed from: A */
                public int m15051A() {
                    return this.f18858h;
                }

                /* renamed from: C */
                public boolean m15052C() {
                    return (this.f18853c & 2) != 0;
                }

                /* renamed from: D */
                public boolean m15053D() {
                    return (this.f18853c & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public C8464b newBuilderForType() {
                    return m15037E();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: G, reason: merged with bridge method [inline-methods] */
                public C8464b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8464b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: J, reason: merged with bridge method [inline-methods] */
                public C8464b toBuilder() {
                    return this == f18851j ? new C8464b() : new C8464b().m15091x(this);
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
                    if (!m15059u().equals(graphMatrix.m15059u()) || m15053D() != graphMatrix.m15053D()) {
                        return false;
                    }
                    if ((!m15053D() || m15061y().equals(graphMatrix.m15061y())) && m15052C() == graphMatrix.m15052C()) {
                        return (!m15052C() || m15060v().equals(graphMatrix.m15060v())) && m15062z().equals(graphMatrix.m15062z()) && m15051A() == graphMatrix.m15051A() && getUnknownFields().equals(graphMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18852k;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeInt32Size = 0;
                    for (int i11 = 0; i11 < this.f18854d.size(); i11++) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f18854d.get(i11));
                    }
                    if ((this.f18853c & 1) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(2, m15061y());
                    }
                    if ((this.f18853c & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m15060v());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18857g)) {
                        iComputeInt32Size += GeneratedMessage.computeStringSize(4, this.f18857g);
                    }
                    int i12 = this.f18858h;
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
                    if (m15058t() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m15059u().hashCode();
                    }
                    if (m15053D()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m15061y().hashCode();
                    }
                    if (m15052C()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m15060v().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 4) * 53) + m15062z().hashCode()) * 37) + 5) * 53) + m15051A()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18719j.ensureFieldAccessorsInitialized(GraphMatrix.class, C8464b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18859i;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18859i = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphMatrix();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public GraphMatrix getDefaultInstanceForType() {
                    return f18851j;
                }

                /* renamed from: t */
                public int m15058t() {
                    return this.f18854d.size();
                }

                /* renamed from: u */
                public List m15059u() {
                    return this.f18854d;
                }

                /* renamed from: v */
                public EzyMatrix.Matrix m15060v() {
                    EzyMatrix.Matrix matrix = this.f18856f;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    for (int i10 = 0; i10 < this.f18854d.size(); i10++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f18854d.get(i10));
                    }
                    if ((this.f18853c & 1) != 0) {
                        codedOutputStream.writeMessage(2, m15061y());
                    }
                    if ((this.f18853c & 2) != 0) {
                        codedOutputStream.writeMessage(3, m15060v());
                    }
                    if (!GeneratedMessage.isStringEmpty(this.f18857g)) {
                        GeneratedMessage.writeString(codedOutputStream, 4, this.f18857g);
                    }
                    int i11 = this.f18858h;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(5, i11);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: y */
                public EzyMatrix.Matrix m15061y() {
                    EzyMatrix.Matrix matrix = this.f18855e;
                    return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                }

                /* renamed from: z */
                public String m15062z() {
                    Object obj = this.f18857g;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f18857g = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$b */
                public static final class C8464b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18860c;

                    /* renamed from: d */
                    public List f18861d;

                    /* renamed from: e */
                    public RepeatedFieldBuilderV3 f18862e;

                    /* renamed from: f */
                    public EzyMatrix.Matrix f18863f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f18864g;

                    /* renamed from: h */
                    public EzyMatrix.Matrix f18865h;

                    /* renamed from: i */
                    public SingleFieldBuilderV3 f18866i;

                    /* renamed from: j */
                    public Object f18867j;

                    /* renamed from: k */
                    public int f18868k;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            m15084o();
                            m15065u();
                            m15064r();
                        }
                    }

                    /* renamed from: r */
                    private SingleFieldBuilderV3 m15064r() {
                        if (this.f18866i == null) {
                            this.f18866i = new SingleFieldBuilderV3(m15085p(), getParentForChildren(), isClean());
                            this.f18865h = null;
                        }
                        return this.f18866i;
                    }

                    /* renamed from: u */
                    private SingleFieldBuilderV3 m15065u() {
                        if (this.f18864g == null) {
                            this.f18864g = new SingleFieldBuilderV3(m15087s(), getParentForChildren(), isClean());
                            this.f18863f = null;
                        }
                        return this.f18864g;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public final C8464b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8464b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C8464b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8464b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public C8464b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8464b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: D */
                    public C8464b m15069D(String str) {
                        str.getClass();
                        this.f18867j = str;
                        this.f18860c |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: E */
                    public C8464b m15070E(int i10) {
                        this.f18868k = i10;
                        this.f18860c |= 16;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: F, reason: merged with bridge method [inline-methods] */
                    public final C8464b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8464b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: b */
                    public C8464b m15072b(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18862e;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m15082m();
                        AbstractMessageLite.Builder.addAll(iterable, this.f18861d);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public C8464b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8464b) super.addRepeatedField(fieldDescriptor, obj);
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
                        m15077h(graphMatrix);
                        if (this.f18860c != 0) {
                            m15076g(graphMatrix);
                        }
                        onBuilt();
                        return graphMatrix;
                    }

                    /* renamed from: g */
                    public final void m15076g(GraphMatrix graphMatrix) {
                        int i10;
                        int i11 = this.f18860c;
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18864g;
                            graphMatrix.f18855e = singleFieldBuilderV3 == null ? this.f18863f : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18866i;
                            graphMatrix.f18856f = singleFieldBuilderV32 == null ? this.f18865h : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 8) != 0) {
                            graphMatrix.f18857g = this.f18867j;
                        }
                        if ((i11 & 16) != 0) {
                            graphMatrix.f18858h = this.f18868k;
                        }
                        GraphMatrix.m15048n(graphMatrix, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18718i;
                    }

                    /* renamed from: h */
                    public final void m15077h(GraphMatrix graphMatrix) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18862e;
                        if (repeatedFieldBuilderV3 != null) {
                            graphMatrix.f18854d = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f18860c & 1) != 0) {
                            this.f18861d = Collections.unmodifiableList(this.f18861d);
                            this.f18860c &= -2;
                        }
                        graphMatrix.f18854d = this.f18861d;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8464b clear() {
                        super.clear();
                        this.f18860c = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18862e;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f18861d = Collections.EMPTY_LIST;
                        } else {
                            this.f18861d = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f18860c &= -2;
                        this.f18863f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18864g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18864g = null;
                        }
                        this.f18865h = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18866i;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f18866i = null;
                        }
                        this.f18867j = "";
                        this.f18868k = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18719j.ensureFieldAccessorsInitialized(GraphMatrix.class, C8464b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8464b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8464b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C8464b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8464b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C8464b mo33979clone() {
                        return (C8464b) super.mo33979clone();
                    }

                    /* renamed from: m */
                    public final void m15082m() {
                        if ((this.f18860c & 1) == 0) {
                            this.f18861d = new ArrayList(this.f18861d);
                            this.f18860c |= 1;
                        }
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix getDefaultInstanceForType() {
                        return GraphMatrix.m15050p();
                    }

                    /* renamed from: o */
                    public final RepeatedFieldBuilderV3 m15084o() {
                        if (this.f18862e == null) {
                            this.f18862e = new RepeatedFieldBuilderV3(this.f18861d, (this.f18860c & 1) != 0, getParentForChildren(), isClean());
                            this.f18861d = null;
                        }
                        return this.f18862e;
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m15085p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18866i;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18865h;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C8487b m15086q() {
                        this.f18860c |= 4;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m15064r().getBuilder();
                    }

                    /* renamed from: s */
                    public EzyMatrix.Matrix m15087s() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18864g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f18863f;
                        return matrix == null ? EzyMatrix.Matrix.m15466p() : matrix;
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix.C8487b m15088t() {
                        this.f18860c |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C8487b) m15065u().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C8464b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18862e;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m15082m();
                                                this.f18861d.add(graphData);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(graphData);
                                            }
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m15065u().getBuilder(), extensionRegistryLite);
                                            this.f18860c |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m15064r().getBuilder(), extensionRegistryLite);
                                            this.f18860c |= 4;
                                        } else if (tag == 34) {
                                            this.f18867j = codedInputStream.readStringRequireUtf8();
                                            this.f18860c |= 8;
                                        } else if (tag == 40) {
                                            this.f18868k = codedInputStream.readInt32();
                                            this.f18860c |= 16;
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
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C8464b mergeFrom(Message message) {
                        if (message instanceof GraphMatrix) {
                            return m15091x((GraphMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: x */
                    public C8464b m15091x(GraphMatrix graphMatrix) {
                        if (graphMatrix == GraphMatrix.m15050p()) {
                            return this;
                        }
                        if (this.f18862e == null) {
                            if (!graphMatrix.f18854d.isEmpty()) {
                                if (this.f18861d.isEmpty()) {
                                    this.f18861d = graphMatrix.f18854d;
                                    this.f18860c &= -2;
                                } else {
                                    m15082m();
                                    this.f18861d.addAll(graphMatrix.f18854d);
                                }
                                onChanged();
                            }
                        } else if (!graphMatrix.f18854d.isEmpty()) {
                            if (this.f18862e.isEmpty()) {
                                this.f18862e.dispose();
                                this.f18862e = null;
                                this.f18861d = graphMatrix.f18854d;
                                this.f18860c &= -2;
                                this.f18862e = GeneratedMessage.alwaysUseFieldBuilders ? m15084o() : null;
                            } else {
                                this.f18862e.addAllMessages(graphMatrix.f18854d);
                            }
                        }
                        if (graphMatrix.m15053D()) {
                            m15093z(graphMatrix.m15061y());
                        }
                        if (graphMatrix.m15052C()) {
                            m15092y(graphMatrix.m15060v());
                        }
                        if (!graphMatrix.m15062z().isEmpty()) {
                            this.f18867j = graphMatrix.f18857g;
                            this.f18860c |= 8;
                            onChanged();
                        }
                        if (graphMatrix.m15051A() != 0) {
                            m15070E(graphMatrix.m15051A());
                        }
                        mergeUnknownFields(graphMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: y */
                    public C8464b m15092y(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18866i;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18860c & 4) == 0 || (matrix2 = this.f18865h) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18865h = matrix;
                        } else {
                            m15086q().m15492n(matrix);
                        }
                        if (this.f18865h != null) {
                            this.f18860c |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: z */
                    public C8464b m15093z(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18864g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f18860c & 2) == 0 || (matrix2 = this.f18863f) == null || matrix2 == EzyMatrix.Matrix.m15466p()) {
                            this.f18863f = matrix;
                        } else {
                            m15088t().m15492n(matrix);
                        }
                        if (this.f18863f != null) {
                            this.f18860c |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    public C8464b() {
                        this.f18861d = Collections.EMPTY_LIST;
                        this.f18867j = "";
                        maybeForceBuilderInitialization();
                    }

                    public C8464b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18861d = Collections.EMPTY_LIST;
                        this.f18867j = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18857g = "";
                    this.f18858h = 0;
                    this.f18859i = (byte) -1;
                }

                private GraphMatrix() {
                    this.f18857g = "";
                    this.f18858h = 0;
                    this.f18859i = (byte) -1;
                    this.f18854d = Collections.EMPTY_LIST;
                    this.f18857g = "";
                }
            }

            public static final class GraphRemove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final GraphRemove f18869e = new GraphRemove();

                /* renamed from: f */
                public static final Parser f18870f = new C8465a();

                /* renamed from: c */
                public List f18871c;

                /* renamed from: d */
                public byte f18872d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$a */
                public class C8465a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphRemove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8466b c8466bM15098m = GraphRemove.m15098m();
                        try {
                            c8466bM15098m.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8466bM15098m.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8466bM15098m.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8466bM15098m.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8466bM15098m.buildPartial());
                        }
                    }
                }

                /* renamed from: e */
                public static GraphRemove m15097e() {
                    return f18869e;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18716g;
                }

                /* renamed from: m */
                public static C8466b m15098m() {
                    return f18869e.toBuilder();
                }

                /* renamed from: p */
                public static GraphRemove m15099p(ByteString byteString) {
                    return (GraphRemove) f18870f.parseFrom(byteString);
                }

                /* renamed from: r */
                public static GraphRemove m15100r(byte[] bArr) {
                    return (GraphRemove) f18870f.parseFrom(bArr);
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
                    return m15103k().equals(graphRemove.m15103k()) && getUnknownFields().equals(graphRemove.getUnknownFields());
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public GraphRemove getDefaultInstanceForType() {
                    return f18869e;
                }

                /* renamed from: g */
                public int m15102g() {
                    return this.f18871c.size();
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18870f;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = 0;
                    for (int i11 = 0; i11 < this.f18871c.size(); i11++) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f18871c.get(i11));
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
                    if (m15102g() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m15103k().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18717h.ensureFieldAccessorsInitialized(GraphRemove.class, C8466b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18872d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18872d = (byte) 1;
                    return true;
                }

                /* renamed from: k */
                public List m15103k() {
                    return this.f18871c;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public C8466b newBuilderForType() {
                    return m15098m();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphRemove();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public C8466b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8466b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C8466b toBuilder() {
                    return this == f18869e ? new C8466b() : new C8466b().m15123r(this);
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    for (int i10 = 0; i10 < this.f18871c.size(); i10++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f18871c.get(i10));
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$b */
                public static final class C8466b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18873c;

                    /* renamed from: d */
                    public List f18874d;

                    /* renamed from: e */
                    public RepeatedFieldBuilderV3 f18875e;

                    /* renamed from: m */
                    private void m15108m() {
                        if ((this.f18873c & 1) == 0) {
                            this.f18874d = new ArrayList(this.f18874d);
                            this.f18873c |= 1;
                        }
                    }

                    /* renamed from: o */
                    private RepeatedFieldBuilderV3 m15109o() {
                        if (this.f18875e == null) {
                            this.f18875e = new RepeatedFieldBuilderV3(this.f18874d, (this.f18873c & 1) != 0, getParentForChildren(), isClean());
                            this.f18874d = null;
                        }
                        return this.f18875e;
                    }

                    /* renamed from: b */
                    public C8466b m15110b(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18875e;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m15108m();
                        AbstractMessageLite.Builder.addAll(iterable, this.f18874d);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public C8466b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8466b) super.addRepeatedField(fieldDescriptor, obj);
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
                        m15115h(graphRemove);
                        if (this.f18873c != 0) {
                            m15114g(graphRemove);
                        }
                        onBuilt();
                        return graphRemove;
                    }

                    /* renamed from: g */
                    public final void m15114g(GraphRemove graphRemove) {
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18716g;
                    }

                    /* renamed from: h */
                    public final void m15115h(GraphRemove graphRemove) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18875e;
                        if (repeatedFieldBuilderV3 != null) {
                            graphRemove.f18871c = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f18873c & 1) != 0) {
                            this.f18874d = Collections.unmodifiableList(this.f18874d);
                            this.f18873c &= -2;
                        }
                        graphRemove.f18871c = this.f18874d;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8466b clear() {
                        super.clear();
                        this.f18873c = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18875e;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f18874d = Collections.EMPTY_LIST;
                        } else {
                            this.f18874d = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f18873c &= -2;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18717h.ensureFieldAccessorsInitialized(GraphRemove.class, C8466b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8466b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8466b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C8466b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8466b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C8466b mo33979clone() {
                        return (C8466b) super.mo33979clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public GraphRemove getDefaultInstanceForType() {
                        return GraphRemove.m15097e();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public C8466b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18875e;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m15108m();
                                                this.f18874d.add(graphData);
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
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C8466b mergeFrom(Message message) {
                        if (message instanceof GraphRemove) {
                            return m15123r((GraphRemove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: r */
                    public C8466b m15123r(GraphRemove graphRemove) {
                        if (graphRemove == GraphRemove.m15097e()) {
                            return this;
                        }
                        if (this.f18875e == null) {
                            if (!graphRemove.f18871c.isEmpty()) {
                                if (this.f18874d.isEmpty()) {
                                    this.f18874d = graphRemove.f18871c;
                                    this.f18873c &= -2;
                                } else {
                                    m15108m();
                                    this.f18874d.addAll(graphRemove.f18871c);
                                }
                                onChanged();
                            }
                        } else if (!graphRemove.f18871c.isEmpty()) {
                            if (this.f18875e.isEmpty()) {
                                this.f18875e.dispose();
                                this.f18875e = null;
                                this.f18874d = graphRemove.f18871c;
                                this.f18873c &= -2;
                                this.f18875e = GeneratedMessage.alwaysUseFieldBuilders ? m15109o() : null;
                            } else {
                                this.f18875e.addAllMessages(graphRemove.f18871c);
                            }
                        }
                        mergeUnknownFields(graphRemove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public final C8466b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8466b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C8466b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8466b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public C8466b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8466b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public final C8466b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8466b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C8466b() {
                        this.f18874d = Collections.EMPTY_LIST;
                    }

                    public C8466b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f18874d = Collections.EMPTY_LIST;
                    }
                }

                public GraphRemove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18872d = (byte) -1;
                }

                private GraphRemove() {
                    this.f18872d = (byte) -1;
                    this.f18871c = Collections.EMPTY_LIST;
                }
            }

            public static final class REBUILD extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: h */
                public static final REBUILD f18876h = new REBUILD();

                /* renamed from: i */
                public static final Parser f18877i = new C8467a();

                /* renamed from: c */
                public int f18878c;

                /* renamed from: d */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot f18879d;

                /* renamed from: e */
                public int f18880e;

                /* renamed from: f */
                public EzyHeader.BackgroundLineConfig f18881f;

                /* renamed from: g */
                public byte f18882g;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$a */
                public class C8467a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public REBUILD parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C8468b c8468bM15134r = REBUILD.m15134r();
                        try {
                            c8468bM15134r.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c8468bM15134r.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c8468bM15134r.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8468bM15134r.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8468bM15134r.buildPartial());
                        }
                    }
                }

                /* renamed from: f */
                public static /* synthetic */ int m15132f(REBUILD rebuild, int i10) {
                    int i11 = i10 | rebuild.f18878c;
                    rebuild.f18878c = i11;
                    return i11;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f18732w;
                }

                /* renamed from: k */
                public static REBUILD m15133k() {
                    return f18876h;
                }

                /* renamed from: r */
                public static C8468b m15134r() {
                    return f18876h.toBuilder();
                }

                /* renamed from: v */
                public static REBUILD m15135v(ByteString byteString) {
                    return (REBUILD) f18877i.parseFrom(byteString);
                }

                /* renamed from: y */
                public static REBUILD m15136y(byte[] bArr) {
                    return (REBUILD) f18877i.parseFrom(bArr);
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
                    if (m15141p() != rebuild.m15141p()) {
                        return false;
                    }
                    if ((!m15141p() || m15139n().equals(rebuild.m15139n())) && getBackgroundColor() == rebuild.getBackgroundColor() && m15140o() == rebuild.m15140o()) {
                        return (!m15140o() || m15137g().equals(rebuild.m15137g())) && getUnknownFields().equals(rebuild.getUnknownFields());
                    }
                    return false;
                }

                /* renamed from: g */
                public EzyHeader.BackgroundLineConfig m15137g() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f18881f;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m15287g() : backgroundLineConfig;
                }

                public int getBackgroundColor() {
                    return this.f18880e;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f18877i;
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f18878c & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m15139n()) : 0;
                    int i11 = this.f18880e;
                    if (i11 != 0) {
                        iComputeMessageSize += CodedOutputStream.computeInt32Size(2, i11);
                    }
                    if ((this.f18878c & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(3, m15137g());
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
                    if (m15141p()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m15139n().hashCode();
                    }
                    int backgroundColor = (((iHashCode * 37) + 2) * 53) + getBackgroundColor();
                    if (m15140o()) {
                        backgroundColor = (((backgroundColor * 37) + 3) * 53) + m15137g().hashCode();
                    }
                    int iHashCode2 = (backgroundColor * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18733x.ensureFieldAccessorsInitialized(REBUILD.class, C8468b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f18882g;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f18882g = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public REBUILD getDefaultInstanceForType() {
                    return f18876h;
                }

                /* renamed from: n */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot m15139n() {
                    EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f18879d;
                    return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m15600G() : graphSnapshot;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new REBUILD();
                }

                /* renamed from: o */
                public boolean m15140o() {
                    return (this.f18878c & 2) != 0;
                }

                /* renamed from: p */
                public boolean m15141p() {
                    return (this.f18878c & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C8468b newBuilderForType() {
                    return m15134r();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C8468b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C8468b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) {
                    if ((this.f18878c & 1) != 0) {
                        codedOutputStream.writeMessage(1, m15139n());
                    }
                    int i10 = this.f18880e;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    if ((this.f18878c & 2) != 0) {
                        codedOutputStream.writeMessage(3, m15137g());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C8468b toBuilder() {
                    return this == f18876h ? new C8468b() : new C8468b().m15166u(this);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$b */
                public static final class C8468b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: c */
                    public int f18883c;

                    /* renamed from: d */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot f18884d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f18885e;

                    /* renamed from: f */
                    public int f18886f;

                    /* renamed from: g */
                    public EzyHeader.BackgroundLineConfig f18887g;

                    /* renamed from: h */
                    public SingleFieldBuilderV3 f18888h;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessage.alwaysUseFieldBuilders) {
                            m15162q();
                            m15158m();
                        }
                    }

                    /* renamed from: A */
                    public C8468b m15146A(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18885e;
                        if (singleFieldBuilderV3 == null) {
                            graphSnapshot.getClass();
                            this.f18884d = graphSnapshot;
                        } else {
                            singleFieldBuilderV3.setMessage(graphSnapshot);
                        }
                        this.f18883c |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public final C8468b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8468b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C8468b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8468b) super.addRepeatedField(fieldDescriptor, obj);
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
                        if (this.f18883c != 0) {
                            m15151f(rebuild);
                        }
                        onBuilt();
                        return rebuild;
                    }

                    /* renamed from: f */
                    public final void m15151f(REBUILD rebuild) {
                        int i10;
                        int i11 = this.f18883c;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18885e;
                            rebuild.f18879d = singleFieldBuilderV3 == null ? this.f18884d : (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            rebuild.f18880e = this.f18886f;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18888h;
                            rebuild.f18881f = singleFieldBuilderV32 == null ? this.f18887g : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        REBUILD.m15132f(rebuild, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C8468b clear() {
                        super.clear();
                        this.f18883c = 0;
                        this.f18884d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18885e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f18885e = null;
                        }
                        this.f18886f = 0;
                        this.f18887g = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f18888h;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f18888h = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f18732w;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C8468b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C8468b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C8468b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C8468b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f18733x.ensureFieldAccessorsInitialized(REBUILD.class, C8468b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: j, reason: merged with bridge method [inline-methods] */
                    public C8468b mo33979clone() {
                        return (C8468b) super.mo33979clone();
                    }

                    /* renamed from: k */
                    public EzyHeader.BackgroundLineConfig m15156k() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18888h;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f18887g;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m15287g() : backgroundLineConfig;
                    }

                    /* renamed from: l */
                    public EzyHeader.BackgroundLineConfig.C8480b m15157l() {
                        this.f18883c |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C8480b) m15158m().getBuilder();
                    }

                    /* renamed from: m */
                    public final SingleFieldBuilderV3 m15158m() {
                        if (this.f18888h == null) {
                            this.f18888h = new SingleFieldBuilderV3(m15156k(), getParentForChildren(), isClean());
                            this.f18887g = null;
                        }
                        return this.f18888h;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public REBUILD getDefaultInstanceForType() {
                        return REBUILD.m15133k();
                    }

                    /* renamed from: o */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m15160o() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18885e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.getMessage();
                        }
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f18884d;
                        return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m15600G() : graphSnapshot;
                    }

                    /* renamed from: p */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b m15161p() {
                        this.f18883c |= 1;
                        onChanged();
                        return (EzyPageSnapshot.PageSnapshot.GraphSnapshot.C8496b) m15162q().getBuilder();
                    }

                    /* renamed from: q */
                    public final SingleFieldBuilderV3 m15162q() {
                        if (this.f18885e == null) {
                            this.f18885e = new SingleFieldBuilderV3(m15160o(), getParentForChildren(), isClean());
                            this.f18884d = null;
                        }
                        return this.f18885e;
                    }

                    /* renamed from: r */
                    public C8468b m15163r(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18888h;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f18883c & 4) == 0 || (backgroundLineConfig2 = this.f18887g) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m15287g()) {
                            this.f18887g = backgroundLineConfig;
                        } else {
                            m15157l().m15310n(backgroundLineConfig);
                        }
                        if (this.f18887g != null) {
                            this.f18883c |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C8468b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z10 = false;
                        while (!z10) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m15162q().getBuilder(), extensionRegistryLite);
                                            this.f18883c |= 1;
                                        } else if (tag == 16) {
                                            this.f18886f = codedInputStream.readInt32();
                                            this.f18883c |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m15158m().getBuilder(), extensionRegistryLite);
                                            this.f18883c |= 4;
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
                    public C8468b mergeFrom(Message message) {
                        if (message instanceof REBUILD) {
                            return m15166u((REBUILD) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C8468b m15166u(REBUILD rebuild) {
                        if (rebuild == REBUILD.m15133k()) {
                            return this;
                        }
                        if (rebuild.m15141p()) {
                            m15167v(rebuild.m15139n());
                        }
                        if (rebuild.getBackgroundColor() != 0) {
                            m15169x(rebuild.getBackgroundColor());
                        }
                        if (rebuild.m15140o()) {
                            m15163r(rebuild.m15137g());
                        }
                        mergeUnknownFields(rebuild.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C8468b m15167v(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f18885e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(graphSnapshot);
                        } else if ((this.f18883c & 1) == 0 || (graphSnapshot2 = this.f18884d) == null || graphSnapshot2 == EzyPageSnapshot.PageSnapshot.GraphSnapshot.m15600G()) {
                            this.f18884d = graphSnapshot;
                        } else {
                            m15161p().m15641D(graphSnapshot);
                        }
                        if (this.f18884d != null) {
                            this.f18883c |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C8468b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C8468b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: x */
                    public C8468b m15169x(int i10) {
                        this.f18886f = i10;
                        this.f18883c |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C8468b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C8468b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: z, reason: merged with bridge method [inline-methods] */
                    public C8468b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C8468b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    public C8468b() {
                        maybeForceBuilderInitialization();
                    }

                    public C8468b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public REBUILD(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f18880e = 0;
                    this.f18882g = (byte) -1;
                }

                private REBUILD() {
                    this.f18880e = 0;
                    this.f18882g = (byte) -1;
                }
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$a */
            public class C8469a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public CommandInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8470b c8470bM14691v = CommandInfo.m14691v();
                    try {
                        c8470bM14691v.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8470bM14691v.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8470bM14691v.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8470bM14691v.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8470bM14691v.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyCommand.f18712c;
            }

            /* renamed from: o */
            public static CommandInfo m14690o() {
                return f18739i;
            }

            public static Parser parser() {
                return f18740j;
            }

            /* renamed from: v */
            public static C8470b m14691v() {
                return f18739i.toBuilder();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C8470b toBuilder() {
                return this == f18739i ? new C8470b() : new C8470b().m15184n(this);
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
                return m14697r() == commandInfo.m14697r() && m14698t() == commandInfo.m14698t() && m14699u() == commandInfo.m14699u() && this.f18744f == commandInfo.f18744f && m14695n().equals(commandInfo.m14695n()) && getUnknownFields().equals(commandInfo.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f18740j;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                long j10 = this.f18741c;
                int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
                long j11 = this.f18742d;
                if (j11 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j11);
                }
                boolean z10 = this.f18743e;
                if (z10) {
                    iComputeInt64Size += CodedOutputStream.computeBoolSize(3, z10);
                }
                if (this.f18744f != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    iComputeInt64Size += CodedOutputStream.computeEnumSize(4, this.f18744f);
                }
                if (!this.f18745g.isEmpty()) {
                    iComputeInt64Size += CodedOutputStream.computeBytesSize(5, this.f18745g);
                }
                int serializedSize = iComputeInt64Size + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(m14697r())) * 37) + 2) * 53) + Internal.hashLong(m14698t())) * 37) + 3) * 53) + Internal.hashBoolean(m14699u())) * 37) + 4) * 53) + this.f18744f) * 37) + 5) * 53) + m14695n().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f18713d.ensureFieldAccessorsInitialized(CommandInfo.class, C8470b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f18746h;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f18746h = (byte) 1;
                return true;
            }

            /* renamed from: k */
            public EzyCommandEnum.CommandEnum m14693k() {
                EzyCommandEnum.CommandEnum commandEnumM15218a = EzyCommandEnum.CommandEnum.m15218a(this.f18744f);
                return commandEnumM15218a == null ? EzyCommandEnum.CommandEnum.UNRECOGNIZED : commandEnumM15218a;
            }

            /* renamed from: m */
            public int m14694m() {
                return this.f18744f;
            }

            /* renamed from: n */
            public ByteString m14695n() {
                return this.f18745g;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new CommandInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public CommandInfo getDefaultInstanceForType() {
                return f18739i;
            }

            /* renamed from: r */
            public long m14697r() {
                return this.f18741c;
            }

            /* renamed from: t */
            public long m14698t() {
                return this.f18742d;
            }

            /* renamed from: u */
            public boolean m14699u() {
                return this.f18743e;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                long j10 = this.f18741c;
                if (j10 != 0) {
                    codedOutputStream.writeInt64(1, j10);
                }
                long j11 = this.f18742d;
                if (j11 != 0) {
                    codedOutputStream.writeInt64(2, j11);
                }
                boolean z10 = this.f18743e;
                if (z10) {
                    codedOutputStream.writeBool(3, z10);
                }
                if (this.f18744f != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    codedOutputStream.writeEnum(4, this.f18744f);
                }
                if (!this.f18745g.isEmpty()) {
                    codedOutputStream.writeBytes(5, this.f18745g);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C8470b newBuilderForType() {
                return m14691v();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C8470b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8470b(builderParent);
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$b */
            public static final class C8470b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f18889c;

                /* renamed from: d */
                public long f18890d;

                /* renamed from: e */
                public long f18891e;

                /* renamed from: f */
                public boolean f18892f;

                /* renamed from: g */
                public int f18893g;

                /* renamed from: h */
                public ByteString f18894h;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8470b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8470b) super.addRepeatedField(fieldDescriptor, obj);
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
                    if (this.f18889c != 0) {
                        m15176f(commandInfo);
                    }
                    onBuilt();
                    return commandInfo;
                }

                /* renamed from: f */
                public final void m15176f(CommandInfo commandInfo) {
                    int i10 = this.f18889c;
                    if ((i10 & 1) != 0) {
                        commandInfo.f18741c = this.f18890d;
                    }
                    if ((i10 & 2) != 0) {
                        commandInfo.f18742d = this.f18891e;
                    }
                    if ((i10 & 4) != 0) {
                        commandInfo.f18743e = this.f18892f;
                    }
                    if ((i10 & 8) != 0) {
                        commandInfo.f18744f = this.f18893g;
                    }
                    if ((i10 & 16) != 0) {
                        commandInfo.f18745g = this.f18894h;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8470b clear() {
                    super.clear();
                    this.f18889c = 0;
                    this.f18890d = 0L;
                    this.f18891e = 0L;
                    this.f18892f = false;
                    this.f18893g = 0;
                    this.f18894h = ByteString.EMPTY;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyCommand.f18712c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8470b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8470b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8470b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8470b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f18713d.ensureFieldAccessorsInitialized(CommandInfo.class, C8470b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8470b mo33979clone() {
                    return (C8470b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public CommandInfo getDefaultInstanceForType() {
                    return CommandInfo.m14690o();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8470b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f18890d = codedInputStream.readInt64();
                                        this.f18889c |= 1;
                                    } else if (tag == 16) {
                                        this.f18891e = codedInputStream.readInt64();
                                        this.f18889c |= 2;
                                    } else if (tag == 24) {
                                        this.f18892f = codedInputStream.readBool();
                                        this.f18889c |= 4;
                                    } else if (tag == 32) {
                                        this.f18893g = codedInputStream.readEnum();
                                        this.f18889c |= 8;
                                    } else if (tag == 42) {
                                        this.f18894h = codedInputStream.readBytes();
                                        this.f18889c |= 16;
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
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C8470b mergeFrom(Message message) {
                    if (message instanceof CommandInfo) {
                        return m15184n((CommandInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C8470b m15184n(CommandInfo commandInfo) {
                    if (commandInfo == CommandInfo.m14690o()) {
                        return this;
                    }
                    if (commandInfo.m14697r() != 0) {
                        m15189s(commandInfo.m14697r());
                    }
                    if (commandInfo.m14698t() != 0) {
                        m15190t(commandInfo.m14698t());
                    }
                    if (commandInfo.m14699u()) {
                        m15192v(commandInfo.m14699u());
                    }
                    if (commandInfo.f18744f != 0) {
                        m15187q(commandInfo.m14694m());
                    }
                    if (commandInfo.m14695n() != ByteString.EMPTY) {
                        m15188r(commandInfo.m14695n());
                    }
                    mergeUnknownFields(commandInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final C8470b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8470b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: p */
                public C8470b m15186p(EzyCommandEnum.CommandEnum commandEnum) {
                    commandEnum.getClass();
                    this.f18889c |= 8;
                    this.f18893g = commandEnum.getNumber();
                    onChanged();
                    return this;
                }

                /* renamed from: q */
                public C8470b m15187q(int i10) {
                    this.f18893g = i10;
                    this.f18889c |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C8470b m15188r(ByteString byteString) {
                    byteString.getClass();
                    this.f18894h = byteString;
                    this.f18889c |= 16;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C8470b m15189s(long j10) {
                    this.f18890d = j10;
                    this.f18889c |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: t */
                public C8470b m15190t(long j10) {
                    this.f18891e = j10;
                    this.f18889c |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C8470b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8470b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: v */
                public C8470b m15192v(boolean z10) {
                    this.f18892f = z10;
                    this.f18889c |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C8470b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8470b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public final C8470b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8470b) super.setUnknownFields(unknownFieldSet);
                }

                public C8470b() {
                    this.f18893g = 0;
                    this.f18894h = ByteString.EMPTY;
                }

                public C8470b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f18893g = 0;
                    this.f18894h = ByteString.EMPTY;
                }
            }

            public CommandInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f18741c = 0L;
                this.f18742d = 0L;
                this.f18743e = false;
                this.f18744f = 0;
                this.f18745g = ByteString.EMPTY;
                this.f18746h = (byte) -1;
            }

            private CommandInfo() {
                this.f18741c = 0L;
                this.f18742d = 0L;
                this.f18743e = false;
                this.f18744f = 0;
                ByteString byteString = ByteString.EMPTY;
                this.f18746h = (byte) -1;
                this.f18744f = 0;
                this.f18745g = byteString;
            }
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$a */
        public class C8471a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CommandSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8472b c8472bM14676m = CommandSource.m14676m();
                try {
                    c8472bM14676m.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8472bM14676m.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8472bM14676m.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8472bM14676m.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8472bM14676m.buildPartial());
                }
            }
        }

        /* renamed from: g */
        public static CommandSource m14675g() {
            return f18735e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyCommand.f18710a;
        }

        /* renamed from: m */
        public static C8472b m14676m() {
            return f18735e.toBuilder();
        }

        /* renamed from: p */
        public static CommandSource m14677p(InputStream inputStream) {
            return (CommandSource) GeneratedMessage.parseWithIOException(f18736f, inputStream);
        }

        /* renamed from: e */
        public int m14678e() {
            return this.f18737c.size();
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
            return m14679f().equals(commandSource.m14679f()) && getUnknownFields().equals(commandSource.getUnknownFields());
        }

        /* renamed from: f */
        public List m14679f() {
            return this.f18737c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f18736f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f18737c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f18737c.get(i11));
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
            if (m14678e() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m14679f().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyCommand.f18711b.ensureFieldAccessorsInitialized(CommandSource.class, C8472b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f18738d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f18738d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public CommandSource getDefaultInstanceForType() {
            return f18735e;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8472b newBuilderForType() {
            return m14676m();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CommandSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C8472b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8472b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C8472b toBuilder() {
            return this == f18735e ? new C8472b() : new C8472b().m15212s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f18737c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f18737c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$b */
        public static final class C8472b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f18895c;

            /* renamed from: d */
            public List f18896d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f18897e;

            /* renamed from: b */
            public C8472b m15196b(CommandInfo.C8470b c8470b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18897e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8470b.build());
                    return this;
                }
                m15206m();
                this.f18896d.add(c8470b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C8472b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8472b) super.addRepeatedField(fieldDescriptor, obj);
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
                m15201h(commandSource);
                if (this.f18895c != 0) {
                    m15200g(commandSource);
                }
                onBuilt();
                return commandSource;
            }

            /* renamed from: g */
            public final void m15200g(CommandSource commandSource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyCommand.f18710a;
            }

            /* renamed from: h */
            public final void m15201h(CommandSource commandSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18897e;
                if (repeatedFieldBuilderV3 != null) {
                    commandSource.f18737c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f18895c & 1) != 0) {
                    this.f18896d = Collections.unmodifiableList(this.f18896d);
                    this.f18895c &= -2;
                }
                commandSource.f18737c = this.f18896d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8472b clear() {
                super.clear();
                this.f18895c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18897e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f18896d = Collections.EMPTY_LIST;
                } else {
                    this.f18896d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f18895c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f18711b.ensureFieldAccessorsInitialized(CommandSource.class, C8472b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8472b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8472b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8472b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8472b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8472b mo33979clone() {
                return (C8472b) super.mo33979clone();
            }

            /* renamed from: m */
            public final void m15206m() {
                if ((this.f18895c & 1) == 0) {
                    this.f18896d = new ArrayList(this.f18896d);
                    this.f18895c |= 1;
                }
            }

            /* renamed from: n */
            public int m15207n() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18897e;
                return repeatedFieldBuilderV3 == null ? this.f18896d.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: o */
            public final RepeatedFieldBuilderV3 m15208o() {
                if (this.f18897e == null) {
                    this.f18897e = new RepeatedFieldBuilderV3(this.f18896d, (this.f18895c & 1) != 0, getParentForChildren(), isClean());
                    this.f18896d = null;
                }
                return this.f18897e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public CommandSource getDefaultInstanceForType() {
                return CommandSource.m14675g();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8472b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    CommandInfo commandInfo = (CommandInfo) codedInputStream.readMessage(CommandInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f18897e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m15206m();
                                        this.f18896d.add(commandInfo);
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
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C8472b mergeFrom(Message message) {
                if (message instanceof CommandSource) {
                    return m15212s((CommandSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8472b m15212s(CommandSource commandSource) {
                if (commandSource == CommandSource.m14675g()) {
                    return this;
                }
                if (this.f18897e == null) {
                    if (!commandSource.f18737c.isEmpty()) {
                        if (this.f18896d.isEmpty()) {
                            this.f18896d = commandSource.f18737c;
                            this.f18895c &= -2;
                        } else {
                            m15206m();
                            this.f18896d.addAll(commandSource.f18737c);
                        }
                        onChanged();
                    }
                } else if (!commandSource.f18737c.isEmpty()) {
                    if (this.f18897e.isEmpty()) {
                        this.f18897e.dispose();
                        this.f18897e = null;
                        this.f18896d = commandSource.f18737c;
                        this.f18895c &= -2;
                        this.f18897e = GeneratedMessage.alwaysUseFieldBuilders ? m15208o() : null;
                    } else {
                        this.f18897e.addAllMessages(commandSource.f18737c);
                    }
                }
                mergeUnknownFields(commandSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8472b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8472b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8472b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8472b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8472b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8472b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8472b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8472b) super.setUnknownFields(unknownFieldSet);
            }

            public C8472b() {
                this.f18896d = Collections.EMPTY_LIST;
            }

            public C8472b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f18896d = Collections.EMPTY_LIST;
            }
        }

        public CommandSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f18738d = (byte) -1;
        }

        private CommandSource() {
            this.f18738d = (byte) -1;
            this.f18737c = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m14671y().getMessageTypes().get(0);
        f18710a = descriptor;
        f18711b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f18712c = descriptor2;
        f18713d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DelayTime", "Duration", "IsPlay", "CommandEnum", "Data"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f18714e = descriptor3;
        f18715f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"GraphEnum", "GraphId", "OutRect", "ParentGraphId", "SourceFileName", "SourceId", "Extras"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f18716g = descriptor4;
        f18717h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GraphData"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        f18718i = descriptor5;
        f18719j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"GraphData", "OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        f18720k = descriptor6;
        f18721l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GraphId", "GraphEnum", "OutRect", "Content", "Paint", "Points", "RenderMatrix", "FilePath"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(4);
        f18722m = descriptor7;
        f18723n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"FileName", "Duration", "Validate"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(5);
        f18724o = descriptor8;
        f18725p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(6);
        f18726q = descriptor9;
        f18727r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"OriginMatrix", "LastMatrix"});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(7);
        f18728s = descriptor10;
        f18729t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"OriginBackground", "LastBackground", "OriginBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(8);
        f18730u = descriptor11;
        f18731v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor12 = descriptor2.getNestedTypes().get(9);
        f18732w = descriptor12;
        f18733x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Snapshot", "BackgroundColor", "BackgroundLineConfig"});
        AnyProto.getDescriptor();
        EzyCommandEnum.m15217a();
        EzyGraphEnum.m15225a();
        EzyRectF.m15787c();
        EzyMatrix.m15454c();
        EzyPaint.m15711c();
        EzyPointF.m15753c();
        EzyPageSnapshot.m15580e();
        EzyHeader.m15237i();
    }

    /* renamed from: y */
    public static Descriptors.FileDescriptor m14671y() {
        return f18734y;
    }
}
