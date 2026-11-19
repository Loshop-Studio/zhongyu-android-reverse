.class public final synthetic Lk2/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic c:Lk2/k;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lk2/k;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk2/b;->c:Lk2/k;

    iput-object p2, p0, Lk2/b;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk2/b;->c:Lk2/k;

    iget-object v1, p0, Lk2/b;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lk2/k;->e(Lk2/k;Ljava/lang/String;)V

    return-void
.end method
