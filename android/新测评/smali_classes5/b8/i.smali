.class public final synthetic Lb8/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lb8/q;


# direct methods
.method public synthetic constructor <init>(Lb8/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb8/i;->a:Lb8/q;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb8/i;->a:Lb8/q;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lb8/q;->c(Lb8/q;Landroid/net/Uri;)V

    return-void
.end method
