package com.zykj.board;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyGeometryEnum;
import com.zykj.board.EzyMatrix;
import com.zykj.board.EzyPaint;
import com.zykj.board.EzyPointF;
import com.zykj.board.EzyTouchEvent;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class EzySource {

    /* renamed from: a */
    public static final Descriptors.Descriptor f19256a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f19257b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f19258c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f19259d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f19260e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f19261f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f19262g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f19263h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f19264i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f19265j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f19266k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f19267l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f19268m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f19269n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f19270o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f19271p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f19272q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f19273r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f19274s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f19275t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f19276u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f19277v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f19278w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f19279x;

    /* renamed from: y */
    public static Descriptors.FileDescriptor f19280y = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\fSource.proto\u001a\u0016utils/TouchEvent.proto\u001a\u0012utils/Matrix.proto\u001a\u0011utils/Paint.proto\u001a\u0012utils/PointF.proto\u001a\u0018enums/GeometryEnum.proto\"}\n\u000bTouchSource\u0012)\n\ttouchInfo\u0018\u0001 \u0003(\u000b2\u0016.TouchSource.TouchInfo\u001aC\n\tTouchInfo\u0012\u001f\n\ntouchEvent\u0018\u0001 \u0003(\u000b2\u000b.TouchEvent\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"c\n\fMatrixSource\u0012,\n\nmatrixInfo\u0018\u0001 \u0003(\u000b2\u0018.MatrixSource.MatrixInfo\u001a%\n\nMatrixInfo\u0012\u0017\n\u0006matrix\u0018\u0001 \u0003(\u000b2\u0007.Matrix\"\u007f\n\nFileSource\u0012&\n\bfileInfo\u0018\u0001 \u0003(\u000b2\u0014.FileSource.FileInfo\u001aI\n\bFileInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\r\n\u0005width\u0018\u0002 \u0001(\u0005\u0012\u000e\n\u0006height\u0018\u0003 \u0001(\u0005\u0012\u0010\n\bvalidate\u0018\u0004 \u0001(\t\"w\n\u000bAudioSource\u0012)\n\taudioInfo\u0018\u0001 \u0003(\u000b2\u0016.AudioSource.AudioInfo\u001a=\n\tAudioInfo\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0003\u0012\u0010\n\bvalidate\u0018\u0003 \u0001(\t\"h\n\nTextSource\u0012&\n\btextInfo\u0018\u0001 \u0003(\u000b2\u0014.TextSource.TextInfo\u001a2\n\bTextInfo\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0015\n\u0005paint\u0018\u0002 \u0001(\u000b2\u0006.Paint\"©\u0001\n\u000eGeometrySource\u00122\n\fgeometryInfo\u0018\u0001 \u0003(\u000b2\u001c.GeometrySource.GeometryInfo\u001ac\n\fGeometryInfo\u0012#\n\fgeometryType\u0018\u0001 \u0001(\u000e2\r.GeometryEnum\u0012\u0017\n\u0006points\u0018\u0002 \u0003(\u000b2\u0007.PointF\u0012\u0015\n\u0005paint\u0018\u0003 \u0001(\u000b2\u0006.PaintB\u001b\n\u000ecom.zykj.boardB\tEzySourceb\u0006proto3"}, new Descriptors.FileDescriptor[]{EzyTouchEvent.m16323g(), EzyMatrix.m15454c(), EzyPaint.m15711c(), EzyPointF.m15753c(), EzyGeometryEnum.m15221a()});

    public static final class FileSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final FileSource f19281e = new FileSource();

        /* renamed from: f */
        public static final Parser f19282f = new C8518a();

        /* renamed from: c */
        public List f19283c;

        /* renamed from: d */
        public byte f19284d;

        public static final class FileInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: h */
            public static final FileInfo f19285h = new FileInfo();

            /* renamed from: i */
            public static final Parser f19286i = new C8516a();

            /* renamed from: c */
            public volatile Object f19287c;

            /* renamed from: d */
            public int f19288d;

            /* renamed from: e */
            public int f19289e;

            /* renamed from: f */
            public volatile Object f19290f;

            /* renamed from: g */
            public byte f19291g;

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$a */
            public class C8516a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public FileInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8517b c8517bM15987o = FileInfo.m15987o();
                    try {
                        c8517bM15987o.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8517bM15987o.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8517bM15987o.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8517bM15987o.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8517bM15987o.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f19266k;
            }

            /* renamed from: k */
            public static FileInfo m15986k() {
                return f19285h;
            }

            /* renamed from: o */
            public static C8517b m15987o() {
                return f19285h.toBuilder();
            }

            public static Parser parser() {
                return f19286i;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FileInfo)) {
                    return super.equals(obj);
                }
                FileInfo fileInfo = (FileInfo) obj;
                return getName().equals(fileInfo.getName()) && getWidth() == fileInfo.getWidth() && getHeight() == fileInfo.getHeight() && m15989n().equals(fileInfo.m15989n()) && getUnknownFields().equals(fileInfo.getUnknownFields());
            }

            public int getHeight() {
                return this.f19289e;
            }

            public String getName() {
                Object obj = this.f19287c;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19287c = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19286i;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f19287c) ? GeneratedMessage.computeStringSize(1, this.f19287c) : 0;
                int i11 = this.f19288d;
                if (i11 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(2, i11);
                }
                int i12 = this.f19289e;
                if (i12 != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(3, i12);
                }
                if (!GeneratedMessage.isStringEmpty(this.f19290f)) {
                    iComputeStringSize += GeneratedMessage.computeStringSize(4, this.f19290f);
                }
                int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getWidth() {
                return this.f19288d;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getName().hashCode()) * 37) + 2) * 53) + getWidth()) * 37) + 3) * 53) + getHeight()) * 37) + 4) * 53) + m15989n().hashCode()) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19267l.ensureFieldAccessorsInitialized(FileInfo.class, C8517b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19291g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19291g = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public FileInfo getDefaultInstanceForType() {
                return f19285h;
            }

            /* renamed from: n */
            public String m15989n() {
                Object obj = this.f19290f;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19290f = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new FileInfo();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8517b newBuilderForType() {
                return m15987o();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C8517b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8517b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C8517b toBuilder() {
                return this == f19285h ? new C8517b() : new C8517b().m16005n(this);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessage.isStringEmpty(this.f19287c)) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.f19287c);
                }
                int i10 = this.f19288d;
                if (i10 != 0) {
                    codedOutputStream.writeInt32(2, i10);
                }
                int i11 = this.f19289e;
                if (i11 != 0) {
                    codedOutputStream.writeInt32(3, i11);
                }
                if (!GeneratedMessage.isStringEmpty(this.f19290f)) {
                    GeneratedMessage.writeString(codedOutputStream, 4, this.f19290f);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$FileSource$FileInfo$b */
            public static final class C8517b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19292c;

                /* renamed from: d */
                public Object f19293d;

                /* renamed from: e */
                public int f19294e;

                /* renamed from: f */
                public int f19295f;

                /* renamed from: g */
                public Object f19296g;

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8517b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8517b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public FileInfo build() {
                    FileInfo fileInfoBuildPartial = buildPartial();
                    if (fileInfoBuildPartial.isInitialized()) {
                        return fileInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public FileInfo buildPartial() {
                    FileInfo fileInfo = new FileInfo(this);
                    if (this.f19292c != 0) {
                        m15997f(fileInfo);
                    }
                    onBuilt();
                    return fileInfo;
                }

                /* renamed from: f */
                public final void m15997f(FileInfo fileInfo) {
                    int i10 = this.f19292c;
                    if ((i10 & 1) != 0) {
                        fileInfo.f19287c = this.f19293d;
                    }
                    if ((i10 & 2) != 0) {
                        fileInfo.f19288d = this.f19294e;
                    }
                    if ((i10 & 4) != 0) {
                        fileInfo.f19289e = this.f19295f;
                    }
                    if ((i10 & 8) != 0) {
                        fileInfo.f19290f = this.f19296g;
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8517b clear() {
                    super.clear();
                    this.f19292c = 0;
                    this.f19293d = "";
                    this.f19294e = 0;
                    this.f19295f = 0;
                    this.f19296g = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f19266k;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8517b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8517b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8517b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8517b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f19267l.ensureFieldAccessorsInitialized(FileInfo.class, C8517b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8517b mo33979clone() {
                    return (C8517b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public FileInfo getDefaultInstanceForType() {
                    return FileInfo.m15986k();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8517b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f19293d = codedInputStream.readStringRequireUtf8();
                                        this.f19292c |= 1;
                                    } else if (tag == 16) {
                                        this.f19294e = codedInputStream.readInt32();
                                        this.f19292c |= 2;
                                    } else if (tag == 24) {
                                        this.f19295f = codedInputStream.readInt32();
                                        this.f19292c |= 4;
                                    } else if (tag == 34) {
                                        this.f19296g = codedInputStream.readStringRequireUtf8();
                                        this.f19292c |= 8;
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
                public C8517b mergeFrom(Message message) {
                    if (message instanceof FileInfo) {
                        return m16005n((FileInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: n */
                public C8517b m16005n(FileInfo fileInfo) {
                    if (fileInfo == FileInfo.m15986k()) {
                        return this;
                    }
                    if (!fileInfo.getName().isEmpty()) {
                        this.f19293d = fileInfo.f19287c;
                        this.f19292c |= 1;
                        onChanged();
                    }
                    if (fileInfo.getWidth() != 0) {
                        m16013v(fileInfo.getWidth());
                    }
                    if (fileInfo.getHeight() != 0) {
                        m16008q(fileInfo.getHeight());
                    }
                    if (!fileInfo.m15989n().isEmpty()) {
                        this.f19296g = fileInfo.f19290f;
                        this.f19292c |= 8;
                        onChanged();
                    }
                    mergeUnknownFields(fileInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public final C8517b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8517b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8517b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8517b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: q */
                public C8517b m16008q(int i10) {
                    this.f19295f = i10;
                    this.f19292c |= 4;
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C8517b m16009r(String str) {
                    str.getClass();
                    this.f19293d = str;
                    this.f19292c |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public C8517b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8517b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public final C8517b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8517b) super.setUnknownFields(unknownFieldSet);
                }

                /* renamed from: u */
                public C8517b m16012u(String str) {
                    str.getClass();
                    this.f19296g = str;
                    this.f19292c |= 8;
                    onChanged();
                    return this;
                }

                /* renamed from: v */
                public C8517b m16013v(int i10) {
                    this.f19294e = i10;
                    this.f19292c |= 2;
                    onChanged();
                    return this;
                }

                public C8517b() {
                    this.f19293d = "";
                    this.f19296g = "";
                }

                public C8517b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19293d = "";
                    this.f19296g = "";
                }
            }

            public FileInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19287c = "";
                this.f19288d = 0;
                this.f19289e = 0;
                this.f19290f = "";
                this.f19291g = (byte) -1;
            }

            private FileInfo() {
                this.f19287c = "";
                this.f19288d = 0;
                this.f19289e = 0;
                this.f19290f = "";
                this.f19291g = (byte) -1;
                this.f19287c = "";
                this.f19290f = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$a */
        public class C8518a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public FileSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8519b c8519bM15972m = FileSource.m15972m();
                try {
                    c8519bM15972m.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8519bM15972m.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8519bM15972m.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8519bM15972m.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8519bM15972m.buildPartial());
                }
            }
        }

        /* renamed from: e */
        public static FileSource m15971e() {
            return f19281e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f19264i;
        }

        /* renamed from: m */
        public static C8519b m15972m() {
            return f19281e.toBuilder();
        }

        /* renamed from: p */
        public static FileSource m15973p(InputStream inputStream) {
            return (FileSource) GeneratedMessage.parseWithIOException(f19282f, inputStream);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileSource)) {
                return super.equals(obj);
            }
            FileSource fileSource = (FileSource) obj;
            return m15976k().equals(fileSource.m15976k()) && getUnknownFields().equals(fileSource.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public FileSource getDefaultInstanceForType() {
            return f19281e;
        }

        /* renamed from: g */
        public int m15975g() {
            return this.f19283c.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19282f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19283c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19283c.get(i11));
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
            if (m15975g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m15976k().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f19265j.ensureFieldAccessorsInitialized(FileSource.class, C8519b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19284d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19284d = (byte) 1;
            return true;
        }

        /* renamed from: k */
        public List m15976k() {
            return this.f19283c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8519b newBuilderForType() {
            return m15972m();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new FileSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C8519b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8519b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C8519b toBuilder() {
            return this == f19281e ? new C8519b() : new C8519b().m16031s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19283c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19283c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$FileSource$b */
        public static final class C8519b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19297c;

            /* renamed from: d */
            public List f19298d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19299e;

            /* renamed from: b */
            public C8519b m16015b(FileInfo.C8517b c8517b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19299e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8517b.build());
                    return this;
                }
                m16025m();
                this.f19298d.add(c8517b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C8519b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8519b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public FileSource build() {
                FileSource fileSourceBuildPartial = buildPartial();
                if (fileSourceBuildPartial.isInitialized()) {
                    return fileSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public FileSource buildPartial() {
                FileSource fileSource = new FileSource(this);
                m16020h(fileSource);
                if (this.f19297c != 0) {
                    m16019g(fileSource);
                }
                onBuilt();
                return fileSource;
            }

            /* renamed from: g */
            public final void m16019g(FileSource fileSource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f19264i;
            }

            /* renamed from: h */
            public final void m16020h(FileSource fileSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19299e;
                if (repeatedFieldBuilderV3 != null) {
                    fileSource.f19283c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f19297c & 1) != 0) {
                    this.f19298d = Collections.unmodifiableList(this.f19298d);
                    this.f19297c &= -2;
                }
                fileSource.f19283c = this.f19298d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8519b clear() {
                super.clear();
                this.f19297c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19299e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19298d = Collections.EMPTY_LIST;
                } else {
                    this.f19298d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19297c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19265j.ensureFieldAccessorsInitialized(FileSource.class, C8519b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8519b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8519b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8519b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8519b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8519b mo33979clone() {
                return (C8519b) super.mo33979clone();
            }

            /* renamed from: m */
            public final void m16025m() {
                if ((this.f19297c & 1) == 0) {
                    this.f19298d = new ArrayList(this.f19298d);
                    this.f19297c |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public FileSource getDefaultInstanceForType() {
                return FileSource.m15971e();
            }

            /* renamed from: o */
            public int m16027o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19299e;
                return repeatedFieldBuilderV3 == null ? this.f19298d.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m16028p() {
                if (this.f19299e == null) {
                    this.f19299e = new RepeatedFieldBuilderV3(this.f19298d, (this.f19297c & 1) != 0, getParentForChildren(), isClean());
                    this.f19298d = null;
                }
                return this.f19299e;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8519b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    FileInfo fileInfo = (FileInfo) codedInputStream.readMessage(FileInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19299e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m16025m();
                                        this.f19298d.add(fileInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fileInfo);
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
            public C8519b mergeFrom(Message message) {
                if (message instanceof FileSource) {
                    return m16031s((FileSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8519b m16031s(FileSource fileSource) {
                if (fileSource == FileSource.m15971e()) {
                    return this;
                }
                if (this.f19299e == null) {
                    if (!fileSource.f19283c.isEmpty()) {
                        if (this.f19298d.isEmpty()) {
                            this.f19298d = fileSource.f19283c;
                            this.f19297c &= -2;
                        } else {
                            m16025m();
                            this.f19298d.addAll(fileSource.f19283c);
                        }
                        onChanged();
                    }
                } else if (!fileSource.f19283c.isEmpty()) {
                    if (this.f19299e.isEmpty()) {
                        this.f19299e.dispose();
                        this.f19299e = null;
                        this.f19298d = fileSource.f19283c;
                        this.f19297c &= -2;
                        this.f19299e = GeneratedMessage.alwaysUseFieldBuilders ? m16028p() : null;
                    } else {
                        this.f19299e.addAllMessages(fileSource.f19283c);
                    }
                }
                mergeUnknownFields(fileSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8519b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8519b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8519b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8519b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8519b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8519b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8519b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8519b) super.setUnknownFields(unknownFieldSet);
            }

            public C8519b() {
                this.f19298d = Collections.EMPTY_LIST;
            }

            public C8519b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19298d = Collections.EMPTY_LIST;
            }
        }

        public FileSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19284d = (byte) -1;
        }

        private FileSource() {
            this.f19284d = (byte) -1;
            this.f19283c = Collections.EMPTY_LIST;
        }
    }

    public static final class GeometrySource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final GeometrySource f19300e = new GeometrySource();

        /* renamed from: f */
        public static final Parser f19301f = new C8522a();

        /* renamed from: c */
        public List f19302c;

        /* renamed from: d */
        public byte f19303d;

        public static final class GeometryInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: h */
            public static final GeometryInfo f19304h = new GeometryInfo();

            /* renamed from: i */
            public static final Parser f19305i = new C8520a();

            /* renamed from: c */
            public int f19306c;

            /* renamed from: d */
            public int f19307d;

            /* renamed from: e */
            public List f19308e;

            /* renamed from: f */
            public EzyPaint.Paint f19309f;

            /* renamed from: g */
            public byte f19310g;

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$a */
            public class C8520a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public GeometryInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8521b c8521bM16056u = GeometryInfo.m16056u();
                    try {
                        c8521bM16056u.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8521bM16056u.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8521bM16056u.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8521bM16056u.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8521bM16056u.buildPartial());
                    }
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f19278w;
            }

            /* renamed from: k */
            public static /* synthetic */ int m16053k(GeometryInfo geometryInfo, int i10) {
                int i11 = i10 | geometryInfo.f19306c;
                geometryInfo.f19306c = i11;
                return i11;
            }

            /* renamed from: n */
            public static GeometryInfo m16055n() {
                return f19304h;
            }

            public static Parser parser() {
                return f19305i;
            }

            /* renamed from: u */
            public static C8521b m16056u() {
                return f19304h.toBuilder();
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof GeometryInfo)) {
                    return super.equals(obj);
                }
                GeometryInfo geometryInfo = (GeometryInfo) obj;
                if (this.f19307d == geometryInfo.f19307d && getPointsList().equals(geometryInfo.getPointsList()) && m16060t() == geometryInfo.m16060t()) {
                    return (!m16060t() || m16059r().equals(geometryInfo.m16059r())) && getUnknownFields().equals(geometryInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19305i;
            }

            public int getPointsCount() {
                return this.f19308e.size();
            }

            public List getPointsList() {
                return this.f19308e;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeEnumSize = this.f19307d != EzyGeometryEnum.GeometryEnum.OVAL.getNumber() ? CodedOutputStream.computeEnumSize(1, this.f19307d) : 0;
                for (int i11 = 0; i11 < this.f19308e.size(); i11++) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(2, (MessageLite) this.f19308e.get(i11));
                }
                if ((this.f19306c & 1) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(3, m16059r());
                }
                int serializedSize = iComputeEnumSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.f19307d;
                if (getPointsCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + getPointsList().hashCode();
                }
                if (m16060t()) {
                    iHashCode = (((iHashCode * 37) + 3) * 53) + m16059r().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19279x.ensureFieldAccessorsInitialized(GeometryInfo.class, C8521b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19310g;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19310g = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new GeometryInfo();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public GeometryInfo getDefaultInstanceForType() {
                return f19304h;
            }

            /* renamed from: p */
            public int m16058p() {
                return this.f19307d;
            }

            /* renamed from: r */
            public EzyPaint.Paint m16059r() {
                EzyPaint.Paint paint = this.f19309f;
                return paint == null ? EzyPaint.Paint.m15718k() : paint;
            }

            /* renamed from: t */
            public boolean m16060t() {
                return (this.f19306c & 1) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8521b newBuilderForType() {
                return m16056u();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (this.f19307d != EzyGeometryEnum.GeometryEnum.OVAL.getNumber()) {
                    codedOutputStream.writeEnum(1, this.f19307d);
                }
                for (int i10 = 0; i10 < this.f19308e.size(); i10++) {
                    codedOutputStream.writeMessage(2, (MessageLite) this.f19308e.get(i10));
                }
                if ((this.f19306c & 1) != 0) {
                    codedOutputStream.writeMessage(3, m16059r());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: y, reason: merged with bridge method [inline-methods] */
            public C8521b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8521b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: z, reason: merged with bridge method [inline-methods] */
            public C8521b toBuilder() {
                return this == f19304h ? new C8521b() : new C8521b().m16081s(this);
            }

            /* renamed from: com.zykj.board.EzySource$GeometrySource$GeometryInfo$b */
            public static final class C8521b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19311c;

                /* renamed from: d */
                public int f19312d;

                /* renamed from: e */
                public List f19313e;

                /* renamed from: f */
                public RepeatedFieldBuilderV3 f19314f;

                /* renamed from: g */
                public EzyPaint.Paint f19315g;

                /* renamed from: h */
                public SingleFieldBuilderV3 f19316h;

                private void ensurePointsIsMutable() {
                    if ((this.f19311c & 2) == 0) {
                        this.f19313e = new ArrayList(this.f19313e);
                        this.f19311c |= 2;
                    }
                }

                private RepeatedFieldBuilderV3 getPointsFieldBuilder() {
                    if (this.f19314f == null) {
                        this.f19314f = new RepeatedFieldBuilderV3(this.f19313e, (this.f19311c & 2) != 0, getParentForChildren(), isClean());
                        this.f19313e = null;
                    }
                    return this.f19314f;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getPointsFieldBuilder();
                        m16065p();
                    }
                }

                /* renamed from: p */
                private SingleFieldBuilderV3 m16065p() {
                    if (this.f19316h == null) {
                        this.f19316h = new SingleFieldBuilderV3(m16077n(), getParentForChildren(), isClean());
                        this.f19315g = null;
                    }
                    return this.f19316h;
                }

                /* renamed from: b */
                public C8521b m16066b(EzyPointF.PointF pointF) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19314f;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(pointF);
                        return this;
                    }
                    pointF.getClass();
                    ensurePointsIsMutable();
                    this.f19313e.add(pointF);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public C8521b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8521b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public GeometryInfo build() {
                    GeometryInfo geometryInfoBuildPartial = buildPartial();
                    if (geometryInfoBuildPartial.isInitialized()) {
                        return geometryInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometryInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public GeometryInfo buildPartial() {
                    GeometryInfo geometryInfo = new GeometryInfo(this);
                    m16071h(geometryInfo);
                    if (this.f19311c != 0) {
                        m16070g(geometryInfo);
                    }
                    onBuilt();
                    return geometryInfo;
                }

                /* renamed from: g */
                public final void m16070g(GeometryInfo geometryInfo) {
                    int i10;
                    int i11 = this.f19311c;
                    if ((i11 & 1) != 0) {
                        geometryInfo.f19307d = this.f19312d;
                    }
                    if ((i11 & 4) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19316h;
                        geometryInfo.f19309f = singleFieldBuilderV3 == null ? this.f19315g : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    GeometryInfo.m16053k(geometryInfo, i10);
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f19278w;
                }

                /* renamed from: h */
                public final void m16071h(GeometryInfo geometryInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19314f;
                    if (repeatedFieldBuilderV3 != null) {
                        geometryInfo.f19308e = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f19311c & 2) != 0) {
                        this.f19313e = Collections.unmodifiableList(this.f19313e);
                        this.f19311c &= -3;
                    }
                    geometryInfo.f19308e = this.f19313e;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8521b clear() {
                    super.clear();
                    this.f19311c = 0;
                    this.f19312d = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19314f;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f19313e = Collections.EMPTY_LIST;
                    } else {
                        this.f19313e = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f19311c &= -3;
                    this.f19315g = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19316h;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f19316h = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f19279x.ensureFieldAccessorsInitialized(GeometryInfo.class, C8521b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8521b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8521b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C8521b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8521b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8521b mo33979clone() {
                    return (C8521b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public GeometryInfo getDefaultInstanceForType() {
                    return GeometryInfo.m16055n();
                }

                /* renamed from: n */
                public EzyPaint.Paint m16077n() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19316h;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f19315g;
                    return paint == null ? EzyPaint.Paint.m15718k() : paint;
                }

                /* renamed from: o */
                public EzyPaint.Paint.C8501b m16078o() {
                    this.f19311c |= 4;
                    onChanged();
                    return (EzyPaint.Paint.C8501b) m16065p().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: q, reason: merged with bridge method [inline-methods] */
                public C8521b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 8) {
                                        this.f19312d = codedInputStream.readEnum();
                                        this.f19311c |= 1;
                                    } else if (tag == 18) {
                                        EzyPointF.PointF pointF = (EzyPointF.PointF) codedInputStream.readMessage(EzyPointF.PointF.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19314f;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensurePointsIsMutable();
                                            this.f19313e.add(pointF);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(pointF);
                                        }
                                    } else if (tag == 26) {
                                        codedInputStream.readMessage(m16065p().getBuilder(), extensionRegistryLite);
                                        this.f19311c |= 4;
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
                public C8521b mergeFrom(Message message) {
                    if (message instanceof GeometryInfo) {
                        return m16081s((GeometryInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: s */
                public C8521b m16081s(GeometryInfo geometryInfo) {
                    if (geometryInfo == GeometryInfo.m16055n()) {
                        return this;
                    }
                    if (geometryInfo.f19307d != 0) {
                        m16085w(geometryInfo.m16058p());
                    }
                    if (this.f19314f == null) {
                        if (!geometryInfo.f19308e.isEmpty()) {
                            if (this.f19313e.isEmpty()) {
                                this.f19313e = geometryInfo.f19308e;
                                this.f19311c &= -3;
                            } else {
                                ensurePointsIsMutable();
                                this.f19313e.addAll(geometryInfo.f19308e);
                            }
                            onChanged();
                        }
                    } else if (!geometryInfo.f19308e.isEmpty()) {
                        if (this.f19314f.isEmpty()) {
                            this.f19314f.dispose();
                            this.f19314f = null;
                            this.f19313e = geometryInfo.f19308e;
                            this.f19311c &= -3;
                            this.f19314f = GeneratedMessage.alwaysUseFieldBuilders ? getPointsFieldBuilder() : null;
                        } else {
                            this.f19314f.addAllMessages(geometryInfo.f19308e);
                        }
                    }
                    if (geometryInfo.m16060t()) {
                        m16082t(geometryInfo.m16059r());
                    }
                    mergeUnknownFields(geometryInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: t */
                public C8521b m16082t(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19316h;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f19311c & 4) == 0 || (paint2 = this.f19315g) == null || paint2 == EzyPaint.Paint.m15718k()) {
                        this.f19315g = paint;
                    } else {
                        m16078o().m15740n(paint);
                    }
                    if (this.f19315g != null) {
                        this.f19311c |= 4;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public final C8521b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8521b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public C8521b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8521b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: w */
                public C8521b m16085w(int i10) {
                    this.f19312d = i10;
                    this.f19311c |= 1;
                    onChanged();
                    return this;
                }

                /* renamed from: x */
                public C8521b m16086x(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19316h;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f19315g = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f19311c |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C8521b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8521b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public final C8521b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8521b) super.setUnknownFields(unknownFieldSet);
                }

                public C8521b() {
                    this.f19312d = 0;
                    this.f19313e = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C8521b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19312d = 0;
                    this.f19313e = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public GeometryInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19307d = 0;
                this.f19310g = (byte) -1;
            }

            private GeometryInfo() {
                this.f19310g = (byte) -1;
                this.f19307d = 0;
                this.f19308e = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$a */
        public class C8522a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public GeometrySource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8523b c8523bM16039k = GeometrySource.m16039k();
                try {
                    c8523bM16039k.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8523bM16039k.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8523bM16039k.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8523bM16039k.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8523bM16039k.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static GeometrySource m16038d() {
            return f19300e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f19276u;
        }

        /* renamed from: k */
        public static C8523b m16039k() {
            return f19300e.toBuilder();
        }

        /* renamed from: o */
        public static GeometrySource m16040o(InputStream inputStream) {
            return (GeometrySource) GeneratedMessage.parseWithIOException(f19301f, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public GeometrySource getDefaultInstanceForType() {
            return f19300e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GeometrySource)) {
                return super.equals(obj);
            }
            GeometrySource geometrySource = (GeometrySource) obj;
            return m16043g().equals(geometrySource.m16043g()) && getUnknownFields().equals(geometrySource.getUnknownFields());
        }

        /* renamed from: f */
        public int m16042f() {
            return this.f19302c.size();
        }

        /* renamed from: g */
        public List m16043g() {
            return this.f19302c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19301f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19302c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19302c.get(i11));
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
            if (m16042f() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m16043g().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f19277v.ensureFieldAccessorsInitialized(GeometrySource.class, C8523b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19303d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19303d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8523b newBuilderForType() {
            return m16039k();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8523b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8523b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new GeometrySource();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C8523b toBuilder() {
            return this == f19300e ? new C8523b() : new C8523b().m16106s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19302c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19302c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$GeometrySource$b */
        public static final class C8523b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19317c;

            /* renamed from: d */
            public List f19318d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19319e;

            /* renamed from: b */
            public C8523b m16090b(GeometryInfo.C8521b c8521b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19319e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8521b.build());
                    return this;
                }
                m16100m();
                this.f19318d.add(c8521b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C8523b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8523b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public GeometrySource build() {
                GeometrySource geometrySourceBuildPartial = buildPartial();
                if (geometrySourceBuildPartial.isInitialized()) {
                    return geometrySourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) geometrySourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public GeometrySource buildPartial() {
                GeometrySource geometrySource = new GeometrySource(this);
                m16095h(geometrySource);
                if (this.f19317c != 0) {
                    m16094g(geometrySource);
                }
                onBuilt();
                return geometrySource;
            }

            /* renamed from: g */
            public final void m16094g(GeometrySource geometrySource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f19276u;
            }

            /* renamed from: h */
            public final void m16095h(GeometrySource geometrySource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19319e;
                if (repeatedFieldBuilderV3 != null) {
                    geometrySource.f19302c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f19317c & 1) != 0) {
                    this.f19318d = Collections.unmodifiableList(this.f19318d);
                    this.f19317c &= -2;
                }
                geometrySource.f19302c = this.f19318d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8523b clear() {
                super.clear();
                this.f19317c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19319e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19318d = Collections.EMPTY_LIST;
                } else {
                    this.f19318d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19317c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19277v.ensureFieldAccessorsInitialized(GeometrySource.class, C8523b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8523b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8523b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8523b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8523b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8523b mo33979clone() {
                return (C8523b) super.mo33979clone();
            }

            /* renamed from: m */
            public final void m16100m() {
                if ((this.f19317c & 1) == 0) {
                    this.f19318d = new ArrayList(this.f19318d);
                    this.f19317c |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public GeometrySource getDefaultInstanceForType() {
                return GeometrySource.m16038d();
            }

            /* renamed from: o */
            public int m16102o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19319e;
                return repeatedFieldBuilderV3 == null ? this.f19318d.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m16103p() {
                if (this.f19319e == null) {
                    this.f19319e = new RepeatedFieldBuilderV3(this.f19318d, (this.f19317c & 1) != 0, getParentForChildren(), isClean());
                    this.f19318d = null;
                }
                return this.f19319e;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8523b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    GeometryInfo geometryInfo = (GeometryInfo) codedInputStream.readMessage(GeometryInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19319e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m16100m();
                                        this.f19318d.add(geometryInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(geometryInfo);
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
            public C8523b mergeFrom(Message message) {
                if (message instanceof GeometrySource) {
                    return m16106s((GeometrySource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8523b m16106s(GeometrySource geometrySource) {
                if (geometrySource == GeometrySource.m16038d()) {
                    return this;
                }
                if (this.f19319e == null) {
                    if (!geometrySource.f19302c.isEmpty()) {
                        if (this.f19318d.isEmpty()) {
                            this.f19318d = geometrySource.f19302c;
                            this.f19317c &= -2;
                        } else {
                            m16100m();
                            this.f19318d.addAll(geometrySource.f19302c);
                        }
                        onChanged();
                    }
                } else if (!geometrySource.f19302c.isEmpty()) {
                    if (this.f19319e.isEmpty()) {
                        this.f19319e.dispose();
                        this.f19319e = null;
                        this.f19318d = geometrySource.f19302c;
                        this.f19317c &= -2;
                        this.f19319e = GeneratedMessage.alwaysUseFieldBuilders ? m16103p() : null;
                    } else {
                        this.f19319e.addAllMessages(geometrySource.f19302c);
                    }
                }
                mergeUnknownFields(geometrySource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8523b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8523b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8523b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8523b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8523b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8523b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8523b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8523b) super.setUnknownFields(unknownFieldSet);
            }

            public C8523b() {
                this.f19318d = Collections.EMPTY_LIST;
            }

            public C8523b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19318d = Collections.EMPTY_LIST;
            }
        }

        public GeometrySource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19303d = (byte) -1;
        }

        private GeometrySource() {
            this.f19303d = (byte) -1;
            this.f19302c = Collections.EMPTY_LIST;
        }
    }

    public static final class MatrixSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final MatrixSource f19320e = new MatrixSource();

        /* renamed from: f */
        public static final Parser f19321f = new C8526a();

        /* renamed from: c */
        public List f19322c;

        /* renamed from: d */
        public byte f19323d;

        public static final class MatrixInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: e */
            public static final MatrixInfo f19324e = new MatrixInfo();

            /* renamed from: f */
            public static final Parser f19325f = new C8524a();

            /* renamed from: c */
            public List f19326c;

            /* renamed from: d */
            public byte f19327d;

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$a */
            public class C8524a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public MatrixInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8525b c8525bM16126g = MatrixInfo.m16126g();
                    try {
                        c8525bM16126g.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8525bM16126g.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8525bM16126g.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8525bM16126g.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8525bM16126g.buildPartial());
                    }
                }
            }

            /* renamed from: e */
            public static MatrixInfo m16125e() {
                return f19324e;
            }

            /* renamed from: g */
            public static C8525b m16126g() {
                return f19324e.toBuilder();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f19262g;
            }

            public static Parser parser() {
                return f19325f;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MatrixInfo)) {
                    return super.equals(obj);
                }
                MatrixInfo matrixInfo = (MatrixInfo) obj;
                return getMatrixList().equals(matrixInfo.getMatrixList()) && getUnknownFields().equals(matrixInfo.getUnknownFields());
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public MatrixInfo getDefaultInstanceForType() {
                return f19324e;
            }

            public int getMatrixCount() {
                return this.f19326c.size();
            }

            public List getMatrixList() {
                return this.f19326c;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19325f;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.f19326c.size(); i11++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19326c.get(i11));
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
                if (getMatrixCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getMatrixList().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19263h.ensureFieldAccessorsInitialized(MatrixInfo.class, C8525b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19327d;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19327d = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8525b newBuilderForType() {
                return m16126g();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public C8525b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8525b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C8525b toBuilder() {
                return this == f19324e ? new C8525b() : new C8525b().m16147r(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new MatrixInfo();
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                for (int i10 = 0; i10 < this.f19326c.size(); i10++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f19326c.get(i10));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$MatrixSource$MatrixInfo$b */
            public static final class C8525b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19328c;

                /* renamed from: d */
                public List f19329d;

                /* renamed from: e */
                public RepeatedFieldBuilderV3 f19330e;

                /* renamed from: b */
                public C8525b m16132b(EzyMatrix.Matrix.C8487b c8487b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19330e;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c8487b.build());
                        return this;
                    }
                    ensureMatrixIsMutable();
                    this.f19329d.add(c8487b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: d */
                public C8525b m16133d(EzyMatrix.Matrix matrix) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19330e;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(matrix);
                        return this;
                    }
                    matrix.getClass();
                    ensureMatrixIsMutable();
                    this.f19329d.add(matrix);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public C8525b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8525b) super.addRepeatedField(fieldDescriptor, obj);
                }

                public final void ensureMatrixIsMutable() {
                    if ((this.f19328c & 1) == 0) {
                        this.f19329d = new ArrayList(this.f19329d);
                        this.f19328c |= 1;
                    }
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public MatrixInfo build() {
                    MatrixInfo matrixInfoBuildPartial = buildPartial();
                    if (matrixInfoBuildPartial.isInitialized()) {
                        return matrixInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public MatrixInfo buildPartial() {
                    MatrixInfo matrixInfo = new MatrixInfo(this);
                    m16138i(matrixInfo);
                    if (this.f19328c != 0) {
                        m16137h(matrixInfo);
                    }
                    onBuilt();
                    return matrixInfo;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f19262g;
                }

                /* renamed from: h */
                public final void m16137h(MatrixInfo matrixInfo) {
                }

                /* renamed from: i */
                public final void m16138i(MatrixInfo matrixInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19330e;
                    if (repeatedFieldBuilderV3 != null) {
                        matrixInfo.f19326c = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f19328c & 1) != 0) {
                        this.f19329d = Collections.unmodifiableList(this.f19329d);
                        this.f19328c &= -2;
                    }
                    matrixInfo.f19326c = this.f19329d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f19263h.ensureFieldAccessorsInitialized(MatrixInfo.class, C8525b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8525b clear() {
                    super.clear();
                    this.f19328c = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19330e;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f19329d = Collections.EMPTY_LIST;
                    } else {
                        this.f19329d = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f19328c &= -2;
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C8525b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8525b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8525b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8525b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C8525b mo33979clone() {
                    return (C8525b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public MatrixInfo getDefaultInstanceForType() {
                    return MatrixInfo.m16125e();
                }

                /* renamed from: o */
                public final RepeatedFieldBuilderV3 m16144o() {
                    if (this.f19330e == null) {
                        this.f19330e = new RepeatedFieldBuilderV3(this.f19329d, (this.f19328c & 1) != 0, getParentForChildren(), isClean());
                        this.f19329d = null;
                    }
                    return this.f19330e;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public C8525b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyMatrix.Matrix matrix = (EzyMatrix.Matrix) codedInputStream.readMessage(EzyMatrix.Matrix.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19330e;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureMatrixIsMutable();
                                            this.f19329d.add(matrix);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(matrix);
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
                public C8525b mergeFrom(Message message) {
                    if (message instanceof MatrixInfo) {
                        return m16147r((MatrixInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: r */
                public C8525b m16147r(MatrixInfo matrixInfo) {
                    if (matrixInfo == MatrixInfo.m16125e()) {
                        return this;
                    }
                    if (this.f19330e == null) {
                        if (!matrixInfo.f19326c.isEmpty()) {
                            if (this.f19329d.isEmpty()) {
                                this.f19329d = matrixInfo.f19326c;
                                this.f19328c &= -2;
                            } else {
                                ensureMatrixIsMutable();
                                this.f19329d.addAll(matrixInfo.f19326c);
                            }
                            onChanged();
                        }
                    } else if (!matrixInfo.f19326c.isEmpty()) {
                        if (this.f19330e.isEmpty()) {
                            this.f19330e.dispose();
                            this.f19330e = null;
                            this.f19329d = matrixInfo.f19326c;
                            this.f19328c &= -2;
                            this.f19330e = GeneratedMessage.alwaysUseFieldBuilders ? m16144o() : null;
                        } else {
                            this.f19330e.addAllMessages(matrixInfo.f19326c);
                        }
                    }
                    mergeUnknownFields(matrixInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C8525b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8525b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: t, reason: merged with bridge method [inline-methods] */
                public C8525b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8525b) super.setField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C8525b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8525b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final C8525b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8525b) super.setUnknownFields(unknownFieldSet);
                }

                public C8525b() {
                    this.f19329d = Collections.EMPTY_LIST;
                }

                public C8525b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19329d = Collections.EMPTY_LIST;
                }
            }

            public MatrixInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19327d = (byte) -1;
            }

            private MatrixInfo() {
                this.f19327d = (byte) -1;
                this.f19326c = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$a */
        public class C8526a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MatrixSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8527b c8527bM16114k = MatrixSource.m16114k();
                try {
                    c8527bM16114k.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8527bM16114k.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8527bM16114k.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8527bM16114k.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8527bM16114k.buildPartial());
                }
            }
        }

        /* renamed from: d */
        public static MatrixSource m16113d() {
            return f19320e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f19260e;
        }

        /* renamed from: k */
        public static C8527b m16114k() {
            return f19320e.toBuilder();
        }

        /* renamed from: o */
        public static MatrixSource m16115o(InputStream inputStream) {
            return (MatrixSource) GeneratedMessage.parseWithIOException(f19321f, inputStream);
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public MatrixSource getDefaultInstanceForType() {
            return f19320e;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MatrixSource)) {
                return super.equals(obj);
            }
            MatrixSource matrixSource = (MatrixSource) obj;
            return m16118g().equals(matrixSource.m16118g()) && getUnknownFields().equals(matrixSource.getUnknownFields());
        }

        /* renamed from: f */
        public int m16117f() {
            return this.f19322c.size();
        }

        /* renamed from: g */
        public List m16118g() {
            return this.f19322c;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19321f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19322c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19322c.get(i11));
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
            if (m16117f() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m16118g().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f19261f.ensureFieldAccessorsInitialized(MatrixSource.class, C8527b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19323d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19323d = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C8527b newBuilderForType() {
            return m16114k();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8527b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8527b(builderParent);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new MatrixSource();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C8527b toBuilder() {
            return this == f19320e ? new C8527b() : new C8527b().m16169s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19322c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19322c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$MatrixSource$b */
        public static final class C8527b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19331c;

            /* renamed from: d */
            public List f19332d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19333e;

            /* renamed from: b */
            public C8527b m16153b(MatrixInfo matrixInfo) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19333e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(matrixInfo);
                    return this;
                }
                matrixInfo.getClass();
                m16163m();
                this.f19332d.add(matrixInfo);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C8527b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8527b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public MatrixSource build() {
                MatrixSource matrixSourceBuildPartial = buildPartial();
                if (matrixSourceBuildPartial.isInitialized()) {
                    return matrixSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) matrixSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public MatrixSource buildPartial() {
                MatrixSource matrixSource = new MatrixSource(this);
                m16158h(matrixSource);
                if (this.f19331c != 0) {
                    m16157g(matrixSource);
                }
                onBuilt();
                return matrixSource;
            }

            /* renamed from: g */
            public final void m16157g(MatrixSource matrixSource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f19260e;
            }

            /* renamed from: h */
            public final void m16158h(MatrixSource matrixSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19333e;
                if (repeatedFieldBuilderV3 != null) {
                    matrixSource.f19322c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f19331c & 1) != 0) {
                    this.f19332d = Collections.unmodifiableList(this.f19332d);
                    this.f19331c &= -2;
                }
                matrixSource.f19322c = this.f19332d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8527b clear() {
                super.clear();
                this.f19331c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19333e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19332d = Collections.EMPTY_LIST;
                } else {
                    this.f19332d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19331c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19261f.ensureFieldAccessorsInitialized(MatrixSource.class, C8527b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8527b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8527b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8527b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8527b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8527b mo33979clone() {
                return (C8527b) super.mo33979clone();
            }

            /* renamed from: m */
            public final void m16163m() {
                if ((this.f19331c & 1) == 0) {
                    this.f19332d = new ArrayList(this.f19332d);
                    this.f19331c |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public MatrixSource getDefaultInstanceForType() {
                return MatrixSource.m16113d();
            }

            /* renamed from: o */
            public int m16165o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19333e;
                return repeatedFieldBuilderV3 == null ? this.f19332d.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m16166p() {
                if (this.f19333e == null) {
                    this.f19333e = new RepeatedFieldBuilderV3(this.f19332d, (this.f19331c & 1) != 0, getParentForChildren(), isClean());
                    this.f19332d = null;
                }
                return this.f19333e;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8527b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    MatrixInfo matrixInfo = (MatrixInfo) codedInputStream.readMessage(MatrixInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19333e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m16163m();
                                        this.f19332d.add(matrixInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(matrixInfo);
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
            public C8527b mergeFrom(Message message) {
                if (message instanceof MatrixSource) {
                    return m16169s((MatrixSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8527b m16169s(MatrixSource matrixSource) {
                if (matrixSource == MatrixSource.m16113d()) {
                    return this;
                }
                if (this.f19333e == null) {
                    if (!matrixSource.f19322c.isEmpty()) {
                        if (this.f19332d.isEmpty()) {
                            this.f19332d = matrixSource.f19322c;
                            this.f19331c &= -2;
                        } else {
                            m16163m();
                            this.f19332d.addAll(matrixSource.f19322c);
                        }
                        onChanged();
                    }
                } else if (!matrixSource.f19322c.isEmpty()) {
                    if (this.f19333e.isEmpty()) {
                        this.f19333e.dispose();
                        this.f19333e = null;
                        this.f19332d = matrixSource.f19322c;
                        this.f19331c &= -2;
                        this.f19333e = GeneratedMessage.alwaysUseFieldBuilders ? m16166p() : null;
                    } else {
                        this.f19333e.addAllMessages(matrixSource.f19322c);
                    }
                }
                mergeUnknownFields(matrixSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8527b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8527b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8527b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8527b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8527b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8527b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8527b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8527b) super.setUnknownFields(unknownFieldSet);
            }

            public C8527b() {
                this.f19332d = Collections.EMPTY_LIST;
            }

            public C8527b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19332d = Collections.EMPTY_LIST;
            }
        }

        public MatrixSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19323d = (byte) -1;
        }

        private MatrixSource() {
            this.f19323d = (byte) -1;
            this.f19322c = Collections.EMPTY_LIST;
        }
    }

    public static final class TextSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final TextSource f19334e = new TextSource();

        /* renamed from: f */
        public static final Parser f19335f = new C8530a();

        /* renamed from: c */
        public List f19336c;

        /* renamed from: d */
        public byte f19337d;

        public static final class TextInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: g */
            public static final TextInfo f19338g = new TextInfo();

            /* renamed from: h */
            public static final Parser f19339h = new C8528a();

            /* renamed from: c */
            public int f19340c;

            /* renamed from: d */
            public volatile Object f19341d;

            /* renamed from: e */
            public EzyPaint.Paint f19342e;

            /* renamed from: f */
            public byte f19343f;

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$a */
            public class C8528a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TextInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8529b c8529bM16192o = TextInfo.m16192o();
                    try {
                        c8529bM16192o.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8529bM16192o.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8529bM16192o.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8529bM16192o.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8529bM16192o.buildPartial());
                    }
                }
            }

            /* renamed from: f */
            public static /* synthetic */ int m16190f(TextInfo textInfo, int i10) {
                int i11 = i10 | textInfo.f19340c;
                textInfo.f19340c = i11;
                return i11;
            }

            /* renamed from: g */
            public static TextInfo m16191g() {
                return f19338g;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f19274s;
            }

            /* renamed from: o */
            public static C8529b m16192o() {
                return f19338g.toBuilder();
            }

            public static Parser parser() {
                return f19339h;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TextInfo)) {
                    return super.equals(obj);
                }
                TextInfo textInfo = (TextInfo) obj;
                if (getContent().equals(textInfo.getContent()) && m16195n() == textInfo.m16195n()) {
                    return (!m16195n() || m16194m().equals(textInfo.m16194m())) && getUnknownFields().equals(textInfo.getUnknownFields());
                }
                return false;
            }

            public String getContent() {
                Object obj = this.f19341d;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String stringUtf8 = ((ByteString) obj).toStringUtf8();
                this.f19341d = stringUtf8;
                return stringUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19339h;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeStringSize = !GeneratedMessage.isStringEmpty(this.f19341d) ? GeneratedMessage.computeStringSize(1, this.f19341d) : 0;
                if ((1 & this.f19340c) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(2, m16194m());
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
                int iHashCode = ((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getContent().hashCode();
                if (m16195n()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m16194m().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19275t.ensureFieldAccessorsInitialized(TextInfo.class, C8529b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19343f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19343f = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public TextInfo getDefaultInstanceForType() {
                return f19338g;
            }

            /* renamed from: m */
            public EzyPaint.Paint m16194m() {
                EzyPaint.Paint paint = this.f19342e;
                return paint == null ? EzyPaint.Paint.m15718k() : paint;
            }

            /* renamed from: n */
            public boolean m16195n() {
                return (this.f19340c & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TextInfo();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public C8529b newBuilderForType() {
                return m16192o();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C8529b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8529b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C8529b toBuilder() {
                return this == f19338g ? new C8529b() : new C8529b().m16214q(this);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if (!GeneratedMessage.isStringEmpty(this.f19341d)) {
                    GeneratedMessage.writeString(codedOutputStream, 1, this.f19341d);
                }
                if ((this.f19340c & 1) != 0) {
                    codedOutputStream.writeMessage(2, m16194m());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$TextSource$TextInfo$b */
            public static final class C8529b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19344c;

                /* renamed from: d */
                public Object f19345d;

                /* renamed from: e */
                public EzyPaint.Paint f19346e;

                /* renamed from: f */
                public SingleFieldBuilderV3 f19347f;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        m16200n();
                    }
                }

                /* renamed from: n */
                private SingleFieldBuilderV3 m16200n() {
                    if (this.f19347f == null) {
                        this.f19347f = new SingleFieldBuilderV3(m16210l(), getParentForChildren(), isClean());
                        this.f19346e = null;
                    }
                    return this.f19347f;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8529b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8529b) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: d, reason: merged with bridge method [inline-methods] */
                public TextInfo build() {
                    TextInfo textInfoBuildPartial = buildPartial();
                    if (textInfoBuildPartial.isInitialized()) {
                        return textInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) textInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: e, reason: merged with bridge method [inline-methods] */
                public TextInfo buildPartial() {
                    TextInfo textInfo = new TextInfo(this);
                    if (this.f19344c != 0) {
                        m16204f(textInfo);
                    }
                    onBuilt();
                    return textInfo;
                }

                /* renamed from: f */
                public final void m16204f(TextInfo textInfo) {
                    int i10;
                    int i11 = this.f19344c;
                    if ((i11 & 1) != 0) {
                        textInfo.f19341d = this.f19345d;
                    }
                    if ((i11 & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19347f;
                        textInfo.f19342e = singleFieldBuilderV3 == null ? this.f19346e : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    TextInfo.m16190f(textInfo, i10);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public C8529b clear() {
                    super.clear();
                    this.f19344c = 0;
                    this.f19345d = "";
                    this.f19346e = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19347f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f19347f = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f19274s;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: h, reason: merged with bridge method [inline-methods] */
                public C8529b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8529b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: i, reason: merged with bridge method [inline-methods] */
                public C8529b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8529b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f19275t.ensureFieldAccessorsInitialized(TextInfo.class, C8529b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8529b mo33979clone() {
                    return (C8529b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public TextInfo getDefaultInstanceForType() {
                    return TextInfo.m16191g();
                }

                /* renamed from: l */
                public EzyPaint.Paint m16210l() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19347f;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f19346e;
                    return paint == null ? EzyPaint.Paint.m15718k() : paint;
                }

                /* renamed from: m */
                public EzyPaint.Paint.C8501b m16211m() {
                    this.f19344c |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C8501b) m16200n().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: o, reason: merged with bridge method [inline-methods] */
                public C8529b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        this.f19345d = codedInputStream.readStringRequireUtf8();
                                        this.f19344c |= 1;
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m16200n().getBuilder(), extensionRegistryLite);
                                        this.f19344c |= 2;
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
                public C8529b mergeFrom(Message message) {
                    if (message instanceof TextInfo) {
                        return m16214q((TextInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: q */
                public C8529b m16214q(TextInfo textInfo) {
                    if (textInfo == TextInfo.m16191g()) {
                        return this;
                    }
                    if (!textInfo.getContent().isEmpty()) {
                        this.f19345d = textInfo.f19341d;
                        this.f19344c |= 1;
                        onChanged();
                    }
                    if (textInfo.m16195n()) {
                        m16215r(textInfo.m16194m());
                    }
                    mergeUnknownFields(textInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: r */
                public C8529b m16215r(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19347f;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f19344c & 2) == 0 || (paint2 = this.f19346e) == null || paint2 == EzyPaint.Paint.m15718k()) {
                        this.f19346e = paint;
                    } else {
                        m16211m().m15740n(paint);
                    }
                    if (this.f19346e != null) {
                        this.f19344c |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: s, reason: merged with bridge method [inline-methods] */
                public final C8529b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8529b) super.mergeUnknownFields(unknownFieldSet);
                }

                /* renamed from: t */
                public C8529b m16217t(String str) {
                    str.getClass();
                    this.f19345d = str;
                    this.f19344c |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: u, reason: merged with bridge method [inline-methods] */
                public C8529b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8529b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: v */
                public C8529b m16219v(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19347f;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f19346e = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f19344c |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C8529b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8529b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: x, reason: merged with bridge method [inline-methods] */
                public final C8529b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8529b) super.setUnknownFields(unknownFieldSet);
                }

                public C8529b() {
                    this.f19345d = "";
                    maybeForceBuilderInitialization();
                }

                public C8529b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19345d = "";
                    maybeForceBuilderInitialization();
                }
            }

            public TextInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19341d = "";
                this.f19343f = (byte) -1;
            }

            private TextInfo() {
                this.f19341d = "";
                this.f19343f = (byte) -1;
                this.f19341d = "";
            }
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$a */
        public class C8530a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TextSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8531b c8531bM16178m = TextSource.m16178m();
                try {
                    c8531bM16178m.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8531bM16178m.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8531bM16178m.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8531bM16178m.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8531bM16178m.buildPartial());
                }
            }
        }

        /* renamed from: e */
        public static TextSource m16177e() {
            return f19334e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f19272q;
        }

        /* renamed from: m */
        public static C8531b m16178m() {
            return f19334e.toBuilder();
        }

        /* renamed from: p */
        public static TextSource m16179p(InputStream inputStream) {
            return (TextSource) GeneratedMessage.parseWithIOException(f19335f, inputStream);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TextSource)) {
                return super.equals(obj);
            }
            TextSource textSource = (TextSource) obj;
            return m16182k().equals(textSource.m16182k()) && getUnknownFields().equals(textSource.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public TextSource getDefaultInstanceForType() {
            return f19334e;
        }

        /* renamed from: g */
        public int m16181g() {
            return this.f19336c.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19335f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19336c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19336c.get(i11));
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
            if (m16181g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m16182k().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f19273r.ensureFieldAccessorsInitialized(TextSource.class, C8531b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19337d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19337d = (byte) 1;
            return true;
        }

        /* renamed from: k */
        public List m16182k() {
            return this.f19336c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8531b newBuilderForType() {
            return m16178m();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TextSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C8531b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8531b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C8531b toBuilder() {
            return this == f19334e ? new C8531b() : new C8531b().m16239s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19336c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19336c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$TextSource$b */
        public static final class C8531b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19348c;

            /* renamed from: d */
            public List f19349d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19350e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8531b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8531b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: d */
            public C8531b m16224d(TextInfo.C8529b c8529b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19350e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8529b.build());
                    return this;
                }
                m16233m();
                this.f19349d.add(c8529b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public TextSource build() {
                TextSource textSourceBuildPartial = buildPartial();
                if (textSourceBuildPartial.isInitialized()) {
                    return textSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) textSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TextSource buildPartial() {
                TextSource textSource = new TextSource(this);
                m16228h(textSource);
                if (this.f19348c != 0) {
                    m16227g(textSource);
                }
                onBuilt();
                return textSource;
            }

            /* renamed from: g */
            public final void m16227g(TextSource textSource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f19272q;
            }

            /* renamed from: h */
            public final void m16228h(TextSource textSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19350e;
                if (repeatedFieldBuilderV3 != null) {
                    textSource.f19336c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f19348c & 1) != 0) {
                    this.f19349d = Collections.unmodifiableList(this.f19349d);
                    this.f19348c &= -2;
                }
                textSource.f19336c = this.f19349d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8531b clear() {
                super.clear();
                this.f19348c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19350e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19349d = Collections.EMPTY_LIST;
                } else {
                    this.f19349d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19348c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19273r.ensureFieldAccessorsInitialized(TextSource.class, C8531b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8531b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8531b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8531b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8531b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8531b mo33979clone() {
                return (C8531b) super.mo33979clone();
            }

            /* renamed from: m */
            public final void m16233m() {
                if ((this.f19348c & 1) == 0) {
                    this.f19349d = new ArrayList(this.f19349d);
                    this.f19348c |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public TextSource getDefaultInstanceForType() {
                return TextSource.m16177e();
            }

            /* renamed from: o */
            public int m16235o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19350e;
                return repeatedFieldBuilderV3 == null ? this.f19349d.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m16236p() {
                if (this.f19350e == null) {
                    this.f19350e = new RepeatedFieldBuilderV3(this.f19349d, (this.f19348c & 1) != 0, getParentForChildren(), isClean());
                    this.f19349d = null;
                }
                return this.f19350e;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8531b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TextInfo textInfo = (TextInfo) codedInputStream.readMessage(TextInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19350e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m16233m();
                                        this.f19349d.add(textInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(textInfo);
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
            public C8531b mergeFrom(Message message) {
                if (message instanceof TextSource) {
                    return m16239s((TextSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8531b m16239s(TextSource textSource) {
                if (textSource == TextSource.m16177e()) {
                    return this;
                }
                if (this.f19350e == null) {
                    if (!textSource.f19336c.isEmpty()) {
                        if (this.f19349d.isEmpty()) {
                            this.f19349d = textSource.f19336c;
                            this.f19348c &= -2;
                        } else {
                            m16233m();
                            this.f19349d.addAll(textSource.f19336c);
                        }
                        onChanged();
                    }
                } else if (!textSource.f19336c.isEmpty()) {
                    if (this.f19350e.isEmpty()) {
                        this.f19350e.dispose();
                        this.f19350e = null;
                        this.f19349d = textSource.f19336c;
                        this.f19348c &= -2;
                        this.f19350e = GeneratedMessage.alwaysUseFieldBuilders ? m16236p() : null;
                    } else {
                        this.f19350e.addAllMessages(textSource.f19336c);
                    }
                }
                mergeUnknownFields(textSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8531b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8531b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8531b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8531b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8531b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8531b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8531b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8531b) super.setUnknownFields(unknownFieldSet);
            }

            public C8531b() {
                this.f19349d = Collections.EMPTY_LIST;
            }

            public C8531b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19349d = Collections.EMPTY_LIST;
            }
        }

        public TextSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19337d = (byte) -1;
        }

        private TextSource() {
            this.f19337d = (byte) -1;
            this.f19336c = Collections.EMPTY_LIST;
        }
    }

    public static final class TouchSource extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: e */
        public static final TouchSource f19351e = new TouchSource();

        /* renamed from: f */
        public static final Parser f19352f = new C8534a();

        /* renamed from: c */
        public List f19353c;

        /* renamed from: d */
        public byte f19354d;

        public static final class TouchInfo extends GeneratedMessageV3 implements MessageOrBuilder {

            /* renamed from: g */
            public static final TouchInfo f19355g = new TouchInfo();

            /* renamed from: h */
            public static final Parser f19356h = new C8532a();

            /* renamed from: c */
            public int f19357c;

            /* renamed from: d */
            public List f19358d;

            /* renamed from: e */
            public EzyPaint.Paint f19359e;

            /* renamed from: f */
            public byte f19360f;

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$a */
            public class C8532a extends AbstractParser {
                @Override // com.google.protobuf.Parser
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public TouchInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    C8533b c8533bM16263p = TouchInfo.m16263p();
                    try {
                        c8533bM16263p.mergeFrom(codedInputStream, extensionRegistryLite);
                        return c8533bM16263p.buildPartial();
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(c8533bM16263p.buildPartial());
                    } catch (UninitializedMessageException e11) {
                        throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8533bM16263p.buildPartial());
                    } catch (IOException e12) {
                        throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8533bM16263p.buildPartial());
                    }
                }
            }

            /* renamed from: a */
            public static /* synthetic */ int m16256a(TouchInfo touchInfo, int i10) {
                int i11 = i10 | touchInfo.f19357c;
                touchInfo.f19357c = i11;
                return i11;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EzySource.f19258c;
            }

            /* renamed from: k */
            public static TouchInfo m16262k() {
                return f19355g;
            }

            /* renamed from: p */
            public static C8533b m16263p() {
                return f19355g.toBuilder();
            }

            public static Parser parser() {
                return f19356h;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof TouchInfo)) {
                    return super.equals(obj);
                }
                TouchInfo touchInfo = (TouchInfo) obj;
                if (getTouchEventList().equals(touchInfo.getTouchEventList()) && m16266o() == touchInfo.m16266o()) {
                    return (!m16266o() || m16265n().equals(touchInfo.m16265n())) && getUnknownFields().equals(touchInfo.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser getParserForType() {
                return f19356h;
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                int iComputeMessageSize = 0;
                for (int i11 = 0; i11 < this.f19358d.size(); i11++) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19358d.get(i11));
                }
                if ((this.f19357c & 1) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeMessageSize(2, m16265n());
                }
                int serializedSize = iComputeMessageSize + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            public int getTouchEventCount() {
                return this.f19358d.size();
            }

            public List getTouchEventList() {
                return this.f19358d;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = 779 + getDescriptor().hashCode();
                if (getTouchEventCount() > 0) {
                    iHashCode = (((iHashCode * 37) + 1) * 53) + getTouchEventList().hashCode();
                }
                if (m16266o()) {
                    iHashCode = (((iHashCode * 37) + 2) * 53) + m16265n().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19259d.ensureFieldAccessorsInitialized(TouchInfo.class, C8533b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.f19360f;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.f19360f = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public TouchInfo getDefaultInstanceForType() {
                return f19355g;
            }

            /* renamed from: n */
            public EzyPaint.Paint m16265n() {
                EzyPaint.Paint paint = this.f19359e;
                return paint == null ? EzyPaint.Paint.m15718k() : paint;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
                return new TouchInfo();
            }

            /* renamed from: o */
            public boolean m16266o() {
                return (this.f19357c & 1) != 0;
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C8533b newBuilderForType() {
                return m16263p();
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public C8533b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
                return new C8533b(builderParent);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8533b toBuilder() {
                return this == f19355g ? new C8533b() : new C8533b().m16288t(this);
            }

            @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                for (int i10 = 0; i10 < this.f19358d.size(); i10++) {
                    codedOutputStream.writeMessage(1, (MessageLite) this.f19358d.get(i10));
                }
                if ((this.f19357c & 1) != 0) {
                    codedOutputStream.writeMessage(2, m16265n());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            /* renamed from: com.zykj.board.EzySource$TouchSource$TouchInfo$b */
            public static final class C8533b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

                /* renamed from: c */
                public int f19361c;

                /* renamed from: d */
                public List f19362d;

                /* renamed from: e */
                public RepeatedFieldBuilderV3 f19363e;

                /* renamed from: f */
                public EzyPaint.Paint f19364f;

                /* renamed from: g */
                public SingleFieldBuilderV3 f19365g;

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessage.alwaysUseFieldBuilders) {
                        getTouchEventFieldBuilder();
                        m16271q();
                    }
                }

                /* renamed from: q */
                private SingleFieldBuilderV3 m16271q() {
                    if (this.f19365g == null) {
                        this.f19365g = new SingleFieldBuilderV3(m16284o(), getParentForChildren(), isClean());
                        this.f19364f = null;
                    }
                    return this.f19365g;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public C8533b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8533b) super.addRepeatedField(fieldDescriptor, obj);
                }

                /* renamed from: d */
                public C8533b m16273d(EzyTouchEvent.TouchEvent.C8542b c8542b) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19363e;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(c8542b.build());
                        return this;
                    }
                    ensureTouchEventIsMutable();
                    this.f19362d.add(c8542b.build());
                    onChanged();
                    return this;
                }

                /* renamed from: e */
                public C8533b m16274e(EzyTouchEvent.TouchEvent touchEvent) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19363e;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(touchEvent);
                        return this;
                    }
                    touchEvent.getClass();
                    ensureTouchEventIsMutable();
                    this.f19362d.add(touchEvent);
                    onChanged();
                    return this;
                }

                public final void ensureTouchEventIsMutable() {
                    if ((this.f19361c & 1) == 0) {
                        this.f19362d = new ArrayList(this.f19362d);
                        this.f19361c |= 1;
                    }
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: f, reason: merged with bridge method [inline-methods] */
                public TouchInfo build() {
                    TouchInfo touchInfoBuildPartial = buildPartial();
                    if (touchInfoBuildPartial.isInitialized()) {
                        return touchInfoBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchInfoBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: g, reason: merged with bridge method [inline-methods] */
                public TouchInfo buildPartial() {
                    TouchInfo touchInfo = new TouchInfo(this);
                    m16278i(touchInfo);
                    if (this.f19361c != 0) {
                        m16277h(touchInfo);
                    }
                    onBuilt();
                    return touchInfo;
                }

                @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return EzySource.f19258c;
                }

                public final RepeatedFieldBuilderV3 getTouchEventFieldBuilder() {
                    if (this.f19363e == null) {
                        this.f19363e = new RepeatedFieldBuilderV3(this.f19362d, (this.f19361c & 1) != 0, getParentForChildren(), isClean());
                        this.f19362d = null;
                    }
                    return this.f19363e;
                }

                /* renamed from: h */
                public final void m16277h(TouchInfo touchInfo) {
                    int i10;
                    if ((this.f19361c & 2) != 0) {
                        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19365g;
                        touchInfo.f19359e = singleFieldBuilderV3 == null ? this.f19364f : (EzyPaint.Paint) singleFieldBuilderV3.build();
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    TouchInfo.m16256a(touchInfo, i10);
                }

                /* renamed from: i */
                public final void m16278i(TouchInfo touchInfo) {
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19363e;
                    if (repeatedFieldBuilderV3 != null) {
                        touchInfo.f19358d = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.f19361c & 1) != 0) {
                        this.f19362d = Collections.unmodifiableList(this.f19362d);
                        this.f19361c &= -2;
                    }
                    touchInfo.f19358d = this.f19362d;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return EzySource.f19259d.ensureFieldAccessorsInitialized(TouchInfo.class, C8533b.class);
                }

                @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: j, reason: merged with bridge method [inline-methods] */
                public C8533b clear() {
                    super.clear();
                    this.f19361c = 0;
                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19363e;
                    if (repeatedFieldBuilderV3 == null) {
                        this.f19362d = Collections.EMPTY_LIST;
                    } else {
                        this.f19362d = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.f19361c &= -2;
                    this.f19364f = null;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19365g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.f19365g = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: k, reason: merged with bridge method [inline-methods] */
                public C8533b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (C8533b) super.clearField(fieldDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: l, reason: merged with bridge method [inline-methods] */
                public C8533b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (C8533b) super.clearOneof(oneofDescriptor);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public C8533b mo33979clone() {
                    return (C8533b) super.mo33979clone();
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                /* renamed from: n, reason: merged with bridge method [inline-methods] */
                public TouchInfo getDefaultInstanceForType() {
                    return TouchInfo.m16262k();
                }

                /* renamed from: o */
                public EzyPaint.Paint m16284o() {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19365g;
                    if (singleFieldBuilderV3 != null) {
                        return (EzyPaint.Paint) singleFieldBuilderV3.getMessage();
                    }
                    EzyPaint.Paint paint = this.f19364f;
                    return paint == null ? EzyPaint.Paint.m15718k() : paint;
                }

                /* renamed from: p */
                public EzyPaint.Paint.C8501b m16285p() {
                    this.f19361c |= 2;
                    onChanged();
                    return (EzyPaint.Paint.C8501b) m16271q().getBuilder();
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public C8533b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                    extensionRegistryLite.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int tag = codedInputStream.readTag();
                                if (tag != 0) {
                                    if (tag == 10) {
                                        EzyTouchEvent.TouchEvent touchEvent = (EzyTouchEvent.TouchEvent) codedInputStream.readMessage(EzyTouchEvent.TouchEvent.parser(), extensionRegistryLite);
                                        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19363e;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureTouchEventIsMutable();
                                            this.f19362d.add(touchEvent);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(touchEvent);
                                        }
                                    } else if (tag == 18) {
                                        codedInputStream.readMessage(m16271q().getBuilder(), extensionRegistryLite);
                                        this.f19361c |= 2;
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
                public C8533b mergeFrom(Message message) {
                    if (message instanceof TouchInfo) {
                        return m16288t((TouchInfo) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                /* renamed from: t */
                public C8533b m16288t(TouchInfo touchInfo) {
                    if (touchInfo == TouchInfo.m16262k()) {
                        return this;
                    }
                    if (this.f19363e == null) {
                        if (!touchInfo.f19358d.isEmpty()) {
                            if (this.f19362d.isEmpty()) {
                                this.f19362d = touchInfo.f19358d;
                                this.f19361c &= -2;
                            } else {
                                ensureTouchEventIsMutable();
                                this.f19362d.addAll(touchInfo.f19358d);
                            }
                            onChanged();
                        }
                    } else if (!touchInfo.f19358d.isEmpty()) {
                        if (this.f19363e.isEmpty()) {
                            this.f19363e.dispose();
                            this.f19363e = null;
                            this.f19362d = touchInfo.f19358d;
                            this.f19361c &= -2;
                            this.f19363e = GeneratedMessage.alwaysUseFieldBuilders ? getTouchEventFieldBuilder() : null;
                        } else {
                            this.f19363e.addAllMessages(touchInfo.f19358d);
                        }
                    }
                    if (touchInfo.m16266o()) {
                        m16289u(touchInfo.m16265n());
                    }
                    mergeUnknownFields(touchInfo.getUnknownFields());
                    onChanged();
                    return this;
                }

                /* renamed from: u */
                public C8533b m16289u(EzyPaint.Paint paint) {
                    EzyPaint.Paint paint2;
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19365g;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(paint);
                    } else if ((this.f19361c & 2) == 0 || (paint2 = this.f19364f) == null || paint2 == EzyPaint.Paint.m15718k()) {
                        this.f19364f = paint;
                    } else {
                        m16285p().m15740n(paint);
                    }
                    if (this.f19364f != null) {
                        this.f19361c |= 2;
                        onChanged();
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: v, reason: merged with bridge method [inline-methods] */
                public final C8533b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8533b) super.mergeUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public C8533b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (C8533b) super.setField(fieldDescriptor, obj);
                }

                /* renamed from: x */
                public C8533b m16292x(EzyPaint.Paint paint) {
                    SingleFieldBuilderV3 singleFieldBuilderV3 = this.f19365g;
                    if (singleFieldBuilderV3 == null) {
                        paint.getClass();
                        this.f19364f = paint;
                    } else {
                        singleFieldBuilderV3.setMessage(paint);
                    }
                    this.f19361c |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: y, reason: merged with bridge method [inline-methods] */
                public C8533b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                    return (C8533b) super.setRepeatedField(fieldDescriptor, i10, obj);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
                /* renamed from: z, reason: merged with bridge method [inline-methods] */
                public final C8533b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (C8533b) super.setUnknownFields(unknownFieldSet);
                }

                public C8533b() {
                    this.f19362d = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public C8533b(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.f19362d = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }
            }

            public TouchInfo(GeneratedMessageV3.Builder builder) {
                super(builder);
                this.f19360f = (byte) -1;
            }

            private TouchInfo() {
                this.f19360f = (byte) -1;
                this.f19358d = Collections.EMPTY_LIST;
            }
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$a */
        public class C8534a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public TouchSource parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                C8535b c8535bM16248m = TouchSource.m16248m();
                try {
                    c8535bM16248m.mergeFrom(codedInputStream, extensionRegistryLite);
                    return c8535bM16248m.buildPartial();
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.setUnfinishedMessage(c8535bM16248m.buildPartial());
                } catch (UninitializedMessageException e11) {
                    throw e11.asInvalidProtocolBufferException().setUnfinishedMessage(c8535bM16248m.buildPartial());
                } catch (IOException e12) {
                    throw new InvalidProtocolBufferException(e12).setUnfinishedMessage(c8535bM16248m.buildPartial());
                }
            }
        }

        /* renamed from: e */
        public static TouchSource m16247e() {
            return f19351e;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EzySource.f19256a;
        }

        /* renamed from: m */
        public static C8535b m16248m() {
            return f19351e.toBuilder();
        }

        /* renamed from: p */
        public static TouchSource m16249p(InputStream inputStream) {
            return (TouchSource) GeneratedMessage.parseWithIOException(f19352f, inputStream);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TouchSource)) {
                return super.equals(obj);
            }
            TouchSource touchSource = (TouchSource) obj;
            return m16252k().equals(touchSource.m16252k()) && getUnknownFields().equals(touchSource.getUnknownFields());
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public TouchSource getDefaultInstanceForType() {
            return f19351e;
        }

        /* renamed from: g */
        public int m16251g() {
            return this.f19353c.size();
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f19352f;
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f19353c.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f19353c.get(i11));
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
            if (m16251g() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m16252k().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.GeneratedMessage
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EzySource.f19257b.ensureFieldAccessorsInitialized(TouchSource.class, C8535b.class);
        }

        @Override // com.google.protobuf.GeneratedMessage.ExtendableMessage, com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f19354d;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f19354d = (byte) 1;
            return true;
        }

        /* renamed from: k */
        public List m16252k() {
            return this.f19353c;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public C8535b newBuilderForType() {
            return m16248m();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TouchSource();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C8535b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C8535b(builderParent);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C8535b toBuilder() {
            return this == f19351e ? new C8535b() : new C8535b().m16312s(this);
        }

        @Override // com.google.protobuf.GeneratedMessage, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f19353c.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f19353c.get(i10));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        /* renamed from: com.zykj.board.EzySource$TouchSource$b */
        public static final class C8535b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: c */
            public int f19366c;

            /* renamed from: d */
            public List f19367d;

            /* renamed from: e */
            public RepeatedFieldBuilderV3 f19368e;

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C8535b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8535b) super.addRepeatedField(fieldDescriptor, obj);
            }

            /* renamed from: d */
            public C8535b m16297d(TouchInfo.C8533b c8533b) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19368e;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(c8533b.build());
                    return this;
                }
                m16306m();
                this.f19367d.add(c8533b.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public TouchSource build() {
                TouchSource touchSourceBuildPartial = buildPartial();
                if (touchSourceBuildPartial.isInitialized()) {
                    return touchSourceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) touchSourceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public TouchSource buildPartial() {
                TouchSource touchSource = new TouchSource(this);
                m16301h(touchSource);
                if (this.f19366c != 0) {
                    m16300g(touchSource);
                }
                onBuilt();
                return touchSource;
            }

            /* renamed from: g */
            public final void m16300g(TouchSource touchSource) {
            }

            @Override // com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return EzySource.f19256a;
            }

            /* renamed from: h */
            public final void m16301h(TouchSource touchSource) {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19368e;
                if (repeatedFieldBuilderV3 != null) {
                    touchSource.f19353c = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.f19366c & 1) != 0) {
                    this.f19367d = Collections.unmodifiableList(this.f19367d);
                    this.f19366c &= -2;
                }
                touchSource.f19353c = this.f19367d;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C8535b clear() {
                super.clear();
                this.f19366c = 0;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19368e;
                if (repeatedFieldBuilderV3 == null) {
                    this.f19367d = Collections.EMPTY_LIST;
                } else {
                    this.f19367d = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.f19366c &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EzySource.f19257b.ensureFieldAccessorsInitialized(TouchSource.class, C8535b.class);
            }

            @Override // com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C8535b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C8535b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public C8535b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C8535b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: l, reason: merged with bridge method [inline-methods] */
            public C8535b mo33979clone() {
                return (C8535b) super.mo33979clone();
            }

            /* renamed from: m */
            public final void m16306m() {
                if ((this.f19366c & 1) == 0) {
                    this.f19367d = new ArrayList(this.f19367d);
                    this.f19366c |= 1;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public TouchSource getDefaultInstanceForType() {
                return TouchSource.m16247e();
            }

            /* renamed from: o */
            public int m16308o() {
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19368e;
                return repeatedFieldBuilderV3 == null ? this.f19367d.size() : repeatedFieldBuilderV3.getCount();
            }

            /* renamed from: p */
            public final RepeatedFieldBuilderV3 m16309p() {
                if (this.f19368e == null) {
                    this.f19368e = new RepeatedFieldBuilderV3(this.f19367d, (this.f19366c & 1) != 0, getParentForChildren(), isClean());
                    this.f19367d = null;
                }
                return this.f19368e;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public C8535b mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    TouchInfo touchInfo = (TouchInfo) codedInputStream.readMessage(TouchInfo.parser(), extensionRegistryLite);
                                    RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f19368e;
                                    if (repeatedFieldBuilderV3 == null) {
                                        m16306m();
                                        this.f19367d.add(touchInfo);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(touchInfo);
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
            public C8535b mergeFrom(Message message) {
                if (message instanceof TouchSource) {
                    return m16312s((TouchSource) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: s */
            public C8535b m16312s(TouchSource touchSource) {
                if (touchSource == TouchSource.m16247e()) {
                    return this;
                }
                if (this.f19368e == null) {
                    if (!touchSource.f19353c.isEmpty()) {
                        if (this.f19367d.isEmpty()) {
                            this.f19367d = touchSource.f19353c;
                            this.f19366c &= -2;
                        } else {
                            m16306m();
                            this.f19367d.addAll(touchSource.f19353c);
                        }
                        onChanged();
                    }
                } else if (!touchSource.f19353c.isEmpty()) {
                    if (this.f19368e.isEmpty()) {
                        this.f19368e.dispose();
                        this.f19368e = null;
                        this.f19367d = touchSource.f19353c;
                        this.f19366c &= -2;
                        this.f19368e = GeneratedMessage.alwaysUseFieldBuilders ? m16309p() : null;
                    } else {
                        this.f19368e.addAllMessages(touchSource.f19353c);
                    }
                }
                mergeUnknownFields(touchSource.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C8535b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8535b) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C8535b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C8535b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.ExtendableBuilder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            public C8535b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C8535b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.GeneratedMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C8535b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (C8535b) super.setUnknownFields(unknownFieldSet);
            }

            public C8535b() {
                this.f19367d = Collections.EMPTY_LIST;
            }

            public C8535b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f19367d = Collections.EMPTY_LIST;
            }
        }

        public TouchSource(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f19354d = (byte) -1;
        }

        private TouchSource() {
            this.f19354d = (byte) -1;
            this.f19353c = Collections.EMPTY_LIST;
        }
    }

    static {
        Descriptors.Descriptor descriptor = m15967u().getMessageTypes().get(0);
        f19256a = descriptor;
        f19257b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"TouchInfo"});
        Descriptors.Descriptor descriptor2 = descriptor.getNestedTypes().get(0);
        f19258c = descriptor2;
        f19259d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TouchEvent", "Paint"});
        Descriptors.Descriptor descriptor3 = m15967u().getMessageTypes().get(1);
        f19260e = descriptor3;
        f19261f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MatrixInfo"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        f19262g = descriptor4;
        f19263h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Matrix"});
        Descriptors.Descriptor descriptor5 = m15967u().getMessageTypes().get(2);
        f19264i = descriptor5;
        f19265j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"FileInfo"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        f19266k = descriptor6;
        f19267l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Name", "Width", "Height", "Validate"});
        Descriptors.Descriptor descriptor7 = m15967u().getMessageTypes().get(3);
        f19268m = descriptor7;
        f19269n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AudioInfo"});
        Descriptors.Descriptor descriptor8 = descriptor7.getNestedTypes().get(0);
        f19270o = descriptor8;
        f19271p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Name", "Duration", "Validate"});
        Descriptors.Descriptor descriptor9 = m15967u().getMessageTypes().get(4);
        f19272q = descriptor9;
        f19273r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"TextInfo"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        f19274s = descriptor10;
        f19275t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Content", "Paint"});
        Descriptors.Descriptor descriptor11 = m15967u().getMessageTypes().get(5);
        f19276u = descriptor11;
        f19277v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"GeometryInfo"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        f19278w = descriptor12;
        f19279x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"GeometryType", "Points", "Paint"});
        EzyTouchEvent.m16323g();
        EzyMatrix.m15454c();
        EzyPaint.m15711c();
        EzyPointF.m15753c();
        EzyGeometryEnum.m15221a();
    }

    /* renamed from: u */
    public static Descriptors.FileDescriptor m15967u() {
        return f19280y;
    }
}
