.class public abstract Lcom/zykj/evaluation/ui/home/c$a;
.super Lcom/zykj/evaluation/ui/home/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/evaluation/ui/home/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/evaluation/ui/home/c$a$a;,
        Lcom/zykj/evaluation/ui/home/c$a$b;,
        Lcom/zykj/evaluation/ui/home/c$a$c;,
        Lcom/zykj/evaluation/ui/home/c$a$d;,
        Lcom/zykj/evaluation/ui/home/c$a$e;
    }
.end annotation


# instance fields
.field public final b:Ljava/lang/Integer;

.field public final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p2, v0}, Lcom/zykj/evaluation/ui/home/c;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    iput-object p1, p0, Lcom/zykj/evaluation/ui/home/c$a;->b:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/zykj/evaluation/ui/home/c$a;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/zykj/evaluation/ui/home/c$a;-><init>(Ljava/lang/Integer;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/Integer;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/ui/home/c$a;->b:Ljava/lang/Integer;

    .line 2
    .line 3
    return-object v0
.end method
