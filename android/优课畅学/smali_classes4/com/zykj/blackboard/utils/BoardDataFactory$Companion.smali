# RE note 组装 Sketch 的 BoardHead、BoardBody 与独立 Header。buildHead 设置所写版本。
.class public final Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/blackboard/utils/BoardDataFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/zykj/blackboard/utils/BoardDataFactory$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final buildHead(IILjava/lang/Long;JLcom/zykj/board/EzyHeader$Author;Ljava/util/List;)Lcom/zykj/board/EzyHeader$Header;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/lang/Long;",
            "J",
            "Lcom/zykj/board/EzyHeader$Author;",
            "Ljava/util/List<",
            "Lcom/zykj/board/EzyHeader$Author;",
            ">;)",
            "Lcom/zykj/board/EzyHeader$Header;"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/zykj/board/EzyHeader$Header;->J()Lcom/zykj/board/EzyHeader$Header$b;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x6

    .line 6
    invoke-virtual {v0, v1}, Lcom/zykj/board/EzyHeader$Header$b;->Y(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/zykj/board/EzyHeader$Header$b;->Z(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Lcom/zykj/board/EzyHeader$Header$b;->R(I)Lcom/zykj/board/EzyHeader$Header$b;

    .line 13
    .line 14
    .line 15
    new-instance p1, Ljava/util/Date;

    .line 16
    .line 17
    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 21
    .line 22
    .line 23
    move-result-wide p1

    .line 24
    invoke-virtual {v0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->M(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p4, p5}, Lcom/zykj/board/EzyHeader$Header$b;->P(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 28
    .line 29
    .line 30
    if-eqz p3, :cond_0

    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide p1

    .line 36
    invoke-virtual {v0, p1, p2}, Lcom/zykj/board/EzyHeader$Header$b;->X(J)Lcom/zykj/board/EzyHeader$Header$b;

    .line 37
    .line 38
    .line 39
    :cond_0
    if-eqz p6, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0, p6}, Lcom/zykj/board/EzyHeader$Header$b;->L(Lcom/zykj/board/EzyHeader$Author;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 42
    .line 43
    .line 44
    :cond_1
    if-eqz p7, :cond_2

    .line 45
    .line 46
    invoke-virtual {v0, p7}, Lcom/zykj/board/EzyHeader$Header$b;->c(Ljava/lang/Iterable;)Lcom/zykj/board/EzyHeader$Header$b;

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0}, Lcom/zykj/board/EzyHeader$Header$b;->g()Lcom/zykj/board/EzyHeader$Header;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const-string p2, "header.build()"

    .line 54
    .line 55
    invoke-static {p1, p2}, Lkotlin/jvm/internal/u;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object p1
.end method
