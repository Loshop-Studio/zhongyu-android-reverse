.class public final synthetic Lq8/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lq8/g;

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lu8/a;


# direct methods
.method public synthetic constructor <init>(Lq8/g;Ljava/lang/Object;Lu8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq8/f;->a:Lq8/g;

    iput-object p2, p0, Lq8/f;->b:Ljava/lang/Object;

    iput-object p3, p0, Lq8/f;->c:Lu8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lq8/f;->a:Lq8/g;

    iget-object v1, p0, Lq8/f;->b:Ljava/lang/Object;

    iget-object v2, p0, Lq8/f;->c:Lu8/a;

    invoke-static {v0, v1, v2}, Lq8/g;->d(Lq8/g;Ljava/lang/Object;Lu8/a;)V

    return-void
.end method
