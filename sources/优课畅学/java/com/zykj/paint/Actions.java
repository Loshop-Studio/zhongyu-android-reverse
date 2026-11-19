package com.zykj.paint;

// RE note 本类字节码直接引用的读写或显示接口包括Protobuf。

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.Any;
import com.google.protobuf.AnyProto;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class Actions {

    /* renamed from: A */
    public static Descriptors.FileDescriptor f10474A;

    /* renamed from: a */
    public static final Descriptors.Descriptor f10475a;

    /* renamed from: b */
    public static final GeneratedMessageV3.FieldAccessorTable f10476b;

    /* renamed from: c */
    public static final Descriptors.Descriptor f10477c;

    /* renamed from: d */
    public static final GeneratedMessageV3.FieldAccessorTable f10478d;

    /* renamed from: e */
    public static final Descriptors.Descriptor f10479e;

    /* renamed from: f */
    public static final GeneratedMessageV3.FieldAccessorTable f10480f;

    /* renamed from: g */
    public static final Descriptors.Descriptor f10481g;

    /* renamed from: h */
    public static final GeneratedMessageV3.FieldAccessorTable f10482h;

    /* renamed from: i */
    public static final Descriptors.Descriptor f10483i;

    /* renamed from: j */
    public static final GeneratedMessageV3.FieldAccessorTable f10484j;

    /* renamed from: k */
    public static final Descriptors.Descriptor f10485k;

    /* renamed from: l */
    public static final GeneratedMessageV3.FieldAccessorTable f10486l;

    /* renamed from: m */
    public static final Descriptors.Descriptor f10487m;

    /* renamed from: n */
    public static final GeneratedMessageV3.FieldAccessorTable f10488n;

    /* renamed from: o */
    public static final Descriptors.Descriptor f10489o;

    /* renamed from: p */
    public static final GeneratedMessageV3.FieldAccessorTable f10490p;

    /* renamed from: q */
    public static final Descriptors.Descriptor f10491q;

    /* renamed from: r */
    public static final GeneratedMessageV3.FieldAccessorTable f10492r;

    /* renamed from: s */
    public static final Descriptors.Descriptor f10493s;

    /* renamed from: t */
    public static final GeneratedMessageV3.FieldAccessorTable f10494t;

    /* renamed from: u */
    public static final Descriptors.Descriptor f10495u;

    /* renamed from: v */
    public static final GeneratedMessageV3.FieldAccessorTable f10496v;

    /* renamed from: w */
    public static final Descriptors.Descriptor f10497w;

    /* renamed from: x */
    public static final GeneratedMessageV3.FieldAccessorTable f10498x;

    /* renamed from: y */
    public static final Descriptors.Descriptor f10499y;

    /* renamed from: z */
    public static final GeneratedMessageV3.FieldAccessorTable f10500z;

    public static final class EzyAction extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: g */
        public static final EzyAction f10501g = new EzyAction();

        /* renamed from: h */
        public static final Parser f10502h = new C7415a();

        /* renamed from: a */
        public int f10503a;

        /* renamed from: b */
        public int f10504b;

        /* renamed from: c */
        public int f10505c;

        /* renamed from: d */
        public int f10506d;

        /* renamed from: e */
        public Any f10507e;

        /* renamed from: f */
        public byte f10508f;

        /* renamed from: com.zykj.paint.Actions$EzyAction$a */
        public class C7415a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public EzyAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyAction(codedInputStream, extensionRegistryLite, null);
            }
        }

        /* renamed from: com.zykj.paint.Actions$EzyAction$b */
        public static final class C7416b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f10509a;

            /* renamed from: b */
            public int f10510b;

            /* renamed from: c */
            public int f10511c;

            /* renamed from: d */
            public int f10512d;

            /* renamed from: e */
            public Any f10513e;

            /* renamed from: f */
            public SingleFieldBuilderV3 f10514f;

            public /* synthetic */ C7416b(GeneratedMessageV3.BuilderParent builderParent, C7419a c7419a) {
                this(builderParent);
            }

            private void maybeForceBuilderInitialization() {
                boolean unused = GeneratedMessageV3.alwaysUseFieldBuilders;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7416b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7416b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public EzyAction build() {
                EzyAction ezyActionBuildPartial = buildPartial();
                if (ezyActionBuildPartial.isInitialized()) {
                    return ezyActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public EzyAction buildPartial() {
                EzyAction ezyAction = new EzyAction(this, (C7419a) null);
                ezyAction.f10503a = this.f10509a;
                ezyAction.f10504b = this.f10510b;
                ezyAction.f10505c = this.f10511c;
                ezyAction.f10506d = this.f10512d;
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f10514f;
                if (singleFieldBuilderV3 == null) {
                    ezyAction.f10507e = this.f10513e;
                } else {
                    ezyAction.f10507e = (Any) singleFieldBuilderV3.build();
                }
                onBuilt();
                return ezyAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7416b clear() {
                super.clear();
                this.f10509a = 0;
                this.f10510b = 0;
                this.f10511c = 0;
                this.f10512d = 0;
                if (this.f10514f == null) {
                    this.f10513e = null;
                    return this;
                }
                this.f10513e = null;
                this.f10514f = null;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.f10475a;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7416b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7416b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7416b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7416b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.f10476b.ensureFieldAccessorsInitialized(EzyAction.class, C7416b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7416b mo27381clone() {
                return (C7416b) super.mo27381clone();
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: k, reason: merged with bridge method [inline-methods] */
            public EzyAction getDefaultInstanceForType() {
                return EzyAction.m9622j();
            }

            /* renamed from: l */
            public C7416b m9643l(Any any) {
                SingleFieldBuilderV3 singleFieldBuilderV3 = this.f10514f;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(any);
                    return this;
                }
                Any any2 = this.f10513e;
                if (any2 != null) {
                    this.f10513e = Any.newBuilder(any2).mergeFrom(any).buildPartial();
                } else {
                    this.f10513e = any;
                }
                onChanged();
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.paint.Actions.EzyAction.C7416b mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyAction.m9617b()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyAction r3 = (com.zykj.paint.Actions.EzyAction) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.m9646o(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.paint.Actions$EzyAction r4 = (com.zykj.paint.Actions.EzyAction) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.m9646o(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyAction.C7416b.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyAction$b"); // DEX body: android/优课畅学/smali/com/zykj/paint/Actions$EzyAction$b.smali:770
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            public C7416b mergeFrom(Message message) {
                if (message instanceof EzyAction) {
                    return m9646o((EzyAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: o */
            public C7416b m9646o(EzyAction ezyAction) {
                if (ezyAction == EzyAction.m9622j()) {
                    return this;
                }
                if (ezyAction.m9629n() != 0) {
                    m9653v(ezyAction.m9629n());
                }
                if (ezyAction.m9627l() != 0) {
                    m9649r(ezyAction.m9627l());
                }
                if (ezyAction.m9624h() != 0) {
                    m9648q(ezyAction.m9624h());
                }
                if (ezyAction.m9628m() != 0) {
                    m9651t(ezyAction.m9628m());
                }
                if (ezyAction.m9630o()) {
                    m9643l(ezyAction.m9625i());
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final C7416b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            /* renamed from: q */
            public C7416b m9648q(int i10) {
                this.f10511c = i10;
                onChanged();
                return this;
            }

            /* renamed from: r */
            public C7416b m9649r(int i10) {
                this.f10510b = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7416b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7416b) super.setField(fieldDescriptor, obj);
            }

            /* renamed from: t */
            public C7416b m9651t(int i10) {
                this.f10512d = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C7416b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7416b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            /* renamed from: v */
            public C7416b m9653v(int i10) {
                this.f10509a = i10;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public final C7416b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public /* synthetic */ C7416b(C7419a c7419a) {
                this();
            }

            public C7416b() {
                this.f10513e = null;
                maybeForceBuilderInitialization();
            }

            public C7416b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f10513e = null;
                maybeForceBuilderInitialization();
            }
        }

        public /* synthetic */ EzyAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C7419a c7419a) {
            this(codedInputStream, extensionRegistryLite);
        }

        /* renamed from: j */
        public static EzyAction m9622j() {
            return f10501g;
        }

        /* renamed from: p */
        public static C7416b m9623p() {
            return f10501g.toBuilder();
        }

        public static Parser parser() {
            return f10502h;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EzyAction)) {
                return super.equals(obj);
            }
            EzyAction ezyAction = (EzyAction) obj;
            boolean z10 = m9629n() == ezyAction.m9629n() && m9627l() == ezyAction.m9627l() && m9624h() == ezyAction.m9624h() && m9628m() == ezyAction.m9628m() && m9630o() == ezyAction.m9630o();
            return m9630o() ? z10 && m9625i().equals(ezyAction.m9625i()) : z10;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f10502h;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.f10503a;
            int iComputeInt32Size = i11 != 0 ? CodedOutputStream.computeInt32Size(1, i11) : 0;
            int i12 = this.f10504b;
            if (i12 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(2, i12);
            }
            int i13 = this.f10505c;
            if (i13 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(3, i13);
            }
            int i14 = this.f10506d;
            if (i14 != 0) {
                iComputeInt32Size += CodedOutputStream.computeInt32Size(4, i14);
            }
            if (this.f10507e != null) {
                iComputeInt32Size += CodedOutputStream.computeMessageSize(5, m9625i());
            }
            this.memoizedSize = iComputeInt32Size;
            return iComputeInt32Size;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        /* renamed from: h */
        public int m9624h() {
            return this.f10505c;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((779 + getDescriptorForType().hashCode()) * 37) + 1) * 53) + m9629n()) * 37) + 2) * 53) + m9627l()) * 37) + 3) * 53) + m9624h()) * 37) + 4) * 53) + m9628m();
            if (m9630o()) {
                iHashCode = (((iHashCode * 37) + 5) * 53) + m9625i().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        /* renamed from: i */
        public Any m9625i() {
            Any any = this.f10507e;
            return any == null ? Any.getDefaultInstance() : any;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.f10476b.ensureFieldAccessorsInitialized(EzyAction.class, C7416b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f10508f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f10508f = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public EzyAction getDefaultInstanceForType() {
            return f10501g;
        }

        /* renamed from: l */
        public int m9627l() {
            return this.f10504b;
        }

        /* renamed from: m */
        public int m9628m() {
            return this.f10506d;
        }

        /* renamed from: n */
        public int m9629n() {
            return this.f10503a;
        }

        /* renamed from: o */
        public boolean m9630o() {
            return this.f10507e != null;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public C7416b newBuilderForType() {
            return m9623p();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C7416b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7416b(builderParent, null);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public C7416b toBuilder() {
            C7419a c7419a = null;
            return this == f10501g ? new C7416b(c7419a) : new C7416b(c7419a).m9646o(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int i10 = this.f10503a;
            if (i10 != 0) {
                codedOutputStream.writeInt32(1, i10);
            }
            int i11 = this.f10504b;
            if (i11 != 0) {
                codedOutputStream.writeInt32(2, i11);
            }
            int i12 = this.f10505c;
            if (i12 != 0) {
                codedOutputStream.writeInt32(3, i12);
            }
            int i13 = this.f10506d;
            if (i13 != 0) {
                codedOutputStream.writeInt32(4, i13);
            }
            if (this.f10507e != null) {
                codedOutputStream.writeMessage(5, m9625i());
            }
        }

        public /* synthetic */ EzyAction(GeneratedMessageV3.Builder builder, C7419a c7419a) {
            this(builder);
        }

        public EzyAction(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f10508f = (byte) -1;
        }

        private EzyAction() {
            this.f10508f = (byte) -1;
            this.f10503a = 0;
            this.f10504b = 0;
            this.f10505c = 0;
            this.f10506d = 0;
        }

        public EzyAction(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag == 8) {
                                this.f10503a = codedInputStream.readInt32();
                            } else if (tag == 16) {
                                this.f10504b = codedInputStream.readInt32();
                            } else if (tag == 24) {
                                this.f10505c = codedInputStream.readInt32();
                            } else if (tag == 32) {
                                this.f10506d = codedInputStream.readInt32();
                            } else if (tag != 42) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                Any any = this.f10507e;
                                Any.Builder builder = any != null ? any.toBuilder() : null;
                                Any any2 = (Any) codedInputStream.readMessage(Any.parser(), extensionRegistryLite);
                                this.f10507e = any2;
                                if (builder != null) {
                                    builder.mergeFrom(any2);
                                    this.f10507e = builder.buildPartial();
                                }
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            makeExtensionsImmutable();
        }
    }

    public static final class EzyActionList extends GeneratedMessageV3 implements MessageOrBuilder {

        /* renamed from: c */
        public static final EzyActionList f10515c = new EzyActionList();

        /* renamed from: d */
        public static final Parser f10516d = new C7417a();

        /* renamed from: a */
        public List f10517a;

        /* renamed from: b */
        public byte f10518b;

        /* renamed from: com.zykj.paint.Actions$EzyActionList$a */
        public class C7417a extends AbstractParser {
            @Override // com.google.protobuf.Parser
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public EzyActionList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return new EzyActionList(codedInputStream, extensionRegistryLite, null);
            }
        }

        /* renamed from: com.zykj.paint.Actions$EzyActionList$b */
        public static final class C7418b extends GeneratedMessageV3.Builder implements MessageOrBuilder {

            /* renamed from: a */
            public int f10519a;

            /* renamed from: b */
            public List f10520b;

            /* renamed from: c */
            public RepeatedFieldBuilderV3 f10521c;

            public /* synthetic */ C7418b(GeneratedMessageV3.BuilderParent builderParent, C7419a c7419a) {
                this(builderParent);
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    m9678l();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public C7418b addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7418b) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public EzyActionList build() {
                EzyActionList ezyActionListBuildPartial = buildPartial();
                if (ezyActionListBuildPartial.isInitialized()) {
                    return ezyActionListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyActionListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public EzyActionList buildPartial() {
                EzyActionList ezyActionList = new EzyActionList(this, (C7419a) null);
                int i10 = this.f10519a;
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f10521c;
                if (repeatedFieldBuilderV3 == null) {
                    if ((i10 & 1) == 1) {
                        this.f10520b = Collections.unmodifiableList(this.f10520b);
                        this.f10519a &= -2;
                    }
                    ezyActionList.f10517a = this.f10520b;
                } else {
                    ezyActionList.f10517a = repeatedFieldBuilderV3.build();
                }
                onBuilt();
                return ezyActionList;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: g, reason: merged with bridge method [inline-methods] */
            public C7418b clear() {
                super.clear();
                RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f10521c;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.f10520b = Collections.EMPTY_LIST;
                this.f10519a &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return Actions.f10499y;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public C7418b clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (C7418b) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public C7418b clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (C7418b) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return Actions.f10500z.ensureFieldAccessorsInitialized(EzyActionList.class, C7418b.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* renamed from: j, reason: merged with bridge method [inline-methods] */
            public C7418b mo27381clone() {
                return (C7418b) super.mo27381clone();
            }

            /* renamed from: k */
            public final void m9677k() {
                if ((this.f10519a & 1) != 1) {
                    this.f10520b = new ArrayList(this.f10520b);
                    this.f10519a |= 1;
                }
            }

            /* renamed from: l */
            public final RepeatedFieldBuilderV3 m9678l() {
                if (this.f10521c == null) {
                    this.f10521c = new RepeatedFieldBuilderV3(this.f10520b, (this.f10519a & 1) == 1, getParentForChildren(), isClean());
                    this.f10520b = null;
                }
                return this.f10521c;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public EzyActionList getDefaultInstanceForType() {
                return EzyActionList.m9659h();
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            /* renamed from: n, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public com.zykj.paint.Actions.EzyActionList.C7418b mergeFrom(com.google.protobuf.CodedInputStream r3, com.google.protobuf.ExtensionRegistryLite r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.google.protobuf.Parser r1 = com.zykj.paint.Actions.EzyActionList.access$13400()     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    java.lang.Object r3 = r1.parsePartialFrom(r3, r4)     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    com.zykj.paint.Actions$EzyActionList r3 = (com.zykj.paint.Actions.EzyActionList) r3     // Catch: java.lang.Throwable -> L11 com.google.protobuf.InvalidProtocolBufferException -> L13
                    if (r3 == 0) goto L10
                    r2.m9682p(r3)
                L10:
                    return r2
                L11:
                    r3 = move-exception
                    goto L21
                L13:
                    r3 = move-exception
                    com.google.protobuf.MessageLite r4 = r3.getUnfinishedMessage()     // Catch: java.lang.Throwable -> L11
                    com.zykj.paint.Actions$EzyActionList r4 = (com.zykj.paint.Actions.EzyActionList) r4     // Catch: java.lang.Throwable -> L11
                    java.io.IOException r3 = r3.unwrapIOException()     // Catch: java.lang.Throwable -> L1f
                    throw r3     // Catch: java.lang.Throwable -> L1f
                L1f:
                    r3 = move-exception
                    r0 = r4
                L21:
                    if (r0 == 0) goto L26
                    r2.m9682p(r0)
                L26:
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.zykj.paint.Actions.EzyActionList.C7418b.mergeFrom(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite):com.zykj.paint.Actions$EzyActionList$b"); // DEX body: android/优课畅学/smali/com/zykj/paint/Actions$EzyActionList$b.smali:928
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: o, reason: merged with bridge method [inline-methods] */
            public C7418b mergeFrom(Message message) {
                if (message instanceof EzyActionList) {
                    return m9682p((EzyActionList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            /* renamed from: p */
            public C7418b m9682p(EzyActionList ezyActionList) {
                if (ezyActionList == EzyActionList.m9659h()) {
                    return this;
                }
                if (this.f10521c == null) {
                    if (!ezyActionList.f10517a.isEmpty()) {
                        if (this.f10520b.isEmpty()) {
                            this.f10520b = ezyActionList.f10517a;
                            this.f10519a &= -2;
                        } else {
                            m9677k();
                            this.f10520b.addAll(ezyActionList.f10517a);
                        }
                        onChanged();
                    }
                } else if (!ezyActionList.f10517a.isEmpty()) {
                    if (this.f10521c.isEmpty()) {
                        this.f10521c.dispose();
                        this.f10521c = null;
                        this.f10520b = ezyActionList.f10517a;
                        this.f10519a &= -2;
                        this.f10521c = GeneratedMessageV3.alwaysUseFieldBuilders ? m9678l() : null;
                    } else {
                        this.f10521c.addAllMessages(ezyActionList.f10517a);
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            /* renamed from: q, reason: merged with bridge method [inline-methods] */
            public final C7418b mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C7418b setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (C7418b) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: s, reason: merged with bridge method [inline-methods] */
            public C7418b setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i10, Object obj) {
                return (C7418b) super.setRepeatedField(fieldDescriptor, i10, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            /* renamed from: t, reason: merged with bridge method [inline-methods] */
            public final C7418b setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return this;
            }

            public /* synthetic */ C7418b(C7419a c7419a) {
                this();
            }

            public C7418b() {
                this.f10520b = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public C7418b(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.f10520b = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }
        }

        public /* synthetic */ EzyActionList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, C7419a c7419a) {
            this(codedInputStream, extensionRegistryLite);
        }

        /* renamed from: h */
        public static EzyActionList m9659h() {
            return f10515c;
        }

        /* renamed from: j */
        public static C7418b m9660j() {
            return f10515c.toBuilder();
        }

        /* renamed from: m */
        public static EzyActionList m9661m(InputStream inputStream) {
            return (EzyActionList) GeneratedMessageV3.parseWithIOException(f10516d, inputStream);
        }

        /* renamed from: n */
        public static EzyActionList m9662n(byte[] bArr) {
            return (EzyActionList) f10516d.parseFrom(bArr);
        }

        /* renamed from: e */
        public int m9663e() {
            return this.f10517a.size();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof EzyActionList) ? super.equals(obj) : m9664g().equals(((EzyActionList) obj).m9664g());
        }

        /* renamed from: g */
        public List m9664g() {
            return this.f10517a;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser getParserForType() {
            return f10516d;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeMessageSize = 0;
            for (int i11 = 0; i11 < this.f10517a.size(); i11++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, (MessageLite) this.f10517a.get(i11));
            }
            this.memoizedSize = iComputeMessageSize;
            return iComputeMessageSize;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageOrBuilder
        public final UnknownFieldSet getUnknownFields() {
            return UnknownFieldSet.getDefaultInstance();
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptorForType().hashCode();
            if (m9663e() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + m9664g().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + this.unknownFields.hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public EzyActionList getDefaultInstanceForType() {
            return f10515c;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return Actions.f10500z.ensureFieldAccessorsInitialized(EzyActionList.class, C7418b.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.f10518b;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.f10518b = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public C7418b newBuilderForType() {
            return m9660j();
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public C7418b newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new C7418b(builderParent, null);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public C7418b toBuilder() {
            C7419a c7419a = null;
            return this == f10515c ? new C7418b(c7419a) : new C7418b(c7419a).m9682p(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i10 = 0; i10 < this.f10517a.size(); i10++) {
                codedOutputStream.writeMessage(1, (MessageLite) this.f10517a.get(i10));
            }
        }

        public /* synthetic */ EzyActionList(GeneratedMessageV3.Builder builder, C7419a c7419a) {
            this(builder);
        }

        public EzyActionList(GeneratedMessageV3.Builder builder) {
            super(builder);
            this.f10518b = (byte) -1;
        }

        private EzyActionList() {
            this.f10518b = (byte) -1;
            this.f10517a = Collections.EMPTY_LIST;
        }

        public EzyActionList(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            this();
            boolean z10 = false;
            boolean z11 = false;
            while (!z10) {
                try {
                    try {
                        int tag = codedInputStream.readTag();
                        if (tag != 0) {
                            if (tag != 10) {
                                if (!codedInputStream.skipField(tag)) {
                                }
                            } else {
                                if (!z11) {
                                    this.f10517a = new ArrayList();
                                    z11 = true;
                                }
                                this.f10517a.add((EzyAction) codedInputStream.readMessage(EzyAction.parser(), extensionRegistryLite));
                            }
                        }
                        z10 = true;
                    } catch (InvalidProtocolBufferException e10) {
                        throw e10.setUnfinishedMessage(this);
                    } catch (IOException e11) {
                        throw new InvalidProtocolBufferException(e11).setUnfinishedMessage(this);
                    }
                } catch (Throwable th) {
                    if (z11) {
                        this.f10517a = Collections.unmodifiableList(this.f10517a);
                    }
                    makeExtensionsImmutable();
                    throw th;
                }
            }
            if (z11) {
                this.f10517a = Collections.unmodifiableList(this.f10517a);
            }
            makeExtensionsImmutable();
        }
    }

    public static final class EzyMatrixData extends GeneratedMessageV3 implements MessageOrBuilder {
    }

    public static final class NewImageData extends GeneratedMessageV3 implements MessageOrBuilder {
    }

    public static final class NewLayerData extends GeneratedMessageV3 implements MessageOrBuilder {
    }

    public static final class NewPolylineData extends GeneratedMessageV3 implements MessageOrBuilder {
    }

    /* renamed from: com.zykj.paint.Actions$a */
    public class C7419a implements Descriptors.FileDescriptor.InternalDescriptorAssigner {
        @Override // com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner
        public ExtensionRegistry assignDescriptors(Descriptors.FileDescriptor fileDescriptor) {
            Descriptors.FileDescriptor unused = Actions.f10474A = fileDescriptor;
            return null;
        }
    }

    static {
        Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\ractions.proto\u001a\u0019google/protobuf/any.proto\"w\n\tEzyAction\u0012\u000f\n\u0007StartAt\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bDuration\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nActionType\u0018\u0003 \u0001(\u0005\u0012\u000f\n\u0007GraphId\u0018\u0004 \u0001(\u0005\u0012\"\n\u0004Data\u0018\u0005 \u0001(\u000b2\u0014.google.protobuf.Any\"$\n\rEzyActionData\u0012\u0013\n\u000bPlaceHolder\u0018\u0001 \u0001(\u0005\"\u001f\n\rEzyMatrixData\u0012\u000e\n\u0006values\u0018\u0001 \u0003(\u0002\"+\n\rMoveGraphData\u0012\u001a\n\u0006Vector\u0018\u0001 \u0001(\u000b2\n.EzyVector\"\u001e\n\rZoomGraphData\u0012\r\n\u0005Scale\u0018\u0001 \u0001(\u0001\"(\n\fNewLayerData\u0012\u0018\n\u0005Color\u0018\u0001 \u0001(\u000b2\t.EzyColor\"M\n\fNewImageData\u0012\u0018\n\u0005Point\u0018\u0001 \u0001(\u000b2\t.EzyPoint\u0012\u0016\n\u0004S", "ize\u0018\u0002 \u0001(\u000b2\b.EzySize\u0012\u000b\n\u0003Src\u0018\u0003 \u0001(\t\"l\n\u000fNewPolylineData\u0012\u0019\n\u0006Points\u0018\u0001 \u0003(\u000b2\t.EzyPoint\u0012\u0018\n\u0005Color\u0018\u0002 \u0001(\u000b2\t.EzyColor\u0012\r\n\u0005Width\u0018\u0003 \u0001(\u0001\u0012\u0015\n\rStickyGraphId\u0018\u0004 \u0001(\u0005\"C\n\bEzyColor\u0012\u000b\n\u0003Red\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005Green\u0018\u0002 \u0001(\u0005\u0012\f\n\u0004Blue\u0018\u0003 \u0001(\u0005\u0012\r\n\u0005Alpha\u0018\u0004 \u0001(\u0005\" \n\bEzyPoint\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"(\n\u0007EzySize\u0012\r\n\u0005Width\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006Height\u0018\u0002 \u0001(\u0005\"!\n\tEzyVector\u0012\t\n\u0001X\u0018\u0001 \u0001(\u0001\u0012\t\n\u0001Y\u0018\u0002 \u0001(\u0001\"+\n\rEzyActionList\u0012\u001a\n\u0006action\u0018\u0001 \u0003(\u000b2\n.EzyActionB*\n\u000ecom.zykj.paintª\u0002\u0017EzyCoursePla", "yer.Actionsb\u0006proto3"}, new Descriptors.FileDescriptor[]{AnyProto.getDescriptor()}, new C7419a());
        Descriptors.Descriptor descriptor = m9615f().getMessageTypes().get(0);
        f10475a = descriptor;
        f10476b = new GeneratedMessageV3.FieldAccessorTable(descriptor, new String[]{"StartAt", "Duration", "ActionType", "GraphId", "Data"});
        Descriptors.Descriptor descriptor2 = m9615f().getMessageTypes().get(1);
        f10477c = descriptor2;
        f10478d = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"PlaceHolder"});
        Descriptors.Descriptor descriptor3 = m9615f().getMessageTypes().get(2);
        f10479e = descriptor3;
        f10480f = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Values"});
        Descriptors.Descriptor descriptor4 = m9615f().getMessageTypes().get(3);
        f10481g = descriptor4;
        f10482h = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Vector"});
        Descriptors.Descriptor descriptor5 = m9615f().getMessageTypes().get(4);
        f10483i = descriptor5;
        f10484j = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Scale"});
        Descriptors.Descriptor descriptor6 = m9615f().getMessageTypes().get(5);
        f10485k = descriptor6;
        f10486l = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Color"});
        Descriptors.Descriptor descriptor7 = m9615f().getMessageTypes().get(6);
        f10487m = descriptor7;
        f10488n = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Point", "Size", "Src"});
        Descriptors.Descriptor descriptor8 = m9615f().getMessageTypes().get(7);
        f10489o = descriptor8;
        f10490p = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Points", "Color", "Width", "StickyGraphId"});
        Descriptors.Descriptor descriptor9 = m9615f().getMessageTypes().get(8);
        f10491q = descriptor9;
        f10492r = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Red", "Green", "Blue", "Alpha"});
        Descriptors.Descriptor descriptor10 = m9615f().getMessageTypes().get(9);
        f10493s = descriptor10;
        f10494t = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor11 = m9615f().getMessageTypes().get(10);
        f10495u = descriptor11;
        f10496v = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Width", "Height"});
        Descriptors.Descriptor descriptor12 = m9615f().getMessageTypes().get(11);
        f10497w = descriptor12;
        f10498x = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"X", "Y"});
        Descriptors.Descriptor descriptor13 = m9615f().getMessageTypes().get(12);
        f10499y = descriptor13;
        f10500z = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Action"});
        AnyProto.getDescriptor();
    }

    /* renamed from: f */
    public static Descriptors.FileDescriptor m9615f() {
        return f10474A;
    }
}
