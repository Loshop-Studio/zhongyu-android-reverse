.class public final Lcom/zykj/evaluation/ui/home/c$e$d;
.super Lcom/zykj/evaluation/ui/home/c$e;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c$e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# static fields
.field public static final e:Lcom/zykj/evaluation/ui/home/c$e$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/home/c$e$d;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/home/c$e$d;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/home/c$e$d;->e:Lcom/zykj/evaluation/ui/home/c$e$d;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "\u5168\u90e8"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {p0, v0, v1, v1, v1}, Lcom/zykj/evaluation/ui/home/c$e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/home/c$e$d;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x23931578

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Unlimited"

    return-object v0
.end method
