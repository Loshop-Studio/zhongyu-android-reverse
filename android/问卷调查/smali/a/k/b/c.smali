.class public La/k/b/c;
.super La/k/b/z0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/k/b/c$d;,
        La/k/b/c$b;,
        La/k/b/c$c;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 0

    invoke-direct {p0, p1}, La/k/b/z0;-><init>(Landroid/view/ViewGroup;)V

    return-void
.end method


# virtual methods
.method public b(Ljava/util/List;Z)V
    .locals 39
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/k/b/z0$d;",
            ">;Z)V"
        }
    .end annotation

    move-object/from16 v7, p0

    move/from16 v6, p2

    sget-object v8, La/k/b/z0$d$c;->d:La/k/b/z0$d$c;

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v10, La/k/b/z0$d$c;->c:La/k/b/z0$d$c;

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v11, v1

    move-object v12, v2

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/k/b/z0$d;

    .line 1
    iget-object v4, v1, La/k/b/z0$d;->c:La/k/b/m;

    .line 2
    iget-object v4, v4, La/k/b/m;->G:Landroid/view/View;

    invoke-static {v4}, La/k/b/z0$d$c;->c(Landroid/view/View;)La/k/b/z0$d$c;

    move-result-object v4

    .line 3
    iget-object v5, v1, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    .line 4
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_2

    if-eq v5, v3, :cond_1

    if-eq v5, v2, :cond_2

    const/4 v2, 0x3

    if-eq v5, v2, :cond_2

    goto :goto_0

    :cond_1
    if-eq v4, v10, :cond_0

    move-object v12, v1

    goto :goto_0

    :cond_2
    if-ne v4, v10, :cond_0

    if-nez v11, :cond_0

    move-object v11, v1

    goto :goto_0

    :cond_3
    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    move-object/from16 v0, p1

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/k/b/z0$d;

    new-instance v2, La/h/f/a;

    invoke-direct {v2}, La/h/f/a;-><init>()V

    .line 5
    invoke-virtual {v1}, La/k/b/z0$d;->d()V

    iget-object v4, v1, La/k/b/z0$d;->e:Ljava/util/HashSet;

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 6
    new-instance v4, La/k/b/c$b;

    invoke-direct {v4, v1, v2, v6}, La/k/b/c$b;-><init>(La/k/b/z0$d;La/h/f/a;Z)V

    invoke-virtual {v13, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, La/h/f/a;

    invoke-direct {v2}, La/h/f/a;-><init>()V

    .line 7
    invoke-virtual {v1}, La/k/b/z0$d;->d()V

    iget-object v4, v1, La/k/b/z0$d;->e:Ljava/util/HashSet;

    invoke-virtual {v4, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 8
    new-instance v4, La/k/b/c$d;

    if-eqz v6, :cond_4

    if-ne v1, v11, :cond_5

    goto :goto_2

    :cond_4
    if-ne v1, v12, :cond_5

    :goto_2
    move v5, v3

    goto :goto_3

    :cond_5
    const/4 v5, 0x0

    :goto_3
    invoke-direct {v4, v1, v2, v6, v5}, La/k/b/c$d;-><init>(La/k/b/z0$d;La/h/f/a;ZZ)V

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v2, La/k/b/c$a;

    invoke-direct {v2, v7, v15, v1}, La/k/b/c$a;-><init>(La/k/b/c;Ljava/util/List;La/k/b/z0$d;)V

    .line 9
    iget-object v1, v1, La/k/b/z0$d;->d:Ljava/util/List;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 10
    :cond_6
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move-object v3, v1

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_e

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/k/b/c$d;

    invoke-virtual {v1}, La/k/b/c$c;->b()Z

    move-result v2

    if-eqz v2, :cond_7

    move-object/from16 p1, v0

    move-object/from16 v24, v13

    goto/16 :goto_7

    .line 11
    :cond_7
    iget-object v2, v1, La/k/b/c$d;->c:Ljava/lang/Object;

    invoke-virtual {v1, v2}, La/k/b/c$d;->c(Ljava/lang/Object;)La/k/b/u0;

    move-result-object v2

    move-object/from16 p1, v0

    iget-object v0, v1, La/k/b/c$d;->e:Ljava/lang/Object;

    invoke-virtual {v1, v0}, La/k/b/c$d;->c(Ljava/lang/Object;)La/k/b/u0;

    move-result-object v0

    move-object/from16 v24, v13

    const-string v13, " returned Transition "

    const-string v16, "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "

    if-eqz v2, :cond_9

    if-eqz v0, :cond_9

    if-ne v2, v0, :cond_8

    goto :goto_5

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static/range {v16 .. v16}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 12
    iget-object v3, v1, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 13
    iget-object v3, v3, La/k/b/z0$d;->c:La/k/b/m;

    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, La/k/b/c$d;->c:Ljava/lang/Object;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " which uses a different Transition  type than its shared element transition "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, La/k/b/c$d;->e:Ljava/lang/Object;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    :goto_5
    if-eqz v2, :cond_a

    goto :goto_6

    :cond_a
    move-object v2, v0

    :goto_6
    if-nez v3, :cond_b

    move-object v3, v2

    goto :goto_7

    :cond_b
    if-eqz v2, :cond_d

    if-ne v3, v2, :cond_c

    goto :goto_7

    .line 15
    :cond_c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static/range {v16 .. v16}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    .line 16
    iget-object v3, v1, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 17
    iget-object v3, v3, La/k/b/z0$d;->c:La/k/b/m;

    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    iget-object v1, v1, La/k/b/c$d;->c:Ljava/lang/Object;

    .line 20
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " which uses a different Transition  type than other Fragments."

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_7
    move-object/from16 v0, p1

    move-object/from16 v13, v24

    goto/16 :goto_4

    :cond_e
    move-object/from16 v24, v13

    const-string v13, "FragmentManager"

    if-nez v3, :cond_10

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/k/b/c$d;

    .line 21
    iget-object v2, v1, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 22
    invoke-virtual {v4, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, La/k/b/c$c;->a()V

    goto :goto_8

    :cond_f
    const/4 v0, 0x0

    const/4 v1, 0x1

    move v10, v1

    move-object/from16 v30, v8

    move-object v8, v9

    move-object v11, v13

    move-object/from16 v29, v15

    move-object v9, v4

    goto/16 :goto_1c

    :cond_10
    new-instance v2, Landroid/view/View;

    .line 23
    iget-object v0, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 24
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-direct {v2, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 p1, v13

    new-instance v13, Ljava/util/ArrayList;

    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v25, v10

    new-instance v10, La/e/a;

    invoke-direct {v10}, La/e/a;-><init>()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v26

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v1

    move-object/from16 v1, v16

    move-object/from16 v27, v17

    move/from16 v28, v18

    move-object/from16 v16, v2

    move-object/from16 v17, v4

    move-object v2, v11

    move-object v4, v12

    :goto_9
    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_22

    invoke-interface/range {v26 .. v26}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v20, v5

    move-object/from16 v5, v18

    check-cast v5, La/k/b/c$d;

    .line 25
    iget-object v5, v5, La/k/b/c$d;->e:Ljava/lang/Object;

    if-eqz v5, :cond_11

    const/16 v18, 0x1

    goto :goto_a

    :cond_11
    const/16 v18, 0x0

    :goto_a
    if-eqz v18, :cond_21

    if-eqz v2, :cond_21

    if-eqz v4, :cond_21

    .line 26
    invoke-virtual {v3, v5}, La/k/b/u0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v3, v1}, La/k/b/u0;->y(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 27
    iget-object v1, v4, La/k/b/z0$d;->c:La/k/b/m;

    .line 28
    iget-object v1, v1, La/k/b/m;->J:La/k/b/m$b;

    if-eqz v1, :cond_12

    iget-object v1, v1, La/k/b/m$b;->i:Ljava/util/ArrayList;

    if-nez v1, :cond_13

    :cond_12
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :cond_13
    move-object/from16 v18, v3

    .line 29
    iget-object v3, v2, La/k/b/z0$d;->c:La/k/b/m;

    .line 30
    iget-object v3, v3, La/k/b/m;->J:La/k/b/m$b;

    if-eqz v3, :cond_14

    iget-object v3, v3, La/k/b/m$b;->i:Ljava/util/ArrayList;

    if-nez v3, :cond_15

    :cond_14
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_15
    move-object/from16 v21, v5

    .line 31
    iget-object v5, v2, La/k/b/z0$d;->c:La/k/b/m;

    .line 32
    iget-object v5, v5, La/k/b/m;->J:La/k/b/m$b;

    if-eqz v5, :cond_16

    iget-object v5, v5, La/k/b/m$b;->j:Ljava/util/ArrayList;

    if-nez v5, :cond_17

    :cond_16
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    :cond_17
    const/16 v22, 0x0

    move-object/from16 v30, v8

    move-object/from16 v29, v15

    move/from16 v15, v22

    .line 33
    :goto_b
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-ge v15, v8, :cond_19

    invoke-virtual {v5, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result v8

    move-object/from16 v22, v5

    const/4 v5, -0x1

    if-eq v8, v5, :cond_18

    invoke-virtual {v3, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v8, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_18
    add-int/lit8 v15, v15, 0x1

    move-object/from16 v5, v22

    goto :goto_b

    .line 34
    :cond_19
    iget-object v3, v4, La/k/b/z0$d;->c:La/k/b/m;

    .line 35
    iget-object v3, v3, La/k/b/m;->J:La/k/b/m$b;

    if-eqz v3, :cond_1a

    iget-object v3, v3, La/k/b/m$b;->j:Ljava/util/ArrayList;

    if-nez v3, :cond_1b

    :cond_1a
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    :cond_1b
    move-object v8, v3

    if-nez v6, :cond_1c

    .line 36
    iget-object v3, v2, La/k/b/z0$d;->c:La/k/b/m;

    .line 37
    invoke-virtual {v3}, La/k/b/m;->q()V

    .line 38
    iget-object v3, v4, La/k/b/z0$d;->c:La/k/b/m;

    .line 39
    invoke-virtual {v3}, La/k/b/m;->n()V

    goto :goto_c

    .line 40
    :cond_1c
    iget-object v3, v2, La/k/b/z0$d;->c:La/k/b/m;

    .line 41
    invoke-virtual {v3}, La/k/b/m;->n()V

    .line 42
    iget-object v3, v4, La/k/b/z0$d;->c:La/k/b/m;

    .line 43
    invoke-virtual {v3}, La/k/b/m;->q()V

    :goto_c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v5, 0x0

    :goto_d
    if-ge v5, v3, :cond_1d

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v22

    move/from16 v23, v3

    move-object/from16 v3, v22

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v10, v15, v3}, La/e/h;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v5, v5, 0x1

    move/from16 v3, v23

    goto :goto_d

    :cond_1d
    new-instance v15, La/e/a;

    invoke-direct {v15}, La/e/a;-><init>()V

    .line 44
    iget-object v3, v2, La/k/b/z0$d;->c:La/k/b/m;

    .line 45
    iget-object v3, v3, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v7, v15, v3}, La/k/b/c;->k(Ljava/util/Map;Landroid/view/View;)V

    .line 46
    invoke-static {v15, v1}, La/e/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 47
    invoke-virtual {v15}, La/e/a;->keySet()Ljava/util/Set;

    move-result-object v3

    .line 48
    invoke-static {v10, v3}, La/e/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 49
    new-instance v5, La/e/a;

    invoke-direct {v5}, La/e/a;-><init>()V

    .line 50
    iget-object v3, v4, La/k/b/z0$d;->c:La/k/b/m;

    .line 51
    iget-object v3, v3, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v7, v5, v3}, La/k/b/c;->k(Ljava/util/Map;Landroid/view/View;)V

    .line 52
    invoke-static {v5, v8}, La/e/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 53
    invoke-virtual {v10}, La/e/a;->values()Ljava/util/Collection;

    move-result-object v3

    .line 54
    invoke-static {v5, v3}, La/e/g;->k(Ljava/util/Map;Ljava/util/Collection;)Z

    .line 55
    invoke-static {v10, v5}, La/k/b/s0;->m(La/e/a;La/e/a;)V

    invoke-virtual {v10}, La/e/a;->keySet()Ljava/util/Set;

    move-result-object v3

    invoke-virtual {v7, v15, v3}, La/k/b/c;->l(La/e/a;Ljava/util/Collection;)V

    invoke-virtual {v10}, La/e/a;->values()Ljava/util/Collection;

    move-result-object v3

    invoke-virtual {v7, v5, v3}, La/k/b/c;->l(La/e/a;Ljava/util/Collection;)V

    invoke-virtual {v10}, La/e/h;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1e

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    invoke-virtual {v13}, Ljava/util/ArrayList;->clear()V

    const/4 v1, 0x0

    move-object v6, v0

    move-object v8, v9

    move-object/from16 v31, v10

    move-object v3, v11

    move-object v5, v12

    move-object/from16 v32, v14

    move-object/from16 v0, v16

    move-object/from16 v9, v17

    move-object/from16 v12, v18

    move-object/from16 v10, v19

    move-object/from16 v37, v20

    goto/16 :goto_f

    .line 56
    :cond_1e
    iget-object v3, v4, La/k/b/z0$d;->c:La/k/b/m;

    iget-object v2, v2, La/k/b/z0$d;->c:La/k/b/m;

    const/4 v4, 0x1

    .line 57
    invoke-static {v3, v2, v6, v15, v4}, La/k/b/s0;->c(La/k/b/m;La/k/b/m;ZLa/e/a;Z)V

    .line 58
    iget-object v3, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 59
    new-instance v2, La/k/b/h;

    move-object v6, v0

    move-object v0, v2

    move-object/from16 v31, v10

    move-object/from16 v10, v19

    move-object/from16 v19, v1

    move-object/from16 v1, p0

    move-object/from16 v33, v9

    move-object/from16 v32, v14

    move-object/from16 v14, v16

    move-object v9, v2

    move-object v2, v12

    move-object/from16 v34, v12

    move-object/from16 v35, v14

    move-object/from16 v12, v18

    move-object v14, v3

    move-object v3, v11

    move/from16 v16, v4

    move-object/from16 v36, v11

    move-object/from16 v11, v17

    move/from16 v4, p2

    move-object/from16 v17, v5

    move-object/from16 v38, v11

    move-object/from16 v37, v20

    move-object/from16 v11, v21

    invoke-direct/range {v0 .. v5}, La/k/b/h;-><init>(La/k/b/c;La/k/b/z0$d;La/k/b/z0$d;ZLa/e/a;)V

    invoke-static {v14, v9}, La/h/j/n;->a(Landroid/view/View;Ljava/lang/Runnable;)La/h/j/n;

    invoke-virtual {v15}, La/e/a;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v6, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    const/4 v0, 0x0

    move-object/from16 v1, v19

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v15, v1}, La/e/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v12, v11, v1}, La/k/b/u0;->t(Ljava/lang/Object;Landroid/view/View;)V

    move-object/from16 v27, v1

    goto :goto_e

    :cond_1f
    const/4 v0, 0x0

    :goto_e
    invoke-virtual/range {v17 .. v17}, La/e/a;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    move-object/from16 v1, v17

    invoke-virtual {v1, v0}, La/e/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_20

    .line 60
    iget-object v1, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 61
    new-instance v2, La/k/b/i;

    invoke-direct {v2, v7, v12, v0, v10}, La/k/b/i;-><init>(La/k/b/c;La/k/b/u0;Landroid/view/View;Landroid/graphics/Rect;)V

    invoke-static {v1, v2}, La/h/j/n;->a(Landroid/view/View;Ljava/lang/Runnable;)La/h/j/n;

    move/from16 v28, v16

    :cond_20
    move-object/from16 v0, v35

    invoke-virtual {v12, v11, v0, v6}, La/k/b/u0;->w(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v16, v12

    move-object/from16 v17, v11

    move-object/from16 v22, v11

    move-object/from16 v23, v13

    invoke-virtual/range {v16 .. v23}, La/k/b/u0;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    move-object/from16 v8, v33

    move-object/from16 v3, v36

    move-object/from16 v9, v38

    invoke-virtual {v9, v3, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v5, v34

    invoke-virtual {v9, v5, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v2, v3

    move-object v4, v5

    move-object v1, v11

    goto :goto_f

    :cond_21
    move-object v6, v0

    move-object/from16 v30, v8

    move-object v8, v9

    move-object/from16 v31, v10

    move-object v5, v12

    move-object/from16 v32, v14

    move-object/from16 v29, v15

    move-object/from16 v0, v16

    move-object/from16 v9, v17

    move-object/from16 v10, v19

    move-object/from16 v37, v20

    move-object v12, v3

    move-object v3, v11

    :goto_f
    move-object/from16 v16, v0

    move-object v11, v3

    move-object v0, v6

    move-object/from16 v17, v9

    move-object/from16 v19, v10

    move-object v3, v12

    move-object/from16 v15, v29

    move-object/from16 v10, v31

    move-object/from16 v14, v32

    move/from16 v6, p2

    move-object v12, v5

    move-object v9, v8

    move-object/from16 v8, v30

    move-object/from16 v5, v37

    goto/16 :goto_9

    :cond_22
    move-object v6, v0

    move-object v12, v3

    move-object/from16 v37, v5

    move-object/from16 v30, v8

    move-object v8, v9

    move-object/from16 v31, v10

    move-object/from16 v32, v14

    move-object/from16 v29, v15

    move-object/from16 v0, v16

    move-object/from16 v9, v17

    move-object/from16 v10, v19

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v16

    if-eqz v16, :cond_2f

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v3, v16

    check-cast v3, La/k/b/c$d;

    invoke-virtual {v3}, La/k/b/c$c;->b()Z

    move-result v16

    if-eqz v16, :cond_23

    move-object/from16 v26, v11

    .line 62
    iget-object v11, v3, La/k/b/c$c;->a:La/k/b/z0$d;

    move-object/from16 v33, v14

    move-object/from16 v14, v37

    .line 63
    invoke-virtual {v9, v11, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, La/k/b/c$c;->a()V

    move-object/from16 v11, v26

    move-object/from16 v14, v33

    goto :goto_10

    :cond_23
    move-object/from16 v26, v11

    move-object/from16 v33, v14

    move-object/from16 v14, v37

    .line 64
    iget-object v11, v3, La/k/b/c$d;->c:Ljava/lang/Object;

    .line 65
    invoke-virtual {v12, v11}, La/k/b/u0;->g(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    move-object/from16 v34, v15

    .line 66
    iget-object v15, v3, La/k/b/c$c;->a:La/k/b/z0$d;

    if-eqz v1, :cond_25

    if-eq v15, v2, :cond_24

    if-ne v15, v4, :cond_25

    :cond_24
    const/16 v16, 0x1

    goto :goto_11

    :cond_25
    const/16 v16, 0x0

    :goto_11
    if-nez v11, :cond_27

    if-nez v16, :cond_26

    .line 67
    invoke-virtual {v9, v15, v14}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v3}, La/k/b/c$c;->a()V

    :cond_26
    move-object/from16 v16, v0

    move-object/from16 v35, v4

    move-object/from16 v37, v14

    move-object/from16 v4, v25

    move-object/from16 v0, v27

    move-object/from16 v14, v33

    move-object/from16 v15, v34

    goto/16 :goto_15

    :cond_27
    move-object/from16 v37, v14

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    move-object/from16 v35, v4

    .line 68
    iget-object v4, v15, La/k/b/z0$d;->c:La/k/b/m;

    .line 69
    iget-object v4, v4, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v7, v14, v4}, La/k/b/c;->j(Ljava/util/ArrayList;Landroid/view/View;)V

    if-eqz v16, :cond_29

    if-ne v15, v2, :cond_28

    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    goto :goto_12

    :cond_28
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->removeAll(Ljava/util/Collection;)Z

    :cond_29
    :goto_12
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2a

    invoke-virtual {v12, v11, v0}, La/k/b/u0;->a(Ljava/lang/Object;Landroid/view/View;)V

    move-object/from16 v16, v0

    goto :goto_13

    :cond_2a
    invoke-virtual {v12, v11, v14}, La/k/b/u0;->b(Ljava/lang/Object;Ljava/util/ArrayList;)V

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 v16, v12

    move-object/from16 v17, v11

    move-object/from16 v18, v11

    move-object/from16 v19, v14

    invoke-virtual/range {v16 .. v23}, La/k/b/u0;->r(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;Ljava/util/ArrayList;)V

    .line 70
    iget-object v4, v15, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    move-object/from16 v16, v0

    move-object/from16 v0, v30

    if-ne v4, v0, :cond_2b

    move-object/from16 v4, v29

    .line 71
    invoke-virtual {v4, v15}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, v14}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object/from16 v30, v0

    .line 72
    iget-object v0, v15, La/k/b/z0$d;->c:La/k/b/m;

    .line 73
    iget-object v0, v0, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 74
    iget-object v0, v15, La/k/b/z0$d;->c:La/k/b/m;

    .line 75
    iget-object v0, v0, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v12, v11, v0, v4}, La/k/b/u0;->q(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 76
    iget-object v0, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 77
    new-instance v4, La/k/b/j;

    invoke-direct {v4, v7, v14}, La/k/b/j;-><init>(La/k/b/c;Ljava/util/ArrayList;)V

    invoke-static {v0, v4}, La/h/j/n;->a(Landroid/view/View;Ljava/lang/Runnable;)La/h/j/n;

    goto :goto_13

    :cond_2b
    move-object/from16 v30, v0

    .line 78
    :goto_13
    iget-object v0, v15, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    move-object/from16 v4, v25

    if-ne v0, v4, :cond_2d

    .line 79
    invoke-virtual {v5, v14}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    if-eqz v28, :cond_2c

    invoke-virtual {v12, v11, v10}, La/k/b/u0;->s(Ljava/lang/Object;Landroid/graphics/Rect;)V

    :cond_2c
    move-object/from16 v0, v27

    goto :goto_14

    :cond_2d
    move-object/from16 v0, v27

    invoke-virtual {v12, v11, v0}, La/k/b/u0;->t(Ljava/lang/Object;Landroid/view/View;)V

    :goto_14
    invoke-virtual {v9, v15, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    iget-boolean v3, v3, La/k/b/c$d;->d:Z

    if-eqz v3, :cond_2e

    const/4 v3, 0x0

    move-object/from16 v15, v34

    .line 81
    invoke-virtual {v12, v15, v11, v3}, La/k/b/u0;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v15, v3

    move-object/from16 v14, v33

    goto :goto_15

    :cond_2e
    move-object/from16 v15, v34

    const/4 v3, 0x0

    move-object/from16 v14, v33

    invoke-virtual {v12, v14, v11, v3}, La/k/b/u0;->m(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v14, v3

    :goto_15
    move-object/from16 v27, v0

    move-object/from16 v25, v4

    move-object/from16 v0, v16

    move-object/from16 v11, v26

    move-object/from16 v4, v35

    goto/16 :goto_10

    :cond_2f
    move-object/from16 v35, v4

    invoke-virtual {v12, v15, v14, v1}, La/k/b/u0;->l(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual/range {v32 .. v32}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_16
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_37

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/k/b/c$d;

    invoke-virtual {v4}, La/k/b/c$c;->b()Z

    move-result v10

    if-eqz v10, :cond_30

    goto :goto_16

    .line 82
    :cond_30
    iget-object v10, v4, La/k/b/c$d;->c:Ljava/lang/Object;

    .line 83
    iget-object v11, v4, La/k/b/c$c;->a:La/k/b/z0$d;

    move-object/from16 v14, v35

    if-eqz v1, :cond_32

    if-eq v11, v2, :cond_31

    if-ne v11, v14, :cond_32

    :cond_31
    const/4 v15, 0x1

    goto :goto_17

    :cond_32
    const/4 v15, 0x0

    :goto_17
    if-nez v10, :cond_34

    if-eqz v15, :cond_33

    goto :goto_18

    :cond_33
    move-object/from16 v11, p1

    goto :goto_1a

    .line 84
    :cond_34
    :goto_18
    iget-object v10, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 85
    sget-object v15, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v10}, Landroid/view/View;->isLaidOut()Z

    move-result v10

    if-nez v10, :cond_36

    const/4 v10, 0x2

    .line 86
    invoke-static {v10}, La/k/b/c0;->N(I)Z

    move-result v10

    if-eqz v10, :cond_35

    const-string v10, "SpecialEffectsController: Container "

    invoke-static {v10}, Lb/a/a/a/a;->g(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    .line 87
    iget-object v15, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 88
    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v15, " has not been laid out. Completing operation "

    invoke-virtual {v10, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    move-object/from16 v11, p1

    invoke-static {v11, v10}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_19

    :cond_35
    move-object/from16 v11, p1

    :goto_19
    invoke-virtual {v4}, La/k/b/c$c;->a()V

    goto :goto_1a

    :cond_36
    move-object/from16 v11, p1

    .line 89
    iget-object v10, v4, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 90
    iget-object v10, v10, La/k/b/z0$d;->c:La/k/b/m;

    .line 91
    iget-object v15, v4, La/k/b/c$c;->b:La/h/f/a;

    move-object/from16 p1, v2

    .line 92
    new-instance v2, La/k/b/k;

    invoke-direct {v2, v7, v4}, La/k/b/k;-><init>(La/k/b/c;La/k/b/c$d;)V

    invoke-virtual {v12, v10, v0, v15, v2}, La/k/b/u0;->u(La/k/b/m;Ljava/lang/Object;La/h/f/a;Ljava/lang/Runnable;)V

    move-object/from16 v2, p1

    :goto_1a
    move-object/from16 p1, v11

    move-object/from16 v35, v14

    goto :goto_16

    :cond_37
    move-object/from16 v11, p1

    .line 93
    iget-object v2, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 94
    sget-object v3, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v2}, Landroid/view/View;->isLaidOut()Z

    move-result v2

    if-nez v2, :cond_38

    const/4 v0, 0x0

    goto :goto_1b

    :cond_38
    const/4 v2, 0x4

    .line 95
    invoke-static {v5, v2}, La/k/b/s0;->o(Ljava/util/ArrayList;I)V

    invoke-virtual {v12, v13}, La/k/b/u0;->n(Ljava/util/ArrayList;)Ljava/util/ArrayList;

    move-result-object v20

    .line 96
    iget-object v2, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 97
    invoke-virtual {v12, v2, v0}, La/k/b/u0;->c(Landroid/view/ViewGroup;Ljava/lang/Object;)V

    .line 98
    iget-object v0, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    move-object/from16 v16, v12

    move-object/from16 v17, v0

    move-object/from16 v18, v6

    move-object/from16 v19, v13

    move-object/from16 v21, v31

    .line 99
    invoke-virtual/range {v16 .. v21}, La/k/b/u0;->v(Landroid/view/View;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/Map;)V

    const/4 v0, 0x0

    invoke-static {v5, v0}, La/k/b/s0;->o(Ljava/util/ArrayList;I)V

    invoke-virtual {v12, v1, v6, v13}, La/k/b/u0;->x(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    :goto_1b
    const/4 v10, 0x1

    .line 100
    :goto_1c
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsValue(Ljava/lang/Object;)Z

    move-result v12

    .line 101
    iget-object v13, v7, La/k/b/z0;->a:Landroid/view/ViewGroup;

    .line 102
    invoke-virtual {v13}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v14

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {v24 .. v24}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v16

    move v1, v0

    :goto_1d
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_40

    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, La/k/b/c$b;

    invoke-virtual {v6}, La/k/b/c$c;->b()Z

    move-result v2

    if-eqz v2, :cond_39

    goto :goto_1e

    :cond_39
    invoke-virtual {v6, v14}, La/k/b/c$b;->c(Landroid/content/Context;)La/k/b/t;

    move-result-object v2

    if-nez v2, :cond_3a

    goto :goto_1e

    :cond_3a
    iget-object v5, v2, La/k/b/t;->b:Landroid/animation/Animator;

    if-nez v5, :cond_3b

    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    .line 103
    :cond_3b
    iget-object v4, v6, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 104
    iget-object v2, v4, La/k/b/z0$d;->c:La/k/b/m;

    .line 105
    invoke-virtual {v9, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v8, v3}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3d

    const/4 v3, 0x2

    invoke-static {v3}, La/k/b/c0;->N(I)Z

    move-result v3

    if-eqz v3, :cond_3c

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Ignoring Animator set on "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " as this Fragment was involved in a Transition."

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3c
    :goto_1e
    invoke-virtual {v6}, La/k/b/c$c;->a()V

    goto :goto_1d

    .line 106
    :cond_3d
    iget-object v1, v4, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    move-object/from16 v3, v30

    if-ne v1, v3, :cond_3e

    move/from16 v17, v10

    goto :goto_1f

    :cond_3e
    move/from16 v17, v0

    :goto_1f
    move-object/from16 v1, v29

    if-eqz v17, :cond_3f

    .line 107
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    :cond_3f
    iget-object v2, v2, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v13, v2}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v0, La/k/b/d;

    move-object/from16 v18, v3

    move-object v3, v0

    move-object/from16 v19, v1

    move-object/from16 v1, p0

    move-object/from16 p1, v2

    move-object v2, v13

    move-object/from16 v33, v8

    move-object v8, v3

    move-object/from16 v3, p1

    move-object/from16 v20, v4

    move/from16 v4, v17

    move-object/from16 v17, v9

    move-object v9, v5

    move-object/from16 v5, v20

    move-object/from16 p2, v6

    invoke-direct/range {v0 .. v6}, La/k/b/d;-><init>(La/k/b/c;Landroid/view/ViewGroup;Landroid/view/View;ZLa/k/b/z0$d;La/k/b/c$b;)V

    invoke-virtual {v9, v8}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    move-object/from16 v0, p1

    invoke-virtual {v9, v0}, Landroid/animation/Animator;->setTarget(Ljava/lang/Object;)V

    invoke-virtual {v9}, Landroid/animation/Animator;->start()V

    move-object/from16 v2, p2

    .line 108
    iget-object v0, v2, La/k/b/c$c;->b:La/h/f/a;

    .line 109
    new-instance v1, La/k/b/e;

    invoke-direct {v1, v7, v9}, La/k/b/e;-><init>(La/k/b/c;Landroid/animation/Animator;)V

    invoke-virtual {v0, v1}, La/h/f/a;->b(La/h/f/a$a;)V

    const/4 v0, 0x0

    move v1, v10

    move-object/from16 v9, v17

    move-object/from16 v30, v18

    move-object/from16 v29, v19

    move-object/from16 v8, v33

    goto/16 :goto_1d

    :cond_40
    move-object/from16 v19, v29

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_20
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_45

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/k/b/c$b;

    .line 110
    iget-object v3, v2, La/k/b/c$c;->a:La/k/b/z0$d;

    .line 111
    iget-object v4, v3, La/k/b/z0$d;->c:La/k/b/m;

    const-string v5, "Ignoring Animation set on "

    if-eqz v12, :cond_41

    const/4 v3, 0x2

    .line 112
    invoke-static {v3}, La/k/b/c0;->N(I)Z

    move-result v3

    if-eqz v3, :cond_42

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " as Animations cannot run alongside Transitions."

    goto :goto_21

    :cond_41
    const/4 v6, 0x2

    if-eqz v1, :cond_43

    invoke-static {v6}, La/k/b/c0;->N(I)Z

    move-result v3

    if-eqz v3, :cond_42

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v4, " as Animations cannot run alongside Animators."

    :goto_21
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_42
    invoke-virtual {v2}, La/k/b/c$c;->a()V

    goto :goto_20

    :cond_43
    iget-object v4, v4, La/k/b/m;->G:Landroid/view/View;

    invoke-virtual {v2, v14}, La/k/b/c$b;->c(Landroid/content/Context;)La/k/b/t;

    move-result-object v5

    .line 113
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    iget-object v5, v5, La/k/b/t;->a:Landroid/view/animation/Animation;

    .line 115
    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    iget-object v3, v3, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    .line 117
    sget-object v6, La/k/b/z0$d$c;->b:La/k/b/z0$d$c;

    if-eq v3, v6, :cond_44

    invoke-virtual {v4, v5}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {v2}, La/k/b/c$c;->a()V

    goto :goto_22

    :cond_44
    invoke-virtual {v13, v4}, Landroid/view/ViewGroup;->startViewTransition(Landroid/view/View;)V

    new-instance v3, La/k/b/u;

    invoke-direct {v3, v5, v13, v4}, La/k/b/u;-><init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V

    new-instance v5, La/k/b/f;

    invoke-direct {v5, v7, v13, v4, v2}, La/k/b/f;-><init>(La/k/b/c;Landroid/view/ViewGroup;Landroid/view/View;La/k/b/c$b;)V

    invoke-virtual {v3, v5}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    invoke-virtual {v4, v3}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 118
    :goto_22
    iget-object v3, v2, La/k/b/c$c;->b:La/h/f/a;

    .line 119
    new-instance v5, La/k/b/g;

    invoke-direct {v5, v7, v4, v13, v2}, La/k/b/g;-><init>(La/k/b/c;Landroid/view/View;Landroid/view/ViewGroup;La/k/b/c$b;)V

    invoke-virtual {v3, v5}, La/h/f/a;->b(La/h/f/a$a;)V

    goto/16 :goto_20

    .line 120
    :cond_45
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_23
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_46

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/k/b/z0$d;

    .line 121
    iget-object v2, v1, La/k/b/z0$d;->c:La/k/b/m;

    .line 122
    iget-object v2, v2, La/k/b/m;->G:Landroid/view/View;

    .line 123
    iget-object v1, v1, La/k/b/z0$d;->a:La/k/b/z0$d$c;

    .line 124
    invoke-virtual {v1, v2}, La/k/b/z0$d$c;->a(Landroid/view/View;)V

    goto :goto_23

    .line 125
    :cond_46
    invoke-virtual/range {v19 .. v19}, Ljava/util/ArrayList;->clear()V

    return-void
.end method

.method public j(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    move-object v0, p2

    check-cast v0, Landroid/view/ViewGroup;

    .line 1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->isTransitionGroup()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p2, :cond_3

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p0, p1, v2}, La/k/b/c;->j(Ljava/util/ArrayList;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3
    :goto_1
    return-void
.end method

.method public k(Ljava/util/Map;Landroid/view/View;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Landroid/view/View;",
            ")V"
        }
    .end annotation

    .line 1
    sget-object v0, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p2}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 2
    invoke-interface {p1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    check-cast p2, Landroid/view/ViewGroup;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {p0, p1, v2}, La/k/b/c;->k(Ljava/util/Map;Landroid/view/View;)V

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public l(La/e/a;Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La/e/a<",
            "Ljava/lang/String;",
            "Landroid/view/View;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1}, La/e/a;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, La/e/g$b;

    invoke-virtual {p1}, La/e/g$b;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    move-object v0, p1

    check-cast v0, La/e/g$d;

    invoke-virtual {v0}, La/e/g$d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, La/e/g$d;->next()Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    .line 1
    sget-object v2, La/h/j/o;->a:Ljava/util/WeakHashMap;

    invoke-virtual {v1}, Landroid/view/View;->getTransitionName()Ljava/lang/String;

    move-result-object v1

    .line 2
    invoke-interface {p2, v1}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, La/e/g$d;->remove()V

    goto :goto_0

    :cond_1
    return-void
.end method
