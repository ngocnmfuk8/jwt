package com.ngocnm.jwt.polls.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

/**
 * @author NgocNM
 */
@NoArgsConstructor
@Entity
@Table(name = "choices")
public class Choice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @NotBlank
    @Size(max = 40)
    @Getter
    @Setter
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "poll_id", nullable = false)
    @Getter
    @Setter
    private Poll poll;

    public Choice(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Choice choice = (Choice) o;
        return Objects.equals(id, choice.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
