.class public final synthetic Ls5/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/blankj/utilcode/util/PermissionUtils$SingleCallback;


# instance fields
.field public final synthetic a:Lkotlin/jvm/functions/Function0;

.field public final synthetic b:Lcom/zykj/evaluation/ui/MainFragment;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/MainFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls5/n;->a:Lkotlin/jvm/functions/Function0;

    iput-object p2, p0, Ls5/n;->b:Lcom/zykj/evaluation/ui/MainFragment;

    return-void
.end method


# virtual methods
.method public final callback(ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V
    .locals 6

    .line 1
    iget-object v0, p0, Ls5/n;->a:Lkotlin/jvm/functions/Function0;

    iget-object v1, p0, Ls5/n;->b:Lcom/zykj/evaluation/ui/MainFragment;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/zykj/evaluation/ui/MainFragment;->h0(Lkotlin/jvm/functions/Function0;Lcom/zykj/evaluation/ui/MainFragment;ZLjava/util/List;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method
