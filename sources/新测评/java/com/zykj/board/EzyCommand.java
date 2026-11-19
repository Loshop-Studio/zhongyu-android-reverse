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
    public static final Descriptors.Descriptor f7874a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f7875b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f7876c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f7877d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f7878e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f7879f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f7880g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f7881h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f7882i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f7883j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f7884k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f7885l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f7886m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f7887n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f7888o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f7889p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f7890q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f7891r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f7892s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f7893t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f7894u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f7895v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f7896w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f7897x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f7898y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rCommand.proto\u001a\u0019google/protobuf/any.proto\u001a\u0017enums/CommandEnum.proto\u001a\u0015enums/GraphEnum.proto\u001a\u0011utils/RectF.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0013GraphSnapshot.proto\u001a\fHeader.proto\"\u0092\u000b\n\rCommandSource\u0012/\n\u000bcommandInfo\u0018\u0001 \u0003(\u000b2\u001a.CommandSource.CommandInfo\u001aÏ\n\n\u000bCommandInfo\u0012\u0011\n\tdelayTime\u0018\u0001 \u0001(\u0003\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u000e\n\u0006isPlay\u0018\u0003 \u0001(\b\u0012!\n\u000bcommandEnum\u0018\u0004 \u0001(\u000e2\f.CommandEnum\u0012\f\n\u0004data\u0018\u0005 \u0001(\f\u001a¥\u0001\n\tGraphData\u0012\u001d\n\tgraphEnum\u0018\u0001 \u0001(\u000e2\n.GraphEnum\u0012\u000f\n\u0007graphId\u0018\u0002 \u0001(\t\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u0015\n\rparentGraphId\u0018\u0004 \u0001(\t\u0012\u0016\n\u000esourceFileName\u0018\u0005 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0006 \u0001(\u0005\u0012\u000e\n\u0006extras\u0018\u0007 \u0001(\t\u001aF\n\u000bGraphRemove\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u001a¬\u0001\n\u000bGraphMatrix\u00127\n\tgraphData\u0018\u0001 \u0003(\u000b2$.CommandSource.CommandInfo.GraphData\u0012\u001d\n\foriginMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0003 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0004 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0005 \u0001(\u0005\u001aÈ\u0001\n\u000bGraphChange\u0012\u000f\n\u0007graphId\u0018\u0001 \u0001(\t\u0012\u001d\n\tgraphEnum\u0018\u0002 \u0001(\u000e2\n.GraphEnum\u0012\u0017\n\u0007outRect\u0018\u0003 \u0001(\u000b2\u0006.RectF\u0012\u000f\n\u0007content\u0018\u0004 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0005 \u0001(\u000b2\u0006.Paint\u0012\u0017\n\u0006points\u0018\u0006 \u0003(\u000b2\u0007.PointF\u0012\u001d\n\frenderMatrix\u0018\u0007 \u0001(\u000b2\u0007.Matrix\u0012\u0010\n\bfilePath\u0018\b \u0001(\t\u001aB\n\nAudioStart\u0012\u0010\n\bfileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\u001at\n\fCameraMatrix\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u0012\u0016\n\u000esourceFileName\u0018\u0003 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0004 \u0001(\u0005\u001aD\n\u0006Camera\u0012\u001d\n\foriginMatrix\u0018\u0001 \u0001(\u000b2\u0007.Matrix\u0012\u001b\n\nlastMatrix\u0018\u0002 \u0001(\u000b2\u0007.Matrix\u001a®\u0001\n\u0006Config\u0012\u0018\n\u0010originBackground\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000elastBackground\u0018\u0002 \u0001(\u0005\u00129\n\u001aoriginBackgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfig\u00127\n\u0018lastBackgroundLineConfig\u0018\u0004 \u0001(\u000b2\u0015.BackgroundLineConfig\u001a6\n\nCursorMove\u0012\u0016\n\u000esourceFileName\u0018\u0001 \u0001(\t\u0012\u0010\n\bsourceId\u0018\u0002 \u0001(\u0005\u001a\u0086\u0001\n\u0007REBUILD\u0012-\n\bsnapshot\u0018\u0001 \u0001(\u000b2\u001b.PageSnapshot.GraphSnapshot\u0012\u0017\n\u000fbackgroundColor\u0018\u0002 \u0001(\u0005\u00123\n\u0014backgroundLineConfig\u0018\u0003 \u0001(\u000b2\u0015.BackgroundLineConfigB\u001c\n\u000ecom.zykj.boardB\nEzyCommandb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor(), EzyCommandEnum.m7478a(), EzyGraphEnum.m7488a(), EzyRectF.m8037c(), EzyMatrix.m7709c(), EzyPaint.m7960c(), EzyPointF.m8002c(), EzyPageSnapshot.m7833e(), EzyHeader.m7501i()});

    public static final class CommandSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final CommandSource f7899c = new CommandSource();

        /* renamed from: d */
        public static final Parser f7900d = new C6774a();

        /* renamed from: a */
        public List f7901a;

        /* renamed from: b */
        public byte f7902b;

        public static final class CommandInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: g */
            public static final CommandInfo f7903g = new CommandInfo();

            /* renamed from: h */
            public static final Parser f7904h = new C6772a();

            /* renamed from: a */
            public long f7905a;

            /* renamed from: b */
            public long f7906b;

            /* renamed from: c */
            public boolean f7907c;

            /* renamed from: d */
            public int f7908d;

            /* renamed from: e */
            public ByteString f7909e;

            /* renamed from: f */
            public byte f7910f;

            public static final class AudioStart extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final AudioStart f7911e = new AudioStart();

                /* renamed from: f */
                public static final Parser f7912f = new C6752a();

                /* renamed from: a */
                public volatile Object f7913a;

                /* renamed from: b */
                public long f7914b;

                /* renamed from: c */
                public volatile Object f7915c;

                /* renamed from: d */
                public byte f7916d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$a */
                public class C6752a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public AudioStart parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6753b c6753bM6973t = AudioStart.m6973t();
                        try {
                            c6753bM6973t.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6753bM6973t.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6753bM6973t.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6753bM6973t.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6753bM6973t.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7886m;
                }

                /* renamed from: o */
                public static AudioStart m6972o() {
                    return f7911e;
                }

                /* renamed from: t */
                public static C6753b m6973t() {
                    return f7911e.toBuilder();
                }

                /* renamed from: w */
                public static AudioStart m6974w(ByteString byteString) {
                    return (AudioStart) f7912f.parseFrom(byteString);
                }

                /* renamed from: x */
                public static AudioStart m6975x(byte[] bArr) {
                    return (AudioStart) f7912f.parseFrom(bArr);
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
                    return getFileName().equals(audioStart.getFileName()) && m6977r() == audioStart.m6977r() && m6978s().equals(audioStart.m6978s()) && getUnknownFields().equals(audioStart.getUnknownFields());
                }

                public String getFileName() {
                    Object obj = this.f7913a;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7913a = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7912f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f7913a) ? GeneratedMessageV3.computeStringSize(1, this.f7913a) : 0;
                    long j10 = this.f7914b;
                    if (j10 != 0) {
                        iComputeStringSize += CodedOutputStream.computeInt64Size(2, j10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7915c)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.f7915c);
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
                    int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getFileName().hashCode()) * 37) + 2) * 53) + Internal.hashLong(m6977r())) * 37) + 3) * 53) + m6978s().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7887n.ensureFieldAccessorsInitialized(AudioStart.class, C6753b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f7916d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f7916d = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new AudioStart();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public AudioStart getDefaultInstanceForType() {
                    return f7911e;
                }

                /* renamed from: r */
                public long m6977r() {
                    return this.f7914b;
                }

                /* renamed from: s */
                public String m6978s() {
                    Object obj = this.f7915c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7915c = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C6753b newBuilderForType() {
                    return m6973t();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C6753b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6753b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!GeneratedMessageV3.isStringEmpty(this.f7913a)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f7913a);
                    }
                    long j10 = this.f7914b;
                    if (j10 != 0) {
                        codedOutputStream.writeInt64(2, j10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7915c)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.f7915c);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C6753b toBuilder() {
                    return this == f7911e ? new C6753b() : new C6753b().m6994n(this);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$AudioStart$b */
                public static final class C6753b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f7917a;

                    /* renamed from: b */
                    public Object f7918b;

                    /* renamed from: c */
                    public long f7919c;

                    /* renamed from: d */
                    public Object f7920d;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6753b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6753b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public AudioStart build() {
                        AudioStart audioStartBuildPartial = buildPartial();
                        if (audioStartBuildPartial.isInitialized()) {
                            return audioStartBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) audioStartBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public AudioStart buildPartial() {
                        AudioStart audioStart = new AudioStart(this);
                        if (this.f7917a != 0) {
                            m6986e(audioStart);
                        }
                        onBuilt();
                        return audioStart;
                    }

                    /* renamed from: e */
                    public final void m6986e(AudioStart audioStart) {
                        int i10 = this.f7917a;
                        if ((i10 & 1) != 0) {
                            audioStart.f7913a = this.f7918b;
                        }
                        if ((i10 & 2) != 0) {
                            audioStart.f7914b = this.f7919c;
                        }
                        if ((i10 & 4) != 0) {
                            audioStart.f7915c = this.f7920d;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6753b clear() {
                        super.clear();
                        this.f7917a = 0;
                        this.f7918b = "";
                        this.f7919c = 0L;
                        this.f7920d = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6753b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6753b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7886m;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6753b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6753b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                    public C6753b mo24228clone() {
                        return (C6753b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7887n.ensureFieldAccessorsInitialized(AudioStart.class, C6753b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public AudioStart getDefaultInstanceForType() {
                        return AudioStart.m6972o();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C6753b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f7918b = codedInputStream.readStringRequireUtf8();
                                            this.f7917a |= 1;
                                        } else if (tag == 16) {
                                            this.f7919c = codedInputStream.readInt64();
                                            this.f7917a |= 2;
                                        } else if (tag == 26) {
                                            this.f7920d = codedInputStream.readStringRequireUtf8();
                                            this.f7917a |= 4;
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
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C6753b mergeFrom(Message message) {
                        if (message instanceof AudioStart) {
                            return m6994n((AudioStart) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: n */
                    public C6753b m6994n(AudioStart audioStart) {
                        if (audioStart == AudioStart.m6972o()) {
                            return this;
                        }
                        if (!audioStart.getFileName().isEmpty()) {
                            this.f7918b = audioStart.f7913a;
                            this.f7917a |= 1;
                            onChanged();
                        }
                        if (audioStart.m6977r() != 0) {
                            m6996q(audioStart.m6977r());
                        }
                        if (!audioStart.m6978s().isEmpty()) {
                            this.f7920d = audioStart.f7915c;
                            this.f7917a |= 4;
                            onChanged();
                        }
                        mergeUnknownFields(audioStart.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public final C6753b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6753b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: q */
                    public C6753b m6996q(long j10) {
                        this.f7919c = j10;
                        this.f7917a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C6753b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6753b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: s */
                    public C6753b m6998s(String str) {
                        str.getClass();
                        this.f7918b = str;
                        this.f7917a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C6753b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6753b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public final C6753b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6753b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C6753b() {
                        this.f7918b = "";
                        this.f7920d = "";
                    }

                    public C6753b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f7918b = "";
                        this.f7920d = "";
                    }
                }

                public AudioStart(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7913a = "";
                    this.f7914b = 0L;
                    this.f7915c = "";
                    this.f7916d = (byte) -1;
                }

                private AudioStart() {
                    this.f7913a = "";
                    this.f7914b = 0L;
                    this.f7915c = "";
                    this.f7916d = (byte) -1;
                    this.f7913a = "";
                    this.f7915c = "";
                }
            }

            public static final class Camera extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: e */
                public static final Camera f7921e = new Camera();

                /* renamed from: f */
                public static final Parser f7922f = new C6754a();

                /* renamed from: a */
                public int f7923a;

                /* renamed from: b */
                public EzyMatrix.Matrix f7924b;

                /* renamed from: c */
                public EzyMatrix.Matrix f7925c;

                /* renamed from: d */
                public byte f7926d;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$a */
                public class C6754a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Camera parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6755b c6755bM7005t = Camera.m7005t();
                        try {
                            c6755bM7005t.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6755bM7005t.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6755bM7005t.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6755bM7005t.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6755bM7005t.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7890q;
                }

                /* renamed from: j */
                public static /* synthetic */ int m7003j(Camera camera, int i10) {
                    int i11 = i10 | camera.f7923a;
                    camera.f7923a = i11;
                    return i11;
                }

                /* renamed from: k */
                public static Camera m7004k() {
                    return f7921e;
                }

                /* renamed from: t */
                public static C6755b m7005t() {
                    return f7921e.toBuilder();
                }

                /* renamed from: w */
                public static Camera m7006w(ByteString byteString) {
                    return (Camera) f7922f.parseFrom(byteString);
                }

                /* renamed from: x */
                public static Camera m7007x(byte[] bArr) {
                    return (Camera) f7922f.parseFrom(bArr);
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
                    if (m7012s() != camera.m7012s()) {
                        return false;
                    }
                    if ((!m7012s() || m7010q().equals(camera.m7010q())) && m7011r() == camera.m7011r()) {
                        return (!m7011r() || m7009o().equals(camera.m7009o())) && getUnknownFields().equals(camera.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7922f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f7923a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7010q()) : 0;
                    if ((this.f7923a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m7009o());
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
                    if (m7012s()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7010q().hashCode();
                    }
                    if (m7011r()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m7009o().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7891r.ensureFieldAccessorsInitialized(Camera.class, C6755b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f7926d;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f7926d = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public Camera getDefaultInstanceForType() {
                    return f7921e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Camera();
                }

                /* renamed from: o */
                public EzyMatrix.Matrix m7009o() {
                    EzyMatrix.Matrix matrix = this.f7925c;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: q */
                public EzyMatrix.Matrix m7010q() {
                    EzyMatrix.Matrix matrix = this.f7924b;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: r */
                public boolean m7011r() {
                    return (this.f7923a & 2) != 0;
                }

                /* renamed from: s */
                public boolean m7012s() {
                    return (this.f7923a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C6755b newBuilderForType() {
                    return m7005t();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C6755b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6755b(builderParent);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if ((this.f7923a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m7010q());
                    }
                    if ((this.f7923a & 2) != 0) {
                        codedOutputStream.writeMessage(2, m7009o());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C6755b toBuilder() {
                    return this == f7921e ? new C6755b() : new C6755b().m7037u(this);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Camera$b */
                public static final class C6755b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f7927a;

                    /* renamed from: b */
                    public EzyMatrix.Matrix f7928b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f7929c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f7930d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f7931e;

                    /* renamed from: A */
                    public C6755b m7017A(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7929c;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f7928b = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f7927a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C6755b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6755b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C6755b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6755b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6755b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6755b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Camera build() {
                        Camera cameraBuildPartial = buildPartial();
                        if (cameraBuildPartial.isInitialized()) {
                            return cameraBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Camera buildPartial() {
                        Camera camera = new Camera(this);
                        if (this.f7927a != 0) {
                            m7023e(camera);
                        }
                        onBuilt();
                        return camera;
                    }

                    /* renamed from: e */
                    public final void m7023e(Camera camera) {
                        int i10;
                        int i11 = this.f7927a;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7929c;
                            camera.f7924b = singleFieldBuilderV3 == null ? this.f7928b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7931e;
                            camera.f7925c = singleFieldBuilderV32 == null ? this.f7930d : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        Camera.m7003j(camera, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6755b clear() {
                        super.clear();
                        this.f7927a = 0;
                        this.f7928b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7929c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f7929c = null;
                        }
                        this.f7930d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7931e;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f7931e = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6755b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6755b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7890q;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6755b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6755b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6755b mo24228clone() {
                        return (C6755b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7891r.ensureFieldAccessorsInitialized(Camera.class, C6755b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public Camera getDefaultInstanceForType() {
                        return Camera.m7004k();
                    }

                    /* renamed from: l */
                    public EzyMatrix.Matrix m7029l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7931e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f7930d;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix.C6790b m7030m() {
                        this.f7927a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7031n().getBuilder();
                    }

                    public final void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7034r();
                            m7031n();
                        }
                    }

                    /* renamed from: n */
                    public final SingleFieldBuilderV3 m7031n() {
                        if (this.f7931e == null) {
                            this.f7931e = new SingleFieldBuilderV3(m7029l(), getParentForChildren(), isClean());
                            this.f7930d = null;
                        }
                        return this.f7931e;
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m7032p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7929c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f7928b;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C6790b m7033q() {
                        this.f7927a |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7034r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m7034r() {
                        if (this.f7929c == null) {
                            this.f7929c = new SingleFieldBuilderV3(m7032p(), getParentForChildren(), isClean());
                            this.f7928b = null;
                        }
                        return this.f7929c;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C6755b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m7034r().getBuilder(), extensionRegistryLite);
                                            this.f7927a |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m7031n().getBuilder(), extensionRegistryLite);
                                            this.f7927a |= 2;
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
                    public C6755b mergeFrom(Message message) {
                        if (message instanceof Camera) {
                            return m7037u((Camera) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C6755b m7037u(Camera camera) {
                        if (camera == Camera.m7004k()) {
                            return this;
                        }
                        if (camera.m7012s()) {
                            m7039w(camera.m7010q());
                        }
                        if (camera.m7011r()) {
                            m7038v(camera.m7009o());
                        }
                        mergeUnknownFields(camera.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C6755b m7038v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7931e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f7927a & 2) == 0 || (matrix2 = this.f7930d) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f7930d = matrix;
                        } else {
                            m7030m().m7748n(matrix);
                        }
                        if (this.f7930d != null) {
                            this.f7927a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C6755b m7039w(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7929c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f7927a & 1) == 0 || (matrix2 = this.f7928b) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f7928b = matrix;
                        } else {
                            m7033q().m7748n(matrix);
                        }
                        if (this.f7928b != null) {
                            this.f7927a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C6755b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6755b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C6755b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6755b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C6755b m7042z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7931e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f7930d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f7927a |= 2;
                        onChanged();
                        return this;
                    }

                    public C6755b() {
                        maybeForceBuilderInitialization();
                    }

                    public C6755b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Camera(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7926d = (byte) -1;
                }

                private Camera() {
                    this.f7926d = (byte) -1;
                }
            }

            public static final class CameraMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final CameraMatrix f7932g = new CameraMatrix();

                /* renamed from: h */
                public static final Parser f7933h = new C6756a();

                /* renamed from: a */
                public int f7934a;

                /* renamed from: b */
                public EzyMatrix.Matrix f7935b;

                /* renamed from: c */
                public EzyMatrix.Matrix f7936c;

                /* renamed from: d */
                public volatile Object f7937d;

                /* renamed from: e */
                public int f7938e;

                /* renamed from: f */
                public byte f7939f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$a */
                public class C6756a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6757b c6757bM7052y = CameraMatrix.m7052y();
                        try {
                            c6757bM7052y.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6757bM7052y.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6757bM7052y.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6757bM7052y.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6757bM7052y.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static CameraMatrix m7043B(ByteString byteString) {
                    return (CameraMatrix) f7933h.parseFrom(byteString);
                }

                /* renamed from: C */
                public static CameraMatrix m7044C(byte[] bArr) {
                    return (CameraMatrix) f7933h.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7888o;
                }

                /* renamed from: o */
                public static /* synthetic */ int m7050o(CameraMatrix cameraMatrix, int i10) {
                    int i11 = i10 | cameraMatrix.f7934a;
                    cameraMatrix.f7934a = i11;
                    return i11;
                }

                /* renamed from: q */
                public static CameraMatrix m7051q() {
                    return f7932g;
                }

                /* renamed from: y */
                public static C6757b m7052y() {
                    return f7932g.toBuilder();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C6757b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6757b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C6757b toBuilder() {
                    return this == f7932g ? new C6757b() : new C6757b().m7086u(this);
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
                    if (m7061x() != cameraMatrix.m7061x()) {
                        return false;
                    }
                    if ((!m7061x() || m7057t().equals(cameraMatrix.m7057t())) && m7060w() == cameraMatrix.m7060w()) {
                        return (!m7060w() || m7056s().equals(cameraMatrix.m7056s())) && m7058u().equals(cameraMatrix.m7058u()) && m7059v() == cameraMatrix.m7059v() && getUnknownFields().equals(cameraMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7933h;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f7934a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7057t()) : 0;
                    if ((this.f7934a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m7056s());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7937d)) {
                        iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.f7937d);
                    }
                    int i11 = this.f7938e;
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
                    if (m7061x()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7057t().hashCode();
                    }
                    if (m7060w()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m7056s().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 3) * 53) + m7058u().hashCode()) * 37) + 4) * 53) + m7059v()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7889p.ensureFieldAccessorsInitialized(CameraMatrix.class, C6757b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f7939f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f7939f = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CameraMatrix();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public CameraMatrix getDefaultInstanceForType() {
                    return f7932g;
                }

                /* renamed from: s */
                public EzyMatrix.Matrix m7056s() {
                    EzyMatrix.Matrix matrix = this.f7936c;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: t */
                public EzyMatrix.Matrix m7057t() {
                    EzyMatrix.Matrix matrix = this.f7935b;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: u */
                public String m7058u() {
                    Object obj = this.f7937d;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7937d = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: v */
                public int m7059v() {
                    return this.f7938e;
                }

                /* renamed from: w */
                public boolean m7060w() {
                    return (this.f7934a & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if ((this.f7934a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m7057t());
                    }
                    if ((this.f7934a & 2) != 0) {
                        codedOutputStream.writeMessage(2, m7056s());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7937d)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 3, this.f7937d);
                    }
                    int i10 = this.f7938e;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(4, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public boolean m7061x() {
                    return (this.f7934a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C6757b newBuilderForType() {
                    return m7052y();
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CameraMatrix$b */
                public static final class C6757b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f7940a;

                    /* renamed from: b */
                    public EzyMatrix.Matrix f7941b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f7942c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f7943d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f7944e;

                    /* renamed from: f */
                    public Object f7945f;

                    /* renamed from: g */
                    public int f7946g;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7065r();
                            m7064n();
                        }
                    }

                    /* renamed from: n */
                    private SingleFieldBuilderV3 m7064n() {
                        if (this.f7944e == null) {
                            this.f7944e = new SingleFieldBuilderV3(m7080l(), getParentForChildren(), isClean());
                            this.f7943d = null;
                        }
                        return this.f7944e;
                    }

                    /* renamed from: r */
                    private SingleFieldBuilderV3 m7065r() {
                        if (this.f7942c == null) {
                            this.f7942c = new SingleFieldBuilderV3(m7082p(), getParentForChildren(), isClean());
                            this.f7941b = null;
                        }
                        return this.f7942c;
                    }

                    /* renamed from: A */
                    public C6757b m7066A(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7942c;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f7941b = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f7940a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C6757b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6757b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: C */
                    public C6757b m7068C(String str) {
                        str.getClass();
                        this.f7945f = str;
                        this.f7940a |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: D */
                    public C6757b m7069D(int i10) {
                        this.f7946g = i10;
                        this.f7940a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C6757b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6757b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6757b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6757b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix build() {
                        CameraMatrix cameraMatrixBuildPartial = buildPartial();
                        if (cameraMatrixBuildPartial.isInitialized()) {
                            return cameraMatrixBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cameraMatrixBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix buildPartial() {
                        CameraMatrix cameraMatrix = new CameraMatrix(this);
                        if (this.f7940a != 0) {
                            m7074e(cameraMatrix);
                        }
                        onBuilt();
                        return cameraMatrix;
                    }

                    /* renamed from: e */
                    public final void m7074e(CameraMatrix cameraMatrix) {
                        int i10;
                        int i11 = this.f7940a;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7942c;
                            cameraMatrix.f7935b = singleFieldBuilderV3 == null ? this.f7941b : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7944e;
                            cameraMatrix.f7936c = singleFieldBuilderV32 == null ? this.f7943d : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 4) != 0) {
                            cameraMatrix.f7937d = this.f7945f;
                        }
                        if ((i11 & 8) != 0) {
                            cameraMatrix.f7938e = this.f7946g;
                        }
                        CameraMatrix.m7050o(cameraMatrix, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6757b clear() {
                        super.clear();
                        this.f7940a = 0;
                        this.f7941b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7942c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f7942c = null;
                        }
                        this.f7943d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7944e;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f7944e = null;
                        }
                        this.f7945f = "";
                        this.f7946g = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6757b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6757b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7888o;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6757b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6757b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6757b mo24228clone() {
                        return (C6757b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7889p.ensureFieldAccessorsInitialized(CameraMatrix.class, C6757b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public CameraMatrix getDefaultInstanceForType() {
                        return CameraMatrix.m7051q();
                    }

                    /* renamed from: l */
                    public EzyMatrix.Matrix m7080l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7944e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f7943d;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: m */
                    public EzyMatrix.Matrix.C6790b m7081m() {
                        this.f7940a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7064n().getBuilder();
                    }

                    /* renamed from: p */
                    public EzyMatrix.Matrix m7082p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7942c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f7941b;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix.C6790b m7083q() {
                        this.f7940a |= 1;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7065r().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C6757b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m7065r().getBuilder(), extensionRegistryLite);
                                            this.f7940a |= 1;
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m7064n().getBuilder(), extensionRegistryLite);
                                            this.f7940a |= 2;
                                        } else if (tag == 26) {
                                            this.f7945f = codedInputStream.readStringRequireUtf8();
                                            this.f7940a |= 4;
                                        } else if (tag == 32) {
                                            this.f7946g = codedInputStream.readInt32();
                                            this.f7940a |= 8;
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
                    public C6757b mergeFrom(Message message) {
                        if (message instanceof CameraMatrix) {
                            return m7086u((CameraMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C6757b m7086u(CameraMatrix cameraMatrix) {
                        if (cameraMatrix == CameraMatrix.m7051q()) {
                            return this;
                        }
                        if (cameraMatrix.m7061x()) {
                            m7088w(cameraMatrix.m7057t());
                        }
                        if (cameraMatrix.m7060w()) {
                            m7087v(cameraMatrix.m7056s());
                        }
                        if (!cameraMatrix.m7058u().isEmpty()) {
                            this.f7945f = cameraMatrix.f7937d;
                            this.f7940a |= 4;
                            onChanged();
                        }
                        if (cameraMatrix.m7059v() != 0) {
                            m7069D(cameraMatrix.m7059v());
                        }
                        mergeUnknownFields(cameraMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C6757b m7087v(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7944e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f7940a & 2) == 0 || (matrix2 = this.f7943d) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f7943d = matrix;
                        } else {
                            m7081m().m7748n(matrix);
                        }
                        if (this.f7943d != null) {
                            this.f7940a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C6757b m7088w(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7942c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f7940a & 1) == 0 || (matrix2 = this.f7941b) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f7941b = matrix;
                        } else {
                            m7083q().m7748n(matrix);
                        }
                        if (this.f7941b != null) {
                            this.f7940a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C6757b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6757b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C6757b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6757b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C6757b m7091z(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7944e;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f7943d = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f7940a |= 2;
                        onChanged();
                        return this;
                    }

                    public C6757b() {
                        this.f7945f = "";
                        maybeForceBuilderInitialization();
                    }

                    public C6757b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f7945f = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public CameraMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7937d = "";
                    this.f7938e = 0;
                    this.f7939f = (byte) -1;
                }

                private CameraMatrix() {
                    this.f7937d = "";
                    this.f7938e = 0;
                    this.f7939f = (byte) -1;
                    this.f7937d = "";
                }
            }

            public static final class Config extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: g */
                public static final Config f7947g = new Config();

                /* renamed from: h */
                public static final Parser f7948h = new C6758a();

                /* renamed from: a */
                public int f7949a;

                /* renamed from: b */
                public int f7950b;

                /* renamed from: c */
                public int f7951c;

                /* renamed from: d */
                public EzyHeader.BackgroundLineConfig f7952d;

                /* renamed from: e */
                public EzyHeader.BackgroundLineConfig f7953e;

                /* renamed from: f */
                public byte f7954f;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$a */
                public class C6758a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public Config parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6759b c6759bM7101y = Config.m7101y();
                        try {
                            c6759bM7101y.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6759bM7101y.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6759bM7101y.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6759bM7101y.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6759bM7101y.buildPartial());
                        }
                    }
                }

                /* renamed from: B */
                public static Config m7092B(ByteString byteString) {
                    return (Config) f7948h.parseFrom(byteString);
                }

                /* renamed from: C */
                public static Config m7093C(byte[] bArr) {
                    return (Config) f7948h.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7892s;
                }

                /* renamed from: k */
                public static /* synthetic */ int m7097k(Config config, int i10) {
                    int i11 = i10 | config.f7949a;
                    config.f7949a = i11;
                    return i11;
                }

                /* renamed from: q */
                public static Config m7100q() {
                    return f7947g;
                }

                /* renamed from: y */
                public static C6759b m7101y() {
                    return f7947g.toBuilder();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C6759b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6759b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: D, reason: merged with bridge method [inline-methods] */
                public C6759b toBuilder() {
                    return this == f7947g ? new C6759b() : new C6759b().m7135u(this);
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
                    if (m7107u() != config.m7107u() || m7105s() != config.m7105s() || m7110x() != config.m7110x()) {
                        return false;
                    }
                    if ((!m7110x() || m7108v().equals(config.m7108v())) && m7109w() == config.m7109w()) {
                        return (!m7109w() || m7106t().equals(config.m7106t())) && getUnknownFields().equals(config.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7948h;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int i11 = this.f7950b;
                    int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
                    int i12 = this.f7951c;
                    if (i12 != 0) {
                        iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
                    }
                    if ((1 & this.f7949a) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m7108v());
                    }
                    if ((this.f7949a & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(4, m7106t());
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
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7107u()) * 37) + 2) * 53) + m7105s();
                    if (m7110x()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7108v().hashCode();
                    }
                    if (m7109w()) {
                        iHashCode = (((iHashCode * 37) + 4) * 53) + m7106t().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7893t.ensureFieldAccessorsInitialized(Config.class, C6759b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f7954f;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f7954f = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new Config();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public Config getDefaultInstanceForType() {
                    return f7947g;
                }

                /* renamed from: s */
                public int m7105s() {
                    return this.f7951c;
                }

                /* renamed from: t */
                public EzyHeader.BackgroundLineConfig m7106t() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f7953e;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m7547o() : backgroundLineConfig;
                }

                /* renamed from: u */
                public int m7107u() {
                    return this.f7950b;
                }

                /* renamed from: v */
                public EzyHeader.BackgroundLineConfig m7108v() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f7952d;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m7547o() : backgroundLineConfig;
                }

                /* renamed from: w */
                public boolean m7109w() {
                    return (this.f7949a & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    int i10 = this.f7950b;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(1, i10);
                    }
                    int i11 = this.f7951c;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(2, i11);
                    }
                    if ((this.f7949a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m7108v());
                    }
                    if ((this.f7949a & 2) != 0) {
                        codedOutputStream.writeMessage(4, m7106t());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public boolean m7110x() {
                    return (this.f7949a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public C6759b newBuilderForType() {
                    return m7101y();
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$Config$b */
                public static final class C6759b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f7955a;

                    /* renamed from: b */
                    public int f7956b;

                    /* renamed from: c */
                    public int f7957c;

                    /* renamed from: d */
                    public EzyHeader.BackgroundLineConfig f7958d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f7959e;

                    /* renamed from: f */
                    public EzyHeader.BackgroundLineConfig f7960f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f7961g;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7132r();
                            m7129n();
                        }
                    }

                    /* renamed from: A */
                    public C6759b m7113A(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7961g;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f7960f = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f7955a |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: B */
                    public C6759b m7114B(int i10) {
                        this.f7956b = i10;
                        this.f7955a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: C */
                    public C6759b m7115C(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7959e;
                        if (singleFieldBuilderV3 == null) {
                            backgroundLineConfig.getClass();
                            this.f7958d = backgroundLineConfig;
                        } else {
                            singleFieldBuilderV3.setMessage(backgroundLineConfig);
                        }
                        this.f7955a |= 4;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C6759b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6759b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C6759b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6759b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6759b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6759b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public Config build() {
                        Config configBuildPartial = buildPartial();
                        if (configBuildPartial.isInitialized()) {
                            return configBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) configBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public Config buildPartial() {
                        Config config = new Config(this);
                        if (this.f7955a != 0) {
                            m7121e(config);
                        }
                        onBuilt();
                        return config;
                    }

                    /* renamed from: e */
                    public final void m7121e(Config config) {
                        int i10;
                        int i11 = this.f7955a;
                        if ((i11 & 1) != 0) {
                            config.f7950b = this.f7956b;
                        }
                        if ((i11 & 2) != 0) {
                            config.f7951c = this.f7957c;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7959e;
                            config.f7952d = singleFieldBuilderV3 == null ? this.f7958d : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7961g;
                            config.f7953e = singleFieldBuilderV32 == null ? this.f7960f : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        Config.m7097k(config, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6759b clear() {
                        super.clear();
                        this.f7955a = 0;
                        this.f7956b = 0;
                        this.f7957c = 0;
                        this.f7958d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7959e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f7959e = null;
                        }
                        this.f7960f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7961g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f7961g = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6759b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6759b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7892s;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6759b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6759b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6759b mo24228clone() {
                        return (C6759b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7893t.ensureFieldAccessorsInitialized(Config.class, C6759b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public Config getDefaultInstanceForType() {
                        return Config.m7100q();
                    }

                    /* renamed from: l */
                    public EzyHeader.BackgroundLineConfig m7127l() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7961g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f7960f;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m7547o() : backgroundLineConfig;
                    }

                    /* renamed from: m */
                    public EzyHeader.BackgroundLineConfig.C6783b m7128m() {
                        this.f7955a |= 8;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C6783b) m7129n().getBuilder();
                    }

                    /* renamed from: n */
                    public final SingleFieldBuilderV3 m7129n() {
                        if (this.f7961g == null) {
                            this.f7961g = new SingleFieldBuilderV3(m7127l(), getParentForChildren(), isClean());
                            this.f7960f = null;
                        }
                        return this.f7961g;
                    }

                    /* renamed from: p */
                    public EzyHeader.BackgroundLineConfig m7130p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7959e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f7958d;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m7547o() : backgroundLineConfig;
                    }

                    /* renamed from: q */
                    public EzyHeader.BackgroundLineConfig.C6783b m7131q() {
                        this.f7955a |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C6783b) m7132r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m7132r() {
                        if (this.f7959e == null) {
                            this.f7959e = new SingleFieldBuilderV3(m7130p(), getParentForChildren(), isClean());
                            this.f7958d = null;
                        }
                        return this.f7959e;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: s, reason: merged with bridge method [inline-methods] */
                    public C6759b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f7956b = codedInputStream.readInt32();
                                            this.f7955a |= 1;
                                        } else if (tag == 16) {
                                            this.f7957c = codedInputStream.readInt32();
                                            this.f7955a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m7132r().getBuilder(), extensionRegistryLite);
                                            this.f7955a |= 4;
                                        } else if (tag == 34) {
                                            codedInputStream.readMessage(m7129n().getBuilder(), extensionRegistryLite);
                                            this.f7955a |= 8;
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
                    public C6759b mergeFrom(Message message) {
                        if (message instanceof Config) {
                            return m7135u((Config) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: u */
                    public C6759b m7135u(Config config) {
                        if (config == Config.m7100q()) {
                            return this;
                        }
                        if (config.m7107u() != 0) {
                            m7114B(config.m7107u());
                        }
                        if (config.m7105s() != 0) {
                            m7140z(config.m7105s());
                        }
                        if (config.m7110x()) {
                            m7137w(config.m7108v());
                        }
                        if (config.m7109w()) {
                            m7136v(config.m7106t());
                        }
                        mergeUnknownFields(config.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: v */
                    public C6759b m7136v(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7961g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f7955a & 8) == 0 || (backgroundLineConfig2 = this.f7960f) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m7547o()) {
                            this.f7960f = backgroundLineConfig;
                        } else {
                            m7128m().m7570n(backgroundLineConfig);
                        }
                        if (this.f7960f != null) {
                            this.f7955a |= 8;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: w */
                    public C6759b m7137w(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7959e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f7955a & 4) == 0 || (backgroundLineConfig2 = this.f7958d) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m7547o()) {
                            this.f7958d = backgroundLineConfig;
                        } else {
                            m7131q().m7570n(backgroundLineConfig);
                        }
                        if (this.f7958d != null) {
                            this.f7955a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C6759b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6759b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: y, reason: merged with bridge method [inline-methods] */
                    public C6759b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6759b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: z */
                    public C6759b m7140z(int i10) {
                        this.f7957c = i10;
                        this.f7955a |= 2;
                        onChanged();
                        return this;
                    }

                    public C6759b() {
                        maybeForceBuilderInitialization();
                    }

                    public C6759b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public Config(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7950b = 0;
                    this.f7951c = 0;
                    this.f7954f = (byte) -1;
                }

                private Config() {
                    this.f7950b = 0;
                    this.f7951c = 0;
                    this.f7954f = (byte) -1;
                }
            }

            public static final class CursorMove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: d */
                public static final CursorMove f7962d = new CursorMove();

                /* renamed from: e */
                public static final Parser f7963e = new C6760a();

                /* renamed from: a */
                public volatile Object f7964a;

                /* renamed from: b */
                public int f7965b;

                /* renamed from: c */
                public byte f7966c;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$a */
                public class C6760a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public CursorMove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6761b c6761bM7145r = CursorMove.m7145r();
                        try {
                            c6761bM7145r.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6761bM7145r.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6761bM7145r.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6761bM7145r.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6761bM7145r.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7894u;
                }

                /* renamed from: k */
                public static CursorMove m7144k() {
                    return f7962d;
                }

                /* renamed from: r */
                public static C6761b m7145r() {
                    return f7962d.toBuilder();
                }

                /* renamed from: u */
                public static CursorMove m7146u(ByteString byteString) {
                    return (CursorMove) f7963e.parseFrom(byteString);
                }

                /* renamed from: v */
                public static CursorMove m7147v(byte[] bArr) {
                    return (CursorMove) f7963e.parseFrom(bArr);
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
                    return m7149o().equals(cursorMove.m7149o()) && m7150q() == cursorMove.m7150q() && getUnknownFields().equals(cursorMove.getUnknownFields());
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7963e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f7964a) ? GeneratedMessageV3.computeStringSize(1, this.f7964a) : 0;
                    int i11 = this.f7965b;
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
                    int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7149o().hashCode()) * 37) + 2) * 53) + m7150q()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode;
                    return iHashCode;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7895v.ensureFieldAccessorsInitialized(CursorMove.class, C6761b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f7966c;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f7966c = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public CursorMove getDefaultInstanceForType() {
                    return f7962d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new CursorMove();
                }

                /* renamed from: o */
                public String m7149o() {
                    Object obj = this.f7964a;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7964a = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: q */
                public int m7150q() {
                    return this.f7965b;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C6761b newBuilderForType() {
                    return m7145r();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C6761b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6761b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6761b toBuilder() {
                    return this == f7962d ? new C6761b() : new C6761b().m7166n(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!GeneratedMessageV3.isStringEmpty(this.f7964a)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f7964a);
                    }
                    int i10 = this.f7965b;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$CursorMove$b */
                public static final class C6761b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f7967a;

                    /* renamed from: b */
                    public Object f7968b;

                    /* renamed from: c */
                    public int f7969c;

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6761b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6761b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public CursorMove build() {
                        CursorMove cursorMoveBuildPartial = buildPartial();
                        if (cursorMoveBuildPartial.isInitialized()) {
                            return cursorMoveBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) cursorMoveBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public CursorMove buildPartial() {
                        CursorMove cursorMove = new CursorMove(this);
                        if (this.f7967a != 0) {
                            m7158e(cursorMove);
                        }
                        onBuilt();
                        return cursorMove;
                    }

                    /* renamed from: e */
                    public final void m7158e(CursorMove cursorMove) {
                        int i10 = this.f7967a;
                        if ((i10 & 1) != 0) {
                            cursorMove.f7964a = this.f7968b;
                        }
                        if ((i10 & 2) != 0) {
                            cursorMove.f7965b = this.f7969c;
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6761b clear() {
                        super.clear();
                        this.f7967a = 0;
                        this.f7968b = "";
                        this.f7969c = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6761b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6761b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7894u;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6761b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6761b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6761b mo24228clone() {
                        return (C6761b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7895v.ensureFieldAccessorsInitialized(CursorMove.class, C6761b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public CursorMove getDefaultInstanceForType() {
                        return CursorMove.m7144k();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C6761b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f7968b = codedInputStream.readStringRequireUtf8();
                                            this.f7967a |= 1;
                                        } else if (tag == 16) {
                                            this.f7969c = codedInputStream.readInt32();
                                            this.f7967a |= 2;
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
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public C6761b mergeFrom(Message message) {
                        if (message instanceof CursorMove) {
                            return m7166n((CursorMove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: n */
                    public C6761b m7166n(CursorMove cursorMove) {
                        if (cursorMove == CursorMove.m7144k()) {
                            return this;
                        }
                        if (!cursorMove.m7149o().isEmpty()) {
                            this.f7968b = cursorMove.f7964a;
                            this.f7967a |= 1;
                            onChanged();
                        }
                        if (cursorMove.m7150q() != 0) {
                            m7171t(cursorMove.m7150q());
                        }
                        mergeUnknownFields(cursorMove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public final C6761b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6761b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C6761b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6761b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: r, reason: merged with bridge method [inline-methods] */
                    public C6761b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6761b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: s */
                    public C6761b m7170s(String str) {
                        str.getClass();
                        this.f7968b = str;
                        this.f7967a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: t */
                    public C6761b m7171t(int i10) {
                        this.f7969c = i10;
                        this.f7967a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public final C6761b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6761b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C6761b() {
                        this.f7968b = "";
                    }

                    public C6761b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f7968b = "";
                    }
                }

                public CursorMove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7964a = "";
                    this.f7965b = 0;
                    this.f7966c = (byte) -1;
                }

                private CursorMove() {
                    this.f7964a = "";
                    this.f7965b = 0;
                    this.f7966c = (byte) -1;
                    this.f7964a = "";
                }
            }

            public static final class GraphChange extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: k */
                public static final GraphChange f7970k = new GraphChange();

                /* renamed from: l */
                public static final Parser f7971l = new C6762a();

                /* renamed from: a */
                public int f7972a;

                /* renamed from: b */
                public volatile Object f7973b;

                /* renamed from: c */
                public int f7974c;

                /* renamed from: d */
                public EzyRectF.RectF f7975d;

                /* renamed from: e */
                public volatile Object f7976e;

                /* renamed from: f */
                public EzyPaint.Paint f7977f;

                /* renamed from: g */
                public List f7978g;

                /* renamed from: h */
                public EzyMatrix.Matrix f7979h;

                /* renamed from: i */
                public volatile Object f7980i;

                /* renamed from: j */
                public byte f7981j;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$a */
                public class C6762a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphChange parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6763b c6763bM7174J = GraphChange.m7174J();
                        try {
                            c6763bM7174J.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6763bM7174J.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6763bM7174J.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6763bM7174J.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6763bM7174J.buildPartial());
                        }
                    }
                }

                /* renamed from: A */
                public static GraphChange m7173A() {
                    return f7970k;
                }

                /* renamed from: J */
                public static C6763b m7174J() {
                    return f7970k.toBuilder();
                }

                /* renamed from: M */
                public static GraphChange m7175M(ByteString byteString) {
                    return (GraphChange) f7971l.parseFrom(byteString);
                }

                /* renamed from: N */
                public static GraphChange m7176N(byte[] bArr) {
                    return (GraphChange) f7971l.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7884k;
                }

                /* renamed from: y */
                public static /* synthetic */ int m7191y(GraphChange graphChange, int i10) {
                    int i11 = i10 | graphChange.f7972a;
                    graphChange.f7972a = i11;
                    return i11;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: B, reason: merged with bridge method [inline-methods] */
                public GraphChange getDefaultInstanceForType() {
                    return f7970k;
                }

                /* renamed from: C */
                public String m7194C() {
                    Object obj = this.f7980i;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7980i = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: D */
                public int m7195D() {
                    return this.f7974c;
                }

                /* renamed from: E */
                public String m7196E() {
                    Object obj = this.f7973b;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7973b = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: F */
                public EzyRectF.RectF m7197F() {
                    EzyRectF.RectF rectF = this.f7975d;
                    return rectF == null ? EzyRectF.RectF.m8042m() : rectF;
                }

                /* renamed from: G */
                public EzyPaint.Paint m7198G() {
                    EzyPaint.Paint paint = this.f7977f;
                    return paint == null ? EzyPaint.Paint.m7967q() : paint;
                }

                /* renamed from: H */
                public EzyMatrix.Matrix m7199H() {
                    EzyMatrix.Matrix matrix = this.f7979h;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: I */
                public boolean m7200I() {
                    return (this.f7972a & 4) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: K, reason: merged with bridge method [inline-methods] */
                public C6763b newBuilderForType() {
                    return m7174J();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: L, reason: merged with bridge method [inline-methods] */
                public C6763b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6763b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: O, reason: merged with bridge method [inline-methods] */
                public C6763b toBuilder() {
                    return this == f7970k ? new C6763b() : new C6763b().m7240y(this);
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
                    if (!m7196E().equals(graphChange.m7196E()) || this.f7974c != graphChange.f7974c || hasOutRect() != graphChange.hasOutRect()) {
                        return false;
                    }
                    if ((hasOutRect() && !m7197F().equals(graphChange.m7197F())) || !getContent().equals(graphChange.getContent()) || hasPaint() != graphChange.hasPaint()) {
                        return false;
                    }
                    if ((!hasPaint() || m7198G().equals(graphChange.m7198G())) && getPointsList().equals(graphChange.getPointsList()) && m7200I() == graphChange.m7200I()) {
                        return (!m7200I() || m7199H().equals(graphChange.m7199H())) && m7194C().equals(graphChange.m7194C()) && getUnknownFields().equals(graphChange.getUnknownFields());
                    }
                    return false;
                }

                public String getContent() {
                    Object obj = this.f7976e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7976e = stringUtf8;
                    return stringUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7971l;
                }

                public int getPointsCount() {
                    return this.f7978g.size();
                }

                public List getPointsList() {
                    return this.f7978g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeStringSize = !GeneratedMessageV3.isStringEmpty(this.f7973b) ? GeneratedMessageV3.computeStringSize(1, this.f7973b) : 0;
                    if (this.f7974c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.f7974c);
                    }
                    if ((1 & this.f7972a) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(3, m7197F());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7976e)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.f7976e);
                    }
                    if ((this.f7972a & 2) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(5, m7198G());
                    }
                    for (int i11 = 0; i11 < this.f7978g.size(); i11++) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(6, (MessageLite) this.f7978g.get(i11));
                    }
                    if ((this.f7972a & 4) != 0) {
                        iComputeStringSize += CodedOutputStream.computeMessageSize(7, m7199H());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7980i)) {
                        iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.f7980i);
                    }
                    int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f7972a & 1) != 0;
                }

                public boolean hasPaint() {
                    return (this.f7972a & 2) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + m7196E().hashCode()) * 37) + 2) * 53) + this.f7974c;
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7197F().hashCode();
                    }
                    int iHashCode2 = (((iHashCode * 37) + 4) * 53) + getContent().hashCode();
                    if (hasPaint()) {
                        iHashCode2 = (((iHashCode2 * 37) + 5) * 53) + m7198G().hashCode();
                    }
                    if (getPointsCount() > 0) {
                        iHashCode2 = (((iHashCode2 * 37) + 6) * 53) + getPointsList().hashCode();
                    }
                    if (m7200I()) {
                        iHashCode2 = (((iHashCode2 * 37) + 7) * 53) + m7199H().hashCode();
                    }
                    int iHashCode3 = (((((iHashCode2 * 37) + 8) * 53) + m7194C().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7885l.ensureFieldAccessorsInitialized(GraphChange.class, C6763b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f7981j;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f7981j = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphChange();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (!GeneratedMessageV3.isStringEmpty(this.f7973b)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 1, this.f7973b);
                    }
                    if (this.f7974c != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(2, this.f7974c);
                    }
                    if ((this.f7972a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m7197F());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7976e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f7976e);
                    }
                    if ((this.f7972a & 2) != 0) {
                        codedOutputStream.writeMessage(5, m7198G());
                    }
                    for (int i10 = 0; i10 < this.f7978g.size(); i10++) {
                        codedOutputStream.writeMessage(6, (MessageLite) this.f7978g.get(i10));
                    }
                    if ((this.f7972a & 4) != 0) {
                        codedOutputStream.writeMessage(7, m7199H());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7980i)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 8, this.f7980i);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphChange$b */
                public static final class C6763b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f7982a;

                    /* renamed from: b */
                    public Object f7983b;

                    /* renamed from: c */
                    public int f7984c;

                    /* renamed from: d */
                    public EzyRectF.RectF f7985d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f7986e;

                    /* renamed from: f */
                    public Object f7987f;

                    /* renamed from: g */
                    public EzyPaint.Paint f7988g;

                    /* renamed from: h */
                    public SingleFieldBuilderV3 f7989h;

                    /* renamed from: i */
                    public List f7990i;

                    /* renamed from: j */
                    public RepeatedFieldBuilderV3 f7991j;

                    /* renamed from: k */
                    public EzyMatrix.Matrix f7992k;

                    /* renamed from: l */
                    public SingleFieldBuilderV3 f7993l;

                    /* renamed from: m */
                    public Object f7994m;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                            m7234s();
                            getPointsFieldBuilder();
                            m7237v();
                        }
                    }

                    /* renamed from: A */
                    public C6763b m7205A(EzyPaint.Paint paint) {
                        EzyPaint.Paint paint2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7989h;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(paint);
                        } else if ((this.f7982a & 16) == 0 || (paint2 = this.f7988g) == null || paint2 == EzyPaint.Paint.m7967q()) {
                            this.f7988g = paint;
                        } else {
                            m7233r().m7989n(paint);
                        }
                        if (this.f7988g != null) {
                            this.f7982a |= 16;
                            onChanged();
                        }
                        return this;
                    }

                    /* renamed from: B */
                    public C6763b m7206B(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7993l;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f7982a & 64) == 0 || (matrix2 = this.f7992k) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f7992k = matrix;
                        } else {
                            m7236u().m7748n(matrix);
                        }
                        if (this.f7992k != null) {
                            this.f7982a |= 64;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C6763b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6763b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: D */
                    public C6763b m7208D(String str) {
                        str.getClass();
                        this.f7987f = str;
                        this.f7982a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public C6763b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6763b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: F */
                    public C6763b m7210F(String str) {
                        str.getClass();
                        this.f7994m = str;
                        this.f7982a |= 128;
                        onChanged();
                        return this;
                    }

                    /* renamed from: G */
                    public C6763b m7211G(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f7982a |= 2;
                        this.f7984c = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: H */
                    public C6763b m7212H(int i10) {
                        this.f7984c = i10;
                        this.f7982a |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: I */
                    public C6763b m7213I(String str) {
                        str.getClass();
                        this.f7983b = str;
                        this.f7982a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: J */
                    public C6763b m7214J(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7986e;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f7985d = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f7982a |= 4;
                        onChanged();
                        return this;
                    }

                    /* renamed from: K */
                    public C6763b m7215K(EzyPaint.Paint paint) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7989h;
                        if (singleFieldBuilderV3 == null) {
                            paint.getClass();
                            this.f7988g = paint;
                        } else {
                            singleFieldBuilderV3.setMessage(paint);
                        }
                        this.f7982a |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: L */
                    public C6763b m7216L(EzyMatrix.Matrix matrix) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7993l;
                        if (singleFieldBuilderV3 == null) {
                            matrix.getClass();
                            this.f7992k = matrix;
                        } else {
                            singleFieldBuilderV3.setMessage(matrix);
                        }
                        this.f7982a |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: M, reason: merged with bridge method [inline-methods] */
                    public C6763b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6763b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: N, reason: merged with bridge method [inline-methods] */
                    public final C6763b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6763b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: b */
                    public C6763b m7219b(EzyPointF.PointF pointF) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f7991j;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addMessage(pointF);
                            return this;
                        }
                        pointF.getClass();
                        ensurePointsIsMutable();
                        this.f7990i.add(pointF);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C6763b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6763b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public GraphChange build() {
                        GraphChange graphChangeBuildPartial = buildPartial();
                        if (graphChangeBuildPartial.isInitialized()) {
                            return graphChangeBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphChangeBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphChange buildPartial() {
                        GraphChange graphChange = new GraphChange(this);
                        m7224g(graphChange);
                        if (this.f7982a != 0) {
                            m7223f(graphChange);
                        }
                        onBuilt();
                        return graphChange;
                    }

                    public final void ensurePointsIsMutable() {
                        if ((this.f7982a & 32) == 0) {
                            this.f7990i = new ArrayList(this.f7990i);
                            this.f7982a |= 32;
                        }
                    }

                    /* renamed from: f */
                    public final void m7223f(GraphChange graphChange) {
                        int i10;
                        int i11 = this.f7982a;
                        if ((i11 & 1) != 0) {
                            graphChange.f7973b = this.f7983b;
                        }
                        if ((i11 & 2) != 0) {
                            graphChange.f7974c = this.f7984c;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7986e;
                            graphChange.f7975d = singleFieldBuilderV3 == null ? this.f7985d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            graphChange.f7976e = this.f7987f;
                        }
                        if ((i11 & 16) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7989h;
                            graphChange.f7977f = singleFieldBuilderV32 == null ? this.f7988g : (EzyPaint.Paint) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 64) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f7993l;
                            graphChange.f7979h = singleFieldBuilderV33 == null ? this.f7992k : (EzyMatrix.Matrix) singleFieldBuilderV33.build();
                            i10 |= 4;
                        }
                        if ((i11 & 128) != 0) {
                            graphChange.f7980i = this.f7994m;
                        }
                        GraphChange.m7191y(graphChange, i10);
                    }

                    /* renamed from: g */
                    public final void m7224g(GraphChange graphChange) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f7991j;
                        if (repeatedFieldBuilderV3 != null) {
                            graphChange.f7978g = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f7982a & 32) != 0) {
                            this.f7990i = Collections.unmodifiableList(this.f7990i);
                            this.f7982a &= -33;
                        }
                        graphChange.f7978g = this.f7990i;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7884k;
                    }

                    public final SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f7986e == null) {
                            this.f7986e = new SingleFieldBuilderV3(m7230n(), getParentForChildren(), isClean());
                            this.f7985d = null;
                        }
                        return this.f7986e;
                    }

                    public final RepeatedFieldBuilderV3 getPointsFieldBuilder() {
                        if (this.f7991j == null) {
                            this.f7991j = new RepeatedFieldBuilderV3(this.f7990i, (this.f7982a & 32) != 0, getParentForChildren(), isClean());
                            this.f7990i = null;
                        }
                        return this.f7991j;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6763b clear() {
                        super.clear();
                        this.f7982a = 0;
                        this.f7983b = "";
                        this.f7984c = 0;
                        this.f7985d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7986e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f7986e = null;
                        }
                        this.f7987f = "";
                        this.f7988g = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f7989h;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f7989h = null;
                        }
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f7991j;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f7990i = Collections.EMPTY_LIST;
                        } else {
                            this.f7990i = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f7982a &= -33;
                        this.f7992k = null;
                        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f7993l;
                        if (singleFieldBuilderV33 != null) {
                            singleFieldBuilderV33.dispose();
                            this.f7993l = null;
                        }
                        this.f7994m = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6763b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6763b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7885l.ensureFieldAccessorsInitialized(GraphChange.class, C6763b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C6763b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6763b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C6763b mo24228clone() {
                        return (C6763b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: m, reason: merged with bridge method [inline-methods] */
                    public GraphChange getDefaultInstanceForType() {
                        return GraphChange.m7173A();
                    }

                    /* renamed from: n */
                    public EzyRectF.RectF m7230n() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7986e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f7985d;
                        return rectF == null ? EzyRectF.RectF.m8042m() : rectF;
                    }

                    /* renamed from: p */
                    public EzyRectF.RectF.C6811b m7231p() {
                        this.f7982a |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C6811b) getOutRectFieldBuilder().getBuilder();
                    }

                    /* renamed from: q */
                    public EzyPaint.Paint m7232q() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7989h;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                        }
                        EzyPaint.Paint paint = this.f7988g;
                        return paint == null ? EzyPaint.Paint.m7967q() : paint;
                    }

                    /* renamed from: r */
                    public EzyPaint.Paint.C6804b m7233r() {
                        this.f7982a |= 16;
                        onChanged();
                        return (EzyPaint.Paint.C6804b) m7234s().getBuilder();
                    }

                    /* renamed from: s */
                    public final SingleFieldBuilderV3 m7234s() {
                        if (this.f7989h == null) {
                            this.f7989h = new SingleFieldBuilderV3(m7232q(), getParentForChildren(), isClean());
                            this.f7988g = null;
                        }
                        return this.f7989h;
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix m7235t() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7993l;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f7992k;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: u */
                    public EzyMatrix.Matrix.C6790b m7236u() {
                        this.f7982a |= 64;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7237v().getBuilder();
                    }

                    /* renamed from: v */
                    public final SingleFieldBuilderV3 m7237v() {
                        if (this.f7993l == null) {
                            this.f7993l = new SingleFieldBuilderV3(m7235t(), getParentForChildren(), isClean());
                            this.f7992k = null;
                        }
                        return this.f7993l;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C6763b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            this.f7983b = codedInputStream.readStringRequireUtf8();
                                            this.f7982a |= 1;
                                        } else if (tag == 16) {
                                            this.f7984c = codedInputStream.readEnum();
                                            this.f7982a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f7982a |= 4;
                                        } else if (tag == 34) {
                                            this.f7987f = codedInputStream.readStringRequireUtf8();
                                            this.f7982a |= 8;
                                        } else if (tag == 42) {
                                            codedInputStream.readMessage(m7234s().getBuilder(), extensionRegistryLite);
                                            this.f7982a |= 16;
                                        } else if (tag == 50) {
                                            EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f7991j;
                                            if (repeatedFieldBuilderV3 == null) {
                                                ensurePointsIsMutable();
                                                this.f7990i.add(pointF);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(pointF);
                                            }
                                        } else if (tag == 58) {
                                            codedInputStream.readMessage(m7237v().getBuilder(), extensionRegistryLite);
                                            this.f7982a |= 64;
                                        } else if (tag == 66) {
                                            this.f7994m = codedInputStream.readStringRequireUtf8();
                                            this.f7982a |= 128;
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
                    public C6763b mergeFrom(Message message) {
                        if (message instanceof GraphChange) {
                            return m7240y((GraphChange) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: y */
                    public C6763b m7240y(GraphChange graphChange) {
                        if (graphChange == GraphChange.m7173A()) {
                            return this;
                        }
                        if (!graphChange.m7196E().isEmpty()) {
                            this.f7983b = graphChange.f7973b;
                            this.f7982a |= 1;
                            onChanged();
                        }
                        if (graphChange.f7974c != 0) {
                            m7212H(graphChange.m7195D());
                        }
                        if (graphChange.hasOutRect()) {
                            m7241z(graphChange.m7197F());
                        }
                        if (!graphChange.getContent().isEmpty()) {
                            this.f7987f = graphChange.f7976e;
                            this.f7982a |= 8;
                            onChanged();
                        }
                        if (graphChange.hasPaint()) {
                            m7205A(graphChange.m7198G());
                        }
                        if (this.f7991j == null) {
                            if (!graphChange.f7978g.isEmpty()) {
                                if (this.f7990i.isEmpty()) {
                                    this.f7990i = graphChange.f7978g;
                                    this.f7982a &= -33;
                                } else {
                                    ensurePointsIsMutable();
                                    this.f7990i.addAll(graphChange.f7978g);
                                }
                                onChanged();
                            }
                        } else if (!graphChange.f7978g.isEmpty()) {
                            if (this.f7991j.isEmpty()) {
                                this.f7991j.dispose();
                                this.f7991j = null;
                                this.f7990i = graphChange.f7978g;
                                this.f7982a &= -33;
                                this.f7991j = GeneratedMessageV3.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                            } else {
                                this.f7991j.addAllMessages(graphChange.f7978g);
                            }
                        }
                        if (graphChange.m7200I()) {
                            m7206B(graphChange.m7199H());
                        }
                        if (!graphChange.m7194C().isEmpty()) {
                            this.f7994m = graphChange.f7980i;
                            this.f7982a |= 128;
                            onChanged();
                        }
                        mergeUnknownFields(graphChange.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C6763b m7241z(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f7986e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f7982a & 4) == 0 || (rectF2 = this.f7985d) == null || rectF2 == EzyRectF.RectF.m8042m()) {
                            this.f7985d = rectF;
                        } else {
                            m7231p().m8060n(rectF);
                        }
                        if (this.f7985d != null) {
                            this.f7982a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    public C6763b() {
                        this.f7983b = "";
                        this.f7984c = 0;
                        this.f7987f = "";
                        this.f7990i = Collections.EMPTY_LIST;
                        this.f7994m = "";
                        maybeForceBuilderInitialization();
                    }

                    public C6763b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f7983b = "";
                        this.f7984c = 0;
                        this.f7987f = "";
                        this.f7990i = Collections.EMPTY_LIST;
                        this.f7994m = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphChange(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7973b = "";
                    this.f7974c = 0;
                    this.f7976e = "";
                    this.f7980i = "";
                    this.f7981j = (byte) -1;
                }

                private GraphChange() {
                    this.f7973b = "";
                    this.f7974c = 0;
                    this.f7976e = "";
                    this.f7980i = "";
                    this.f7981j = (byte) -1;
                    this.f7973b = "";
                    this.f7974c = 0;
                    this.f7976e = "";
                    this.f7978g = Collections.EMPTY_LIST;
                    this.f7980i = "";
                }
            }

            public static final class GraphData extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: j */
                public static final GraphData f7995j = new GraphData();

                /* renamed from: k */
                public static final Parser f7996k = new C6764a();

                /* renamed from: a */
                public int f7997a;

                /* renamed from: b */
                public int f7998b;

                /* renamed from: c */
                public volatile Object f7999c;

                /* renamed from: d */
                public EzyRectF.RectF f8000d;

                /* renamed from: e */
                public volatile Object f8001e;

                /* renamed from: f */
                public volatile Object f8002f;

                /* renamed from: g */
                public int f8003g;

                /* renamed from: h */
                public volatile Object f8004h;

                /* renamed from: i */
                public byte f8005i;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$a */
                public class C6764a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6765b c6765bM7242I = GraphData.m7242I();
                        try {
                            c6765bM7242I.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6765bM7242I.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6765bM7242I.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6765bM7242I.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6765bM7242I.buildPartial());
                        }
                    }
                }

                /* renamed from: I */
                public static C6765b m7242I() {
                    return f7995j.toBuilder();
                }

                /* renamed from: L */
                public static GraphData m7243L(ByteString byteString) {
                    return (GraphData) f7996k.parseFrom(byteString);
                }

                /* renamed from: M */
                public static GraphData m7244M(byte[] bArr) {
                    return (GraphData) f7996k.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7878e;
                }

                public static Parser parser() {
                    return f7996k;
                }

                /* renamed from: w */
                public static /* synthetic */ int m7257w(GraphData graphData, int i10) {
                    int i11 = i10 | graphData.f7997a;
                    graphData.f7997a = i11;
                    return i11;
                }

                /* renamed from: y */
                public static GraphData m7259y() {
                    return f7995j;
                }

                /* renamed from: A */
                public String m7260A() {
                    Object obj = this.f8004h;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8004h = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: B */
                public EzyGraphEnum.GraphEnum m7261B() {
                    EzyGraphEnum.GraphEnum graphEnumM7490f = EzyGraphEnum.GraphEnum.m7490f(this.f7998b);
                    return graphEnumM7490f == null ? EzyGraphEnum.GraphEnum.UNRECOGNIZED : graphEnumM7490f;
                }

                /* renamed from: C */
                public int m7262C() {
                    return this.f7998b;
                }

                /* renamed from: D */
                public String m7263D() {
                    Object obj = this.f7999c;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f7999c = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: E */
                public EzyRectF.RectF m7264E() {
                    EzyRectF.RectF rectF = this.f8000d;
                    return rectF == null ? EzyRectF.RectF.m8042m() : rectF;
                }

                /* renamed from: F */
                public String m7265F() {
                    Object obj = this.f8001e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8001e = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: G */
                public String m7266G() {
                    Object obj = this.f8002f;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8002f = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: H */
                public int m7267H() {
                    return this.f8003g;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: J, reason: merged with bridge method [inline-methods] */
                public C6765b newBuilderForType() {
                    return m7242I();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: K, reason: merged with bridge method [inline-methods] */
                public C6765b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6765b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: N, reason: merged with bridge method [inline-methods] */
                public C6765b toBuilder() {
                    return this == f7995j ? new C6765b() : new C6765b().m7292r(this);
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
                    if (this.f7998b == graphData.f7998b && m7263D().equals(graphData.m7263D()) && hasOutRect() == graphData.hasOutRect()) {
                        return (!hasOutRect() || m7264E().equals(graphData.m7264E())) && m7265F().equals(graphData.m7265F()) && m7266G().equals(graphData.m7266G()) && m7267H() == graphData.m7267H() && m7260A().equals(graphData.m7260A()) && getUnknownFields().equals(graphData.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f7996k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeEnumSize = this.f7998b != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f7998b) : 0;
                    if (!GeneratedMessageV3.isStringEmpty(this.f7999c)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.f7999c);
                    }
                    if ((this.f7997a & 1) != 0) {
                        iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m7264E());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8001e)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.f8001e);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8002f)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(5, this.f8002f);
                    }
                    int i11 = this.f8003g;
                    if (i11 != 0) {
                        iComputeEnumSize += CodedOutputStream.computeInt32Size(6, i11);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8004h)) {
                        iComputeEnumSize += GeneratedMessageV3.computeStringSize(7, this.f8004h);
                    }
                    int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }

                public boolean hasOutRect() {
                    return (this.f7997a & 1) != 0;
                }

                @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
                public int hashCode() {
                    int i10 = this.memoizedHashCode;
                    if (i10 != 0) {
                        return i10;
                    }
                    int iHashCode = ((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f7998b) * 37) + 2) * 53) + m7263D().hashCode();
                    if (hasOutRect()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7264E().hashCode();
                    }
                    int iHashCode2 = (((((((((((((((((iHashCode * 37) + 4) * 53) + m7265F().hashCode()) * 37) + 5) * 53) + m7266G().hashCode()) * 37) + 6) * 53) + m7267H()) * 37) + 7) * 53) + m7260A().hashCode()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7879f.ensureFieldAccessorsInitialized(GraphData.class, C6765b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8005i;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8005i = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphData();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if (this.f7998b != EzyGraphEnum.GraphEnum.BOUNDED_CONTAINER_GRAPH.getNumber()) {
                        codedOutputStream.writeEnum(1, this.f7998b);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f7999c)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 2, this.f7999c);
                    }
                    if ((this.f7997a & 1) != 0) {
                        codedOutputStream.writeMessage(3, m7264E());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8001e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f8001e);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8002f)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 5, this.f8002f);
                    }
                    int i10 = this.f8003g;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(6, i10);
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8004h)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 7, this.f8004h);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public GraphData getDefaultInstanceForType() {
                    return f7995j;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphData$b */
                public static final class C6765b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8006a;

                    /* renamed from: b */
                    public int f8007b;

                    /* renamed from: c */
                    public Object f8008c;

                    /* renamed from: d */
                    public EzyRectF.RectF f8009d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f8010e;

                    /* renamed from: f */
                    public Object f8011f;

                    /* renamed from: g */
                    public Object f8012g;

                    /* renamed from: h */
                    public int f8013h;

                    /* renamed from: i */
                    public Object f8014i;

                    private SingleFieldBuilderV3 getOutRectFieldBuilder() {
                        if (this.f8010e == null) {
                            this.f8010e = new SingleFieldBuilderV3(m7288m(), getParentForChildren(), isClean());
                            this.f8009d = null;
                        }
                        return this.f8010e;
                    }

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            getOutRectFieldBuilder();
                        }
                    }

                    /* renamed from: A */
                    public C6765b m7273A(String str) {
                        str.getClass();
                        this.f8011f = str;
                        this.f8006a |= 8;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public C6765b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6765b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: C */
                    public C6765b m7275C(String str) {
                        str.getClass();
                        this.f8012g = str;
                        this.f8006a |= 16;
                        onChanged();
                        return this;
                    }

                    /* renamed from: D */
                    public C6765b m7276D(int i10) {
                        this.f8013h = i10;
                        this.f8006a |= 32;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: E, reason: merged with bridge method [inline-methods] */
                    public final C6765b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6765b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6765b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6765b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public GraphData build() {
                        GraphData graphDataBuildPartial = buildPartial();
                        if (graphDataBuildPartial.isInitialized()) {
                            return graphDataBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphDataBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public GraphData buildPartial() {
                        GraphData graphData = new GraphData(this);
                        if (this.f8006a != 0) {
                            m7281e(graphData);
                        }
                        onBuilt();
                        return graphData;
                    }

                    /* renamed from: e */
                    public final void m7281e(GraphData graphData) {
                        int i10;
                        int i11 = this.f8006a;
                        if ((i11 & 1) != 0) {
                            graphData.f7998b = this.f8007b;
                        }
                        if ((i11 & 2) != 0) {
                            graphData.f7999c = this.f8008c;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8010e;
                            graphData.f8000d = singleFieldBuilderV3 == null ? this.f8009d : (EzyRectF.RectF) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 8) != 0) {
                            graphData.f8001e = this.f8011f;
                        }
                        if ((i11 & 16) != 0) {
                            graphData.f8002f = this.f8012g;
                        }
                        if ((i11 & 32) != 0) {
                            graphData.f8003g = this.f8013h;
                        }
                        if ((i11 & 64) != 0) {
                            graphData.f8004h = this.f8014i;
                        }
                        GraphData.m7257w(graphData, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6765b clear() {
                        super.clear();
                        this.f8006a = 0;
                        this.f8007b = 0;
                        this.f8008c = "";
                        this.f8009d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8010e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f8010e = null;
                        }
                        this.f8011f = "";
                        this.f8012g = "";
                        this.f8013h = 0;
                        this.f8014i = "";
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6765b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6765b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7878e;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6765b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6765b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6765b mo24228clone() {
                        return (C6765b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7879f.ensureFieldAccessorsInitialized(GraphData.class, C6765b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public GraphData getDefaultInstanceForType() {
                        return GraphData.m7259y();
                    }

                    /* renamed from: l */
                    public String m7287l() {
                        Object obj = this.f8014i;
                        if (obj instanceof String) {
                            return (String) obj;
                        }
                        String stringUtf8 = ((ByteString) obj).toStringUtf8();
                        this.f8014i = stringUtf8;
                        return stringUtf8;
                    }

                    /* renamed from: m */
                    public EzyRectF.RectF m7288m() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8010e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyRectF.RectF) singleFieldBuilderV3.getMessage();
                        }
                        EzyRectF.RectF rectF = this.f8009d;
                        return rectF == null ? EzyRectF.RectF.m8042m() : rectF;
                    }

                    /* renamed from: n */
                    public EzyRectF.RectF.C6811b m7289n() {
                        this.f8006a |= 4;
                        onChanged();
                        return (EzyRectF.RectF.C6811b) getOutRectFieldBuilder().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: p, reason: merged with bridge method [inline-methods] */
                    public C6765b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 8) {
                                            this.f8007b = codedInputStream.readEnum();
                                            this.f8006a |= 1;
                                        } else if (tag == 18) {
                                            this.f8008c = codedInputStream.readStringRequireUtf8();
                                            this.f8006a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(getOutRectFieldBuilder().getBuilder(), extensionRegistryLite);
                                            this.f8006a |= 4;
                                        } else if (tag == 34) {
                                            this.f8011f = codedInputStream.readStringRequireUtf8();
                                            this.f8006a |= 8;
                                        } else if (tag == 42) {
                                            this.f8012g = codedInputStream.readStringRequireUtf8();
                                            this.f8006a |= 16;
                                        } else if (tag == 48) {
                                            this.f8013h = codedInputStream.readInt32();
                                            this.f8006a |= 32;
                                        } else if (tag == 58) {
                                            this.f8014i = codedInputStream.readStringRequireUtf8();
                                            this.f8006a |= 64;
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
                    public C6765b mergeFrom(Message message) {
                        if (message instanceof GraphData) {
                            return m7292r((GraphData) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: r */
                    public C6765b m7292r(GraphData graphData) {
                        if (graphData == GraphData.m7259y()) {
                            return this;
                        }
                        if (graphData.f7998b != 0) {
                            m7298x(graphData.m7262C());
                        }
                        if (!graphData.m7263D().isEmpty()) {
                            this.f8008c = graphData.f7999c;
                            this.f8006a |= 2;
                            onChanged();
                        }
                        if (graphData.hasOutRect()) {
                            m7293s(graphData.m7264E());
                        }
                        if (!graphData.m7265F().isEmpty()) {
                            this.f8011f = graphData.f8001e;
                            this.f8006a |= 8;
                            onChanged();
                        }
                        if (!graphData.m7266G().isEmpty()) {
                            this.f8012g = graphData.f8002f;
                            this.f8006a |= 16;
                            onChanged();
                        }
                        if (graphData.m7267H() != 0) {
                            m7276D(graphData.m7267H());
                        }
                        if (!graphData.m7260A().isEmpty()) {
                            this.f8014i = graphData.f8004h;
                            this.f8006a |= 64;
                            onChanged();
                        }
                        mergeUnknownFields(graphData.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: s */
                    public C6765b m7293s(EzyRectF.RectF rectF) {
                        EzyRectF.RectF rectF2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8010e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(rectF);
                        } else if ((this.f8006a & 4) == 0 || (rectF2 = this.f8009d) == null || rectF2 == EzyRectF.RectF.m8042m()) {
                            this.f8009d = rectF;
                        } else {
                            m7289n().m8060n(rectF);
                        }
                        if (this.f8009d != null) {
                            this.f8006a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C6765b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6765b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: u */
                    public C6765b m7295u(String str) {
                        str.getClass();
                        this.f8014i = str;
                        this.f8006a |= 64;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C6765b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6765b) super.setField(fieldDescriptor, obj);
                    }

                    /* renamed from: w */
                    public C6765b m7297w(EzyGraphEnum.GraphEnum graphEnum) {
                        graphEnum.getClass();
                        this.f8006a |= 1;
                        this.f8007b = graphEnum.getNumber();
                        onChanged();
                        return this;
                    }

                    /* renamed from: x */
                    public C6765b m7298x(int i10) {
                        this.f8007b = i10;
                        this.f8006a |= 1;
                        onChanged();
                        return this;
                    }

                    /* renamed from: y */
                    public C6765b m7299y(String str) {
                        str.getClass();
                        this.f8008c = str;
                        this.f8006a |= 2;
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C6765b m7300z(EzyRectF.RectF rectF) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8010e;
                        if (singleFieldBuilderV3 == null) {
                            rectF.getClass();
                            this.f8009d = rectF;
                        } else {
                            singleFieldBuilderV3.setMessage(rectF);
                        }
                        this.f8006a |= 4;
                        onChanged();
                        return this;
                    }

                    public C6765b() {
                        this.f8007b = 0;
                        this.f8008c = "";
                        this.f8011f = "";
                        this.f8012g = "";
                        this.f8014i = "";
                        maybeForceBuilderInitialization();
                    }

                    public C6765b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8007b = 0;
                        this.f8008c = "";
                        this.f8011f = "";
                        this.f8012g = "";
                        this.f8014i = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphData(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f7998b = 0;
                    this.f7999c = "";
                    this.f8001e = "";
                    this.f8002f = "";
                    this.f8003g = 0;
                    this.f8004h = "";
                    this.f8005i = (byte) -1;
                }

                private GraphData() {
                    this.f7998b = 0;
                    this.f7999c = "";
                    this.f8001e = "";
                    this.f8002f = "";
                    this.f8003g = 0;
                    this.f8004h = "";
                    this.f8005i = (byte) -1;
                    this.f7998b = 0;
                    this.f7999c = "";
                    this.f8001e = "";
                    this.f8002f = "";
                    this.f8004h = "";
                }
            }

            public static final class GraphMatrix extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: h */
                public static final GraphMatrix f8015h = new GraphMatrix();

                /* renamed from: i */
                public static final Parser f8016i = new C6766a();

                /* renamed from: a */
                public int f8017a;

                /* renamed from: b */
                public List f8018b;

                /* renamed from: c */
                public EzyMatrix.Matrix f8019c;

                /* renamed from: d */
                public EzyMatrix.Matrix f8020d;

                /* renamed from: e */
                public volatile Object f8021e;

                /* renamed from: f */
                public int f8022f;

                /* renamed from: g */
                public byte f8023g;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$a */
                public class C6766a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6767b c6767bM7301E = GraphMatrix.m7301E();
                        try {
                            c6767bM7301E.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6767bM7301E.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6767bM7301E.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6767bM7301E.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6767bM7301E.buildPartial());
                        }
                    }
                }

                /* renamed from: E */
                public static C6767b m7301E() {
                    return f8015h.toBuilder();
                }

                /* renamed from: H */
                public static GraphMatrix m7302H(ByteString byteString) {
                    return (GraphMatrix) f8016i.parseFrom(byteString);
                }

                /* renamed from: I */
                public static GraphMatrix m7303I(byte[] bArr) {
                    return (GraphMatrix) f8016i.parseFrom(bArr);
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7882i;
                }

                /* renamed from: s */
                public static /* synthetic */ int m7312s(GraphMatrix graphMatrix, int i10) {
                    int i11 = i10 | graphMatrix.f8017a;
                    graphMatrix.f8017a = i11;
                    return i11;
                }

                /* renamed from: u */
                public static GraphMatrix m7314u() {
                    return f8015h;
                }

                /* renamed from: A */
                public String m7315A() {
                    Object obj = this.f8021e;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    String stringUtf8 = ((ByteString) obj).toStringUtf8();
                    this.f8021e = stringUtf8;
                    return stringUtf8;
                }

                /* renamed from: B */
                public int m7316B() {
                    return this.f8022f;
                }

                /* renamed from: C */
                public boolean m7317C() {
                    return (this.f8017a & 2) != 0;
                }

                /* renamed from: D */
                public boolean m7318D() {
                    return (this.f8017a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public C6767b newBuilderForType() {
                    return m7301E();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: G, reason: merged with bridge method [inline-methods] */
                public C6767b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6767b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: J, reason: merged with bridge method [inline-methods] */
                public C6767b toBuilder() {
                    return this == f8015h ? new C6767b() : new C6767b().m7356y(this);
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
                    if (!m7324x().equals(graphMatrix.m7324x()) || m7318D() != graphMatrix.m7318D()) {
                        return false;
                    }
                    if ((!m7318D() || m7326z().equals(graphMatrix.m7326z())) && m7317C() == graphMatrix.m7317C()) {
                        return (!m7317C() || m7325y().equals(graphMatrix.m7325y())) && m7315A().equals(graphMatrix.m7315A()) && m7316B() == graphMatrix.m7316B() && getUnknownFields().equals(graphMatrix.getUnknownFields());
                    }
                    return false;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8016i;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeInt32Size = 0;
                    for (int i11 = 0; i11 < this.f8018b.size(); i11++) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8018b.get(i11));
                    }
                    if ((this.f8017a & 1) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(2, m7326z());
                    }
                    if ((this.f8017a & 2) != 0) {
                        iComputeInt32Size += CodedOutputStream.computeMessageSize(3, m7325y());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8021e)) {
                        iComputeInt32Size += GeneratedMessageV3.computeStringSize(4, this.f8021e);
                    }
                    int i12 = this.f8022f;
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
                    if (m7323w() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7324x().hashCode();
                    }
                    if (m7318D()) {
                        iHashCode = (((iHashCode * 37) + 2) * 53) + m7326z().hashCode();
                    }
                    if (m7317C()) {
                        iHashCode = (((iHashCode * 37) + 3) * 53) + m7325y().hashCode();
                    }
                    int iHashCode2 = (((((((((iHashCode * 37) + 4) * 53) + m7315A().hashCode()) * 37) + 5) * 53) + m7316B()) * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7883j.ensureFieldAccessorsInitialized(GraphMatrix.class, C6767b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8023g;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8023g = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphMatrix();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public GraphMatrix getDefaultInstanceForType() {
                    return f8015h;
                }

                /* renamed from: w */
                public int m7323w() {
                    return this.f8018b.size();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    for (int i10 = 0; i10 < this.f8018b.size(); i10++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f8018b.get(i10));
                    }
                    if ((this.f8017a & 1) != 0) {
                        codedOutputStream.writeMessage(2, m7326z());
                    }
                    if ((this.f8017a & 2) != 0) {
                        codedOutputStream.writeMessage(3, m7325y());
                    }
                    if (!GeneratedMessageV3.isStringEmpty(this.f8021e)) {
                        GeneratedMessageV3.writeString(codedOutputStream, 4, this.f8021e);
                    }
                    int i11 = this.f8022f;
                    if (i11 != 0) {
                        codedOutputStream.writeInt32(5, i11);
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: x */
                public List m7324x() {
                    return this.f8018b;
                }

                /* renamed from: y */
                public EzyMatrix.Matrix m7325y() {
                    EzyMatrix.Matrix matrix = this.f8020d;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: z */
                public EzyMatrix.Matrix m7326z() {
                    EzyMatrix.Matrix matrix = this.f8019c;
                    return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphMatrix$b */
                public static final class C6767b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8024a;

                    /* renamed from: b */
                    public List f8025b;

                    /* renamed from: c */
                    public RepeatedFieldBuilderV3 f8026c;

                    /* renamed from: d */
                    public EzyMatrix.Matrix f8027d;

                    /* renamed from: e */
                    public SingleFieldBuilderV3 f8028e;

                    /* renamed from: f */
                    public EzyMatrix.Matrix f8029f;

                    /* renamed from: g */
                    public SingleFieldBuilderV3 f8030g;

                    /* renamed from: h */
                    public Object f8031h;

                    /* renamed from: i */
                    public int f8032i;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7349p();
                            m7329v();
                            m7328s();
                        }
                    }

                    /* renamed from: s */
                    private SingleFieldBuilderV3 m7328s() {
                        if (this.f8030g == null) {
                            this.f8030g = new SingleFieldBuilderV3(m7350q(), getParentForChildren(), isClean());
                            this.f8029f = null;
                        }
                        return this.f8030g;
                    }

                    /* renamed from: v */
                    private SingleFieldBuilderV3 m7329v() {
                        if (this.f8028e == null) {
                            this.f8028e = new SingleFieldBuilderV3(m7352t(), getParentForChildren(), isClean());
                            this.f8027d = null;
                        }
                        return this.f8028e;
                    }

                    /* renamed from: A */
                    public C6767b m7330A(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8028e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8024a & 2) == 0 || (matrix2 = this.f8027d) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f8027d = matrix;
                        } else {
                            m7353u().m7748n(matrix);
                        }
                        if (this.f8027d != null) {
                            this.f8024a |= 2;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: B, reason: merged with bridge method [inline-methods] */
                    public final C6767b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6767b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public C6767b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6767b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: D, reason: merged with bridge method [inline-methods] */
                    public C6767b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6767b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: E */
                    public C6767b m7334E(String str) {
                        str.getClass();
                        this.f8031h = str;
                        this.f8024a |= 8;
                        onChanged();
                        return this;
                    }

                    /* renamed from: F */
                    public C6767b m7335F(int i10) {
                        this.f8032i = i10;
                        this.f8024a |= 16;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: G, reason: merged with bridge method [inline-methods] */
                    public final C6767b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6767b) super.setUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: b */
                    public C6767b m7337b(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8026c;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m7347m();
                        AbstractMessageLite.Builder.addAll(iterable, this.f8025b);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C6767b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6767b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix build() {
                        GraphMatrix graphMatrixBuildPartial = buildPartial();
                        if (graphMatrixBuildPartial.isInitialized()) {
                            return graphMatrixBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphMatrixBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix buildPartial() {
                        GraphMatrix graphMatrix = new GraphMatrix(this);
                        m7342g(graphMatrix);
                        if (this.f8024a != 0) {
                            m7341f(graphMatrix);
                        }
                        onBuilt();
                        return graphMatrix;
                    }

                    /* renamed from: f */
                    public final void m7341f(GraphMatrix graphMatrix) {
                        int i10;
                        int i11 = this.f8024a;
                        if ((i11 & 2) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8028e;
                            graphMatrix.f8019c = singleFieldBuilderV3 == null ? this.f8027d : (EzyMatrix.Matrix) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8030g;
                            graphMatrix.f8020d = singleFieldBuilderV32 == null ? this.f8029f : (EzyMatrix.Matrix) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        if ((i11 & 8) != 0) {
                            graphMatrix.f8021e = this.f8031h;
                        }
                        if ((i11 & 16) != 0) {
                            graphMatrix.f8022f = this.f8032i;
                        }
                        GraphMatrix.m7312s(graphMatrix, i10);
                    }

                    /* renamed from: g */
                    public final void m7342g(GraphMatrix graphMatrix) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8026c;
                        if (repeatedFieldBuilderV3 != null) {
                            graphMatrix.f8018b = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f8024a & 1) != 0) {
                            this.f8025b = Collections.unmodifiableList(this.f8025b);
                            this.f8024a &= -2;
                        }
                        graphMatrix.f8018b = this.f8025b;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7882i;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6767b clear() {
                        super.clear();
                        this.f8024a = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8026c;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f8025b = Collections.EMPTY_LIST;
                        } else {
                            this.f8025b = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f8024a &= -2;
                        this.f8027d = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8028e;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f8028e = null;
                        }
                        this.f8029f = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8030g;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f8030g = null;
                        }
                        this.f8031h = "";
                        this.f8032i = 0;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6767b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6767b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7883j.ensureFieldAccessorsInitialized(GraphMatrix.class, C6767b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C6767b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6767b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C6767b mo24228clone() {
                        return (C6767b) super.mo24228clone();
                    }

                    /* renamed from: m */
                    public final void m7347m() {
                        if ((this.f8024a & 1) == 0) {
                            this.f8025b = new ArrayList(this.f8025b);
                            this.f8024a |= 1;
                        }
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public GraphMatrix getDefaultInstanceForType() {
                        return GraphMatrix.m7314u();
                    }

                    /* renamed from: p */
                    public final RepeatedFieldBuilderV3 m7349p() {
                        if (this.f8026c == null) {
                            this.f8026c = new RepeatedFieldBuilderV3(this.f8025b, (this.f8024a & 1) != 0, getParentForChildren(), isClean());
                            this.f8025b = null;
                        }
                        return this.f8026c;
                    }

                    /* renamed from: q */
                    public EzyMatrix.Matrix m7350q() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8030g;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f8029f;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: r */
                    public EzyMatrix.Matrix.C6790b m7351r() {
                        this.f8024a |= 4;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7328s().getBuilder();
                    }

                    /* renamed from: t */
                    public EzyMatrix.Matrix m7352t() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8028e;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyMatrix.Matrix) singleFieldBuilderV3.getMessage();
                        }
                        EzyMatrix.Matrix matrix = this.f8027d;
                        return matrix == null ? EzyMatrix.Matrix.m7721u() : matrix;
                    }

                    /* renamed from: u */
                    public EzyMatrix.Matrix.C6790b m7353u() {
                        this.f8024a |= 2;
                        onChanged();
                        return (EzyMatrix.Matrix.C6790b) m7329v().getBuilder();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public C6767b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8026c;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m7347m();
                                                this.f8025b.add(graphData);
                                            } else {
                                                repeatedFieldBuilderV3.addMessage(graphData);
                                            }
                                        } else if (tag == 18) {
                                            codedInputStream.readMessage(m7329v().getBuilder(), extensionRegistryLite);
                                            this.f8024a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m7328s().getBuilder(), extensionRegistryLite);
                                            this.f8024a |= 4;
                                        } else if (tag == 34) {
                                            this.f8031h = codedInputStream.readStringRequireUtf8();
                                            this.f8024a |= 8;
                                        } else if (tag == 40) {
                                            this.f8032i = codedInputStream.readInt32();
                                            this.f8024a |= 16;
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
                    public C6767b mergeFrom(Message message) {
                        if (message instanceof GraphMatrix) {
                            return m7356y((GraphMatrix) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: y */
                    public C6767b m7356y(GraphMatrix graphMatrix) {
                        if (graphMatrix == GraphMatrix.m7314u()) {
                            return this;
                        }
                        if (this.f8026c == null) {
                            if (!graphMatrix.f8018b.isEmpty()) {
                                if (this.f8025b.isEmpty()) {
                                    this.f8025b = graphMatrix.f8018b;
                                    this.f8024a &= -2;
                                } else {
                                    m7347m();
                                    this.f8025b.addAll(graphMatrix.f8018b);
                                }
                                onChanged();
                            }
                        } else if (!graphMatrix.f8018b.isEmpty()) {
                            if (this.f8026c.isEmpty()) {
                                this.f8026c.dispose();
                                this.f8026c = null;
                                this.f8025b = graphMatrix.f8018b;
                                this.f8024a &= -2;
                                this.f8026c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7349p() : null;
                            } else {
                                this.f8026c.addAllMessages(graphMatrix.f8018b);
                            }
                        }
                        if (graphMatrix.m7318D()) {
                            m7330A(graphMatrix.m7326z());
                        }
                        if (graphMatrix.m7317C()) {
                            m7357z(graphMatrix.m7325y());
                        }
                        if (!graphMatrix.m7315A().isEmpty()) {
                            this.f8031h = graphMatrix.f8021e;
                            this.f8024a |= 8;
                            onChanged();
                        }
                        if (graphMatrix.m7316B() != 0) {
                            m7335F(graphMatrix.m7316B());
                        }
                        mergeUnknownFields(graphMatrix.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: z */
                    public C6767b m7357z(EzyMatrix.Matrix matrix) {
                        EzyMatrix.Matrix matrix2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8030g;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(matrix);
                        } else if ((this.f8024a & 4) == 0 || (matrix2 = this.f8029f) == null || matrix2 == EzyMatrix.Matrix.m7721u()) {
                            this.f8029f = matrix;
                        } else {
                            m7351r().m7748n(matrix);
                        }
                        if (this.f8029f != null) {
                            this.f8024a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    public C6767b() {
                        this.f8025b = Collections.EMPTY_LIST;
                        this.f8031h = "";
                        maybeForceBuilderInitialization();
                    }

                    public C6767b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8025b = Collections.EMPTY_LIST;
                        this.f8031h = "";
                        maybeForceBuilderInitialization();
                    }
                }

                public GraphMatrix(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8021e = "";
                    this.f8022f = 0;
                    this.f8023g = (byte) -1;
                }

                private GraphMatrix() {
                    this.f8021e = "";
                    this.f8022f = 0;
                    this.f8023g = (byte) -1;
                    this.f8018b = Collections.EMPTY_LIST;
                    this.f8021e = "";
                }
            }

            public static final class GraphRemove extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: c */
                public static final GraphRemove f8033c = new GraphRemove();

                /* renamed from: d */
                public static final Parser f8034d = new C6768a();

                /* renamed from: a */
                public List f8035a;

                /* renamed from: b */
                public byte f8036b;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$a */
                public class C6768a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public GraphRemove parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6769b c6769bM7362r = GraphRemove.m7362r();
                        try {
                            c6769bM7362r.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6769bM7362r.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6769bM7362r.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6769bM7362r.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6769bM7362r.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7880g;
                }

                /* renamed from: k */
                public static GraphRemove m7361k() {
                    return f8033c;
                }

                /* renamed from: r */
                public static C6769b m7362r() {
                    return f8033c.toBuilder();
                }

                /* renamed from: u */
                public static GraphRemove m7363u(ByteString byteString) {
                    return (GraphRemove) f8034d.parseFrom(byteString);
                }

                /* renamed from: v */
                public static GraphRemove m7364v(byte[] bArr) {
                    return (GraphRemove) f8034d.parseFrom(bArr);
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
                    return m7367q().equals(graphRemove.m7367q()) && getUnknownFields().equals(graphRemove.getUnknownFields());
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8034d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = 0;
                    for (int i11 = 0; i11 < this.f8035a.size(); i11++) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f8035a.get(i11));
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
                    if (m7366o() > 0) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7367q().hashCode();
                    }
                    int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7881h.ensureFieldAccessorsInitialized(GraphRemove.class, C6769b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8036b;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8036b = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public GraphRemove getDefaultInstanceForType() {
                    return f8033c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new GraphRemove();
                }

                /* renamed from: o */
                public int m7366o() {
                    return this.f8035a.size();
                }

                /* renamed from: q */
                public List m7367q() {
                    return this.f8035a;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C6769b newBuilderForType() {
                    return m7362r();
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C6769b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6769b(builderParent);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6769b toBuilder() {
                    return this == f8033c ? new C6769b() : new C6769b().m7387s(this);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    for (int i10 = 0; i10 < this.f8035a.size(); i10++) {
                        codedOutputStream.writeMessage(1, (MessageLite) this.f8035a.get(i10));
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$GraphRemove$b */
                public static final class C6769b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8037a;

                    /* renamed from: b */
                    public List f8038b;

                    /* renamed from: c */
                    public RepeatedFieldBuilderV3 f8039c;

                    /* renamed from: m */
                    private void m7372m() {
                        if ((this.f8037a & 1) == 0) {
                            this.f8038b = new ArrayList(this.f8038b);
                            this.f8037a |= 1;
                        }
                    }

                    /* renamed from: p */
                    private RepeatedFieldBuilderV3 m7373p() {
                        if (this.f8039c == null) {
                            this.f8039c = new RepeatedFieldBuilderV3(this.f8038b, (this.f8037a & 1) != 0, getParentForChildren(), isClean());
                            this.f8038b = null;
                        }
                        return this.f8039c;
                    }

                    /* renamed from: b */
                    public C6769b m7374b(Iterable iterable) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8039c;
                        if (repeatedFieldBuilderV3 != null) {
                            repeatedFieldBuilderV3.addAllMessages(iterable);
                            return this;
                        }
                        m7372m();
                        AbstractMessageLite.Builder.addAll(iterable, this.f8038b);
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public C6769b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6769b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public GraphRemove build() {
                        GraphRemove graphRemoveBuildPartial = buildPartial();
                        if (graphRemoveBuildPartial.isInitialized()) {
                            return graphRemoveBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) graphRemoveBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: e, reason: merged with bridge method [inline-methods] */
                    public GraphRemove buildPartial() {
                        GraphRemove graphRemove = new GraphRemove(this);
                        m7379g(graphRemove);
                        if (this.f8037a != 0) {
                            m7378f(graphRemove);
                        }
                        onBuilt();
                        return graphRemove;
                    }

                    /* renamed from: f */
                    public final void m7378f(GraphRemove graphRemove) {
                    }

                    /* renamed from: g */
                    public final void m7379g(GraphRemove graphRemove) {
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8039c;
                        if (repeatedFieldBuilderV3 != null) {
                            graphRemove.f8035a = repeatedFieldBuilderV3.build();
                            return;
                        }
                        if ((this.f8037a & 1) != 0) {
                            this.f8038b = Collections.unmodifiableList(this.f8038b);
                            this.f8037a &= -2;
                        }
                        graphRemove.f8035a = this.f8038b;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7880g;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6769b clear() {
                        super.clear();
                        this.f8037a = 0;
                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8039c;
                        if (repeatedFieldBuilderV3 == null) {
                            this.f8038b = Collections.EMPTY_LIST;
                        } else {
                            this.f8038b = null;
                            repeatedFieldBuilderV3.clear();
                        }
                        this.f8037a &= -2;
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6769b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6769b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7881h.ensureFieldAccessorsInitialized(GraphRemove.class, C6769b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: k, reason: merged with bridge method [inline-methods] */
                    public C6769b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6769b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: l, reason: merged with bridge method [inline-methods] */
                    public C6769b mo24228clone() {
                        return (C6769b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public GraphRemove getDefaultInstanceForType() {
                        return GraphRemove.m7361k();
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: q, reason: merged with bridge method [inline-methods] */
                    public C6769b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            GraphData graphData = (GraphData) codedInputStream.readMessage(GraphData.parser(), extensionRegistryLite);
                                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8039c;
                                            if (repeatedFieldBuilderV3 == null) {
                                                m7372m();
                                                this.f8038b.add(graphData);
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
                    public C6769b mergeFrom(Message message) {
                        if (message instanceof GraphRemove) {
                            return m7387s((GraphRemove) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: s */
                    public C6769b m7387s(GraphRemove graphRemove) {
                        if (graphRemove == GraphRemove.m7361k()) {
                            return this;
                        }
                        if (this.f8039c == null) {
                            if (!graphRemove.f8035a.isEmpty()) {
                                if (this.f8038b.isEmpty()) {
                                    this.f8038b = graphRemove.f8035a;
                                    this.f8037a &= -2;
                                } else {
                                    m7372m();
                                    this.f8038b.addAll(graphRemove.f8035a);
                                }
                                onChanged();
                            }
                        } else if (!graphRemove.f8035a.isEmpty()) {
                            if (this.f8039c.isEmpty()) {
                                this.f8039c.dispose();
                                this.f8039c = null;
                                this.f8038b = graphRemove.f8035a;
                                this.f8037a &= -2;
                                this.f8039c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7373p() : null;
                            } else {
                                this.f8039c.addAllMessages(graphRemove.f8035a);
                            }
                        }
                        mergeUnknownFields(graphRemove.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final C6769b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6769b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: u, reason: merged with bridge method [inline-methods] */
                    public C6769b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6769b) super.setField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: v, reason: merged with bridge method [inline-methods] */
                    public C6769b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6769b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: w, reason: merged with bridge method [inline-methods] */
                    public final C6769b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6769b) super.setUnknownFields(unknownFieldSet);
                    }

                    public C6769b() {
                        this.f8038b = Collections.EMPTY_LIST;
                    }

                    public C6769b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        this.f8038b = Collections.EMPTY_LIST;
                    }
                }

                public GraphRemove(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8036b = (byte) -1;
                }

                private GraphRemove() {
                    this.f8036b = (byte) -1;
                    this.f8035a = Collections.EMPTY_LIST;
                }
            }

            public static final class REBUILD extends GeneratedMessageV3 implements MessageOrBuilder {

                /* renamed from: f */
                public static final REBUILD f8040f = new REBUILD();

                /* renamed from: g */
                public static final Parser f8041g = new C6770a();

                /* renamed from: a */
                public int f8042a;

                /* renamed from: b */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot f8043b;

                /* renamed from: c */
                public int f8044c;

                /* renamed from: d */
                public EzyHeader.BackgroundLineConfig f8045d;

                /* renamed from: e */
                public byte f8046e;

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$a */
                public class C6770a extends AbstractParser {
                    @Override // com.google.protobuf.Parser
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public REBUILD parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                        C6771b c6771bM7398v = REBUILD.m7398v();
                        try {
                            c6771bM7398v.mergeFrom(codedInputStream, extensionRegistryLite);
                            return c6771bM7398v.buildPartial();
                        } catch (InvalidProtocolBufferException e10) {
                            throw e10.setUnfinishedMessage(c6771bM7398v.buildPartial());
                        } catch (UninitializedMessageException e11) {
                            throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6771bM7398v.buildPartial());
                        } catch (IOException e12) {
                            throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6771bM7398v.buildPartial());
                        }
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return EzyCommand.f7896w;
                }

                /* renamed from: m */
                public static /* synthetic */ int m7396m(REBUILD rebuild, int i10) {
                    int i11 = i10 | rebuild.f8042a;
                    rebuild.f8042a = i11;
                    return i11;
                }

                /* renamed from: q */
                public static REBUILD m7397q() {
                    return f8040f;
                }

                /* renamed from: v */
                public static C6771b m7398v() {
                    return f8040f.toBuilder();
                }

                /* renamed from: y */
                public static REBUILD m7399y(ByteString byteString) {
                    return (REBUILD) f8041g.parseFrom(byteString);
                }

                /* renamed from: z */
                public static REBUILD m7400z(byte[] bArr) {
                    return (REBUILD) f8041g.parseFrom(bArr);
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                public C6771b toBuilder() {
                    return this == f8040f ? new C6771b() : new C6771b().m7431v(this);
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
                    if (m7406u() != rebuild.m7406u()) {
                        return false;
                    }
                    if ((!m7406u() || m7404s().equals(rebuild.m7404s())) && getBackgroundColor() == rebuild.getBackgroundColor() && m7405t() == rebuild.m7405t()) {
                        return (!m7405t() || m7402o().equals(rebuild.m7402o())) && getUnknownFields().equals(rebuild.getUnknownFields());
                    }
                    return false;
                }

                public int getBackgroundColor() {
                    return this.f8044c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
                public Parser getParserForType() {
                    return f8041g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public int getSerializedSize() {
                    int i10 = this.memoizedSize;
                    if (i10 != -1) {
                        return i10;
                    }
                    int iComputeMessageSize = (this.f8042a & 1) != 0 ? CodedOutputStream.computeMessageSize(1, m7404s()) : 0;
                    int i11 = this.f8044c;
                    if (i11 != 0) {
                        iComputeMessageSize += CodedOutputStream.computeInt32Size(2, i11);
                    }
                    if ((this.f8042a & 2) != 0) {
                        iComputeMessageSize += CodedOutputStream.computeMessageSize(3, m7402o());
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
                    if (m7406u()) {
                        iHashCode = (((iHashCode * 37) + 1) * 53) + m7404s().hashCode();
                    }
                    int backgroundColor = (((iHashCode * 37) + 2) * 53) + getBackgroundColor();
                    if (m7405t()) {
                        backgroundColor = (((backgroundColor * 37) + 3) * 53) + m7402o().hashCode();
                    }
                    int iHashCode2 = (backgroundColor * 29) + getUnknownFields().hashCode();
                    this.memoizedHashCode = iHashCode2;
                    return iHashCode2;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7897x.ensureFieldAccessorsInitialized(REBUILD.class, C6771b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    byte b10 = this.f8046e;
                    if (b10 == 1) {
                        return true;
                    }
                    if (b10 == 0) {
                        return false;
                    }
                    this.f8046e = (byte) 1;
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                    return new REBUILD();
                }

                /* renamed from: o */
                public EzyHeader.BackgroundLineConfig m7402o() {
                    EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f8045d;
                    return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m7547o() : backgroundLineConfig;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public REBUILD getDefaultInstanceForType() {
                    return f8040f;
                }

                /* renamed from: s */
                public EzyPageSnapshot.PageSnapshot.GraphSnapshot m7404s() {
                    EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f8043b;
                    return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m7854G() : graphSnapshot;
                }

                /* renamed from: t */
                public boolean m7405t() {
                    return (this.f8042a & 2) != 0;
                }

                /* renamed from: u */
                public boolean m7406u() {
                    return (this.f8042a & 1) != 0;
                }

                @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6771b newBuilderForType() {
                    return m7398v();
                }

                @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
                public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                    if ((this.f8042a & 1) != 0) {
                        codedOutputStream.writeMessage(1, m7404s());
                    }
                    int i10 = this.f8044c;
                    if (i10 != 0) {
                        codedOutputStream.writeInt32(2, i10);
                    }
                    if ((this.f8042a & 2) != 0) {
                        codedOutputStream.writeMessage(3, m7402o());
                    }
                    getUnknownFields().writeTo(codedOutputStream);
                }

                @Override // com.google.protobuf.GeneratedMessageV3
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public C6771b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                    return new C6771b(builderParent);
                }

                /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$REBUILD$b */
                public static final class C6771b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                    /* renamed from: a */
                    public int f8047a;

                    /* renamed from: b */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot f8048b;

                    /* renamed from: c */
                    public SingleFieldBuilderV3 f8049c;

                    /* renamed from: d */
                    public int f8050d;

                    /* renamed from: e */
                    public EzyHeader.BackgroundLineConfig f8051e;

                    /* renamed from: f */
                    public SingleFieldBuilderV3 f8052f;

                    private void maybeForceBuilderInitialization() {
                        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                            m7427r();
                            m7423m();
                        }
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: A, reason: merged with bridge method [inline-methods] */
                    public C6771b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                        return (C6771b) super.setRepeatedField(fieldDescriptor, i10, obj);
                    }

                    /* renamed from: B */
                    public C6771b m7411B(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8049c;
                        if (singleFieldBuilderV3 == null) {
                            graphSnapshot.getClass();
                            this.f8048b = graphSnapshot;
                        } else {
                            singleFieldBuilderV3.setMessage(graphSnapshot);
                        }
                        this.f8047a |= 1;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: C, reason: merged with bridge method [inline-methods] */
                    public final C6771b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6771b) super.setUnknownFields(unknownFieldSet);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public C6771b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6771b) super.addRepeatedField(fieldDescriptor, obj);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: c, reason: merged with bridge method [inline-methods] */
                    public REBUILD build() {
                        REBUILD rebuildBuildPartial = buildPartial();
                        if (rebuildBuildPartial.isInitialized()) {
                            return rebuildBuildPartial;
                        }
                        throw AbstractMessage.Builder.newUninitializedMessageException((Message) rebuildBuildPartial);
                    }

                    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: d, reason: merged with bridge method [inline-methods] */
                    public REBUILD buildPartial() {
                        REBUILD rebuild = new REBUILD(this);
                        if (this.f8047a != 0) {
                            m7416e(rebuild);
                        }
                        onBuilt();
                        return rebuild;
                    }

                    /* renamed from: e */
                    public final void m7416e(REBUILD rebuild) {
                        int i10;
                        int i11 = this.f8047a;
                        if ((i11 & 1) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8049c;
                            rebuild.f8043b = singleFieldBuilderV3 == null ? this.f8048b : (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.build();
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if ((i11 & 2) != 0) {
                            rebuild.f8044c = this.f8050d;
                        }
                        if ((i11 & 4) != 0) {
                            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8052f;
                            rebuild.f8045d = singleFieldBuilderV32 == null ? this.f8051e : (EzyHeader.BackgroundLineConfig) singleFieldBuilderV32.build();
                            i10 |= 2;
                        }
                        REBUILD.m7396m(rebuild, i10);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: f, reason: merged with bridge method [inline-methods] */
                    public C6771b clear() {
                        super.clear();
                        this.f8047a = 0;
                        this.f8048b = null;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8049c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.dispose();
                            this.f8049c = null;
                        }
                        this.f8050d = 0;
                        this.f8051e = null;
                        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f8052f;
                        if (singleFieldBuilderV32 != null) {
                            singleFieldBuilderV32.dispose();
                            this.f8052f = null;
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: g, reason: merged with bridge method [inline-methods] */
                    public C6771b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                        return (C6771b) super.clearField(fieldDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                    public Descriptors.Descriptor getDescriptorForType() {
                        return EzyCommand.f7896w;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: h, reason: merged with bridge method [inline-methods] */
                    public C6771b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                        return (C6771b) super.clearOneof(oneofDescriptor);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                    /* renamed from: i, reason: merged with bridge method [inline-methods] */
                    public C6771b mo24228clone() {
                        return (C6771b) super.mo24228clone();
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder
                    public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                        return EzyCommand.f7897x.ensureFieldAccessorsInitialized(REBUILD.class, C6771b.class);
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                    public final boolean isInitialized() {
                        return true;
                    }

                    /* renamed from: k */
                    public EzyHeader.BackgroundLineConfig m7421k() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8052f;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyHeader.BackgroundLineConfig) singleFieldBuilderV3.getMessage();
                        }
                        EzyHeader.BackgroundLineConfig backgroundLineConfig = this.f8051e;
                        return backgroundLineConfig == null ? EzyHeader.BackgroundLineConfig.m7547o() : backgroundLineConfig;
                    }

                    /* renamed from: l */
                    public EzyHeader.BackgroundLineConfig.C6783b m7422l() {
                        this.f8047a |= 4;
                        onChanged();
                        return (EzyHeader.BackgroundLineConfig.C6783b) m7423m().getBuilder();
                    }

                    /* renamed from: m */
                    public final SingleFieldBuilderV3 m7423m() {
                        if (this.f8052f == null) {
                            this.f8052f = new SingleFieldBuilderV3(m7421k(), getParentForChildren(), isClean());
                            this.f8051e = null;
                        }
                        return this.f8052f;
                    }

                    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                    /* renamed from: n, reason: merged with bridge method [inline-methods] */
                    public REBUILD getDefaultInstanceForType() {
                        return REBUILD.m7397q();
                    }

                    /* renamed from: p */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot m7425p() {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8049c;
                        if (singleFieldBuilderV3 != null) {
                            return (EzyPageSnapshot.PageSnapshot.GraphSnapshot) singleFieldBuilderV3.getMessage();
                        }
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot = this.f8048b;
                        return graphSnapshot == null ? EzyPageSnapshot.PageSnapshot.GraphSnapshot.m7854G() : graphSnapshot;
                    }

                    /* renamed from: q */
                    public EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b m7426q() {
                        this.f8047a |= 1;
                        onChanged();
                        return (EzyPageSnapshot.PageSnapshot.GraphSnapshot.C6799b) m7427r().getBuilder();
                    }

                    /* renamed from: r */
                    public final SingleFieldBuilderV3 m7427r() {
                        if (this.f8049c == null) {
                            this.f8049c = new SingleFieldBuilderV3(m7425p(), getParentForChildren(), isClean());
                            this.f8048b = null;
                        }
                        return this.f8049c;
                    }

                    /* renamed from: s */
                    public C6771b m7428s(EzyHeader.BackgroundLineConfig backgroundLineConfig) {
                        EzyHeader.BackgroundLineConfig backgroundLineConfig2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8052f;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(backgroundLineConfig);
                        } else if ((this.f8047a & 4) == 0 || (backgroundLineConfig2 = this.f8051e) == null || backgroundLineConfig2 == EzyHeader.BackgroundLineConfig.m7547o()) {
                            this.f8051e = backgroundLineConfig;
                        } else {
                            m7422l().m7570n(backgroundLineConfig);
                        }
                        if (this.f8051e != null) {
                            this.f8047a |= 4;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: t, reason: merged with bridge method [inline-methods] */
                    public C6771b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                        extensionRegistryLite.getClass();
                        boolean z9 = false;
                        while (!z9) {
                            try {
                                try {
                                    int tag = codedInputStream.readTag();
                                    if (tag != 0) {
                                        if (tag == 10) {
                                            codedInputStream.readMessage(m7427r().getBuilder(), extensionRegistryLite);
                                            this.f8047a |= 1;
                                        } else if (tag == 16) {
                                            this.f8050d = codedInputStream.readInt32();
                                            this.f8047a |= 2;
                                        } else if (tag == 26) {
                                            codedInputStream.readMessage(m7423m().getBuilder(), extensionRegistryLite);
                                            this.f8047a |= 4;
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
                    public C6771b mergeFrom(Message message) {
                        if (message instanceof REBUILD) {
                            return m7431v((REBUILD) message);
                        }
                        super.mergeFrom(message);
                        return this;
                    }

                    /* renamed from: v */
                    public C6771b m7431v(REBUILD rebuild) {
                        if (rebuild == REBUILD.m7397q()) {
                            return this;
                        }
                        if (rebuild.m7406u()) {
                            m7432w(rebuild.m7404s());
                        }
                        if (rebuild.getBackgroundColor() != 0) {
                            m7434y(rebuild.getBackgroundColor());
                        }
                        if (rebuild.m7405t()) {
                            m7428s(rebuild.m7402o());
                        }
                        mergeUnknownFields(rebuild.getUnknownFields());
                        onChanged();
                        return this;
                    }

                    /* renamed from: w */
                    public C6771b m7432w(EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot) {
                        EzyPageSnapshot.PageSnapshot.GraphSnapshot graphSnapshot2;
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f8049c;
                        if (singleFieldBuilderV3 != null) {
                            singleFieldBuilderV3.mergeFrom(graphSnapshot);
                        } else if ((this.f8047a & 1) == 0 || (graphSnapshot2 = this.f8048b) == null || graphSnapshot2 == EzyPageSnapshot.PageSnapshot.GraphSnapshot.m7854G()) {
                            this.f8048b = graphSnapshot;
                        } else {
                            m7426q().m7891B(graphSnapshot);
                        }
                        if (this.f8048b != null) {
                            this.f8047a |= 1;
                            onChanged();
                        }
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: x, reason: merged with bridge method [inline-methods] */
                    public final C6771b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                        return (C6771b) super.mergeUnknownFields(unknownFieldSet);
                    }

                    /* renamed from: y */
                    public C6771b m7434y(int i10) {
                        this.f8050d = i10;
                        this.f8047a |= 2;
                        onChanged();
                        return this;
                    }

                    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                    /* renamed from: z, reason: merged with bridge method [inline-methods] */
                    public C6771b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                        return (C6771b) super.setField(fieldDescriptor, obj);
                    }

                    public C6771b() {
                        maybeForceBuilderInitialization();
                    }

                    public C6771b(GeneratedMessageV3.BuilderParent builderParent) {
                        super(builderParent);
                        maybeForceBuilderInitialization();
                    }
                }

                public REBUILD(GeneratedMessageV3.Builder builder) {
                    super(builder);
                    this.f8044c = 0;
                    this.f8046e = (byte) -1;
                }

                private REBUILD() {
                    this.f8044c = 0;
                    this.f8046e = (byte) -1;
                }
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$a */
            public class C6772a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public CommandInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C6773b c6773bM6956y = CommandInfo.m6956y();
                    try {
                        c6773bM6956y.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c6773bM6956y.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c6773bM6956y.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6773bM6956y.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6773bM6956y.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzyCommand.f7876c;
            }

            public static Parser parser() {
                return f7904h;
            }

            /* renamed from: t */
            public static CommandInfo m6955t() {
                return f7903g;
            }

            /* renamed from: y */
            public static C6773b m6956y() {
                return f7903g.toBuilder();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            public C6773b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C6773b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: B, reason: merged with bridge method [inline-methods] */
            public C6773b toBuilder() {
                return this == f7903g ? new C6773b() : new C6773b().m7448n(this);
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
                return m6963v() == commandInfo.m6963v() && m6964w() == commandInfo.m6964w() && m6965x() == commandInfo.m6965x() && this.f7908d == commandInfo.f7908d && m6961s().equals(commandInfo.m6961s()) && getUnknownFields().equals(commandInfo.getUnknownFields());
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f7904h;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                long j10 = this.f7905a;
                int iComputeInt64Size = j10 != 0 ? CodedOutputStream.computeInt64Size(1, j10) : 0;
                long j11 = this.f7906b;
                if (j11 != 0) {
                    iComputeInt64Size += CodedOutputStream.computeInt64Size(2, j11);
                }
                boolean z9 = this.f7907c;
                if (z9) {
                    iComputeInt64Size += CodedOutputStream.computeBoolSize(3, z9);
                }
                if (this.f7908d != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    iComputeInt64Size += CodedOutputStream.computeEnumSize(4, this.f7908d);
                }
                if (!this.f7909e.isEmpty()) {
                    iComputeInt64Size += CodedOutputStream.computeBytesSize(5, this.f7909e);
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
                int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + Internal.hashLong(m6963v())) * 37) + 2) * 53) + Internal.hashLong(m6964w())) * 37) + 3) * 53) + Internal.hashBoolean(m6965x())) * 37) + 4) * 53) + this.f7908d) * 37) + 5) * 53) + m6961s().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f7877d.ensureFieldAccessorsInitialized(CommandInfo.class, C6773b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f7910f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f7910f = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new CommandInfo();
            }

            /* renamed from: q */
            public EzyCommandEnum.CommandEnum m6959q() {
                EzyCommandEnum.CommandEnum commandEnumM7480f = EzyCommandEnum.CommandEnum.m7480f(this.f7908d);
                return commandEnumM7480f == null ? EzyCommandEnum.CommandEnum.UNRECOGNIZED : commandEnumM7480f;
            }

            /* renamed from: r */
            public int m6960r() {
                return this.f7908d;
            }

            /* renamed from: s */
            public ByteString m6961s() {
                return this.f7909e;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public CommandInfo getDefaultInstanceForType() {
                return f7903g;
            }

            /* renamed from: v */
            public long m6963v() {
                return this.f7905a;
            }

            /* renamed from: w */
            public long m6964w() {
                return this.f7906b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                long j10 = this.f7905a;
                if (j10 != 0) {
                    codedOutputStream.writeInt64(1, j10);
                }
                long j11 = this.f7906b;
                if (j11 != 0) {
                    codedOutputStream.writeInt64(2, j11);
                }
                boolean z9 = this.f7907c;
                if (z9) {
                    codedOutputStream.writeBool(3, z9);
                }
                if (this.f7908d != EzyCommandEnum.CommandEnum.ACTION_DEFAULT.getNumber()) {
                    codedOutputStream.writeEnum(4, this.f7908d);
                }
                if (!this.f7909e.isEmpty()) {
                    codedOutputStream.writeBytes(5, this.f7909e);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: x */
            public boolean m6965x() {
                return this.f7907c;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C6773b newBuilderForType() {
                return m6956y();
            }

            /* renamed from: com.zykj.board.EzyCommand$CommandSource$CommandInfo$b */
            public static final class C6773b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: a */
                public int f8053a;

                /* renamed from: b */
                public long f8054b;

                /* renamed from: c */
                public long f8055c;

                /* renamed from: d */
                public boolean f8056d;

                /* renamed from: e */
                public int f8057e;

                /* renamed from: f */
                public ByteString f8058f;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C6773b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6773b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: c, reason: merged with bridge method [inline-methods] */
                public CommandInfo build() {
                    CommandInfo commandInfoBuildPartial = buildPartial();
                    if (commandInfoBuildPartial.isInitialized()) {
                        return commandInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public CommandInfo buildPartial() {
                    CommandInfo commandInfo = new CommandInfo(this);
                    if (this.f8053a != 0) {
                        m7440e(commandInfo);
                    }
                    onBuilt();
                    return commandInfo;
                }

                /* renamed from: e */
                public final void m7440e(CommandInfo commandInfo) {
                    int i10 = this.f8053a;
                    if ((i10 & 1) != 0) {
                        commandInfo.f7905a = this.f8054b;
                    }
                    if ((i10 & 2) != 0) {
                        commandInfo.f7906b = this.f8055c;
                    }
                    if ((i10 & 4) != 0) {
                        commandInfo.f7907c = this.f8056d;
                    }
                    if ((i10 & 8) != 0) {
                        commandInfo.f7908d = this.f8057e;
                    }
                    if ((i10 & 16) != 0) {
                        commandInfo.f7909e = this.f8058f;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public C6773b clear() {
                    super.clear();
                    this.f8053a = 0;
                    this.f8054b = 0L;
                    this.f8055c = 0L;
                    this.f8056d = false;
                    this.f8057e = 0;
                    this.f8058f = ByteString.EMPTY;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C6773b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C6773b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzyCommand.f7876c;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C6773b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C6773b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C6773b mo24228clone() {
                    return (C6773b) super.mo24228clone();
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzyCommand.f7877d.ensureFieldAccessorsInitialized(CommandInfo.class, C6773b.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public CommandInfo getDefaultInstanceForType() {
                    return CommandInfo.m6955t();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C6773b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z9 = false;
                    while (!z9) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f8054b = codedInputStream.readInt64();
                                        this.f8053a |= 1;
                                    } else if (tag == 16) {
                                        this.f8055c = codedInputStream.readInt64();
                                        this.f8053a |= 2;
                                    } else if (tag == 24) {
                                        this.f8056d = codedInputStream.readBool();
                                        this.f8053a |= 4;
                                    } else if (tag == 32) {
                                        this.f8057e = codedInputStream.readEnum();
                                        this.f8053a |= 8;
                                    } else if (tag == 42) {
                                        this.f8058f = codedInputStream.readBytes();
                                        this.f8053a |= 16;
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
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C6773b mergeFrom(Message message) {
                    if (message instanceof CommandInfo) {
                        return m7448n((CommandInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C6773b m7448n(CommandInfo commandInfo) {
                    if (commandInfo == CommandInfo.m6955t()) {
                        return this;
                    }
                    if (commandInfo.m6963v() != 0) {
                        m7452s(commandInfo.m6963v());
                    }
                    if (commandInfo.m6964w() != 0) {
                        m7453t(commandInfo.m6964w());
                    }
                    if (commandInfo.m6965x()) {
                        m7455v(commandInfo.m6965x());
                    }
                    if (commandInfo.f7908d != 0) {
                        m7450q(commandInfo.m6960r());
                    }
                    if (commandInfo.m6961s() != ByteString.EMPTY) {
                        m7451r(commandInfo.m6961s());
                    }
                    mergeUnknownFields(commandInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public final C6773b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6773b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: q */
                public C6773b m7450q(int i10) {
                    this.f8057e = i10;
                    this.f8053a |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C6773b m7451r(ByteString byteString) {
                    byteString.getClass();
                    this.f8058f = byteString;
                    this.f8053a |= 16;
                    onChanged();
                    return this;
                }

                /* renamed from: s */
                public C6773b m7452s(long j10) {
                    this.f8054b = j10;
                    this.f8053a |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: t */
                public C6773b m7453t(long j10) {
                    this.f8055c = j10;
                    this.f8053a |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C6773b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C6773b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: v */
                public C6773b m7455v(boolean z9) {
                    this.f8056d = z9;
                    this.f8053a |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C6773b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C6773b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public final C6773b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C6773b) super.setUnknownFields(unknownFieldSet);
                }

                public C6773b() {
                    this.f8057e = 0;
                    this.f8058f = ByteString.EMPTY;
                }

                public C6773b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f8057e = 0;
                    this.f8058f = ByteString.EMPTY;
                }
            }

            public CommandInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f7905a = 0L;
                this.f7906b = 0L;
                this.f7907c = false;
                this.f7908d = 0;
                this.f7909e = ByteString.EMPTY;
                this.f7910f = (byte) -1;
            }

            private CommandInfo() {
                this.f7905a = 0L;
                this.f7906b = 0L;
                this.f7907c = false;
                this.f7908d = 0;
                ByteString byteString = ByteString.EMPTY;
                this.f7910f = (byte) -1;
                this.f7908d = 0;
                this.f7909e = byteString;
            }
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$a */
        public class C6774a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CommandSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C6775b c6775bM6941r = CommandSource.m6941r();
                try {
                    c6775bM6941r.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c6775bM6941r.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c6775bM6941r.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c6775bM6941r.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c6775bM6941r.buildPartial());
                }
            }
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzyCommand.f7874a;
        }

        /* renamed from: o */
        public static CommandSource m6940o() {
            return f7899c;
        }

        /* renamed from: r */
        public static C6775b m6941r() {
            return f7899c.toBuilder();
        }

        /* renamed from: u */
        public static CommandSource m6942u(InputStream inputStream) {
            return (CommandSource) GeneratedMessageV3.parseWithIOException(f7900d, inputStream);
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
            return m6944m().equals(commandSource.m6944m()) && getUnknownFields().equals(commandSource.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f7900d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f7901a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f7901a.get(i11));
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
            if (m6943k() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m6944m().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzyCommand.f7875b.ensureFieldAccessorsInitialized(CommandSource.class, C6775b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f7902b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f7902b = (byte) 1;
            return true;
        }

        /* renamed from: k */
        public int m6943k() {
            return this.f7901a.size();
        }

        /* renamed from: m */
        public List m6944m() {
            return this.f7901a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CommandSource();
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public CommandSource getDefaultInstanceForType() {
            return f7899c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C6775b newBuilderForType() {
            return m6941r();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C6775b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C6775b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C6775b toBuilder() {
            return this == f7899c ? new C6775b() : new C6775b().m7473r(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            for (int i10 = 0; i10 < this.f7901a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f7901a.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzyCommand$CommandSource$b */
        public static final class C6775b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f8059a;

            /* renamed from: b */
            public List f8060b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f8061c;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C6775b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6775b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public CommandSource build() {
                CommandSource commandSourceBuildPartial = buildPartial();
                if (commandSourceBuildPartial.isInitialized()) {
                    return commandSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) commandSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public CommandSource buildPartial() {
                CommandSource commandSource = new CommandSource(this);
                m7463f(commandSource);
                if (this.f8059a != 0) {
                    m7462e(commandSource);
                }
                onBuilt();
                return commandSource;
            }

            /* renamed from: e */
            public final void m7462e(CommandSource commandSource) {
            }

            /* renamed from: f */
            public final void m7463f(CommandSource commandSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8061c;
                if (repeatedFieldBuilderV3 != null) {
                    commandSource.f7901a = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f8059a & 1) != 0) {
                    this.f8060b = Collections.unmodifiableList(this.f8060b);
                    this.f8059a &= -2;
                }
                commandSource.f7901a = this.f8060b;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C6775b clear() {
                super.clear();
                this.f8059a = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8061c;
                if (repeatedFieldBuilderV3 == null) {
                    this.f8060b = Collections.EMPTY_LIST;
                } else {
                    this.f8060b = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f8059a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzyCommand.f7874a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C6775b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C6775b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C6775b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C6775b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzyCommand.f7875b.ensureFieldAccessorsInitialized(CommandSource.class, C6775b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C6775b mo24228clone() {
                return (C6775b) super.mo24228clone();
            }

            /* renamed from: l */
            public final void m7468l() {
                if ((this.f8059a & 1) == 0) {
                    this.f8060b = new ArrayList(this.f8060b);
                    this.f8059a |= 1;
                }
            }

            /* renamed from: m */
            public final RepeatedFieldBuilderV3 m7469m() {
                if (this.f8061c == null) {
                    this.f8061c = new RepeatedFieldBuilderV3(this.f8060b, (this.f8059a & 1) != 0, getParentForChildren(), isClean());
                    this.f8060b = null;
                }
                return this.f8061c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public CommandSource getDefaultInstanceForType() {
                return CommandSource.m6940o();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C6775b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z9 = false;
                while (!z9) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    CommandInfo commandInfo = (CommandInfo) codedInputStream.readMessage(CommandInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f8061c;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m7468l();
                                        this.f8060b.add(commandInfo);
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
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C6775b mergeFrom(Message message) {
                if (message instanceof CommandSource) {
                    return m7473r((CommandSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: r */
            public C6775b m7473r(CommandSource commandSource) {
                if (commandSource == CommandSource.m6940o()) {
                    return this;
                }
                if (this.f8061c == null) {
                    if (!commandSource.f7901a.isEmpty()) {
                        if (this.f8060b.isEmpty()) {
                            this.f8060b = commandSource.f7901a;
                            this.f8059a &= -2;
                        } else {
                            m7468l();
                            this.f8060b.addAll(commandSource.f7901a);
                        }
                        onChanged();
                    }
                } else if (!commandSource.f7901a.isEmpty()) {
                    if (this.f8061c.isEmpty()) {
                        this.f8061c.dispose();
                        this.f8061c = null;
                        this.f8060b = commandSource.f7901a;
                        this.f8059a &= -2;
                        this.f8061c = GeneratedMessageV3.alwaysUseFieldBuilders ? m7469m() : null;
                    } else {
                        this.f8061c.addAllMessages(commandSource.f7901a);
                    }
                }
                mergeUnknownFields(commandSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public final C6775b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6775b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C6775b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C6775b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C6775b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C6775b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public final C6775b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C6775b) super.setUnknownFields(unknownFieldSet);
            }

            public C6775b() {
                this.f8060b = Collections.EMPTY_LIST;
            }

            public C6775b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f8060b = Collections.EMPTY_LIST;
            }
        }

        public CommandSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f7902b = (byte) -1;
        }

        private CommandSource() {
            this.f7902b = (byte) -1;
            this.f7901a = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m6936y().getMessageTypes().get(0);
        f7874a = descriptor;
        f7875b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"CommandInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f7876c = descriptor2;
        f7877d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DelayTime", "Duration", "IsPlay", "CommandEnum", "Data"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        f7878e = descriptor3;
        f7879f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"GraphEnum", "GraphId", "OutRect", "ParentGraphId", "SourceFileName", "SourceId", "Extras"});
        Descriptors.Descriptor descriptor4 = descriptor2.getNestedTypes().get(1);
        f7880g = descriptor4;
        f7881h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GraphData"});
        Descriptors.Descriptor descriptor5 = descriptor2.getNestedTypes().get(2);
        f7882i = descriptor5;
        f7883j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"GraphData", "OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor6 = descriptor2.getNestedTypes().get(3);
        f7884k = descriptor6;
        f7885l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GraphId", "GraphEnum", "OutRect", "Content", "Paint", "Points", "RenderMatrix", "FilePath"});
        Descriptors.Descriptor descriptor7 = descriptor2.getNestedTypes().get(4);
        f7886m = descriptor7;
        f7887n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"FileName", "Duration", "Validate"});
        Descriptors.Descriptor descriptor8 = descriptor2.getNestedTypes().get(5);
        f7888o = descriptor8;
        f7889p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"OriginMatrix", "LastMatrix", "SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor9 = descriptor2.getNestedTypes().get(6);
        f7890q = descriptor9;
        f7891r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"OriginMatrix", "LastMatrix"});
        Descriptors.Descriptor descriptor10 = descriptor2.getNestedTypes().get(7);
        f7892s = descriptor10;
        f7893t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"OriginBackground", "LastBackground", "OriginBackgroundLineConfig", "LastBackgroundLineConfig"});
        Descriptors.Descriptor descriptor11 = descriptor2.getNestedTypes().get(8);
        f7894u = descriptor11;
        f7895v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SourceFileName", "SourceId"});
        Descriptors.Descriptor descriptor12 = descriptor2.getNestedTypes().get(9);
        f7896w = descriptor12;
        f7897x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Snapshot", "BackgroundColor", "BackgroundLineConfig"});
        AnyProto.getDescriptor();
        EzyCommandEnum.m7478a();
        EzyGraphEnum.m7488a();
        EzyRectF.m8037c();
        EzyMatrix.m7709c();
        EzyPaint.m7960c();
        EzyPointF.m8002c();
        EzyPageSnapshot.m7833e();
        EzyHeader.m7501i();
    }

    /* renamed from: y */
    public static Descriptors.FileDescriptor m6936y() {
        return f7898y;
    }
}
