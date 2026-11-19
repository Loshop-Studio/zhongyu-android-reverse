.class public final Lz5/b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz5/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lz5/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# static fields
.field public static final a:Lz5/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lz5/b$b;

    .line 2
    .line 3
    invoke-direct {v0}, Lz5/b$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz5/b$b;->a:Lz5/b$b;

    .line 7
    .line 8
    return-void
.end method

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
.method public a(Lf5/c0;)Lf5/c0;
    .locals 0

    .line 1
    return-object p1
.end method

.method public bridge synthetic convert(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lf5/c0;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lz5/b$b;->a(Lf5/c0;)Lf5/c0;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
