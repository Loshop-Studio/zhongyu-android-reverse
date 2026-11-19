.class public final synthetic Lc2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lcom/zykj/subscriber/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/subscriber/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/j;->a:Lcom/zykj/subscriber/MainActivity;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lc2/j;->a:Lcom/zykj/subscriber/MainActivity;

    invoke-static {v0}, Lcom/zykj/subscriber/MainActivity;->j(Lcom/zykj/subscriber/MainActivity;)V

    return-void
.end method
