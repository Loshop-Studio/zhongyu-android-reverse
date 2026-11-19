.class public final synthetic Lt4/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/l;


# instance fields
.field public final synthetic a:Lcom/zykj/study/repository/SubscribeRepository;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/study/repository/SubscribeRepository;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/i;->a:Lcom/zykj/study/repository/SubscribeRepository;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lt4/i;->a:Lcom/zykj/study/repository/SubscribeRepository;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {v0, p1}, Lcom/zykj/study/repository/SubscribeRepository;->a(Lcom/zykj/study/repository/SubscribeRepository;I)Lh7/p;

    move-result-object p1

    return-object p1
.end method
