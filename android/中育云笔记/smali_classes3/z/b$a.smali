.class public final Lz/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(Lz/d;Lw/k;)Lz/c;
    .locals 1

    .line 1
    new-instance v0, Lz/b;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lz/b;-><init>(Lz/d;Lw/k;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
