.class public Ly2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ly2/b;

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(Ly2/b;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ly2/g;->a:Ly2/b;

    .line 5
    .line 6
    iput p2, p0, Ly2/g;->b:I

    .line 7
    .line 8
    iput p3, p0, Ly2/g;->c:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 1
    iget-object v0, p0, Ly2/g;->a:Ly2/b;

    .line 2
    .line 3
    invoke-interface {v0}, Ly2/b;->a()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
