.class public final synthetic La2/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/friday/common/activity/RequestScreenCastActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/activity/RequestScreenCastActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La2/f;->a:Lcom/friday/common/activity/RequestScreenCastActivity;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, La2/f;->a:Lcom/friday/common/activity/RequestScreenCastActivity;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/friday/common/activity/RequestScreenCastActivity;->L(Lcom/friday/common/activity/RequestScreenCastActivity;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
