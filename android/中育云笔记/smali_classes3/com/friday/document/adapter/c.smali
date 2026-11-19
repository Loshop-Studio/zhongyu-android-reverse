.class public abstract Lcom/friday/document/adapter/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/friday/document/adapter/c$a;,
        Lcom/friday/document/adapter/c$b;,
        Lcom/friday/document/adapter/c$c;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/friday/document/adapter/c;->a:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILkotlin/jvm/internal/n;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 3
    const-string p1, ""

    :cond_0
    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/friday/document/adapter/c;-><init>(Ljava/lang/String;Lkotlin/jvm/internal/n;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/n;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/friday/document/adapter/c;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/friday/document/adapter/c;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
