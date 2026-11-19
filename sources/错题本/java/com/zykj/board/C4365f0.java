package com.zykj.board;

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
import com.google.protobuf.UnknownFieldSet;
import com.zykj.board.EzyRouterRecord$RouterRecord;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p020b4.AbstractC3134h1;

/* renamed from: com.zykj.board.f0 */
/* loaded from: classes3.dex */
public final class C4365f0 extends GeneratedMessageV3.Builder implements MessageOrBuilder {

    /* renamed from: a */
    public int f5482a;

    /* renamed from: b */
    public List f5483b;

    /* renamed from: c */
    public RepeatedFieldBuilderV3 f5484c;

    /* renamed from: d */
    public List f5485d;

    /* renamed from: e */
    public RepeatedFieldBuilderV3 f5486e;

    /* renamed from: f */
    public List f5487f;

    /* renamed from: g */
    public RepeatedFieldBuilderV3 f5488g;

    /* renamed from: h */
    public List f5489h;

    /* renamed from: i */
    public RepeatedFieldBuilderV3 f5490i;

    /* renamed from: j */
    public List f5491j;

    /* renamed from: k */
    public RepeatedFieldBuilderV3 f5492k;

    /* renamed from: l */
    public List f5493l;

    /* renamed from: m */
    public RepeatedFieldBuilderV3 f5494m;

    /* renamed from: n */
    public List f5495n;

    /* renamed from: o */
    public RepeatedFieldBuilderV3 f5496o;

