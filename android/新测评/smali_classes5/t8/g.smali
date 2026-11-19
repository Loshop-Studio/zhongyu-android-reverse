.class public final synthetic Lt8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lt8/j;

.field public final synthetic b:Lu8/a;


# direct methods
.method public synthetic constructor <init>(Lt8/j;Lu8/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt8/g;->a:Lt8/j;

    iput-object p2, p0, Lt8/g;->b:Lu8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lt8/g;->a:Lt8/j;

    iget-object v1, p0, Lt8/g;->b:Lu8/a;

    invoke-static {v0, v1}, Lt8/j;->f(Lt8/j;Lu8/a;)V

    return-void
.end method
