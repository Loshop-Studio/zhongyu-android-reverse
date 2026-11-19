.class public final synthetic Lm7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lm7/n;


# direct methods
.method public synthetic constructor <init>(Lm7/n;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm7/g;->a:Lm7/n;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lm7/g;->a:Lm7/n;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lm7/n;->f(Lm7/n;Landroid/net/Uri;)V

    return-void
.end method