    public C4365f0() {
        List list = Collections.EMPTY_LIST;
        this.f5483b = list;
        this.f5485d = list;
        this.f5487f = list;
        this.f5489h = list;
        this.f5491j = list;
        this.f5493l = list;
        this.f5495n = list;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4365f0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final Message build() {
        EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecordBuildPartial = buildPartial();
        if (ezyRouterRecord$RouterRecordBuildPartial.isInitialized()) {
            return ezyRouterRecord$RouterRecordBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyRouterRecord$RouterRecordBuildPartial);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final EzyRouterRecord$RouterRecord buildPartial() {
        EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecord = new EzyRouterRecord$RouterRecord(this, null);
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5484c;
        if (repeatedFieldBuilderV3 == null) {
            if ((this.f5482a & 1) != 0) {
                this.f5483b = Collections.unmodifiableList(this.f5483b);
                this.f5482a &= -2;
            }
            ezyRouterRecord$RouterRecord.commandRecord_ = this.f5483b;
        } else {
            ezyRouterRecord$RouterRecord.commandRecord_ = repeatedFieldBuilderV3.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5486e;
        if (repeatedFieldBuilderV32 == null) {
            if ((this.f5482a & 2) != 0) {
                this.f5485d = Collections.unmodifiableList(this.f5485d);
                this.f5482a &= -3;
            }
            ezyRouterRecord$RouterRecord.audioRecord_ = this.f5485d;
        } else {
            ezyRouterRecord$RouterRecord.audioRecord_ = repeatedFieldBuilderV32.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f5488g;
        if (repeatedFieldBuilderV33 == null) {
            if ((this.f5482a & 4) != 0) {
                this.f5487f = Collections.unmodifiableList(this.f5487f);
                this.f5482a &= -5;
            }
            ezyRouterRecord$RouterRecord.touchSourceRecord_ = this.f5487f;
        } else {
            ezyRouterRecord$RouterRecord.touchSourceRecord_ = repeatedFieldBuilderV33.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f5490i;
        if (repeatedFieldBuilderV34 == null) {
            if ((this.f5482a & 8) != 0) {
                this.f5489h = Collections.unmodifiableList(this.f5489h);
                this.f5482a &= -9;
            }
            ezyRouterRecord$RouterRecord.matrixSourceRecord_ = this.f5489h;
        } else {
            ezyRouterRecord$RouterRecord.matrixSourceRecord_ = repeatedFieldBuilderV34.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f5492k;
        if (repeatedFieldBuilderV35 == null) {
            if ((this.f5482a & 16) != 0) {
                this.f5491j = Collections.unmodifiableList(this.f5491j);
                this.f5482a &= -17;
            }
            ezyRouterRecord$RouterRecord.fileSourceRecord_ = this.f5491j;
        } else {
            ezyRouterRecord$RouterRecord.fileSourceRecord_ = repeatedFieldBuilderV35.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f5494m;
        if (repeatedFieldBuilderV36 == null) {
            if ((this.f5482a & 32) != 0) {
                this.f5493l = Collections.unmodifiableList(this.f5493l);
                this.f5482a &= -33;
            }
            ezyRouterRecord$RouterRecord.textSourceRecord_ = this.f5493l;
        } else {
            ezyRouterRecord$RouterRecord.textSourceRecord_ = repeatedFieldBuilderV36.build();
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f5496o;
        if (repeatedFieldBuilderV37 == null) {
            if ((this.f5482a & 64) != 0) {
                this.f5495n = Collections.unmodifiableList(this.f5495n);
                this.f5482a &= -65;
            }
            ezyRouterRecord$RouterRecord.geometrySourceRecord_ = this.f5495n;
        } else {
            ezyRouterRecord$RouterRecord.geometrySourceRecord_ = repeatedFieldBuilderV37.build();
        }
        onBuilt();
        return ezyRouterRecord$RouterRecord;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder clear() {
        m3731e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4365f0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4365f0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessage.Builder mo13724clone() {
        return (C4365f0) super.mo13724clone();
    }

    /* renamed from: e */
    public final void m3731e() {
        super.clear();
        this.f5482a = 0;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5484c;
        if (repeatedFieldBuilderV3 == null) {
            this.f5483b = Collections.EMPTY_LIST;
        } else {
            this.f5483b = null;
            repeatedFieldBuilderV3.clear();
        }
        this.f5482a &= -2;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5486e;
        if (repeatedFieldBuilderV32 == null) {
            this.f5485d = Collections.EMPTY_LIST;
        } else {
            this.f5485d = null;
            repeatedFieldBuilderV32.clear();
        }
        this.f5482a &= -3;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f5488g;
        if (repeatedFieldBuilderV33 == null) {
            this.f5487f = Collections.EMPTY_LIST;
        } else {
            this.f5487f = null;
            repeatedFieldBuilderV33.clear();
        }
        this.f5482a &= -5;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f5490i;
        if (repeatedFieldBuilderV34 == null) {
            this.f5489h = Collections.EMPTY_LIST;
        } else {
            this.f5489h = null;
            repeatedFieldBuilderV34.clear();
        }
        this.f5482a &= -9;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f5492k;
        if (repeatedFieldBuilderV35 == null) {
            this.f5491j = Collections.EMPTY_LIST;
        } else {
            this.f5491j = null;
            repeatedFieldBuilderV35.clear();
        }
        this.f5482a &= -17;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f5494m;
        if (repeatedFieldBuilderV36 == null) {
            this.f5493l = Collections.EMPTY_LIST;
        } else {
            this.f5493l = null;
            repeatedFieldBuilderV36.clear();
        }
        this.f5482a &= -33;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f5496o;
        if (repeatedFieldBuilderV37 == null) {
            this.f5495n = Collections.EMPTY_LIST;
        } else {
            this.f5495n = null;
            repeatedFieldBuilderV37.clear();
        }
        this.f5482a &= -65;
    }

    /* renamed from: f */
    public final void m3732f() {
        if ((this.f5482a & 2) == 0) {
            this.f5485d = new ArrayList(this.f5485d);
            this.f5482a |= 2;
        }
    }

    /* renamed from: g */
    public final void m3733g() {
        if ((this.f5482a & 1) == 0) {
            this.f5483b = new ArrayList(this.f5483b);
            this.f5482a |= 1;
        }
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final Message getDefaultInstanceForType() {
        return EzyRouterRecord$RouterRecord.getDefaultInstance();
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
    public final Descriptors.Descriptor getDescriptorForType() {
        return AbstractC3134h1.f1607a;
    }

    /* renamed from: h */
    public final void m3734h() {
        if ((this.f5482a & 16) == 0) {
            this.f5491j = new ArrayList(this.f5491j);
            this.f5482a |= 16;
        }
    }

    /* renamed from: i */
    public final void m3735i() {
        if ((this.f5482a & 64) == 0) {
            this.f5495n = new ArrayList(this.f5495n);
            this.f5482a |= 64;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder
    public final GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AbstractC3134h1.f1608b.ensureFieldAccessorsInitialized(EzyRouterRecord$RouterRecord.class, C4365f0.class);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return true;
    }

    /* renamed from: j */
    public final void m3736j() {
        if ((this.f5482a & 8) == 0) {
            this.f5489h = new ArrayList(this.f5489h);
            this.f5482a |= 8;
        }
    }

    /* renamed from: k */
    public final void m3737k() {
        if ((this.f5482a & 32) == 0) {
            this.f5493l = new ArrayList(this.f5493l);
            this.f5482a |= 32;
        }
    }

    /* renamed from: l */
    public final void m3738l() {
        if ((this.f5482a & 4) == 0) {
            this.f5487f = new ArrayList(this.f5487f);
            this.f5482a |= 4;
        }
    }

    /* renamed from: m */
    public final void m3739m(EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecord) {
        RepeatedFieldBuilderV3 repeatedFieldBuilderV3;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV32;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV33;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV34;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV35;
        RepeatedFieldBuilderV3 repeatedFieldBuilderV36;
        if (ezyRouterRecord$RouterRecord == EzyRouterRecord$RouterRecord.getDefaultInstance()) {
            return;
        }
        RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = null;
        if (this.f5484c == null) {
            if (!ezyRouterRecord$RouterRecord.commandRecord_.isEmpty()) {
                if (this.f5483b.isEmpty()) {
                    this.f5483b = ezyRouterRecord$RouterRecord.commandRecord_;
                    this.f5482a &= -2;
                } else {
                    m3733g();
                    this.f5483b.addAll(ezyRouterRecord$RouterRecord.commandRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.commandRecord_.isEmpty()) {
            if (this.f5484c.isEmpty()) {
                this.f5484c.dispose();
                this.f5484c = null;
                this.f5483b = ezyRouterRecord$RouterRecord.commandRecord_;
                this.f5482a &= -2;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5484c == null) {
                        this.f5484c = new RepeatedFieldBuilderV3(this.f5483b, (this.f5482a & 1) != 0, getParentForChildren(), isClean());
                        this.f5483b = null;
                    }
                    repeatedFieldBuilderV3 = this.f5484c;
                } else {
                    repeatedFieldBuilderV3 = null;
                }
                this.f5484c = repeatedFieldBuilderV3;
            } else {
                this.f5484c.addAllMessages(ezyRouterRecord$RouterRecord.commandRecord_);
            }
        }
        if (this.f5486e == null) {
            if (!ezyRouterRecord$RouterRecord.audioRecord_.isEmpty()) {
                if (this.f5485d.isEmpty()) {
                    this.f5485d = ezyRouterRecord$RouterRecord.audioRecord_;
                    this.f5482a &= -3;
                } else {
                    m3732f();
                    this.f5485d.addAll(ezyRouterRecord$RouterRecord.audioRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.audioRecord_.isEmpty()) {
            if (this.f5486e.isEmpty()) {
                this.f5486e.dispose();
                this.f5486e = null;
                this.f5485d = ezyRouterRecord$RouterRecord.audioRecord_;
                this.f5482a &= -3;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5486e == null) {
                        this.f5486e = new RepeatedFieldBuilderV3(this.f5485d, (this.f5482a & 2) != 0, getParentForChildren(), isClean());
                        this.f5485d = null;
                    }
                    repeatedFieldBuilderV32 = this.f5486e;
                } else {
                    repeatedFieldBuilderV32 = null;
                }
                this.f5486e = repeatedFieldBuilderV32;
            } else {
                this.f5486e.addAllMessages(ezyRouterRecord$RouterRecord.audioRecord_);
            }
        }
        if (this.f5488g == null) {
            if (!ezyRouterRecord$RouterRecord.touchSourceRecord_.isEmpty()) {
                if (this.f5487f.isEmpty()) {
                    this.f5487f = ezyRouterRecord$RouterRecord.touchSourceRecord_;
                    this.f5482a &= -5;
                } else {
                    m3738l();
                    this.f5487f.addAll(ezyRouterRecord$RouterRecord.touchSourceRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.touchSourceRecord_.isEmpty()) {
            if (this.f5488g.isEmpty()) {
                this.f5488g.dispose();
                this.f5488g = null;
                this.f5487f = ezyRouterRecord$RouterRecord.touchSourceRecord_;
                this.f5482a &= -5;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5488g == null) {
                        this.f5488g = new RepeatedFieldBuilderV3(this.f5487f, (this.f5482a & 4) != 0, getParentForChildren(), isClean());
                        this.f5487f = null;
                    }
                    repeatedFieldBuilderV33 = this.f5488g;
                } else {
                    repeatedFieldBuilderV33 = null;
                }
                this.f5488g = repeatedFieldBuilderV33;
            } else {
                this.f5488g.addAllMessages(ezyRouterRecord$RouterRecord.touchSourceRecord_);
            }
        }
        if (this.f5490i == null) {
            if (!ezyRouterRecord$RouterRecord.matrixSourceRecord_.isEmpty()) {
                if (this.f5489h.isEmpty()) {
                    this.f5489h = ezyRouterRecord$RouterRecord.matrixSourceRecord_;
                    this.f5482a &= -9;
                } else {
                    m3736j();
                    this.f5489h.addAll(ezyRouterRecord$RouterRecord.matrixSourceRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.matrixSourceRecord_.isEmpty()) {
            if (this.f5490i.isEmpty()) {
                this.f5490i.dispose();
                this.f5490i = null;
                this.f5489h = ezyRouterRecord$RouterRecord.matrixSourceRecord_;
                this.f5482a &= -9;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5490i == null) {
                        this.f5490i = new RepeatedFieldBuilderV3(this.f5489h, (this.f5482a & 8) != 0, getParentForChildren(), isClean());
                        this.f5489h = null;
                    }
                    repeatedFieldBuilderV34 = this.f5490i;
                } else {
                    repeatedFieldBuilderV34 = null;
                }
                this.f5490i = repeatedFieldBuilderV34;
            } else {
                this.f5490i.addAllMessages(ezyRouterRecord$RouterRecord.matrixSourceRecord_);
            }
        }
        if (this.f5492k == null) {
            if (!ezyRouterRecord$RouterRecord.fileSourceRecord_.isEmpty()) {
                if (this.f5491j.isEmpty()) {
                    this.f5491j = ezyRouterRecord$RouterRecord.fileSourceRecord_;
                    this.f5482a &= -17;
                } else {
                    m3734h();
                    this.f5491j.addAll(ezyRouterRecord$RouterRecord.fileSourceRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.fileSourceRecord_.isEmpty()) {
            if (this.f5492k.isEmpty()) {
                this.f5492k.dispose();
                this.f5492k = null;
                this.f5491j = ezyRouterRecord$RouterRecord.fileSourceRecord_;
                this.f5482a &= -17;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5492k == null) {
                        this.f5492k = new RepeatedFieldBuilderV3(this.f5491j, (this.f5482a & 16) != 0, getParentForChildren(), isClean());
                        this.f5491j = null;
                    }
                    repeatedFieldBuilderV35 = this.f5492k;
                } else {
                    repeatedFieldBuilderV35 = null;
                }
                this.f5492k = repeatedFieldBuilderV35;
            } else {
                this.f5492k.addAllMessages(ezyRouterRecord$RouterRecord.fileSourceRecord_);
            }
        }
        if (this.f5494m == null) {
            if (!ezyRouterRecord$RouterRecord.textSourceRecord_.isEmpty()) {
                if (this.f5493l.isEmpty()) {
                    this.f5493l = ezyRouterRecord$RouterRecord.textSourceRecord_;
                    this.f5482a &= -33;
                } else {
                    m3737k();
                    this.f5493l.addAll(ezyRouterRecord$RouterRecord.textSourceRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.textSourceRecord_.isEmpty()) {
            if (this.f5494m.isEmpty()) {
                this.f5494m.dispose();
                this.f5494m = null;
                this.f5493l = ezyRouterRecord$RouterRecord.textSourceRecord_;
                this.f5482a &= -33;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5494m == null) {
                        this.f5494m = new RepeatedFieldBuilderV3(this.f5493l, (this.f5482a & 32) != 0, getParentForChildren(), isClean());
                        this.f5493l = null;
                    }
                    repeatedFieldBuilderV36 = this.f5494m;
                } else {
                    repeatedFieldBuilderV36 = null;
                }
                this.f5494m = repeatedFieldBuilderV36;
            } else {
                this.f5494m.addAllMessages(ezyRouterRecord$RouterRecord.textSourceRecord_);
            }
        }
        if (this.f5496o == null) {
            if (!ezyRouterRecord$RouterRecord.geometrySourceRecord_.isEmpty()) {
                if (this.f5495n.isEmpty()) {
                    this.f5495n = ezyRouterRecord$RouterRecord.geometrySourceRecord_;
                    this.f5482a &= -65;
                } else {
                    m3735i();
                    this.f5495n.addAll(ezyRouterRecord$RouterRecord.geometrySourceRecord_);
                }
                onChanged();
            }
        } else if (!ezyRouterRecord$RouterRecord.geometrySourceRecord_.isEmpty()) {
            if (this.f5496o.isEmpty()) {
                this.f5496o.dispose();
                this.f5496o = null;
                this.f5495n = ezyRouterRecord$RouterRecord.geometrySourceRecord_;
                this.f5482a &= -65;
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    if (this.f5496o == null) {
                        this.f5496o = new RepeatedFieldBuilderV3(this.f5495n, (this.f5482a & 64) != 0, getParentForChildren(), isClean());
                        this.f5495n = null;
                    }
                    repeatedFieldBuilderV37 = this.f5496o;
                }
                this.f5496o = repeatedFieldBuilderV37;
            } else {
                this.f5496o.addAllMessages(ezyRouterRecord$RouterRecord.geometrySourceRecord_);
            }
        }
        onChanged();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3740n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4365f0) super.mergeUnknownFields(unknownFieldSet);
    }

    /* renamed from: n */
    public final void m3740n(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.getClass();
        boolean z8 = false;
        while (!z8) {
            try {
                try {
                    int tag = codedInputStream.readTag();
                    if (tag != 0) {
                        if (tag == 10) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV3 = this.f5484c;
                            if (repeatedFieldBuilderV3 == null) {
                                m3733g();
                                this.f5483b.add(sourceCommandRecord);
                            } else {
                                repeatedFieldBuilderV3.addMessage(sourceCommandRecord);
                            }
                        } else if (tag == 18) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord2 = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV32 = this.f5486e;
                            if (repeatedFieldBuilderV32 == null) {
                                m3732f();
                                this.f5485d.add(sourceCommandRecord2);
                            } else {
                                repeatedFieldBuilderV32.addMessage(sourceCommandRecord2);
                            }
                        } else if (tag == 26) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord3 = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV33 = this.f5488g;
                            if (repeatedFieldBuilderV33 == null) {
                                m3738l();
                                this.f5487f.add(sourceCommandRecord3);
                            } else {
                                repeatedFieldBuilderV33.addMessage(sourceCommandRecord3);
                            }
                        } else if (tag == 34) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord4 = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV34 = this.f5490i;
                            if (repeatedFieldBuilderV34 == null) {
                                m3736j();
                                this.f5489h.add(sourceCommandRecord4);
                            } else {
                                repeatedFieldBuilderV34.addMessage(sourceCommandRecord4);
                            }
                        } else if (tag == 42) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord5 = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV35 = this.f5492k;
                            if (repeatedFieldBuilderV35 == null) {
                                m3734h();
                                this.f5491j.add(sourceCommandRecord5);
                            } else {
                                repeatedFieldBuilderV35.addMessage(sourceCommandRecord5);
                            }
                        } else if (tag == 50) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord6 = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV36 = this.f5494m;
                            if (repeatedFieldBuilderV36 == null) {
                                m3737k();
                                this.f5493l.add(sourceCommandRecord6);
                            } else {
                                repeatedFieldBuilderV36.addMessage(sourceCommandRecord6);
                            }
                        } else if (tag == 58) {
                            EzyRouterRecord$RouterRecord.SourceCommandRecord sourceCommandRecord7 = (EzyRouterRecord$RouterRecord.SourceCommandRecord) codedInputStream.readMessage(EzyRouterRecord$RouterRecord.SourceCommandRecord.parser(), extensionRegistryLite);
                            RepeatedFieldBuilderV3 repeatedFieldBuilderV37 = this.f5496o;
                            if (repeatedFieldBuilderV37 == null) {
                                m3735i();
                                this.f5495n.add(sourceCommandRecord7);
                            } else {
                                repeatedFieldBuilderV37.addMessage(sourceCommandRecord7);
                            }
                        } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                        }
                    }
                    z8 = true;
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
        return (C4365f0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4365f0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4365f0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4365f0) super.addRepeatedField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ GeneratedMessageV3.Builder clear() {
        m3731e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return (C4365f0) super.clearField(fieldDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4365f0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final AbstractMessageLite.Builder mo13724clone() {
        return (C4365f0) super.mo13724clone();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
    public final MessageLite getDefaultInstanceForType() {
        return EzyRouterRecord$RouterRecord.getDefaultInstance();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3740n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4365f0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
        return (C4365f0) super.setField(fieldDescriptor, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i, Object obj) {
        return (C4365f0) super.setRepeatedField(fieldDescriptor, i, obj);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4365f0) super.setUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder clear() {
        m3731e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return (C4365f0) super.clearOneof(oneofDescriptor);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final GeneratedMessageV3.Builder mo13724clone() {
        return (C4365f0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3740n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return (C4365f0) super.mergeUnknownFields(unknownFieldSet);
    }

    @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final MessageLite build() {
        EzyRouterRecord$RouterRecord ezyRouterRecord$RouterRecordBuildPartial = buildPartial();
        if (ezyRouterRecord$RouterRecordBuildPartial.isInitialized()) {
            return ezyRouterRecord$RouterRecordBuildPartial;
        }
        throw AbstractMessage.Builder.newUninitializedMessageException((Message) ezyRouterRecord$RouterRecordBuildPartial);
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder clear() {
        m3731e();
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final Message.Builder mo13724clone() {
        return (C4365f0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    public final /* bridge */ /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        m3740n(codedInputStream, extensionRegistryLite);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
    /* renamed from: clone */
    public final MessageLite.Builder mo13724clone() {
        return (C4365f0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final AbstractMessage.Builder mergeFrom(Message message) {
        if (message instanceof EzyRouterRecord$RouterRecord) {
            m3739m((EzyRouterRecord$RouterRecord) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }

    @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
    /* renamed from: clone */
    public final Object mo13724clone() {
        return (C4365f0) super.mo13724clone();
    }

    @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
    public final Message.Builder mergeFrom(Message message) {
        if (message instanceof EzyRouterRecord$RouterRecord) {
            m3739m((EzyRouterRecord$RouterRecord) message);
            return this;
        }
        super.mergeFrom(message);
        return this;
    }
}
