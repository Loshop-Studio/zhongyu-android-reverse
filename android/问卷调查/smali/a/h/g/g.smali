.class public La/h/g/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements La/h/i/a;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "La/h/i/a<",
        "La/h/g/j$a;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:La/h/g/c;


# direct methods
.method public constructor <init>(La/h/g/c;)V
    .locals 0

    iput-object p1, p0, La/h/g/g;->a:La/h/g/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, La/h/g/j$a;

    .line 1
    iget-object v0, p0, La/h/g/g;->a:La/h/g/c;

    invoke-virtual {v0, p1}, La/h/g/c;->a(La/h/g/j$a;)V

    return-void
.end method
