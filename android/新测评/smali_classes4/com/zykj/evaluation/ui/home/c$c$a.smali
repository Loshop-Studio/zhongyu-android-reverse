.class public final Lcom/zykj/evaluation/ui/home/c$c$a;
.super Lcom/zykj/evaluation/ui/home/c$c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final d:Lcom/zykj/evaluation/ui/home/c$c$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/home/c$c$a;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/home/c$c$a;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/home/c$c$a;->d:Lcom/zykj/evaluation/ui/home/c$c$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    const-string v1, "\u672a\u903e\u671f"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {p0, v0, v1, v2}, Lcom/zykj/evaluation/ui/home/c$c;-><init>(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/home/c$c$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x1b73cb79

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "NotOverdue"

    return-object v0
.end method
