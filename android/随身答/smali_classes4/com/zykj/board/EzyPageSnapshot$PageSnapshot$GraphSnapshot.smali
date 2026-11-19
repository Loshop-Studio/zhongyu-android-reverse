# RE note 本类字节码直接引用的读写或显示接口包括Protobuf。
.class public final Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
.super Lcom/google/protobuf/GeneratedMessageV3;
.source "SourceFile"

# interfaces
.implements Lcom/google/protobuf/MessageOrBuilder;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/board/EzyPageSnapshot$PageSnapshot;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "GraphSnapshot"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    }
.end annotation


# static fields
.field public static final o:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

.field public static final p:Lcom/google/protobuf/Parser;


# instance fields
.field public a:I

.field public volatile b:Ljava/lang/Object;

.field public c:I

.field public d:Lcom/zykj/board/EzyRectF$RectF;

.field public e:Lcom/zykj/board/EzyMatrix$Matrix;

.field public f:Ljava/util/List;

.field public volatile g:Ljava/lang/Object;

.field public h:I

.field public i:I

.field public j:Lcom/zykj/board/EzyPaint$Paint;

.field public volatile k:Ljava/lang/Object;

.field public l:Ljava/util/List;

.field public volatile m:Ljava/lang/Object;

.field public n:B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->o:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 7
    .line 8
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$a;

    .line 9
    .line 10
    invoke-direct {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->p:Lcom/google/protobuf/Parser;

    .line 14
    .line 15
    return-void
.end method

.method private constructor <init>()V
    .locals 3

    .line 11
    invoke-direct {p0}, Lcom/google/protobuf/GeneratedMessageV3;-><init>()V

    .line 12
    const-string v0, ""

    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    .line 13
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 14
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 15
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->h:I

    .line 16
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->i:I

    .line 17
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 18
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    const/4 v2, -0x1

    .line 19
    iput-byte v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->n:B

    .line 20
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 21
    iput v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 22
    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 23
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 24
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 25
    iput-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 26
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V
    .locals 1

    .line 2
    invoke-direct {p0, p1}, Lcom/google/protobuf/GeneratedMessageV3;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    .line 3
    const-string p1, ""

    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 5
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 6
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->h:I

    .line 7
    iput v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->i:I

    .line 8
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 9
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    const/4 p1, -0x1

    .line 10
    iput-byte p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->n:B

    return-void
.end method

.method public synthetic constructor <init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;Lcom/zykj/board/EzyPageSnapshot$a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;-><init>(Lcom/google/protobuf/GeneratedMessageV3$Builder;)V

    return-void
.end method

.method public static synthetic A(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic B(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic C(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 2
    .line 3
    or-int/2addr p1, v0

    .line 4
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 5
    .line 6
    return p1
.end method

.method public static synthetic D()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic E()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic F(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic G(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic H(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic I(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/util/List;)Ljava/util/List;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object p1
.end method

.method public static J()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->o:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    return-object v0
.end method

.method public static Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->o:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b0()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic a(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$2200()Z
    .locals 1

    .line 1
    sget-boolean v0, Lcom/google/protobuf/GeneratedMessageV3;->alwaysUseFieldBuilders:Z

    .line 2
    .line 3
    return v0
.end method

.method public static synthetic c(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic g(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 2
    .line 3
    return p0
.end method

.method public static final getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->c()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public static synthetic k(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic n(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyRectF$RectF;)Lcom/zykj/board/EzyRectF$RectF;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    return-object p1
.end method

.method public static parser()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->p:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public static synthetic q(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyMatrix$Matrix;)Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->e:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic t(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic u(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic v(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->h:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic w(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;I)I
    .locals 0

    .line 1
    iput p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->i:I

    .line 2
    .line 3
    return p1
.end method

.method public static synthetic x(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Lcom/zykj/board/EzyPaint$Paint;)Lcom/zykj/board/EzyPaint$Paint;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    return-object p1
.end method

.method public static synthetic y(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic z(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p1
.end method


# virtual methods
.method public K()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->o:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    return-object v0
.end method

.method public L()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public M()Lcom/zykj/board/EzyGraphEnum$GraphEnum;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 2
    .line 3
    invoke-static {v0}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->c(I)Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->i:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 10
    .line 11
    :cond_0
    return-object v0
.end method

.method public N()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 2
    .line 3
    return v0
.end method

.method public O()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public P()Lcom/zykj/board/EzyMatrix$Matrix;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->e:Lcom/zykj/board/EzyMatrix$Matrix;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyMatrix$Matrix;->x()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public Q()Lcom/zykj/board/EzyRectF$RectF;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->d:Lcom/zykj/board/EzyRectF$RectF;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyRectF$RectF;->n()Lcom/zykj/board/EzyRectF$RectF;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public R()Lcom/zykj/board/EzyPaint$Paint;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->j:Lcom/zykj/board/EzyPaint$Paint;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Lcom/zykj/board/EzyPaint$Paint;->t()Lcom/zykj/board/EzyPaint$Paint;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    return-object v0
.end method

.method public S()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public T()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public U()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public V()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->h:I

    .line 2
    .line 3
    return v0
.end method

.method public W()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x2

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public X()Z
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 2
    .line 3
    and-int/lit8 v0, v0, 0x4

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public Z()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 1

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Y()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method

.method public a0(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 2

    .line 1
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p1, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;-><init>(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public b0()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;
    .locals 2

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->o:Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-ne p0, v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;-><init>(Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 9
    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;-><init>(Lcom/zykj/board/EzyPageSnapshot$a;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;->B(Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    invoke-super {p0, p1}, Lcom/google/protobuf/AbstractMessage;->equals(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    :cond_1
    check-cast p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-nez v1, :cond_2

    .line 30
    .line 31
    return v2

    .line 32
    :cond_2
    iget v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 33
    .line 34
    iget v3, p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 35
    .line 36
    if-eq v1, v3, :cond_3

    .line 37
    .line 38
    return v2

    .line 39
    :cond_3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-eq v1, v3, :cond_4

    .line 48
    .line 49
    return v2

    .line 50
    :cond_4
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_5

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Q()Lcom/zykj/board/EzyRectF$RectF;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Q()Lcom/zykj/board/EzyRectF$RectF;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyRectF$RectF;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_5

    .line 69
    .line 70
    return v2

    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->W()Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->W()Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eq v1, v3, :cond_6

    .line 80
    .line 81
    return v2

    .line 82
    :cond_6
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->W()Z

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-eqz v1, :cond_7

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->P()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->P()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyMatrix$Matrix;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_7

    .line 101
    .line 102
    return v2

    .line 103
    :cond_7
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-nez v1, :cond_8

    .line 116
    .line 117
    return v2

    .line 118
    :cond_8
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->U()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->U()Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_9

    .line 131
    .line 132
    return v2

    .line 133
    :cond_9
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->V()I

    .line 134
    .line 135
    .line 136
    move-result v1

    .line 137
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->V()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eq v1, v3, :cond_a

    .line 142
    .line 143
    return v2

    .line 144
    :cond_a
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eq v1, v3, :cond_b

    .line 153
    .line 154
    return v2

    .line 155
    :cond_b
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->X()Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->X()Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    if-eq v1, v3, :cond_c

    .line 164
    .line 165
    return v2

    .line 166
    :cond_c
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->X()Z

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-eqz v1, :cond_d

    .line 171
    .line 172
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Lcom/zykj/board/EzyPaint$Paint;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Lcom/zykj/board/EzyPaint$Paint;

    .line 177
    .line 178
    .line 179
    move-result-object v3

    .line 180
    invoke-virtual {v1, v3}, Lcom/zykj/board/EzyPaint$Paint;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v1

    .line 184
    if-nez v1, :cond_d

    .line 185
    .line 186
    return v2

    .line 187
    :cond_d
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v1

    .line 199
    if-nez v1, :cond_e

    .line 200
    .line 201
    return v2

    .line 202
    :cond_e
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->T()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->T()Ljava/util/List;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    invoke-interface {v1, v3}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-nez v1, :cond_f

    .line 215
    .line 216
    return v2

    .line 217
    :cond_f
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v1

    .line 221
    invoke-virtual {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v3

    .line 225
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-nez v1, :cond_10

    .line 230
    .line 231
    return v2

    .line 232
    :cond_10
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    invoke-virtual {p1}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    invoke-virtual {v1, p1}, Lcom/google/protobuf/UnknownFieldSet;->equals(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result p1

    .line 244
    if-nez p1, :cond_11

    .line 245
    .line 246
    return v2

    .line 247
    :cond_11
    return v0
.end method

.method public getBackgroundColor()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->i:I

    .line 2
    .line 3
    return v0
.end method

.method public getChildGraphCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getChildGraphList()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContent()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 2
    .line 3
    instance-of v1, v0, Ljava/lang/String;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    return-object v0

    .line 10
    :cond_0
    check-cast v0, Lcom/google/protobuf/ByteString;

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/google/protobuf/ByteString;->toStringUtf8()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 17
    .line 18
    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/Message;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->K()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic getDefaultInstanceForType()Lcom/google/protobuf/MessageLite;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->K()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    move-result-object v0

    return-object v0
.end method

.method public getParserForType()Lcom/google/protobuf/Parser;
    .locals 1

    .line 1
    sget-object v0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->p:Lcom/google/protobuf/Parser;

    .line 2
    .line 3
    return-object v0
.end method

.method public getSerializedSize()I
    .locals 6

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eq v0, v1, :cond_0

    .line 5
    .line 6
    return v0

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v2, v0}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move v0, v1

    .line 25
    :goto_0
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 26
    .line 27
    sget-object v4, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 28
    .line 29
    invoke-virtual {v4}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/4 v5, 0x2

    .line 34
    if-eq v3, v4, :cond_2

    .line 35
    .line 36
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 37
    .line 38
    invoke-static {v5, v3}, Lcom/google/protobuf/CodedOutputStream;->computeEnumSize(II)I

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    add-int/2addr v0, v3

    .line 43
    :cond_2
    iget v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 44
    .line 45
    and-int/2addr v2, v3

    .line 46
    if-eqz v2, :cond_3

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Q()Lcom/zykj/board/EzyRectF$RectF;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    add-int/2addr v0, v2

    .line 58
    :cond_3
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 59
    .line 60
    and-int/2addr v2, v5

    .line 61
    const/4 v3, 0x4

    .line 62
    if-eqz v2, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->P()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 65
    .line 66
    .line 67
    move-result-object v2

    .line 68
    invoke-static {v3, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    add-int/2addr v0, v2

    .line 73
    :cond_4
    move v2, v1

    .line 74
    :goto_1
    iget-object v4, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 75
    .line 76
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-ge v2, v4, :cond_5

    .line 81
    .line 82
    iget-object v4, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 83
    .line 84
    invoke-interface {v4, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    check-cast v4, Lcom/google/protobuf/MessageLite;

    .line 89
    .line 90
    const/4 v5, 0x5

    .line 91
    invoke-static {v5, v4}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    add-int/2addr v0, v4

    .line 96
    add-int/lit8 v2, v2, 0x1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_5
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 100
    .line 101
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v2

    .line 105
    if-nez v2, :cond_6

    .line 106
    .line 107
    const/4 v2, 0x6

    .line 108
    iget-object v4, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 109
    .line 110
    invoke-static {v2, v4}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    add-int/2addr v0, v2

    .line 115
    :cond_6
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->h:I

    .line 116
    .line 117
    if-eqz v2, :cond_7

    .line 118
    .line 119
    const/4 v4, 0x7

    .line 120
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    add-int/2addr v0, v2

    .line 125
    :cond_7
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->i:I

    .line 126
    .line 127
    if-eqz v2, :cond_8

    .line 128
    .line 129
    const/16 v4, 0x8

    .line 130
    .line 131
    invoke-static {v4, v2}, Lcom/google/protobuf/CodedOutputStream;->computeInt32Size(II)I

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    add-int/2addr v0, v2

    .line 136
    :cond_8
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 137
    .line 138
    and-int/2addr v2, v3

    .line 139
    if-eqz v2, :cond_9

    .line 140
    .line 141
    const/16 v2, 0x9

    .line 142
    .line 143
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Lcom/zykj/board/EzyPaint$Paint;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v2, v3}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    add-int/2addr v0, v2

    .line 152
    :cond_9
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-nez v2, :cond_a

    .line 159
    .line 160
    const/16 v2, 0xa

    .line 161
    .line 162
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-static {v2, v3}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 165
    .line 166
    .line 167
    move-result v2

    .line 168
    add-int/2addr v0, v2

    .line 169
    :cond_a
    :goto_2
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 170
    .line 171
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-ge v1, v2, :cond_b

    .line 176
    .line 177
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 178
    .line 179
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    check-cast v2, Lcom/google/protobuf/MessageLite;

    .line 184
    .line 185
    const/16 v3, 0xb

    .line 186
    .line 187
    invoke-static {v3, v2}, Lcom/google/protobuf/CodedOutputStream;->computeMessageSize(ILcom/google/protobuf/MessageLite;)I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    add-int/2addr v0, v2

    .line 192
    add-int/lit8 v1, v1, 0x1

    .line 193
    .line 194
    goto :goto_2

    .line 195
    :cond_b
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 196
    .line 197
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-nez v1, :cond_c

    .line 202
    .line 203
    const/16 v1, 0xc

    .line 204
    .line 205
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 206
    .line 207
    invoke-static {v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->computeStringSize(ILjava/lang/Object;)I

    .line 208
    .line 209
    .line 210
    move-result v1

    .line 211
    add-int/2addr v0, v1

    .line 212
    :cond_c
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    invoke-virtual {v1}, Lcom/google/protobuf/UnknownFieldSet;->getSerializedSize()I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    add-int/2addr v0, v1

    .line 221
    iput v0, p0, Lcom/google/protobuf/AbstractMessage;->memoizedSize:I

    .line 222
    .line 223
    return v0
.end method

.method public hasOutRect()Z
    .locals 2

    .line 1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return v0

    .line 6
    :cond_0
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getDescriptor()Lcom/google/protobuf/Descriptors$Descriptor;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/16 v1, 0x30b

    .line 15
    .line 16
    add-int/2addr v1, v0

    .line 17
    mul-int/lit8 v1, v1, 0x25

    .line 18
    .line 19
    add-int/lit8 v1, v1, 0x1

    .line 20
    .line 21
    mul-int/lit8 v1, v1, 0x35

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->O()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v1, v0

    .line 32
    mul-int/lit8 v1, v1, 0x25

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x2

    .line 35
    .line 36
    mul-int/lit8 v1, v1, 0x35

    .line 37
    .line 38
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 39
    .line 40
    add-int/2addr v1, v0

    .line 41
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->hasOutRect()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    mul-int/lit8 v1, v1, 0x25

    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x3

    .line 50
    .line 51
    mul-int/lit8 v1, v1, 0x35

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Q()Lcom/zykj/board/EzyRectF$RectF;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v0}, Lcom/zykj/board/EzyRectF$RectF;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    add-int/2addr v1, v0

    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->W()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_2

    .line 67
    .line 68
    mul-int/lit8 v1, v1, 0x25

    .line 69
    .line 70
    add-int/lit8 v1, v1, 0x4

    .line 71
    .line 72
    mul-int/lit8 v1, v1, 0x35

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->P()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0}, Lcom/zykj/board/EzyMatrix$Matrix;->hashCode()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    add-int/2addr v1, v0

    .line 83
    :cond_2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphCount()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-lez v0, :cond_3

    .line 88
    .line 89
    mul-int/lit8 v1, v1, 0x25

    .line 90
    .line 91
    add-int/lit8 v1, v1, 0x5

    .line 92
    .line 93
    mul-int/lit8 v1, v1, 0x35

    .line 94
    .line 95
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getChildGraphList()Ljava/util/List;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    add-int/2addr v1, v0

    .line 104
    :cond_3
    mul-int/lit8 v1, v1, 0x25

    .line 105
    .line 106
    add-int/lit8 v1, v1, 0x6

    .line 107
    .line 108
    mul-int/lit8 v1, v1, 0x35

    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->U()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    add-int/2addr v1, v0

    .line 119
    mul-int/lit8 v1, v1, 0x25

    .line 120
    .line 121
    add-int/lit8 v1, v1, 0x7

    .line 122
    .line 123
    mul-int/lit8 v1, v1, 0x35

    .line 124
    .line 125
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->V()I

    .line 126
    .line 127
    .line 128
    move-result v0

    .line 129
    add-int/2addr v1, v0

    .line 130
    mul-int/lit8 v1, v1, 0x25

    .line 131
    .line 132
    add-int/lit8 v1, v1, 0x8

    .line 133
    .line 134
    mul-int/lit8 v1, v1, 0x35

    .line 135
    .line 136
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getBackgroundColor()I

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    add-int/2addr v1, v0

    .line 141
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->X()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-eqz v0, :cond_4

    .line 146
    .line 147
    mul-int/lit8 v1, v1, 0x25

    .line 148
    .line 149
    add-int/lit8 v1, v1, 0x9

    .line 150
    .line 151
    mul-int/lit8 v1, v1, 0x35

    .line 152
    .line 153
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Lcom/zykj/board/EzyPaint$Paint;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0}, Lcom/zykj/board/EzyPaint$Paint;->hashCode()I

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    add-int/2addr v1, v0

    .line 162
    :cond_4
    mul-int/lit8 v1, v1, 0x25

    .line 163
    .line 164
    add-int/lit8 v1, v1, 0xa

    .line 165
    .line 166
    mul-int/lit8 v1, v1, 0x35

    .line 167
    .line 168
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->getContent()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 173
    .line 174
    .line 175
    move-result v0

    .line 176
    add-int/2addr v1, v0

    .line 177
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->S()I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    if-lez v0, :cond_5

    .line 182
    .line 183
    mul-int/lit8 v1, v1, 0x25

    .line 184
    .line 185
    add-int/lit8 v1, v1, 0xb

    .line 186
    .line 187
    mul-int/lit8 v1, v1, 0x35

    .line 188
    .line 189
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->T()Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-interface {v0}, Ljava/util/List;->hashCode()I

    .line 194
    .line 195
    .line 196
    move-result v0

    .line 197
    add-int/2addr v1, v0

    .line 198
    :cond_5
    mul-int/lit8 v1, v1, 0x25

    .line 199
    .line 200
    add-int/lit8 v1, v1, 0xc

    .line 201
    .line 202
    mul-int/lit8 v1, v1, 0x35

    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->L()Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    add-int/2addr v1, v0

    .line 213
    mul-int/lit8 v1, v1, 0x1d

    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Lcom/google/protobuf/UnknownFieldSet;->hashCode()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    add-int/2addr v1, v0

    .line 224
    iput v1, p0, Lcom/google/protobuf/AbstractMessageLite;->memoizedHashCode:I

    .line 225
    .line 226
    return v1
.end method

.method public internalGetFieldAccessorTable()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;
    .locals 3

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyPageSnapshot;->d()Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 6
    .line 7
    const-class v2, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;->ensureFieldAccessorsInitialized(Ljava/lang/Class;Ljava/lang/Class;)Lcom/google/protobuf/GeneratedMessageV3$FieldAccessorTable;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0
.end method

.method public final isInitialized()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->n:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ne v0, v1, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    if-nez v0, :cond_1

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    return v0

    .line 11
    :cond_1
    iput-byte v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->n:B

    .line 12
    .line 13
    return v1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Z()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic newBuilderForType(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/google/protobuf/Message$Builder;
    .locals 0

    .line 2
    invoke-virtual {p0, p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a0(Lcom/google/protobuf/GeneratedMessageV3$BuilderParent;)Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic newBuilderForType()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 3
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Z()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public newInstance(Lcom/google/protobuf/GeneratedMessageV3$UnusedPrivateParameter;)Ljava/lang/Object;
    .locals 0

    .line 1
    new-instance p1, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;

    .line 2
    .line 3
    invoke-direct {p1}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p1
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/Message$Builder;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b0()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic toBuilder()Lcom/google/protobuf/MessageLite$Builder;
    .locals 1

    .line 2
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b0()Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot$b;

    move-result-object v0

    return-object v0
.end method

.method public writeTo(Lcom/google/protobuf/CodedOutputStream;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->b:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1, v1, v0}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 16
    .line 17
    sget-object v2, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->b:Lcom/zykj/board/EzyGraphEnum$GraphEnum;

    .line 18
    .line 19
    invoke-virtual {v2}, Lcom/zykj/board/EzyGraphEnum$GraphEnum;->getNumber()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    const/4 v3, 0x2

    .line 24
    if-eq v0, v2, :cond_1

    .line 25
    .line 26
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->c:I

    .line 27
    .line 28
    invoke-virtual {p1, v3, v0}, Lcom/google/protobuf/CodedOutputStream;->writeEnum(II)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 32
    .line 33
    and-int/2addr v0, v1

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    const/4 v0, 0x3

    .line 37
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->Q()Lcom/zykj/board/EzyRectF$RectF;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 42
    .line 43
    .line 44
    :cond_2
    iget v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 45
    .line 46
    and-int/2addr v0, v3

    .line 47
    const/4 v1, 0x4

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->P()Lcom/zykj/board/EzyMatrix$Matrix;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v1, v0}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 55
    .line 56
    .line 57
    :cond_3
    const/4 v0, 0x0

    .line 58
    move v2, v0

    .line 59
    :goto_0
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 60
    .line 61
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-ge v2, v3, :cond_4

    .line 66
    .line 67
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->f:Ljava/util/List;

    .line 68
    .line 69
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    check-cast v3, Lcom/google/protobuf/MessageLite;

    .line 74
    .line 75
    const/4 v4, 0x5

    .line 76
    invoke-virtual {p1, v4, v3}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 77
    .line 78
    .line 79
    add-int/lit8 v2, v2, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_4
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {v2}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-nez v2, :cond_5

    .line 89
    .line 90
    const/4 v2, 0x6

    .line 91
    iget-object v3, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->g:Ljava/lang/Object;

    .line 92
    .line 93
    invoke-static {p1, v2, v3}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    :cond_5
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->h:I

    .line 97
    .line 98
    if-eqz v2, :cond_6

    .line 99
    .line 100
    const/4 v3, 0x7

    .line 101
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 102
    .line 103
    .line 104
    :cond_6
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->i:I

    .line 105
    .line 106
    if-eqz v2, :cond_7

    .line 107
    .line 108
    const/16 v3, 0x8

    .line 109
    .line 110
    invoke-virtual {p1, v3, v2}, Lcom/google/protobuf/CodedOutputStream;->writeInt32(II)V

    .line 111
    .line 112
    .line 113
    :cond_7
    iget v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->a:I

    .line 114
    .line 115
    and-int/2addr v1, v2

    .line 116
    if-eqz v1, :cond_8

    .line 117
    .line 118
    const/16 v1, 0x9

    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->R()Lcom/zykj/board/EzyPaint$Paint;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {p1, v1, v2}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 125
    .line 126
    .line 127
    :cond_8
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 128
    .line 129
    invoke-static {v1}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    if-nez v1, :cond_9

    .line 134
    .line 135
    const/16 v1, 0xa

    .line 136
    .line 137
    iget-object v2, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->k:Ljava/lang/Object;

    .line 138
    .line 139
    invoke-static {p1, v1, v2}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    :cond_9
    :goto_1
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 143
    .line 144
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-ge v0, v1, :cond_a

    .line 149
    .line 150
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->l:Ljava/util/List;

    .line 151
    .line 152
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    check-cast v1, Lcom/google/protobuf/MessageLite;

    .line 157
    .line 158
    const/16 v2, 0xb

    .line 159
    .line 160
    invoke-virtual {p1, v2, v1}, Lcom/google/protobuf/CodedOutputStream;->writeMessage(ILcom/google/protobuf/MessageLite;)V

    .line 161
    .line 162
    .line 163
    add-int/lit8 v0, v0, 0x1

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_a
    iget-object v0, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 167
    .line 168
    invoke-static {v0}, Lcom/google/protobuf/GeneratedMessageV3;->isStringEmpty(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_b

    .line 173
    .line 174
    const/16 v0, 0xc

    .line 175
    .line 176
    iget-object v1, p0, Lcom/zykj/board/EzyPageSnapshot$PageSnapshot$GraphSnapshot;->m:Ljava/lang/Object;

    .line 177
    .line 178
    invoke-static {p1, v0, v1}, Lcom/google/protobuf/GeneratedMessageV3;->writeString(Lcom/google/protobuf/CodedOutputStream;ILjava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_b
    invoke-virtual {p0}, Lcom/google/protobuf/GeneratedMessageV3;->getUnknownFields()Lcom/google/protobuf/UnknownFieldSet;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0, p1}, Lcom/google/protobuf/UnknownFieldSet;->writeTo(Lcom/google/protobuf/CodedOutputStream;)V

    .line 186
    .line 187
    .line 188
    return-void
.end method
