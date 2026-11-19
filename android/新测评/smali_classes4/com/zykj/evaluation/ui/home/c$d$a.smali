.class public final Lcom/zykj/evaluation/ui/home/c$d$a;
.super Lcom/zykj/evaluation/ui/home/c$d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field public static final d:Lcom/zykj/evaluation/ui/home/c$d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/zykj/evaluation/ui/home/c$d$a;

    invoke-direct {v0}, Lcom/zykj/evaluation/ui/home/c$d$a;-><init>()V

    sput-object v0, Lcom/zykj/evaluation/ui/home/c$d$a;->d:Lcom/zykj/evaluation/ui/home/c$d$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    const-string v2, "\u5168\u90e8"

    .line 4
    .line 5
    invoke-direct {p0, v0, v1, v2}, Lcom/zykj/evaluation/ui/home/c$d;-><init>(JLjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lcom/zykj/evaluation/ui/home/c$d$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public hashCode()I
    .locals 1

    const v0, 0x4be20e7

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Unlimited"

    return-object v0
.end method
