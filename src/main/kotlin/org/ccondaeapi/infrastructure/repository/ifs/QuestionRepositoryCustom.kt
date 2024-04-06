package org.ccondaeapi.infrastructure.repository.ifs

import org.ccondaeapi.domain.dto.QuestionDetail
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Repository

@Repository
interface QuestionRepositoryCustom {
    fun notAnsweredQuestionByCategories(categories: List<Long>, pageable: Pageable): Page<QuestionDetail>
}