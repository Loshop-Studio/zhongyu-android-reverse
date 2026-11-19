.class public final Lb0/c;
.super Ljava/lang/ref/WeakReference;
.source "SourceFile"


# instance fields
.field public final a:Ly/c;

.field public final b:Z

.field public c:Lb0/g0;


# direct methods
.method public constructor <init>(Ly/c;Lb0/a0;Ljava/lang/ref/ReferenceQueue;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 2
    .line 3
    .line 4
    const-string p3, "Argument must not be null"

    .line 5
    .line 6
    invoke-static {p1, p3}, Lv7/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lb0/c;->a:Ly/c;

    .line 10
    .line 11
    iget-boolean p1, p2, Lb0/a0;->a:Z

    .line 12
    .line 13
    const/4 p2, 0x0

    .line 14
    iput-object p2, p0, Lb0/c;->c:Lb0/g0;

    .line 15
    .line 16
    iput-boolean p1, p0, Lb0/c;->b:Z

    .line 17
    .line 18
    return-void
.end method
