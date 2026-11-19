.class public final Lo2/c$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo2/c;->h(Landroid/content/Context;Lr2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Lr2/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lr2/a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lo2/c$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    iput-object p2, p0, Lo2/c$b;->b:Lr2/a;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lo2/c$b;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {v0}, Lg2/t0;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lo2/c$b;->b:Lr2/a;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-interface {v1, v0}, Lr2/a;->a(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
