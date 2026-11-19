.class public final synthetic Lk2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lk2/k;


# direct methods
.method public synthetic constructor <init>(Lk2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/h;->c:Lk2/k;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-object v0, p0, Lk2/h;->c:Lk2/k;

    invoke-static {v0}, Lk2/k;->g(Lk2/k;)V

    return-void
.end method
