package com.zykj.view;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class EzySimpleBoardData {

    /* renamed from: com.zykj.view.EzySimpleBoardData$1 */
    public static /* synthetic */ class C52791 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f8185xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f8185xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8185xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8185xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8185xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8185xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8185xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8185xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class Paint extends GeneratedMessageLite<Paint, Builder> implements PaintOrBuilder {
        public static final int COLOR_FIELD_NUMBER = 2;
        private static final Paint DEFAULT_INSTANCE;
        public static final int ISDASHED_FIELD_NUMBER = 3;
        private static volatile Parser<Paint> PARSER = null;
        public static final int WIDTH_FIELD_NUMBER = 1;
        private int color_;
        private boolean isDashed_;
        private float width_;

        public static final class Builder extends GeneratedMessageLite.Builder<Paint, Builder> implements PaintOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder clearColor() {
                copyOnWrite();
                ((Paint) this.instance).clearColor();
                return this;
            }

            public Builder clearIsDashed() {
                copyOnWrite();
                ((Paint) this.instance).clearIsDashed();
                return this;
            }

            public Builder clearWidth() {
                copyOnWrite();
                ((Paint) this.instance).clearWidth();
                return this;
            }

            @Override // com.zykj.view.EzySimpleBoardData.PaintOrBuilder
            public int getColor() {
                return ((Paint) this.instance).getColor();
            }

            @Override // com.zykj.view.EzySimpleBoardData.PaintOrBuilder
            public boolean getIsDashed() {
                return ((Paint) this.instance).getIsDashed();
            }

            @Override // com.zykj.view.EzySimpleBoardData.PaintOrBuilder
            public float getWidth() {
                return ((Paint) this.instance).getWidth();
            }

            public Builder setColor(int i) {
                copyOnWrite();
                ((Paint) this.instance).setColor(i);
                return this;
            }

            public Builder setIsDashed(boolean z8) {
                copyOnWrite();
                ((Paint) this.instance).setIsDashed(z8);
                return this;
            }

            public Builder setWidth(float f) {
                copyOnWrite();
                ((Paint) this.instance).setWidth(f);
                return this;
            }

            private Builder() {
                super(Paint.DEFAULT_INSTANCE);
            }
        }

        static {
            Paint paint = new Paint();
            DEFAULT_INSTANCE = paint;
            GeneratedMessageLite.registerDefaultInstance(Paint.class, paint);
        }

        private Paint() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearColor() {
            this.color_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsDashed() {
            this.isDashed_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWidth() {
            this.width_ = 0.0f;
        }

        public static Paint getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Paint parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Paint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Paint parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Paint> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColor(int i) {
            this.color_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsDashed(boolean z8) {
            this.isDashed_ = z8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWidth(float f) {
            this.width_ = f;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C52791.f8185xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Paint();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0004\u0003\u0007", new Object[]{"width_", "color_", "isDashed_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Paint> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Paint.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.zykj.view.EzySimpleBoardData.PaintOrBuilder
        public int getColor() {
            return this.color_;
        }

        @Override // com.zykj.view.EzySimpleBoardData.PaintOrBuilder
        public boolean getIsDashed() {
            return this.isDashed_;
        }

        @Override // com.zykj.view.EzySimpleBoardData.PaintOrBuilder
        public float getWidth() {
            return this.width_;
        }

        public static Builder newBuilder(Paint paint) {
            return DEFAULT_INSTANCE.createBuilder(paint);
        }

        public static Paint parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Paint) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Paint parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Paint parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Paint parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Paint parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Paint parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Paint parseFrom(InputStream inputStream) throws IOException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Paint parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Paint parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Paint parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Paint) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PaintOrBuilder extends MessageLiteOrBuilder {
        int getColor();

        boolean getIsDashed();

        float getWidth();
    }

    public static final class Path extends GeneratedMessageLite<Path, Builder> implements PathOrBuilder {
        private static final Path DEFAULT_INSTANCE;
        public static final int PAINT_FIELD_NUMBER = 2;
        private static volatile Parser<Path> PARSER = null;
        public static final int POINT_FIELD_NUMBER = 1;
        private int bitField0_;
        private Paint paint_;
        private Internal.ProtobufList<PointF> point_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<Path, Builder> implements PathOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAllPoint(Iterable<? extends PointF> iterable) {
                copyOnWrite();
                ((Path) this.instance).addAllPoint(iterable);
                return this;
            }

            public Builder addPoint(PointF pointF) {
                copyOnWrite();
                ((Path) this.instance).addPoint(pointF);
                return this;
            }

            public Builder clearPaint() {
                copyOnWrite();
                ((Path) this.instance).clearPaint();
                return this;
            }

            public Builder clearPoint() {
                copyOnWrite();
                ((Path) this.instance).clearPoint();
                return this;
            }

            @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
            public Paint getPaint() {
                return ((Path) this.instance).getPaint();
            }

            @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
            public PointF getPoint(int i) {
                return ((Path) this.instance).getPoint(i);
            }

            @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
            public int getPointCount() {
                return ((Path) this.instance).getPointCount();
            }

            @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
            public List<PointF> getPointList() {
                return Collections.unmodifiableList(((Path) this.instance).getPointList());
            }

            @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
            public boolean hasPaint() {
                return ((Path) this.instance).hasPaint();
            }

            public Builder mergePaint(Paint paint) {
                copyOnWrite();
                ((Path) this.instance).mergePaint(paint);
                return this;
            }

            public Builder removePoint(int i) {
                copyOnWrite();
                ((Path) this.instance).removePoint(i);
                return this;
            }

            public Builder setPaint(Paint paint) {
                copyOnWrite();
                ((Path) this.instance).setPaint(paint);
                return this;
            }

            public Builder setPoint(int i, PointF pointF) {
                copyOnWrite();
                ((Path) this.instance).setPoint(i, pointF);
                return this;
            }

            private Builder() {
                super(Path.DEFAULT_INSTANCE);
            }

            public Builder addPoint(int i, PointF pointF) {
                copyOnWrite();
                ((Path) this.instance).addPoint(i, pointF);
                return this;
            }

            public Builder setPaint(Paint.Builder builder) {
                copyOnWrite();
                ((Path) this.instance).setPaint(builder.build());
                return this;
            }

            public Builder setPoint(int i, PointF.Builder builder) {
                copyOnWrite();
                ((Path) this.instance).setPoint(i, builder.build());
                return this;
            }

            public Builder addPoint(PointF.Builder builder) {
                copyOnWrite();
                ((Path) this.instance).addPoint(builder.build());
                return this;
            }

            public Builder addPoint(int i, PointF.Builder builder) {
                copyOnWrite();
                ((Path) this.instance).addPoint(i, builder.build());
                return this;
            }
        }

        static {
            Path path = new Path();
            DEFAULT_INSTANCE = path;
            GeneratedMessageLite.registerDefaultInstance(Path.class, path);
        }

        private Path() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPoint(Iterable<? extends PointF> iterable) {
            ensurePointIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.point_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPoint(PointF pointF) {
            pointF.getClass();
            ensurePointIsMutable();
            this.point_.add(pointF);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaint() {
            this.paint_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPoint() {
            this.point_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensurePointIsMutable() {
            Internal.ProtobufList<PointF> protobufList = this.point_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.point_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Path getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergePaint(Paint paint) {
            paint.getClass();
            Paint paint2 = this.paint_;
            if (paint2 == null || paint2 == Paint.getDefaultInstance()) {
                this.paint_ = paint;
            } else {
                this.paint_ = Paint.newBuilder(this.paint_).mergeFrom((Paint.Builder) paint).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Path parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (Path) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Path parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Path> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePoint(int i) {
            ensurePointIsMutable();
            this.point_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaint(Paint paint) {
            paint.getClass();
            this.paint_ = paint;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPoint(int i, PointF pointF) {
            pointF.getClass();
            ensurePointIsMutable();
            this.point_.set(i, pointF);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C52791.f8185xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new Path();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"bitField0_", "point_", PointF.class, "paint_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Path> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Path.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
        public Paint getPaint() {
            Paint paint = this.paint_;
            return paint == null ? Paint.getDefaultInstance() : paint;
        }

        @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
        public PointF getPoint(int i) {
            return this.point_.get(i);
        }

        @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
        public int getPointCount() {
            return this.point_.size();
        }

        @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
        public List<PointF> getPointList() {
            return this.point_;
        }

        public PointFOrBuilder getPointOrBuilder(int i) {
            return this.point_.get(i);
        }

        public List<? extends PointFOrBuilder> getPointOrBuilderList() {
            return this.point_;
        }

        @Override // com.zykj.view.EzySimpleBoardData.PathOrBuilder
        public boolean hasPaint() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(Path path) {
            return DEFAULT_INSTANCE.createBuilder(path);
        }

        public static Path parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Path) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Path parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Path parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPoint(int i, PointF pointF) {
            pointF.getClass();
            ensurePointIsMutable();
            this.point_.add(i, pointF);
        }

        public static Path parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Path parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Path parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Path parseFrom(InputStream inputStream) throws IOException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Path parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Path parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Path parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (Path) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PathOrBuilder extends MessageLiteOrBuilder {
        Paint getPaint();

        PointF getPoint(int i);

        int getPointCount();

        List<PointF> getPointList();

        boolean hasPaint();
    }

    public static final class PointF extends GeneratedMessageLite<PointF, Builder> implements PointFOrBuilder {
        private static final PointF DEFAULT_INSTANCE;
        private static volatile Parser<PointF> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 1;
        private int valueMemoizedSerializedSize = -1;
        private Internal.FloatList value_ = GeneratedMessageLite.emptyFloatList();

        public static final class Builder extends GeneratedMessageLite.Builder<PointF, Builder> implements PointFOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAllValue(Iterable<? extends Float> iterable) {
                copyOnWrite();
                ((PointF) this.instance).addAllValue(iterable);
                return this;
            }

            public Builder addValue(float f) {
                copyOnWrite();
                ((PointF) this.instance).addValue(f);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((PointF) this.instance).clearValue();
                return this;
            }

            @Override // com.zykj.view.EzySimpleBoardData.PointFOrBuilder
            public float getValue(int i) {
                return ((PointF) this.instance).getValue(i);
            }

            @Override // com.zykj.view.EzySimpleBoardData.PointFOrBuilder
            public int getValueCount() {
                return ((PointF) this.instance).getValueCount();
            }

            @Override // com.zykj.view.EzySimpleBoardData.PointFOrBuilder
            public List<Float> getValueList() {
                return Collections.unmodifiableList(((PointF) this.instance).getValueList());
            }

            public Builder setValue(int i, float f) {
                copyOnWrite();
                ((PointF) this.instance).setValue(i, f);
                return this;
            }

            private Builder() {
                super(PointF.DEFAULT_INSTANCE);
            }
        }

        static {
            PointF pointF = new PointF();
            DEFAULT_INSTANCE = pointF;
            GeneratedMessageLite.registerDefaultInstance(PointF.class, pointF);
        }

        private PointF() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllValue(Iterable<? extends Float> iterable) {
            ensureValueIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addValue(float f) {
            ensureValueIsMutable();
            this.value_.addFloat(f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = GeneratedMessageLite.emptyFloatList();
        }

        private void ensureValueIsMutable() {
            Internal.FloatList floatList = this.value_;
            if (floatList.isModifiable()) {
                return;
            }
            this.value_ = GeneratedMessageLite.mutableCopy(floatList);
        }

        public static PointF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static PointF parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PointF) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PointF parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<PointF> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(int i, float f) {
            ensureValueIsMutable();
            this.value_.setFloat(i, f);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C52791.f8185xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new PointF();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001$", new Object[]{"value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<PointF> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (PointF.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.zykj.view.EzySimpleBoardData.PointFOrBuilder
        public float getValue(int i) {
            return this.value_.getFloat(i);
        }

        @Override // com.zykj.view.EzySimpleBoardData.PointFOrBuilder
        public int getValueCount() {
            return this.value_.size();
        }

        @Override // com.zykj.view.EzySimpleBoardData.PointFOrBuilder
        public List<Float> getValueList() {
            return this.value_;
        }

        public static Builder newBuilder(PointF pointF) {
            return DEFAULT_INSTANCE.createBuilder(pointF);
        }

        public static PointF parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointF) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PointF parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static PointF parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static PointF parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static PointF parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static PointF parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static PointF parseFrom(InputStream inputStream) throws IOException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static PointF parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static PointF parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static PointF parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (PointF) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface PointFOrBuilder extends MessageLiteOrBuilder {
        float getValue(int i);

        int getValueCount();

        List<Float> getValueList();
    }

    public static final class SimpleBoardData extends GeneratedMessageLite<SimpleBoardData, Builder> implements SimpleBoardDataOrBuilder {
        private static final SimpleBoardData DEFAULT_INSTANCE;
        private static volatile Parser<SimpleBoardData> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        private Internal.ProtobufList<Path> path_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<SimpleBoardData, Builder> implements SimpleBoardDataOrBuilder {
            public /* synthetic */ Builder(int i) {
                this();
            }

            public Builder addAllPath(Iterable<? extends Path> iterable) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).addAllPath(iterable);
                return this;
            }

            public Builder addPath(Path path) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).addPath(path);
                return this;
            }

            public Builder clearPath() {
                copyOnWrite();
                ((SimpleBoardData) this.instance).clearPath();
                return this;
            }

            @Override // com.zykj.view.EzySimpleBoardData.SimpleBoardDataOrBuilder
            public Path getPath(int i) {
                return ((SimpleBoardData) this.instance).getPath(i);
            }

            @Override // com.zykj.view.EzySimpleBoardData.SimpleBoardDataOrBuilder
            public int getPathCount() {
                return ((SimpleBoardData) this.instance).getPathCount();
            }

            @Override // com.zykj.view.EzySimpleBoardData.SimpleBoardDataOrBuilder
            public List<Path> getPathList() {
                return Collections.unmodifiableList(((SimpleBoardData) this.instance).getPathList());
            }

            public Builder removePath(int i) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).removePath(i);
                return this;
            }

            public Builder setPath(int i, Path path) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).setPath(i, path);
                return this;
            }

            private Builder() {
                super(SimpleBoardData.DEFAULT_INSTANCE);
            }

            public Builder addPath(int i, Path path) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).addPath(i, path);
                return this;
            }

            public Builder setPath(int i, Path.Builder builder) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).setPath(i, builder.build());
                return this;
            }

            public Builder addPath(Path.Builder builder) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).addPath(builder.build());
                return this;
            }

            public Builder addPath(int i, Path.Builder builder) {
                copyOnWrite();
                ((SimpleBoardData) this.instance).addPath(i, builder.build());
                return this;
            }
        }

        static {
            SimpleBoardData simpleBoardData = new SimpleBoardData();
            DEFAULT_INSTANCE = simpleBoardData;
            GeneratedMessageLite.registerDefaultInstance(SimpleBoardData.class, simpleBoardData);
        }

        private SimpleBoardData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Path> iterable) {
            ensurePathIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(Path path) {
            path.getClass();
            ensurePathIsMutable();
            this.path_.add(path);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensurePathIsMutable() {
            Internal.ProtobufList<Path> protobufList = this.path_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static SimpleBoardData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SimpleBoardData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SimpleBoardData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SimpleBoardData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SimpleBoardData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removePath(int i) {
            ensurePathIsMutable();
            this.path_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i, Path path) {
            path.getClass();
            ensurePathIsMutable();
            this.path_.set(i, path);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C52791.f8185xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new SimpleBoardData();
                case 2:
                    return new Builder(0);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"path_", Path.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SimpleBoardData> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SimpleBoardData.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.zykj.view.EzySimpleBoardData.SimpleBoardDataOrBuilder
        public Path getPath(int i) {
            return this.path_.get(i);
        }

        @Override // com.zykj.view.EzySimpleBoardData.SimpleBoardDataOrBuilder
        public int getPathCount() {
            return this.path_.size();
        }

        @Override // com.zykj.view.EzySimpleBoardData.SimpleBoardDataOrBuilder
        public List<Path> getPathList() {
            return this.path_;
        }

        public PathOrBuilder getPathOrBuilder(int i) {
            return this.path_.get(i);
        }

        public List<? extends PathOrBuilder> getPathOrBuilderList() {
            return this.path_;
        }

        public static Builder newBuilder(SimpleBoardData simpleBoardData) {
            return DEFAULT_INSTANCE.createBuilder(simpleBoardData);
        }

        public static SimpleBoardData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimpleBoardData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SimpleBoardData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SimpleBoardData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i, Path path) {
            path.getClass();
            ensurePathIsMutable();
            this.path_.add(i, path);
        }

        public static SimpleBoardData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SimpleBoardData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SimpleBoardData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SimpleBoardData parseFrom(InputStream inputStream) throws IOException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SimpleBoardData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SimpleBoardData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SimpleBoardData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (SimpleBoardData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface SimpleBoardDataOrBuilder extends MessageLiteOrBuilder {
        Path getPath(int i);

        int getPathCount();

        List<Path> getPathList();
    }

    private EzySimpleBoardData() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
