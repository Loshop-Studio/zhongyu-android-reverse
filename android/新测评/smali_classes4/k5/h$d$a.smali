.class public final Lk5/h$d$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo8/f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/h$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Lk5/h$h;

.field public final b:Lk5/h$d;

.field public final c:I


# direct methods
.method public constructor <init>(Lk5/h$h;Lk5/h$d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lk5/h$d$a;->a:Lk5/h$h;

    .line 5
    .line 6
    iput-object p2, p0, Lk5/h$d$a;->b:Lk5/h$d;

    .line 7
    .line 8
    iput p3, p0, Lk5/h$d$a;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public get()Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lk5/h$d$a;->c:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-static {}, Ll8/c;->a()Lf8/a;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    .line 11
    .line 12
    iget v1, p0, Lk5/h$d$a;->c:I

    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(I)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method
