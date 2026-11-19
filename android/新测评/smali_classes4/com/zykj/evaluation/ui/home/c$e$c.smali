.class public final Lcom/zykj/evaluation/ui/home/c$e$c;
.super Lcom/zykj/evaluation/ui/home/c$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/ui/home/c$e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/home/c$e$c;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/home/c$e$c;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/home/c$e$c;->e:Lcom/zykj/evaluation/ui/home/c$e$c;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    sget-object v0, Lg7/d;->a:Lg7/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lg7/d;->b()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const-string v2, "\u672c\u5468"

    .line 9
    .line 10
    invoke-direct {p0, v2, v0, v1, v1}, Lcom/zykj/evaluation/ui/home/c$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/home/c$e$c;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x7009b83b

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "ThisWeek"

    return-object v0
.end method
