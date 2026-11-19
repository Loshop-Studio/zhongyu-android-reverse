package p020b4;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyHeader$Author;
import com.zykj.board.EzyHeader$BackgroundLineConfig;
import com.zykj.board.EzyHeader$Header;
import com.zykj.board.EzyHeader$MoveConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: b4.u */
/* loaded from: classes3.dex */
public final class C3171u extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f1646a;

    /* renamed from: b */
    public int f1647b;

    /* renamed from: c */
    public int f1648c;

    /* renamed from: d */
    public int f1649d;

    /* renamed from: e */
    public long f1650e;

    /* renamed from: f */
    public long f1651f;

    /* renamed from: g */
    public long f1652g;

    /* renamed from: h */
    public EzyHeader$Author f1653h;

    /* renamed from: i */
    public SingleFieldBuilderV3 f1654i;

    /* renamed from: j */
    public Object f1655j = "";

    /* renamed from: k */
    public List f1656k = Collections.EMPTY_LIST;

    /* renamed from: l */
    public RepeatedFieldBuilderV3 f1657l;

    /* renamed from: m */
    public int f1658m;

    /* renamed from: n */
    public int f1659n;

    /* renamed from: o */
    public EzyHeader$MoveConfig f1660o;

    /* renamed from: p */
    public SingleFieldBuilderV3 f1661p;

    /* renamed from: q */
    public EzyHeader$BackgroundLineConfig f1662q;

    /* renamed from: r */
    public SingleFieldBuilderV3 f1663r;

    /* renamed from: s */
    public EzyHeader$BackgroundLineConfig f1664s;

    /* renamed from: t */
    public SingleFieldBuilderV3 f1665t;

    public C3171u() {
        if (GeneratedMessageV3.alwaysUseFieldBuilders) {
            m2118h();
            m2122l();
            m2121k();
            m2119i();
            m2120j();
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3171u) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyHeader$Header build() {
        EzyHeader$Header ezyHeader$HeaderBuildPartial = buildPartial();
        if (ezyHeader$HeaderBuildPartial.isInitialized()) {
            return ezyHeader$HeaderBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyHeader$HeaderBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m2116f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C3171u) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3171u) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder m13728clone() {
        return (C3171u) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final EzyHeader$Header buildPartial() {
        int i;
        EzyHeader$Header ezyHeader$Header = new EzyHeader$Header(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f1657l;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f1646a & 256) != 0) {
                this.f1656k = Collections.unmodifiableList(this.f1656k);
                this.f1646a &= -257;
            }
            ezyHeader$Header.provider_ = this.f1656k;
        } else {
            ezyHeader$Header.provider_ = repeatedFieldBuilderV3.build();
        }
        int i8 = this.f1646a;
        if (i8 != 0) {
            if ((i8 & 1) != 0) {
                ezyHeader$Header.version_ = this.f1647b;
            }
            if ((i8 & 2) != 0) {
                ezyHeader$Header.width_ = this.f1648c;
            }
            if ((i8 & 4) != 0) {
                ezyHeader$Header.height_ = this.f1649d;
            }
            if ((i8 & 8) != 0) {
                ezyHeader$Header.createDate_ = this.f1650e;
            }
            if ((i8 & 16) != 0) {
                ezyHeader$Header.updateDate_ = this.f1651f;
            }
            if ((i8 & 32) != 0) {
                ezyHeader$Header.duration_ = this.f1652g;
            }
            if ((i8 & 64) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1654i;
                ezyHeader$Header.author_ = singleFieldBuilderV3 == null ? this.f1653h : (EzyHeader$Author) singleFieldBuilderV3.build();
                i = 1;
            } else {
                i = 0;
            }
            if ((i8 & 128) != 0) {
                ezyHeader$Header.convertUrl_ = this.f1655j;
            }
            if ((i8 & 512) != 0) {
                ezyHeader$Header.defaultBackgroundColor_ = this.f1658m;
            }
            if ((i8 & 1024) != 0) {
                ezyHeader$Header.lastBackgroundColor_ = this.f1659n;
            }
            if ((i8 & 2048) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV32 = this.f1661p;
                ezyHeader$Header.moveConfig_ = singleFieldBuilderV32 == null ? this.f1660o : (EzyHeader$MoveConfig) singleFieldBuilderV32.build();
                i |= 2;
            }
            if ((i8 & 4096) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV33 = this.f1663r;
                ezyHeader$Header.defaultBackgroundLineConfig_ = singleFieldBuilderV33 == null ? this.f1662q : (EzyHeader$BackgroundLineConfig) singleFieldBuilderV33.build();
                i |= 4;
            }
            if ((i8 & 8192) != 0) {
                SingleFieldBuilderV3 singleFieldBuilderV34 = this.f1665t;
                ezyHeader$Header.lastBackgroundLineConfig_ = singleFieldBuilderV34 == null ? this.f1664s : (EzyHeader$BackgroundLineConfig) singleFieldBuilderV34.build();
                i |= 8;
            }
            EzyHeader$Header.access$2076(ezyHeader$Header, i);
        }
        onBuilt();
        return ezyHeader$Header;
    }

    /* renamed from: f */
    public final void m2116f() {
        super.clear();
        this.f1646a = 0;
        this.f1647b = 0;
        this.f1648c = 0;
        this.f1649d = 0;
        this.f1650e = 0L;
        this.f1651f = 0L;
        this.f1652g = 0L;
        this.f1653h = null;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1654i;
        if (singleFieldBuilderV3 != null) {
            singleFieldBuilderV3.dispose();
            this.f1654i = null;
        }
        this.f1655j = "";
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f1657l;
        if (repeatedFieldBuilderV3 == null) {
            this.f1656k = Collections.EMPTY_LIST;
        } else {
            this.f1656k = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f1646a &= -257;
        this.f1658m = 0;
        this.f1659n = 0;
        this.f1660o = null;
        SingleFieldBuilderV3 singleFieldBuilderV32 = this.f1661p;
        if (singleFieldBuilderV32 != null) {
            singleFieldBuilderV32.dispose();
            this.f1661p = null;
        }
        this.f1662q = null;
        SingleFieldBuilderV3 singleFieldBuilderV33 = this.f1663r;
        if (singleFieldBuilderV33 != null) {
            singleFieldBuilderV33.dispose();
            this.f1663r = null;
        }
        this.f1664s = null;
        SingleFieldBuilderV3 singleFieldBuilderV34 = this.f1665t;
        if (singleFieldBuilderV34 != null) {
            singleFieldBuilderV34.dispose();
            this.f1665t = null;
        }
    }

    /* renamed from: g */
    public final void m2117g() {
        if ((this.f1646a & 256) == 0) {
            this.f1656k = new ArrayList(this.f1656k);
            this.f1646a |= 256;
        }
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyHeader$Header.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3183y.f1700a;
    }

    /* renamed from: h */
    public final SingleFieldBuilderV3 m2118h() {
        EzyHeader$Author defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1654i;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f1653h;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$Author.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$Author) singleFieldBuilderV3.getMessage();
            }
            this.f1654i = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f1653h = null;
        }
        return this.f1654i;
    }

    /* renamed from: i */
    public final SingleFieldBuilderV3 m2119i() {
        EzyHeader$BackgroundLineConfig defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1663r;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f1662q;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$BackgroundLineConfig.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$BackgroundLineConfig) singleFieldBuilderV3.getMessage();
            }
            this.f1663r = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f1662q = null;
        }
        return this.f1663r;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3183y.f1701b.ensureFieldAccessorsInitialized(EzyHeader$Header.class, C3171u.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final SingleFieldBuilderV3 m2120j() {
        EzyHeader$BackgroundLineConfig defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1665t;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f1664s;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$BackgroundLineConfig.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$BackgroundLineConfig) singleFieldBuilderV3.getMessage();
            }
            this.f1665t = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f1664s = null;
        }
        return this.f1665t;
    }

    /* renamed from: k */
    public final SingleFieldBuilderV3 m2121k() {
        EzyHeader$MoveConfig defaultInstance;
        SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1661p;
        if (singleFieldBuilderV3 == null) {
            if (singleFieldBuilderV3 == null) {
                defaultInstance = this.f1660o;
                if (defaultInstance == null) {
                    defaultInstance = EzyHeader$MoveConfig.getDefaultInstance();
                }
            } else {
                defaultInstance = (EzyHeader$MoveConfig) singleFieldBuilderV3.getMessage();
            }
            this.f1661p = new SingleFieldBuilderV3(defaultInstance, getParentForChildren(), isClean());
            this.f1660o = null;
        }
        return this.f1661p;
    }

    /* renamed from: l */
    public final RepeatedFieldBuilderV3 m2122l() {
        if (this.f1657l == null) {
            this.f1657l = new RepeatedFieldBuilderV3(this.f1656k, (this.f1646a & 256) != 0, getParentForChildren(), isClean());
            this.f1656k = null;
        }
        return this.f1657l;
    }

    /* renamed from: m */
    public final void m2123m(EzyHeader$Header ezyHeader$Header) {
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig;
        EzyHeader$BackgroundLineConfig ezyHeader$BackgroundLineConfig2;
        EzyHeader$MoveConfig ezyHeader$MoveConfig;
        EzyHeader$Author ezyHeader$Author;
        if (ezyHeader$Header == EzyHeader$Header.getDefaultInstance()) {
            return;
        }
        if (ezyHeader$Header.getVersion() != 0) {
            this.f1647b = ezyHeader$Header.getVersion();
            this.f1646a |= 1;
            onChanged();
        }
        if (ezyHeader$Header.getWidth() != 0) {
            this.f1648c = ezyHeader$Header.getWidth();
            this.f1646a |= 2;
            onChanged();
        }
        if (ezyHeader$Header.getHeight() != 0) {
            this.f1649d = ezyHeader$Header.getHeight();
            this.f1646a |= 4;
            onChanged();
        }
        if (ezyHeader$Header.getCreateDate() != 0) {
            this.f1650e = ezyHeader$Header.getCreateDate();
            this.f1646a |= 8;
            onChanged();
        }
        if (ezyHeader$Header.getUpdateDate() != 0) {
            this.f1651f = ezyHeader$Header.getUpdateDate();
            this.f1646a |= 16;
            onChanged();
        }
        if (ezyHeader$Header.getDuration() != 0) {
            this.f1652g = ezyHeader$Header.getDuration();
            this.f1646a |= 32;
            onChanged();
        }
        if (ezyHeader$Header.hasAuthor()) {
            EzyHeader$Author author = ezyHeader$Header.getAuthor();
            SingleFieldBuilderV3 singleFieldBuilderV3 = this.f1654i;
            if (singleFieldBuilderV3 != null) {
                singleFieldBuilderV3.mergeFrom(author);
            } else if ((this.f1646a & 64) == 0 || (ezyHeader$Author = this.f1653h) == null || ezyHeader$Author == EzyHeader$Author.getDefaultInstance()) {
                this.f1653h = author;
            } else {
                this.f1646a |= 64;
                onChanged();
                ((C3153o) m2118h().getBuilder()).m2096f(author);
            }
            if (this.f1653h != null) {
                this.f1646a |= 64;
                onChanged();
            }
        }
        if (!ezyHeader$Header.getConvertUrl().isEmpty()) {
            this.f1655j = ezyHeader$Header.convertUrl_;
            this.f1646a |= 128;
            onChanged();
        }
        if (this.f1657l == null) {
            if (!ezyHeader$Header.provider_.isEmpty()) {
                if (this.f1656k.isEmpty()) {
                    this.f1656k = ezyHeader$Header.provider_;
                    this.f1646a &= -257;
                } else {
                    m2117g();
                    this.f1656k.addAll(ezyHeader$Header.provider_);
                }
                onChanged();
            }
        } else if (!ezyHeader$Header.provider_.isEmpty()) {
            if (this.f1657l.isEmpty()) {
                this.f1657l.dispose();
                this.f1657l = null;
                this.f1656k = ezyHeader$Header.provider_;
                this.f1646a &= -257;
                this.f1657l = GeneratedMessageV3.alwaysUseFieldBuilders ? m2122l() : null;
            } else {
                this.f1657l.addAllMessages(ezyHeader$Header.provider_);
            }
        }
        if (ezyHeader$Header.getDefaultBackgroundColor() != 0) {
            this.f1658m = ezyHeader$Header.getDefaultBackgroundColor();
            this.f1646a |= 512;
            onChanged();
        }
        if (ezyHeader$Header.getLastBackgroundColor() != 0) {
            this.f1659n = ezyHeader$Header.getLastBackgroundColor();
            this.f1646a |= 1024;
            onChanged();
        }
        if (ezyHeader$Header.hasMoveConfig()) {
            EzyHeader$MoveConfig moveConfig = ezyHeader$Header.getMoveConfig();
            SingleFieldBuilderV3 singleFieldBuilderV32 = this.f1661p;
            if (singleFieldBuilderV32 != null) {
                singleFieldBuilderV32.mergeFrom(moveConfig);
            } else if ((this.f1646a & 2048) == 0 || (ezyHeader$MoveConfig = this.f1660o) == null || ezyHeader$MoveConfig == EzyHeader$MoveConfig.getDefaultInstance()) {
                this.f1660o = moveConfig;
            } else {
                this.f1646a |= 2048;
                onChanged();
                ((C3177w) m2121k().getBuilder()).m2134f(moveConfig);
            }
            if (this.f1660o != null) {
                this.f1646a |= 2048;
                onChanged();
            }
        }
        if (ezyHeader$Header.hasDefaultBackgroundLineConfig()) {
            EzyHeader$BackgroundLineConfig defaultBackgroundLineConfig = ezyHeader$Header.getDefaultBackgroundLineConfig();
            SingleFieldBuilderV3 singleFieldBuilderV33 = this.f1663r;
            if (singleFieldBuilderV33 != null) {
                singleFieldBuilderV33.mergeFrom(defaultBackgroundLineConfig);
            } else if ((this.f1646a & 4096) == 0 || (ezyHeader$BackgroundLineConfig2 = this.f1662q) == null || ezyHeader$BackgroundLineConfig2 == EzyHeader$BackgroundLineConfig.getDefaultInstance()) {
                this.f1662q = defaultBackgroundLineConfig;
            } else {
                this.f1646a |= 4096;
                onChanged();
                ((C3162r) m2119i().getBuilder()).m2112g(defaultBackgroundLineConfig);
            }
            if (this.f1662q != null) {
                this.f1646a |= 4096;
                onChanged();
            }
        }
        if (ezyHeader$Header.hasLastBackgroundLineConfig()) {
            EzyHeader$BackgroundLineConfig lastBackgroundLineConfig = ezyHeader$Header.getLastBackgroundLineConfig();
            SingleFieldBuilderV3 singleFieldBuilderV34 = this.f1665t;
            if (singleFieldBuilderV34 != null) {
                singleFieldBuilderV34.mergeFrom(lastBackgroundLineConfig);
            } else if ((this.f1646a & 8192) == 0 || (ezyHeader$BackgroundLineConfig = this.f1664s) == null || ezyHeader$BackgroundLineConfig == EzyHeader$BackgroundLineConfig.getDefaultInstance()) {
                this.f1664s = lastBackgroundLineConfig;
            } else {
                this.f1646a |= 8192;
                onChanged();
                ((C3162r) m2120j().getBuilder()).m2112g(lastBackgroundLineConfig);
            }
            if (this.f1664s != null) {
                this.f1646a |= 8192;
                onChanged();
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2124n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3171u) super.mergeUnknownFields(unknownFieldSet);
    }

    /* renamed from: n */
    public final void m2124n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    switch (tag) {
                        case 0:
                            z8 = true;
                        case 8:
                            this.f1647b = codedInputStream.readInt32();
                            this.f1646a |= 1;
                        case 16:
                            this.f1648c = codedInputStream.readInt32();
                            this.f1646a |= 2;
                        case 24:
                            this.f1649d = codedInputStream.readInt32();
                            this.f1646a |= 4;
                        case 32:
                            this.f1650e = codedInputStream.readInt64();
                            this.f1646a |= 8;
                        case 40:
                            this.f1651f = codedInputStream.readInt64();
                            this.f1646a |= 16;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            this.f1652g = codedInputStream.readInt64();
                            this.f1646a |= 32;
                        case 58:
                            codedInputStream.readMessage(m2118h().getBuilder(), extensionRegistryLite);
                            this.f1646a |= 64;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            this.f1655j = codedInputStream.readStringRequireUtf8();
                            this.f1646a |= 128;
                        case 74:
                            EzyHeader$Author ezyHeader$Author = (EzyHeader$Author) codedInputStream.readMessage(EzyHeader$Author.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f1657l;
                            if (repeatedFieldBuilderV3 == null) {
                                m2117g();
                                this.f1656k.add(ezyHeader$Author);
                            } else {
                                repeatedFieldBuilderV3.addMessage(ezyHeader$Author);
                            }
                        case 80:
                            this.f1658m = codedInputStream.readInt32();
                            this.f1646a |= 512;
                        case 88:
                            this.f1659n = codedInputStream.readInt32();
                            this.f1646a |= 1024;
                        case 98:
                            codedInputStream.readMessage(m2121k().getBuilder(), extensionRegistryLite);
                            this.f1646a |= 2048;
                        case 106:
                            codedInputStream.readMessage(m2119i().getBuilder(), extensionRegistryLite);
                            this.f1646a |= 4096;
                        case 114:
                            codedInputStream.readMessage(m2120j().getBuilder(), extensionRegistryLite);
                            this.f1646a |= 8192;
                        default:
                            if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z8 = true;
                            }
                    }
                } catch (InvalidProtocolBufferException e) {
                    throw e.unwrapIOException();
                }
            } catch (Throwable th) {
                onChanged();
                throw th;
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3171u) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C3171u) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3171u) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3171u) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m2116f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C3171u) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3171u) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder m13728clone() {
        return (C3171u) super.m13728clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyHeader$Header.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2124n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3171u) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C3171u) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C3171u) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3171u) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m2116f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C3171u) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder m13728clone() {
        return (C3171u) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2124n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C3171u) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m2116f();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder m13728clone() {
        return (C3171u) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m2124n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder m13728clone() {
        return (C3171u) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyHeader$Header) {
            m2123m((EzyHeader$Header) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C3171u) super.m13728clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyHeader$Header) {
            m2123m((EzyHeader$Header) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}
