.class public Ly/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly/e;


# static fields
.field public static final a:Ly/g;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ly/g;

    .line 2
    .line 3
    invoke-direct {v0}, Ly/g;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ly/g;->a:Ly/g;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b()Ly/e;
    .locals 1

    .line 1
    sget-object v0, Ly/g;->a:Ly/g;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public a(Lm/j;Lj/d;)Lm/j;
    .locals 0

    .line 1
    return-object p1
.end method
